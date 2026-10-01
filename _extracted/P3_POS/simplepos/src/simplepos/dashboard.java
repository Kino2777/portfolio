
package simplepos;

import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class dashboard extends javax.swing.JFrame {

  
    public dashboard() {
        initComponents();
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
    }
    public void addtable(int id, String Item, int Quantity, double Price) {
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        
        DecimalFormat df = new DecimalFormat("00.00");
        double totPrice = Price * Double.valueOf(Quantity);
        String TotalPrice = df.format(totPrice);
        
        for (int row = 0; row < jTable1.getRowCount(); row++) {
            if (Item == jTable1.getValueAt(row, 1)) {
                dt.removeRow(jTable1.convertRowIndexToModel(row));
            }
        }
        
        Vector v = new Vector();
        
        v.add(id);
        v.add(Item);
        v.add(Quantity);
        v.add(TotalPrice);
        
        dt.addRow(v);
    }
public void cal() {
        int numOfRow = jTable1.getRowCount();
        double tot = 0.0;
        
        for (int i = 0; i < numOfRow; i++) {
            double value = Double.valueOf(jTable1.getValueAt(i, 3).toString());
            tot += value;
        }
        
        DecimalFormat df = new DecimalFormat("00.00");
        total.setText(df.format(tot));
    }
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        q7 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        pay = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        b = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2081, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JOBILEE ORDER PAGE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/4-pcCjoyFamBox.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 140));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("4-pc ChickenJoy Sarap");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 230, -1));

        q1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q1.setForeground(new java.awt.Color(255, 255, 255));
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("0");
        jPanel1.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/6-pcBurgerSteakFam.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 250, 140));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("6-pcs Burger Steak");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 230, -1));

        q2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q2.setForeground(new java.awt.Color(255, 255, 255));
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("0");
        jPanel1.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/BurgerBundle.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 250, 140));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Burger Bundle");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 230, -1));

        q3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q3.setForeground(new java.awt.Color(255, 255, 255));
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("0");
        jPanel1.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, -1, -1));

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/CheesyYumburgerFamSavers.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, 140));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cheesy Yumberger ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 230, -1));

        q4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q4.setForeground(new java.awt.Color(255, 255, 255));
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("0");
        jPanel1.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/CjoyBucketwRiceJolly.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 250, 140));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cjoy Bucket Special");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 230, -1));

        q5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q5.setForeground(new java.awt.Color(255, 255, 255));
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("0");
        jPanel1.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        jButton7.setBackground(new java.awt.Color(204, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/Famduo.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 250, 140));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Famduo Special Pasta");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 230, -1));

        q6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q6.setForeground(new java.awt.Color(255, 255, 255));
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("0");
        jPanel1.add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, -1, -1));

        jButton8.setBackground(new java.awt.Color(204, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/4-pcCjoyFamBox.png"))); // NOI18N
        jButton8.setBorder(null);
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, 140));

        q7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q7.setForeground(new java.awt.Color(255, 255, 255));
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("0");
        jPanel1.add(q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 760, -1, -1));

        jButton9.setBackground(new java.awt.Color(204, 0, 0));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/Palabokpan.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 250, 140));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Palabokan Spesyal");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 230, -1));

        q8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q8.setForeground(new java.awt.Color(255, 255, 255));
        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("0");
        jPanel1.add(q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 760, -1, -1));

        jButton10.setBackground(new java.awt.Color(204, 0, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/peachmangopie.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 250, 140));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Peach Mango Pie");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 230, -1));

        q9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q9.setForeground(new java.awt.Color(255, 255, 255));
        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setText("0");
        jPanel1.add(q9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 760, -1, -1));

        jButton11.setBackground(new java.awt.Color(204, 0, 0));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/JollyCrispyFriesBucket.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, 250, 140));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Bucket Fires");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, 230, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/jollibee-logo-png (1).png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 90, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 970));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ITEM", "QUANTITY", "PRICE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 650, 630));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DELETE");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 190, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 670, 740));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BALANCE:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        bal.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        bal.setForeground(new java.awt.Color(255, 255, 255));
        bal.setText("00");
        jPanel3.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CASH:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TOTAL:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        total.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setText("00");
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        pay.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 270, 50));

        jButton12.setBackground(new java.awt.Color(204, 0, 0));
        jButton12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("PAY");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 190, 160));

        jButton13.setBackground(new java.awt.Color(204, 0, 0));
        jButton13.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("PRINT");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 190, 160));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 750, 1130, 220));

        b.setColumns(20);
        b.setRows(5);
        jScrollPane2.setViewportView(b);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 10, 420, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

 DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
String r =dt.getValueAt(jTable1.getSelectedRow(), 0).toString();

//removeproduct 
int rw = jTable1.getSelectedRow();  
dt.removeRow(rw);


        System.out.println(r);
switch(r){
         case"1":
        q1.setText("0");
        break;
        
        case"2":
        q2.setText("0");
        break;
        
         case"3":
        q3.setText("0");
        break;
        
         case"4":
        q4.setText("0");
        break;
        
         case"5":
        q5.setText("0");
        break;
        
         case"6":
        q6.setText("0");
        break;
        
         case"7":
        q7.setText("0");
        break;
        
         case"8":
        q8.setText("0");
        break;
        
         case"9":
        q9.setText("0");
        break;
        
         default:
             System.out.println("Over");
}

dt.removeRow(rw);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   int i = Integer.valueOf(q1.getText());
        ++i;
        q1.setText(String.valueOf(i));
        addtable(1, "4-pc Chicken Joy ", i, 420.10);
        cal();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int i = Integer.valueOf(q2.getText());
        ++i;
        q2.setText(String.valueOf(i));
        addtable(2, "6-pcs Burger Steak", i, 600.10);
        cal();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         int i = Integer.valueOf(q3.getText());
        ++i;
        q3.setText(String.valueOf(i));
        addtable(3, "Burger Bundle", i, 300.10);
        cal();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      int i = Integer.valueOf(q4.getText());
        ++i;
        q4.setText(String.valueOf(i));
        addtable(4, "Cheesy Yumberger ", i, 120.10);
        cal();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     int i = Integer.valueOf(q5.getText());
        ++i;
        q5.setText(String.valueOf(i));
        addtable(5, "Cjoy Bucket Special", i, 800.10);
        cal();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int i = Integer.valueOf(q6.getText());
        ++i;
        q6.setText(String.valueOf(i));
        addtable(6, "Famduo Special Pasta", i, 450.89);
        cal();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int i = Integer.valueOf(q7.getText());
        ++i;
        q7.setText(String.valueOf(i));
        addtable(7, "Palabokan Spesyal", i, 250.10);
        cal();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
          int i = Integer.valueOf(q8.getText());
        ++i;
        q8.setText(String.valueOf(i));
        addtable(8, "Peach Mango Pie", i, 80.30);
        cal();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    int i = Integer.valueOf(q9.getText());
        ++i;
        q9.setText(String.valueOf(i));
        addtable(9, "Bucket Fires", i, 150.90);
        cal();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       double tot = Double.valueOf(total.getText());
         double paid = Double.valueOf(pay.getText());
           double balance = paid - tot;
           
            DecimalFormat df = new DecimalFormat("00.00");
        
        
           bal.setText(String.valueOf(df.format(balance)));
               
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
  
    try {
        
          b.setText("                                              JOBILEES FOOD \n");
        b.setText(b.getText() + "                                               BANKEROHAN, MATINA D.C., \n");
        b.setText(b.getText() + "                                               DAVAO CITY, BUCANA, \n");
        b.setText(b.getText() + "                                               +092312,0932122333, \n");
        b.setText(b.getText() + "--------------------------------------------------------------------------------------------------------------\n");
         b.setText(b.getText() + "\tITEM \tQUANTITY \tPRICE\n");
        b.setText(b.getText() + "---------------------------------------------------------------------------------------------------------------\n");
       
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String ITEM = df.getValueAt(i, 1).toString();
            String QUANTITY = df.getValueAt(i, 2).toString(); 
            String PRICE = df.getValueAt(i, 3).toString();
            
            
            b.setText(b.getText() + " " + ITEM + "\t" + QUANTITY + "\t" + PRICE + "\n");
        
        }
        b.setText(b.getText() + "----------------------------------------------------------------------------------------------------------------\n");
b.setText(b.getText() + "Sub Total : " + total.getText() +"\n");
b.setText(b.getText() + "Cash      : " + pay.getText() +"\n");
b.setText(b.getText() + "Balance   : " + bal.getText() +"\n");
b.setText(b.getText() + "-------------------------------------------------------------------------------------------------------------------------\n");
b.setText(b.getText() + "  Thanks For Your Business...!"+"\n");
b.setText(b.getText() + "--------------------------------------------------------------------------------------------------------------------------\n");
b.setText(b.getText() + "  Software by TROYOS COMPANY"+"\n");
       
                  
    } catch (Exception e) {
        
        
                        
  }
    }//GEN-LAST:event_jButton13ActionPerformed

   
    public static void main(String args[]) {
     
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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea b;
    private javax.swing.JLabel bal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pay;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
