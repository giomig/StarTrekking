/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import gamestate.MainMenuState;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import music.MusicGame;

/**
 *
 * @author StarTrekking
 *
 * Class that represents the Main Menu panel keeping refers to the image shown
 * and the music background
 */
public class MainMenuPanel extends javax.swing.JPanel{

    private final MainMenuState state;
    private BufferedImage screen;
    public MusicGame mg;

    BufferedImage titleIcon;

    BufferedImage storyModeIcon_black;
    BufferedImage exitIcon_black ;

    BufferedImage storyModeIcon_yellow;
    BufferedImage exitIcon_yellow;

    /**
     * Creates new form MainMenuPanel
     *
     * @param state is the state of the game about the main menu
     * @throws java.io.IOException when there's an error due to open a file
     */
    public MainMenuPanel(MainMenuState state) throws IOException {
        initComponents();
        this.state = state;
        screen = ImageIO.read(getClass().getResource("/screen/forest.png"));

        initComponents();

        titleIcon = ImageIO.read(getClass().getResource("/menuIcon/startrekking.png"));

        storyModeIcon_black = ImageIO.read(getClass().getResource("/menuIcon/story_mode_black.png"));
        exitIcon_black = ImageIO.read(getClass().getResource("/menuIcon/exit_black.png"));

        storyModeIcon_yellow = ImageIO.read(getClass().getResource("/menuIcon/story_mode_yellow.png"));
        exitIcon_yellow = ImageIO.read(getClass().getResource("/menuIcon/exit_yellow.png"));

        titleLabel.setIcon(new javax.swing.ImageIcon(titleIcon));

        initIcon();

        this.setVisible(true);
        this.setSize(GameFrame.WIDTH, GameFrame.HEIGHT);

        //mg.setMusic("MainMenu");
        //mg.play();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        storyModeButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(980, 528));

        titleLabel.setFont(new java.awt.Font("Beirut", 2, 36)); // NOI18N
        titleLabel.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titleLabelbuttonPressedHandler(evt);
            }
        });

        storyModeButton.setBackground(new java.awt.Color(255, 255, 255));
        storyModeButton.setForeground(java.awt.Color.darkGray);
        storyModeButton.setBorder(null);
        storyModeButton.setBorderPainted(false);
        storyModeButton.setContentAreaFilled(false);
        storyModeButton.setFocusPainted(false);
        storyModeButton.setIconTextGap(10);
        storyModeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                storyModeButtonmouseSelectionStoryHandler(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                storyModeButtonmouseExitHandler(evt);
            }
        });
        storyModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storyModeButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setForeground(java.awt.Color.darkGray);
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(storyModeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(storyModeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initIcon() {
        storyModeButton.setIcon(new javax.swing.ImageIcon(storyModeIcon_black));
        storyModeButton.setBorder(null);

        exitButton.setIcon(new javax.swing.ImageIcon(exitIcon_black));
        exitButton.setBorder(null);

    }

    private void titleLabelbuttonPressedHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleLabelbuttonPressedHandler
        // TODO add your handling code here:
        //this.setIconImage(image);
    }//GEN-LAST:event_titleLabelbuttonPressedHandler

    private void storyModeButtonmouseSelectionStoryHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storyModeButtonmouseSelectionStoryHandler
        storyModeButton.setIcon(new javax.swing.ImageIcon(storyModeIcon_yellow));
    }//GEN-LAST:event_storyModeButtonmouseSelectionStoryHandler

    private void storyModeButtonmouseExitHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storyModeButtonmouseExitHandler
        storyModeButton.setIcon(new javax.swing.ImageIcon(storyModeIcon_black));
    }//GEN-LAST:event_storyModeButtonmouseExitHandler

    private void storyModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storyModeButtonActionPerformed
        storyModeButton.setIcon(new javax.swing.ImageIcon(storyModeIcon_black));
        state.handleNext(0);
    }//GEN-LAST:event_storyModeButtonActionPerformed

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitButton.setIcon(new javax.swing.ImageIcon(exitIcon_yellow));
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited

        exitButton.setIcon(new javax.swing.ImageIcon(exitIcon_black));
    }//GEN-LAST:event_exitButtonMouseExited

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        exitButton.setIcon(new javax.swing.ImageIcon(exitIcon_black));
        state.handleNext(1);
    }//GEN-LAST:event_exitButtonActionPerformed

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(screen, 0, 0, null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JButton storyModeButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables


}
