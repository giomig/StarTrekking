/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import gamestate.SelectionLevelState;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author StarTrekking
 *
 * Class that represents the panel of the selection level
 */
public class SelectionLevelPanel extends javax.swing.JPanel{

    private SelectionLevelState state;
    private BufferedImage screen;
    BufferedImage levelIcon;

    BufferedImage levelOneIcon_black;
    BufferedImage levelTwoIcon_black;
    BufferedImage levelThreeIcon_black;
    BufferedImage backMenuIcon_black;
    BufferedImage levelOneIcon_yellow;
    BufferedImage levelTwoIcon_yellow;
    BufferedImage levelThreeIcon_yellow;
    BufferedImage backMenuIcon_yellow;

    /**
     * Creates new form SelectLevelPanel
     *
     * @param path is the parameter to obtain the file path of resources
     * @param state is the selection level state to pass to the panel
     * @throws java.io.IOException when there's an error opening a file
     */
    public SelectionLevelPanel(SelectionLevelState state) throws IOException {

        this.state = state;
        
        initComponents();
        
        levelOneButton.setName("levelOneButton");
        levelTwoButton.setName("levelTwoButton");
        levelThreeButton.setName("levelThreeButton");
        backMainMenuButton.setName("backMainMenuButton");

        initIcon();

        this.setVisible(true);
        this.setSize(GameFrame.WIDTH, GameFrame.HEIGHT);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(screen, 0, 0, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backMainMenuButton = new javax.swing.JButton();
        levelThreeButton = new javax.swing.JButton();
        levelTwoButton = new javax.swing.JButton();
        levelOneButton = new javax.swing.JButton();
        titleLabel1 = new javax.swing.JLabel();

        backMainMenuButton.setBackground(new java.awt.Color(255, 255, 255));
        backMainMenuButton.setBorder(null);
        backMainMenuButton.setBorderPainted(false);
        backMainMenuButton.setContentAreaFilled(false);
        backMainMenuButton.setDefaultCapable(false);
        backMainMenuButton.setFocusPainted(false);
        backMainMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMainMenuButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMainMenuButtonMouseExited(evt);
            }
        });
        backMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMainMenuButtonActionPerformed(evt);
            }
        });

        levelThreeButton.setBorder(null);
        levelThreeButton.setBorderPainted(false);
        levelThreeButton.setContentAreaFilled(false);
        levelThreeButton.setFocusPainted(false);
        levelThreeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                levelThreeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                levelThreeButtonMouseExited(evt);
            }
        });
        levelThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelThreeButtonActionPerformed(evt);
            }
        });

        levelTwoButton.setBorder(null);
        levelTwoButton.setBorderPainted(false);
        levelTwoButton.setContentAreaFilled(false);
        levelTwoButton.setFocusPainted(false);
        levelTwoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                levelTwoButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                levelTwoButtonMouseExited(evt);
            }
        });
        levelTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelTwoButtonActionPerformed(evt);
            }
        });

        levelOneButton.setBorder(null);
        levelOneButton.setBorderPainted(false);
        levelOneButton.setContentAreaFilled(false);
        levelOneButton.setFocusPainted(false);
        levelOneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                levelOneButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                levelOneButtonMouseExited(evt);
            }
        });
        levelOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelOneButtonActionPerformed(evt);
            }
        });

        titleLabel1.setFont(new java.awt.Font("Beirut", 2, 36)); // NOI18N
        titleLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        titleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titleLabel1buttonPressedHandler(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(levelOneButton, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(levelThreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(levelTwoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backMainMenuButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(titleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(titleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(levelOneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(levelTwoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(levelThreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(backMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void initIcon() throws IOException {

        screen = ImageIO.read(getClass().getResource("/screen/forest.png"));
        levelIcon = ImageIO.read(getClass().getResource("/menuIcon/levels.png"));

        levelOneIcon_black = ImageIO.read(getClass().getResource("/menuIcon/level_one_black.png"));
        levelTwoIcon_black = ImageIO.read(getClass().getResource("/menuIcon/level_two_black.png"));
        levelThreeIcon_black = ImageIO.read(getClass().getResource("/menuIcon/level_three_black.png"));
        backMenuIcon_black = ImageIO.read(getClass().getResource("/menuIcon/back_black.png"));

        levelOneIcon_yellow = ImageIO.read(getClass().getResource("/menuIcon/level_one_yellow.png"));
        levelTwoIcon_yellow = ImageIO.read(getClass().getResource("/menuIcon/level_two_yellow.png"));
        levelThreeIcon_yellow = ImageIO.read(getClass().getResource("/menuIcon/level_three_yellow.png"));
        backMenuIcon_yellow = ImageIO.read(getClass().getResource("/menuIcon/back_yellow.png"));

        titleLabel1.setIcon(new javax.swing.ImageIcon(levelIcon));

        backMainMenuButton.setIcon(new javax.swing.ImageIcon(backMenuIcon_black));
        backMainMenuButton.setBorder(null);
        
        levelOneButton.setIcon(new javax.swing.ImageIcon(levelOneIcon_black));
        levelOneButton.setBorder(null);
        
        levelTwoButton.setIcon(new javax.swing.ImageIcon(levelTwoIcon_black));
        levelTwoButton.setBorder(null);

        levelThreeButton.setIcon(new javax.swing.ImageIcon(levelThreeIcon_black));
        levelThreeButton.setBorder(null);
    }

    private void backMainMenuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMainMenuButtonMouseEntered

        backMainMenuButton.setIcon(new javax.swing.ImageIcon(backMenuIcon_yellow));
        backMainMenuButton.setBorder(null);
    }//GEN-LAST:event_backMainMenuButtonMouseEntered

    private void backMainMenuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMainMenuButtonMouseExited

        backMainMenuButton.setIcon(new javax.swing.ImageIcon(backMenuIcon_black));
        backMainMenuButton.setBorder(null);
    }//GEN-LAST:event_backMainMenuButtonMouseExited

    private void backMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMainMenuButtonActionPerformed
        // TODO add your handling code here:
        backMainMenuButton.setIcon(new javax.swing.ImageIcon(backMenuIcon_black));
        state.stopMusic();
        state.nextState(state.getGSM().getMms());
    }//GEN-LAST:event_backMainMenuButtonActionPerformed

    private void levelThreeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_levelThreeButtonMouseEntered

        levelThreeButton.setIcon(new javax.swing.ImageIcon(levelThreeIcon_yellow));
        state.stopMusic();
        levelThreeButton.setBorder(null);
    }//GEN-LAST:event_levelThreeButtonMouseEntered

    private void levelThreeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_levelThreeButtonMouseExited

        levelThreeButton.setIcon(new javax.swing.ImageIcon(levelThreeIcon_black));
        levelThreeButton.setBorder(null);
    }//GEN-LAST:event_levelThreeButtonMouseExited

    private void levelThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelThreeButtonActionPerformed
        levelThreeButton.setIcon(new javax.swing.ImageIcon(levelThreeIcon_black));
        state.getGSM().getSps().setLevel(3);
        state.stopMusic();
        state.nextState(state.getGSM().getSps());
    }//GEN-LAST:event_levelThreeButtonActionPerformed

    private void levelTwoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_levelTwoButtonMouseEntered

        levelTwoButton.setIcon(new javax.swing.ImageIcon(levelTwoIcon_yellow));
        levelTwoButton.setBorder(null);
    }//GEN-LAST:event_levelTwoButtonMouseEntered

    private void levelTwoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_levelTwoButtonMouseExited

        levelTwoButton.setIcon(new javax.swing.ImageIcon(levelTwoIcon_black));
        levelTwoButton.setBorder(null);
    }//GEN-LAST:event_levelTwoButtonMouseExited

    private void levelTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelTwoButtonActionPerformed
        levelTwoButton.setIcon(new javax.swing.ImageIcon(levelTwoIcon_black));
        state.getGSM().getSps().setLevel(2);
        state.stopMusic();
        state.nextState(state.getGSM().getSps());
    }//GEN-LAST:event_levelTwoButtonActionPerformed

    private void levelOneButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_levelOneButtonMouseEntered

        levelOneButton.setIcon(new javax.swing.ImageIcon(levelOneIcon_yellow));
        levelOneButton.setBorder(null);
    }//GEN-LAST:event_levelOneButtonMouseEntered

    private void levelOneButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_levelOneButtonMouseExited

        levelOneButton.setIcon(new javax.swing.ImageIcon(levelOneIcon_black));
        levelOneButton.setBorder(null);
    }//GEN-LAST:event_levelOneButtonMouseExited

    private void levelOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelOneButtonActionPerformed
        levelOneButton.setIcon(new javax.swing.ImageIcon(levelOneIcon_black));
        state.getGSM().getSps().setLevel(1);
        state.nextState(state.getGSM().getSps());
    }//GEN-LAST:event_levelOneButtonActionPerformed

    private void titleLabel1buttonPressedHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleLabel1buttonPressedHandler
        // TODO add your handling code here:
        //this.setIconImage(image);
    }//GEN-LAST:event_titleLabel1buttonPressedHandler

    public BufferedImage getScreen() {
        return screen;
    }

    public BufferedImage getLevelIcon() {
        return levelIcon;
    }

    public BufferedImage getLevelOneIcon_black() {
        return levelOneIcon_black;
    }

    public BufferedImage getLevelTwoIcon_black() {
        return levelTwoIcon_black;
    }

    public BufferedImage getLevelThreeIcon_black() {
        return levelThreeIcon_black;
    }

    public BufferedImage getBackMenuIcon_black() {
        return backMenuIcon_black;
    }

    public BufferedImage getLevelOneIcon_yellow() {
        return levelOneIcon_yellow;
    }

    public BufferedImage getLevelTwoIcon_yellow() {
        return levelTwoIcon_yellow;
    }

    public BufferedImage getLevelThreeIcon_yellow() {
        return levelThreeIcon_yellow;
    }

    public BufferedImage getBackMenuIcon_yellow() {
        return backMenuIcon_yellow;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backMainMenuButton;
    private javax.swing.JButton levelOneButton;
    private javax.swing.JButton levelThreeButton;
    private javax.swing.JButton levelTwoButton;
    private javax.swing.JLabel titleLabel1;
    // End of variables declaration//GEN-END:variables

}
