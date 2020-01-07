package tiles;

import util.graphics.Sprite;
import java.awt.Graphics2D;
import java.util.HashMap;
import tiles.blocks.Block;
import tiles.blocks.ObsBlock;
import tiles.blocks.ObjBlock;
import util.Position;

public class SolidLayer extends Layer {

    

    public static int width;
    public static int height;

    public SolidLayer(String data, Sprite sprite, int width, int height, int tileWidth, int tileHeight, int tileColumns) {
        Block tempBlock;
        tmobj_blocks = new HashMap<>();
        String[] block = data.split(",");

        for (int i = 0; i < (width * height); i++) {
            int temp = Integer.parseInt(block[i].replaceAll("\\s+", ""));
            if (temp != 0) {
                tempBlock = new ObjBlock(sprite.getSprite((int) ((temp - 1) % tileColumns), (int) ((temp - 1) / tileColumns)),
                        new Position((int) (i % width) * tileWidth, (int) (i / width) * tileHeight), tileWidth, tileHeight);
                tmobj_blocks.put(String.valueOf((int) (i % width)) + "," + String.valueOf((int) (i / width)), tempBlock);
            }
        }
    }

    @Override
    public void render(Graphics2D g) {
        for (Block block : tmobj_blocks.values()) {
            block.render(g);
        }
    }
}