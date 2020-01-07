/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameObjects;

import gameObjects.entityState.EnemyDeadState;
import gameObjects.entityState.EnemyRunState;
import gameObjects.entityState.EnemyState;
import gameObjects.entityState.EntityState;
import State.State;
import util.graphics.EntitySprite;
import java.awt.Color;
import java.awt.Graphics2D;
import panels.GameFrame;
import panels.GamePanel;
import util.EntityBox;
import util.Position;

/**
 * @author StarTrekking
 */

/**
 * Represents the Enemy inside the level.
 * @author Star Trekking
 */
public abstract class Enemy extends Entity {

    private EntityState runState;
    private EntityState deadState;
    
    /**
     * Creates an enemy object.
     * @param sprite sprite of the enemy.
     * @param origin spawn position.
     * @param size size of the enemy.
     */
    public Enemy(EntitySprite sprite, Position origin, int size) {
        super(sprite, origin, size);
        this.bounds = new EntityBox(pos, 16, 32, 40, 32);
        this.initialSpeed = -0.05f;
        this.vx = initialSpeed;
        
        runState = new EnemyRunState(this);
        deadState = new EnemyDeadState(this);
        this.state = runState;
        state.set();
    }

    public State getRunState(){
        return runState;
    }
    
    public State getDeadState(){
        return deadState;
    }
    
 
    
    public void move() {
        dx = vx * timex++ + dx0;
    }

    @Override
    public void updateGame() {
        super.updateGame();
        if(pos.getWorldVar().getX() < GamePanel.WIDTH+100){
            if (pos.getWorldVar().getX() < -100) {
                deadAniEnded = true;
            }
            move();
            pos.setY(dy);
            pos.setX(dx);
        }
    }

    @Override
    public void render(Graphics2D g) {
        if (pos.getY() < GamePanel.HEIGHT) {// riduzione lag : perchè se non hanno una posizione di appoggio cadono e non vengono più renderizzati
            g.drawImage(ani.getImage(), (int) pos.getWorldVar().getX(), (int) pos.getWorldVar().getY(), size, size, null);
//            g.setColor(Color.BLUE);
//            g.drawRect((int) (pos.getWorldVar().getX() + bounds.getXOffset()), (int) (pos.getWorldVar().getY() + bounds.getYOffset()), (int) bounds.getWidth(), (int) bounds.getHeight());
        }
    }

}
