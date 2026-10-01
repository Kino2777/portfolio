
package carrental;

/**
 *
 * @author New User
 */
public class reviewbooking extends javax.swing.JFrame {

  
    public reviewbooking() {
        initComponents();
    }

public void displayAllDetails() {
    lblrentaldates.setText(BookingData.rentalDates);
    lblAppointmentDate.setText(BookingData.apptDate);
    lblTypeOfCar.setText(BookingData.serviceType);
    lblcustomername.setText(BookingData.customerName);
    lblphonenumber.setText(BookingData.phoneNumber);
    lbldeliveryaddress.setText(BookingData.deliveryAddress);
    lblpaymentmethod.setText(BookingData.paymentMethod);
    lbltotal.setText(BookingData.totalAmount);
    lblcarpic.setIcon(BookingData.carImage);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblcarpic = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        lblrentaldates = new javax.swing.JLabel();
        lbldeliveryaddress = new javax.swing.JLabel();
        lblcustomername = new javax.swing.JLabel();
        lblphonenumber = new javax.swing.JLabel();
        lblpaymentmethod = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblTypeOfCar = new javax.swing.JLabel();
        lblAppointmentDate = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("REVIEW YOUR BOOKING");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel2.setText("Total Amount:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        lblcarpic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcarpic.setText("car");
        lblcarpic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 4, true));
        jPanel1.add(lblcarpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 200, 110));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Delivery Address:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Customer Name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Phone number:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Payment Method:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel10.setText("________________________________________________________________________________________________________________________________________________________________________________________________________");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        lbltotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 250, 30));

        lblrentaldates.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel1.add(lblrentaldates, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 250, 40));

        lbldeliveryaddress.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel1.add(lbldeliveryaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 250, 40));

        lblcustomername.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel1.add(lblcustomername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 250, 40));

        lblphonenumber.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel1.add(lblphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 250, 40));

        lblpaymentmethod.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel1.add(lblpaymentmethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 250, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("REPAIR REVIEW");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Type of Car:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel16.setText("Appointment Date:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblTypeOfCar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jPanel4.add(lblTypeOfCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 290, 40));
        jPanel4.add(lblAppointmentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 290, 40));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setText("Service Type:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 180, 40));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setText("Repair Price:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, 40));
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 570, 360));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setText("Car:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("RENTAL REVIEW");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setText("Rental Dates:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONFIRM BOOKING");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 300, 60));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 3, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      booksuccesful bs = new booksuccesful();
        bs.setVisible(true);
             bs.setLocationRelativeTo(null);
        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    /*}*
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
            java.util.logging.Logger.getLogger(reviewbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reviewbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reviewbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reviewbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reviewbooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAppointmentDate;
    private javax.swing.JLabel lblTypeOfCar;
    private javax.swing.JLabel lblcarpic;
    private javax.swing.JLabel lblcustomername;
    private javax.swing.JLabel lbldeliveryaddress;
    private javax.swing.JLabel lblpaymentmethod;
    private javax.swing.JLabel lblphonenumber;
    private javax.swing.JLabel lblrentaldates;
    private javax.swing.JLabel lbltotal;
    // End of variables declaration//GEN-END:variables
}
