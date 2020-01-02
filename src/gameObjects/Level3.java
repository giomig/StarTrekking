package gameObjects;

import tiles.LayerFacade;

public class Level3 extends Level{
     
    public Level3() {
        super();
        init();
    }
    
    @Override
    public void init(){
        super.init();
        tf = new LayerFacade("tiles/LevelThree.xml");
        enemies = (EnemiesLevel)ef.build(2);
        addObj(enemies);
    }
}