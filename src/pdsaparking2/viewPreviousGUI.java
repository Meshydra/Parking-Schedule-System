/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pdsaparking2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class viewPreviousGUI extends javax.swing.JFrame {
// global variable to move the undecorated jframe
    int xMouse;
    int yMouse;
    
    String Name;
    String LicenseNumber;
    String ParkedTime;
    String ParkedSpot;
    String timeString;
    int hour;
    /**
     * Creates new form previousNode
     * @param name
     * @param LicenseNumber
     * @param ParkedTime
     * @param ParkedSpot
     * @param time
     * @param hour
     */
    public viewPreviousGUI(String name, String LicenseNumber, String ParkedTime, String ParkedSpot, String time, int hour) {
        initComponents();
        
        this.Name = name;
        this.LicenseNumber = LicenseNumber;
        this.ParkedTime = ParkedTime;
        this.ParkedSpot = ParkedSpot;
        timeString = time;
        this.hour = hour;
        
        load();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblLicense = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblHourly = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        chgName = new javax.swing.JLabel();
        chgLicense = new javax.swing.JLabel();
        chgTime = new javax.swing.JLabel();
        chgSpot = new javax.swing.JLabel();
        chgTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblParkedTime = new javax.swing.JLabel();
        chgParkedTime = new javax.swing.JLabel();
        lblHourly1 = new javax.swing.JLabel();
        chgHourly = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(58, 58, 77));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setDoubleBuffered(false);

        lblName.setBackground(new java.awt.Color(255, 255, 153));
        lblName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name :");

        lblLicense.setBackground(new java.awt.Color(255, 255, 153));
        lblLicense.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        lblLicense.setForeground(new java.awt.Color(255, 255, 255));
        lblLicense.setText("License No :");

        lblTime.setBackground(new java.awt.Color(255, 255, 153));
        lblTime.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time :");

        lblHourly.setBackground(new java.awt.Color(255, 255, 153));
        lblHourly.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        lblHourly.setForeground(new java.awt.Color(255, 255, 255));
        lblHourly.setText("Park Spot");

        lblTotal.setBackground(new java.awt.Color(255, 255, 153));
        lblTotal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total Price :");

        chgName.setBackground(new java.awt.Color(255, 255, 153));
        chgName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        chgName.setForeground(new java.awt.Color(255, 255, 255));
        chgName.setText("jLabel7");

        chgLicense.setBackground(new java.awt.Color(255, 255, 153));
        chgLicense.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        chgLicense.setForeground(new java.awt.Color(255, 255, 255));
        chgLicense.setText("jLabel9");

        chgTime.setBackground(new java.awt.Color(255, 255, 153));
        chgTime.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        chgTime.setForeground(new java.awt.Color(255, 255, 255));
        chgTime.setText("jLabel10");

        chgSpot.setBackground(new java.awt.Color(255, 255, 153));
        chgSpot.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        chgSpot.setForeground(new java.awt.Color(255, 255, 255));
        chgSpot.setText("jLabel11");

        chgTotal.setBackground(new java.awt.Color(255, 255, 153));
        chgTotal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        chgTotal.setForeground(new java.awt.Color(255, 255, 255));
        chgTotal.setText("jLabel12");

        jButton1.setBackground(new java.awt.Color(94, 237, 181));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ok");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblParkedTime.setBackground(new java.awt.Color(255, 255, 153));
        lblParkedTime.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        lblParkedTime.setForeground(new java.awt.Color(255, 255, 255));
        lblParkedTime.setText("Parked Time :");

        chgParkedTime.setBackground(new java.awt.Color(255, 255, 153));
        chgParkedTime.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        chgParkedTime.setForeground(new java.awt.Color(255, 255, 255));
        chgParkedTime.setText("jLabel10");

        lblHourly1.setBackground(new java.awt.Color(255, 255, 153));
        lblHourly1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        lblHourly1.setForeground(new java.awt.Color(255, 255, 255));
        lblHourly1.setText("Hourly Rate:");

        chgHourly.setBackground(new java.awt.Color(255, 255, 153));
        chgHourly.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        chgHourly.setForeground(new java.awt.Color(255, 255, 255));
        chgHourly.setText("jLabel11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHourly1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chgHourly, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblParkedTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chgParkedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(chgName, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chgLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHourly, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chgSpot, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chgTime, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chgTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(chgName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicense)
                    .addComponent(chgLicense))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParkedTime)
                    .addComponent(chgParkedTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(chgTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHourly)
                    .addComponent(chgSpot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHourly1)
                    .addComponent(chgHourly))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(chgTotal))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(38, 38, 67));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false); //you can't see me!
        dispose(); //Destroy the JFrame object
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x- xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(viewPreviousGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewPreviousGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewPreviousGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewPreviousGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    // update the data on application load
    public void load(){
        int total = calculateTotal();
        try{
        chgName.setText(Name);
        chgLicense.setText(LicenseNumber);
        chgSpot.setText(ParkedSpot);        
        chgHourly.setText(Integer.toString(hour));
        chgParkedTime.setText(ParkedTime);        
        chgTime.setText(timeString);
        chgTotal.setText(Integer.toString(total));
        } catch(Exception e){
        chgName.setText("null");
        }
    
    }
    

Date convertToDate(String time){
    SimpleDateFormat day = new SimpleDateFormat("HH:mm:ss");    
        try {
            Date dayReturn = day.parse(time);
            return dayReturn;
        } catch (ParseException ex) {
            Logger.getLogger(viewPreviousGUI.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
}

int calculateHours(Date start, Date stop){
    int hours = 0;
    hours = stop.getHours() - start.getHours();
    if(hours<1){
        hours = 1;
    }
    return hours;

}

int calculateTotal(){
    
    int total;
    total = calculateHours(convertToDate(ParkedTime),convertToDate(timeString)) * hour;
    return total;
    

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chgHourly;
    private javax.swing.JLabel chgLicense;
    private javax.swing.JLabel chgName;
    private javax.swing.JLabel chgParkedTime;
    private javax.swing.JLabel chgSpot;
    private javax.swing.JLabel chgTime;
    private javax.swing.JLabel chgTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHourly;
    private javax.swing.JLabel lblHourly1;
    private javax.swing.JLabel lblLicense;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblParkedTime;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}