/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import gamestate.MainMenuState;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author Gianluca
 */
public class MainMenuFrame extends javax.swing.JFrame {

    private final MainMenuState state;

    /**
     * Creates new form MainMenuFrame
     */
    public MainMenuFrame(MainMenuState state) throws IOException {
        this.state = state;
        BufferedImage myImage = ImageIO.read(getClass().getResource("/screen/forest.png"));
        
        this.setContentPane(new ImagePanel(myImage));
        initComponents();
        
        
        BufferedImage storyModeIcon = ImageIO.read(getClass().getResource("/menuIcon/story_mode_black.png"));
        BufferedImage exitIcon = ImageIO.read(getClass().getResource("/menuIcon/exit_black.png"));
        BufferedImage titleIcon = ImageIO.read(getClass().getResource("/menuIcon/startrekking.png"));
        
        
        storyModeButton.setIcon(new javax.swing.ImageIcon(storyModeIcon));
        exitButton.setIcon(new javax.swing.ImageIcon(exitIcon));
        storyModeButton.setBorder(null);
        exitButton.setBorder(null);
        titleLabel.setIcon(new javax.swing.ImageIcon(titleIcon));
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setVisible(true);
        this.setSize( myImage.getWidth(),myImage.getHeight());
       
        
    }
    
    public class ImagePanel extends JComponent {
        private Image image;
        public ImagePanel(Image image) {
        this.image = image;
    }
        @Override
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        storyModeButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("mainMenuFrame"); // NOI18N
        setResizable(false);

        storyModeButton.setBackground(new java.awt.Color(255, 255, 255));
        storyModeButton.setForeground(java.awt.Color.darkGray);
        storyModeButton.setBorder(null);
        storyModeButton.setIconTextGap(10);
        storyModeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitHandler(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseSelectionStoryHandler(evt);
            }
        });
        storyModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storyModeButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Beirut", 2, 36)); // NOI18N
        titleLabel.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPressedHandler(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setForeground(java.awt.Color.darkGray);
        exitButton.setBorder(null);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(storyModeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(335, Short.MAX_VALUE))
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
                .addContainerGap(191, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void storyModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storyModeButtonActionPerformed
        state.handleNext(0);
    }//GEN-LAST:event_storyModeButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        state.handleNext(1);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void buttonPressedHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPressedHandler
        // TODO add your handling code here:
        //this.setIconImage(image);
    }//GEN-LAST:event_buttonPressedHandler

    private void mouseSelectionStoryHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseSelectionStoryHandler
        
        BufferedImage storyMode = null;
        
        try {
            storyMode = ImageIO.read(getClass().getResource("/menuIcon/story_mode_yellow.png"));
        } catch (IOException ex) {
            Logger.getLogger(MainMenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        storyModeButton.setIcon(new javax.swing.ImageIcon(storyMode));
        storyModeButton.setBorder(null);
    }//GEN-LAST:event_mouseSelectionStoryHandler

    private void mouseExitHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExitHandler
        BufferedImage storyMode = null;
        
        try {
            storyMode = ImageIO.read(getClass().getResource("/menuIcon/story_mode_black.png"));
        } catch (IOException ex) {
            Logger.getLogger(MainMenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        storyModeButton.setIcon(new javax.swing.ImageIcon(storyMode));
        storyModeButton.setBorder(null);
    }//GEN-LAST:event_mouseExitHandler

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        BufferedImage exit = null;

        try {
            exit = ImageIO.read(getClass().getResource("/menuIcon/exit_yellow.png"));
        } catch (IOException ex) {
            Logger.getLogger(MainMenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        exitButton.setIcon(new javax.swing.ImageIcon(exit));
        exitButton.setBorder(null);
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        BufferedImage exit = null;

        try {
            exit = ImageIO.read(getClass().getResource("/menuIcon/exit_black.png"));
        } catch (IOException ex) {
            Logger.getLogger(MainMenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        exitButton.setIcon(new javax.swing.ImageIcon(exit));
        exitButton.setBorder(null);
    }//GEN-LAST:event_exitButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JButton storyModeButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    
}
