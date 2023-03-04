/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pdsaparking2;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import static pdsaparking2.main.tempData;

/**
 *
 * @author DELL
 */
public class dashboardGUI extends javax.swing.JFrame {

    ImageIcon imageCloseh = scaleImage("resources/closeh.png", 24);
    ImageIcon imageClose = scaleImage("resources/close.png", 24);
    // global variable to move the undecorated jframe
    int xMouse;
    int yMouse;
    
    //keep track of how many slots are remaining
    int slots;
    String timeString;
    
    public dashboardGUI() {
        initComponents();
        //set the application icon
        setIconImage(Toolkit.getDefaultToolkit().getImage("resources/logo.png"));
        //makes the frame have rounded borders
         Shape roundedRectangle = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20);

        // set the shape of the frame
        setShape(roundedRectangle);
        
        //new timer
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTimeLabel();
            }
        });
        timer.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNavigation = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        lblRemaining = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLicense = new javax.swing.JTextField();
        txtParked = new javax.swing.JTextField();
        txtParkSpot = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnRefreshSpot = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        txtSlots = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblParkTime = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();
        lblLicense = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbSearch = new javax.swing.JComboBox<>();
        lblParkSpot1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnRefreshTime = new javax.swing.JButton();
        lblParkTime1 = new javax.swing.JLabel();
        btnView1 = new javax.swing.JButton();
        txtHourly = new javax.swing.JSpinner();
        lblRemaining1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setUndecorated(true);
        setResizable(false);

        pnlNavigation.setBackground(new java.awt.Color(38, 38, 67));
        pnlNavigation.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        pnlNavigation.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlNavigationMouseDragged(evt);
            }
        });
        pnlNavigation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlNavigationMousePressed(evt);
            }
        });

        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCloseMousePressed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(244, 250, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(244, 250, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logo.png"))); // NOI18N
        jLabel8.setText("Parking Zone");
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8MouseDragged(evt);
            }
        });

        javax.swing.GroupLayout pnlNavigationLayout = new javax.swing.GroupLayout(pnlNavigation);
        pnlNavigation.setLayout(pnlNavigationLayout);
        pnlNavigationLayout.setHorizontalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNavigationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(251, 251, 251)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        pnlNavigationLayout.setVerticalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlNavigationLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
        );

        btnClose.setIcon(imageClose);

        pnlBody.setBackground(new java.awt.Color(58, 58, 77));
        pnlBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRemaining.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRemaining.setForeground(new java.awt.Color(255, 255, 255));
        lblRemaining.setText("Hourly Rate");
        pnlBody.add(lblRemaining, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 150, -1));

        txtName.setBackground(new java.awt.Color(58, 58, 77));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNameMouseExited(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        pnlBody.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, -1));

        txtLicense.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtLicense.setBackground(new java.awt.Color(58, 58, 77));
        txtLicense.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLicense.setForeground(new java.awt.Color(255, 255, 255));
        txtLicense.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLicenseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLicenseFocusLost(evt);
            }
        });
        pnlBody.add(txtLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 200, -1));

        txtParked.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtParked.setEditable(false);
        txtParked.setBackground(new java.awt.Color(58, 58, 77));
        txtParked.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtParked.setForeground(new java.awt.Color(255, 255, 255));
        txtParked.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtParkedFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtParkedFocusLost(evt);
            }
        });
        pnlBody.add(txtParked, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 200, -1));

        txtParkSpot.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtParkSpot.setEditable(false);
        txtParkSpot.setBackground(new java.awt.Color(58, 58, 77));
        txtParkSpot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtParkSpot.setForeground(new java.awt.Color(255, 255, 255));
        txtParkSpot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtParkSpotFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtParkSpotFocusLost(evt);
            }
        });
        pnlBody.add(txtParkSpot, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 200, -1));

        btnAdd.setBackground(new java.awt.Color(94, 237, 181));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Ticket");
        btnAdd.setActionCommand("");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnlBody.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 160, -1));

        btnRefreshSpot.setBackground(new java.awt.Color(94, 237, 181));
        btnRefreshSpot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRefreshSpot.setForeground(new java.awt.Color(255, 255, 255));
        btnRefreshSpot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/refresh-page-option.png"))); // NOI18N
        btnRefreshSpot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefreshSpot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshSpot.setMaximumSize(new java.awt.Dimension(30, 30));
        btnRefreshSpot.setMinimumSize(new java.awt.Dimension(30, 30));
        btnRefreshSpot.setPreferredSize(new java.awt.Dimension(30, 30));
        btnRefreshSpot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnRefreshSpotFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnRefreshSpotFocusLost(evt);
            }
        });
        btnRefreshSpot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshSpotMouseClicked(evt);
            }
        });
        btnRefreshSpot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshSpotActionPerformed(evt);
            }
        });
        pnlBody.add(btnRefreshSpot, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 30, -1));

        btnView.setBackground(new java.awt.Color(94, 237, 181));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnView.setLabel("Clear");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        pnlBody.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 150, -1));

        txtSlots.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtSlots.setForeground(new java.awt.Color(255, 255, 255));
        txtSlots.setText("0");
        pnlBody.add(txtSlots, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 40, 30));

        lblName.setBackground(new java.awt.Color(244, 250, 255));
        lblName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(244, 250, 255));
        lblName.setText("*Name");
        pnlBody.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, -1));

        lblParkTime.setBackground(new java.awt.Color(244, 250, 255));
        lblParkTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblParkTime.setForeground(new java.awt.Color(244, 250, 255));
        lblParkTime.setText("Search");
        pnlBody.add(lblParkTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 100, -1));

        txtTime.setBackground(new java.awt.Color(244, 250, 255));
        txtTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTime.setForeground(new java.awt.Color(244, 250, 255));
        txtTime.setText("Time");
        pnlBody.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 100, -1));

        lblLicense.setBackground(new java.awt.Color(244, 250, 255));
        lblLicense.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLicense.setForeground(new java.awt.Color(244, 250, 255));
        lblLicense.setText("*License No.");
        pnlBody.add(lblLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 100, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("/50");
        pnlBody.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 87, 30));

        cmbSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSearchItemStateChanged(evt);
            }
        });
        pnlBody.add(cmbSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 200, 30));

        lblParkSpot1.setBackground(new java.awt.Color(244, 250, 255));
        lblParkSpot1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblParkSpot1.setForeground(new java.awt.Color(244, 250, 255));
        lblParkSpot1.setText("Park Spot");
        pnlBody.add(lblParkSpot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 100, -1));

        btnDelete.setBackground(new java.awt.Color(94, 237, 181));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Ticket");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setPreferredSize(new java.awt.Dimension(102, 29));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlBody.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 160, -1));

        btnRefreshTime.setBackground(new java.awt.Color(94, 237, 181));
        btnRefreshTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRefreshTime.setForeground(new java.awt.Color(255, 255, 255));
        btnRefreshTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/refresh-page-option.png"))); // NOI18N
        btnRefreshTime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefreshTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshTime.setMaximumSize(new java.awt.Dimension(30, 30));
        btnRefreshTime.setMinimumSize(new java.awt.Dimension(30, 30));
        btnRefreshTime.setPreferredSize(new java.awt.Dimension(30, 31));
        btnRefreshTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnRefreshTimeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnRefreshTimeFocusLost(evt);
            }
        });
        btnRefreshTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshTimeMouseClicked(evt);
            }
        });
        btnRefreshTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTimeActionPerformed(evt);
            }
        });
        pnlBody.add(btnRefreshTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 30, 30));

        lblParkTime1.setBackground(new java.awt.Color(244, 250, 255));
        lblParkTime1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblParkTime1.setForeground(new java.awt.Color(244, 250, 255));
        lblParkTime1.setText("Parked Time");
        pnlBody.add(lblParkTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 100, -1));

        btnView1.setBackground(new java.awt.Color(94, 237, 181));
        btnView1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnView1.setForeground(new java.awt.Color(255, 255, 255));
        btnView1.setText("View Ticket");
        btnView1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnView1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnView1MouseClicked(evt);
            }
        });
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });
        pnlBody.add(btnView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 150, -1));
        pnlBody.add(txtHourly, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 80, -1));

        lblRemaining1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRemaining1.setForeground(new java.awt.Color(255, 255, 255));
        lblRemaining1.setText("Remaining Slots");
        pnlBody.add(lblRemaining1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        clear();
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRefreshSpotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshSpotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshSpotActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        // TODO add your handling code here:
        btnClose.setIcon(imageCloseh);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        // TODO add your handling code here:
        btnClose.setIcon(imageClose);
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseMousePressed

    private void pnlNavigationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNavigationMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlNavigationMousePressed

    private void jLabel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseDragged

    private void pnlNavigationMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNavigationMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x- xMouse,y-yMouse);
    }//GEN-LAST:event_pnlNavigationMouseDragged

    private void txtNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameMouseEntered

    private void txtNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameMouseExited

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:
        fieldHover(txtName);
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
        fieldLeave(txtName);
    }//GEN-LAST:event_txtNameFocusLost

    private void txtParkedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtParkedFocusGained
        // TODO add your handling code here:
        fieldHover(txtParked);
    }//GEN-LAST:event_txtParkedFocusGained

    private void txtLicenseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLicenseFocusGained
        // TODO add your handling code here:
        fieldHover(txtLicense);
    }//GEN-LAST:event_txtLicenseFocusGained

    private void txtParkSpotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtParkSpotFocusGained
        // TODO add your handling code here:
        fieldHover(txtParkSpot);
    }//GEN-LAST:event_txtParkSpotFocusGained

    private void txtParkSpotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtParkSpotFocusLost
        // TODO add your handling code here:
        fieldLeave(txtParkSpot);
    }//GEN-LAST:event_txtParkSpotFocusLost

    private void txtLicenseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLicenseFocusLost
        // TODO add your handling code here:
        fieldLeave(txtLicense);
    }//GEN-LAST:event_txtLicenseFocusLost

    private void txtParkedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtParkedFocusLost
        // TODO add your handling code here:
        fieldLeave(txtParked);
    }//GEN-LAST:event_txtParkedFocusLost

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        
        //validation guard clauses
         if(txtName.getText().isEmpty() || txtLicense.getText().isEmpty() || txtParkSpot.getText().isEmpty() || txtParked.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }        
        //add function passes as follows name, vehicle number, license,park time, park spot          
        tempData.add(txtName.getText(), txtLicense.getText(), txtParked.getText(), Integer.parseInt(txtParkSpot.getText()));
        updateSlot(1);
        
        //adds the name to the combo box so the user can search 
        cmbSearch.addItem(txtName.getText());
        
        //clean ui
        clear();
        // feedback to the user
        JOptionPane.showMessageDialog(this, "Ticket successfully added.", "Success", JOptionPane.INFORMATION_MESSAGE);        
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshTimeActionPerformed

    private void btnRefreshTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshTimeMouseClicked
        // TODO add your handling code here:
        txtParked.setText(txtTime.getText());
    }//GEN-LAST:event_btnRefreshTimeMouseClicked

    private void btnRefreshSpotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshSpotMouseClicked
        // TODO add your handling code here:
        int available = tempData.availableParkSpot();
        txtParkSpot.setText(Integer.toString(available));
        
    }//GEN-LAST:event_btnRefreshSpotMouseClicked

    private void btnRefreshTimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRefreshTimeFocusGained
        // TODO add your handling code here:
        fieldHover(txtParked);
    }//GEN-LAST:event_btnRefreshTimeFocusGained

    private void btnRefreshTimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRefreshTimeFocusLost
        // TODO add your handling code here:
        fieldLeave(txtParked);
    }//GEN-LAST:event_btnRefreshTimeFocusLost

    private void btnRefreshSpotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRefreshSpotFocusGained
        // TODO add your handling code here:
        fieldHover(txtParkSpot);
    }//GEN-LAST:event_btnRefreshSpotFocusGained

    private void btnRefreshSpotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRefreshSpotFocusLost
        // TODO add your handling code here:
        fieldLeave(txtParkSpot);
    }//GEN-LAST:event_btnRefreshSpotFocusLost

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        //validation guard clauses
         if(txtName.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Invalid or Incorrect Name", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }    
        
        tempData.deleteByName(txtName.getText());
        
        JOptionPane.showMessageDialog(this, "Ticket successfully deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
        cmbSearch.removeItem(txtName.getText());
        
        updateSlot(-1);
        
        clear();
                
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void cmbSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSearchItemStateChanged
        // TODO add your handling code here:
        String selectedValue = cmbSearch.getSelectedItem().toString();
        //make a new node to access the properties of the return value
        Node current = tempData.searchByName(selectedValue);
        
        txtName.setText(current.Name);
        txtLicense.setText(current.LicenseNumber);
        txtParked.setText(current.ParkedTime);
        txtParkSpot.setText(Integer.toString(current.ParkedSpot));      
        
    }//GEN-LAST:event_cmbSearchItemStateChanged

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnView1ActionPerformed

    private void btnView1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnView1MouseClicked
        // TODO add your handling code here:
        // makes sure the text is not empty
        if(txtName.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Please fill Name", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        // saves and searches the name in the list
        String name= txtName.getText();
        Node current = tempData.searchByName(name);
        
        if(current == null){
          JOptionPane.showMessageDialog(this, "Invalid or Incorrect Name", "Error", JOptionPane.ERROR_MESSAGE);
          return;
        }
        int hourly = (int) txtHourly.getValue();
        viewPreviousGUI view = new viewPreviousGUI(current.Name, current.LicenseNumber, current.ParkedTime, Integer.toString(current.ParkedSpot), timeString, hourly);
        view.setVisible(true);
        
    }//GEN-LAST:event_btnView1MouseClicked

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboardGUI().setVisible(true);
            }
        });
    }
    //makes a large image into desired size for icon
    public ImageIcon scaleImage(String location, int size) {
    BufferedImage img = null;
    try {
        img = ImageIO.read(new File(location));
        int width = img.getWidth();
        int height = img.getHeight();
        int newWidth = size;
        int newHeight = size;
        if (width > height) {
            newHeight = (int) (((double) size / width) * height);
        } else {
            newWidth = (int) (((double) size / height) * width);
        }
        Image dimg = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(dimg);
    } catch (IOException e) {
        e.printStackTrace();
        return null;
    }
}
    // Highlights the field when mouse focuses it
    public void fieldHover(JTextField fieldName){
        fieldName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(94, 237, 181)));
    }
    //Unhighletns the field when mouse clicks away
    public void fieldLeave(JTextField fieldName){
        fieldName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    }
    
    //updates time label
    private void updateTimeLabel() {
    // get the current time
    Calendar calendar = Calendar.getInstance();
    int hours = calendar.get(Calendar.HOUR_OF_DAY);
    int minutes = calendar.get(Calendar.MINUTE);
    int seconds = calendar.get(Calendar.SECOND);

    // format the time as a string
    timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);

    // update the JLabel text
    txtTime.setText(timeString);
}
    
    private void updateSlot(int number){
        slots = slots + number;
        txtSlots.setText(Integer.toString(slots));
        
    }
    
    private void clear(){
        txtName.setText(null);
        txtLicense.setText(null);
        txtParked.setText(null);
        txtParkSpot.setText(null); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefreshSpot;
    private javax.swing.JButton btnRefreshTime;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnView1;
    private javax.swing.JComboBox<String> cmbSearch;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblLicense;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblParkSpot1;
    private javax.swing.JLabel lblParkTime;
    private javax.swing.JLabel lblParkTime1;
    private javax.swing.JLabel lblRemaining;
    private javax.swing.JLabel lblRemaining1;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JSpinner txtHourly;
    private javax.swing.JTextField txtLicense;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtParkSpot;
    private javax.swing.JTextField txtParked;
    private javax.swing.JLabel txtSlots;
    private javax.swing.JLabel txtTime;
    // End of variables declaration//GEN-END:variables
}
