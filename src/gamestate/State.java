/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestate;
import javax.swing.JPanel;

/**
 *
 * @author StarTrekking
 */
public abstract class State {
    protected JPanel panel;
    
    public void  handleNext(int code){};
    
    public void handlePrevious(int code){};
    
    public JPanel getPanel(){
        return panel;
    }
    
    public void setPanel(JPanel panel){
        this.panel = panel;
    }
}
