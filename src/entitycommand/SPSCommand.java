/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitycommand;
import gamestate.StoryPlayState;

/**
 *
 * @author Star Trekking
 */
public abstract class SPSCommand implements Command{

    StoryPlayState sps;
    /**
     * Default constructor of SPSCommand abstract class.
     * @param sps   as the state to set
     */
    public SPSCommand(StoryPlayState sps){
        this.sps = sps;
    }
    /**
     * Method that executes the command
     */
    @Override
    public abstract void execute();
    
}
