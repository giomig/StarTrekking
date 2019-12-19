/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestate;

import frames.GameOverFrame;

/**
 *
 * @author Star Trekking
 */
/**
 * Class which represents the state in which the game shows the Game Over Menu.
 */
public class GameOverState extends State {

    private GameStateManager gsm;

    /**
     * Create the Panel, which represents the Game Over Menu.
     *
     * @param gsm gsm represent the gsm that managed this state
     */
    public GameOverState(GameStateManager gsm) {
        this.gsm = gsm;
        this.frame = new GameOverFrame(this);
        //metodo che inizializza le componenti del JPanel;
    }

    /**
     * Define the menu's components.
     */
    /**
     * Method which handles the next state, that could be "Play" or "Main Menu"
     *
     * @param code code represented the next state.
     */
    @Override
    public void handleNext(int code) {
        /*
            codice che gestisce il prossimo stato,
         */

        if (code == 0) {
            frame.dispose();
            gsm.setState(new StoryPlayState(gsm));
        } else if (code == 1) {
            frame.dispose();
            gsm.setState(new MainMenuState(gsm));
        }

    }

    //Non so se per il game over va settato.
    @Override
    public void handlePrevious(int code) {
    }

}
