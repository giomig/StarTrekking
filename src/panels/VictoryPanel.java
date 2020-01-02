/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import gamestate.VictoryState;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Gianluca
 */
public class VictoryPanel extends javax.swing.JPanel{

    private VictoryState state;

    BufferedImage screen;
    BufferedImage titleIcon;

    BufferedImage restartIcon_black;
    BufferedImage nextLevelIcon_black;
    BufferedImage mainMenuIcon_black;

    BufferedImage restartIcon_yellow;
    BufferedImage nextLevelIcon_yellow;
    BufferedImage mainMenuIcon_yellow;

    /**
     * Creates new form VictoryPanel
     */
    public VictoryPanel(VictoryState state) throws IOException {

        this.state = state;
        initComponents();

        titleIcon = ImageIO.read(getClass().getResource("/menuIcon/startrekking.png"));
        screen = ImageIO.read(getClass().getResource("/screen/forest.png"));

        nextLevelIcon_black = ImageIO.read(getClass().getResource("/menuIcon/resume_black.png"));
        restartIcon_black = ImageIO.read(getClass().getResource("/menuIcon/restart_black.png"));
        mainMenuIcon_black = ImageIO.read(getClass().getResource("/menuIcon/back_black.png"));

        nextLevelIcon_yellow = ImageIO.read(getClass().getResource("/menuIcon/resume_yellow.png"));
        restartIcon_yellow = ImageIO.read(getClass().getResource("/menuIcon/restart_yellow.png"));
        mainMenuIcon_yellow = ImageIO.read(getClass().getResource("/menuIcon/back_yellow.png"));

        initIcon();

        this.setVisible(true);
        this.setSize(GameFrame.WIDTH, GameFrame.HEIGHT);

    }

    private void initIcon() {
        mainMenuButton.setIcon(new javax.swing.ImageIcon(mainMenuIcon_black));
        mainMenuButton.setBorder(null);

        restartButton.setIcon(new javax.swing.ImageIcon(restartIcon_black));
        restartButton.setBorder(null);

        nextLevelButton.setIcon(new javax.swing.ImageIcon(nextLevelIcon_black));
        nextLevelButton.setBorder(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        victoryLabel = new javax.swing.JLabel();
        nextLevelButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();

        nextLevelButton.setBorder(null);
        nextLevelButton.setBorderPainted(false);
        nextLevelButton.setContentAreaFilled(false);
        nextLevelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextLevelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextLevelButtonMouseExited(evt);
            }
        });
        nextLevelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextLevelButtonActionPerformed(evt);
            }
        });

        restartButton.setBorder(null);
        restartButton.setBorderPainted(false);
        restartButton.setContentAreaFilled(false);
        restartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                restartButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                restartButtonMouseExited(evt);
            }
        });
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        mainMenuButton.setBorder(null);
        mainMenuButton.setBorderPainted(false);
        mainMenuButton.setContentAreaFilled(false);
        mainMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainMenuButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainMenuButtonMouseExited(evt);
            }
        });
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mainMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(nextLevelButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restartButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(313, 313, 313))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(victoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(victoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nextLevelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextLevelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextLevelButtonActionPerformed
        nextLevelButton.setIcon(new javax.swing.ImageIcon(nextLevelIcon_black));
        state.handleNext(0);
    }//GEN-LAST:event_nextLevelButtonActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        restartButton.setIcon(new javax.swing.ImageIcon(restartIcon_black));
        state.handleNext(1);
    }//GEN-LAST:event_restartButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        mainMenuButton.setIcon(new javax.swing.ImageIcon(mainMenuIcon_black));
        state.handleNext(2);
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void nextLevelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextLevelButtonMouseEntered
        nextLevelButton.setIcon(new javax.swing.ImageIcon(nextLevelIcon_yellow));
        nextLevelButton.setBorder(null);
    }//GEN-LAST:event_nextLevelButtonMouseEntered

    private void nextLevelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextLevelButtonMouseExited
        nextLevelButton.setIcon(new javax.swing.ImageIcon(nextLevelIcon_black));
        nextLevelButton.setBorder(null);
    }//GEN-LAST:event_nextLevelButtonMouseExited

    private void restartButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restartButtonMouseEntered
        restartButton.setIcon(new javax.swing.ImageIcon(restartIcon_yellow));
        restartButton.setBorder(null);
    }//GEN-LAST:event_restartButtonMouseEntered

    private void restartButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restartButtonMouseExited
        restartButton.setIcon(new javax.swing.ImageIcon(restartIcon_black));
        restartButton.setBorder(null);
    }//GEN-LAST:event_restartButtonMouseExited

    private void mainMenuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenuButtonMouseEntered
        mainMenuButton.setIcon(new javax.swing.ImageIcon(mainMenuIcon_yellow));
        mainMenuButton.setBorder(null);
    }//GEN-LAST:event_mainMenuButtonMouseEntered

    private void mainMenuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenuButtonMouseExited
        mainMenuButton.setIcon(new javax.swing.ImageIcon(mainMenuIcon_black));
        mainMenuButton.setBorder(null);
    }//GEN-LAST:event_mainMenuButtonMouseExited

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(screen, 0, 0, null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton nextLevelButton;
    private javax.swing.JButton restartButton;
    private javax.swing.JLabel victoryLabel;
    // End of variables declaration//GEN-END:variables

}