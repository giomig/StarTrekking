/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitycommand;

import KeyHandler.KeyHandlerListener;
import gameObjects.Player;

/**
 *
 * @author Star Trekking
 *
 * Class to use the commend pattern invoking the execute method of the commend
 */
public class PlayerCommandInvoker implements KeyHandlerListener{

    private Player player;
    private Command jumpPlayerC;
    private Command crouchPlayerC;
    private Command attackPlayerC;
    private Command runPlayerC;
    
    /**
     * Command setter
     *
     * @param player to listen
     */
    
    public PlayerCommandInvoker(Player player){
        this.player = player;
        this.jumpPlayerC = new JumpPlayerCommand(player);
        this.crouchPlayerC = new CrouchPlayerCommand(player);
        this.attackPlayerC = new AttackPlayerCommand(player);
        this.runPlayerC = new RunPlayerCommand(player);
    }
/**
 * set correct command based on input code
 * @param code refers to the specific button pressed
 */
    @Override
    public void buttPressed(int code) {
        switch(code){        
            case 32:
                jumpPlayerC.execute();
                break;
            case 17://KeyEvent.VK_CONTROL:
                crouchPlayerC.execute();
                break;
            case 88://KeyEvent.VK_X:         
                attackPlayerC.execute();
                break;
            default:
        }
    }
    /**
     * set running state if input code 
     * is related to crouch button
     * @param code refers to the specific button released
     */
    @Override
    public void buttReleased(int code) {
        if(code == 17) runPlayerC.execute();
    }
    
    
}
