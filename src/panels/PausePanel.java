/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import gamestate.PauseState;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Gianluca
 */
public class PausePanel extends javax.swing.JPanel {

    private PauseState state;
    private BufferedImage screen;
    private BufferedImage resumeIcon_black;
    private BufferedImage restartIcon_black;
    private BufferedImage mainMenuIcon_black;
    private BufferedImage resumeIcon_yellow;
    private BufferedImage restartIcon_yellow;
    private BufferedImage mainMenuIcon_yellow;
    private BufferedImage titleIcon;
    /**
     * Creates new form PausePanel
     */
    public PausePanel(PauseState state) throws IOException {
        this.state = state;
        
        initComponents();
        resumeButton.setName("resumeButton");
        restartButton.setName("restartButton");
        mainMenuButton.setName("mainMenuButton");
        
        initIcon();

        setOpaque(false);
        this.setSize(GameFrame.WIDTH, GameFrame.HEIGHT);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resumeButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        resumeButton.setBorder(null);
        resumeButton.setBorderPainted(false);
        resumeButton.setContentAreaFilled(false);
        resumeButton.setFocusPainted(false);
        resumeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resumeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resumeButtonMouseExited(evt);
            }
        });
        resumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumeButtonActionPerformed(evt);
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

        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);

        mainMenuButton.setBorder(null);
        mainMenuButton.setBorderPainted(false);
        mainMenuButton.setContentAreaFilled(false);
        mainMenuButton.setFocusPainted(false);
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

        titleLabel.setFont(new java.awt.Font("Beirut", 2, 36)); // NOI18N
        titleLabel.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titleLabelbuttonPressedHandler(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton3)
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resumeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(restartButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(mainMenuButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jButton3)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resumeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void initIcon() throws IOException {
        screen = ImageIO.read(getClass().getResource("/screen/forest.png"));
        titleIcon = ImageIO.read(getClass().getResource("/menuIcon/Pause.png"));
        resumeIcon_black = ImageIO.read(getClass().getResource("/menuIcon/resume_black.png"));
        restartIcon_black = ImageIO.read(getClass().getResource("/menuIcon/restart_black.png"));
        mainMenuIcon_black = ImageIO.read(getClass().getResource("/menuIcon/back_black.png"));

        resumeIcon_yellow = ImageIO.read(getClass().getResource("/menuIcon/resume_yellow.png"));
        restartIcon_yellow = ImageIO.read(getClass().getResource("/menuIcon/restart_yellow.png"));
        mainMenuIcon_yellow = ImageIO.read(getClass().getResource("/menuIcon/back_yellow.png"));

        
        titleLabel.setIcon(new javax.swing.ImageIcon(titleIcon) );
        mainMenuButton.setIcon(new javax.swing.ImageIcon(mainMenuIcon_black));
        mainMenuButton.setBorder(null);

        restartButton.setIcon(new javax.swing.ImageIcon(restartIcon_black));
        restartButton.setBorder(null);

        resumeButton.setIcon(new javax.swing.ImageIcon(resumeIcon_black));
        resumeButton.setBorder(null);

    }
    private void resumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumeButtonActionPerformed
        resumeButton.setIcon(new javax.swing.ImageIcon(resumeIcon_black));
        state.setResume(true);
        state.nextState(state.getGSM().getSps());
    }//GEN-LAST:event_resumeButtonActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        restartButton.setIcon(new javax.swing.ImageIcon(restartIcon_black));
        state.nextState(state.getGSM().getSps());
    }//GEN-LAST:event_restartButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        mainMenuButton.setIcon(new javax.swing.ImageIcon(mainMenuIcon_black));
        state.nextState(state.getGSM().getMms());
    }//GEN-LAST:event_mainMenuButtonActionPerformed

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

    private void resumeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resumeButtonMouseEntered
        resumeButton.setIcon(new javax.swing.ImageIcon(resumeIcon_yellow));
        resumeButton.setBorder(null);
    }//GEN-LAST:event_resumeButtonMouseEntered

    private void resumeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resumeButtonMouseExited

        resumeButton.setIcon(new javax.swing.ImageIcon(resumeIcon_black));
        resumeButton.setBorder(null);
    }//GEN-LAST:event_resumeButtonMouseExited

    private void titleLabelbuttonPressedHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleLabelbuttonPressedHandler
        // TODO add your handling code here:
        //this.setIconImage(image);
    }//GEN-LAST:event_titleLabelbuttonPressedHandler

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(screen, 0, 0, null);
    }
    
    public BufferedImage getScreen() {
        return screen;
    }

    public BufferedImage getResumeIcon_black() {
        return resumeIcon_black;
    }

    public BufferedImage getRestartIcon_black() {
        return restartIcon_black;
    }

    public BufferedImage getMainMenuIcon_black() {
        return mainMenuIcon_black;
    }

    public BufferedImage getResumeIcon_yellow() {
        return resumeIcon_yellow;
    }

    public BufferedImage getRestartIcon_yellow() {
        return restartIcon_yellow;
    }

    public BufferedImage getMainMenuIcon_yellow() {
        return mainMenuIcon_yellow;
    }

    public BufferedImage getTitleIcon() {
        return titleIcon;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton restartButton;
    private javax.swing.JButton resumeButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables



}
