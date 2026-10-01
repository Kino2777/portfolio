package carrental;
import javax.swing.JFileChooser;

public class dashboard extends javax.swing.JFrame {
private javax.swing.JPanel panelRentalSummary; 
private javax.swing.JPanel panelRepairSummary; 

     String globalDates, globalAddress, globalCustomerName, globalPhone, globalPayment, globalTotal;
     
    javax.swing.ImageIcon globalCarImage;
    private String selectedCarName = "";
    private double selectedVehiclePrice = 0.0;  
   
    private String selectedRepairName = "";
    private double selectedRepairPrice = 0.0;
    
   
    private boolean isRentalActive = false;
    private boolean isRepairActive = false;
  
    private int price;
    private javax.swing.ImageIcon selectedCarImage;

    
    public dashboard() {
        initComponents();
    }
public void updateAppointmentDetails(String carName, javax.swing.ImageIcon carImage, String capacity, String stars, double price) {
    this.selectedCarName = carName;
    this.selectedCarImage = carImage;
  
    this.selectedVehiclePrice = price; 

    lblVehicleNameDisplay.setText(carName); 
    lblVehicleImageDisplay.setIcon(carImage);
    lblVehicleImageDisplay1.setIcon(carImage);
    lblVehicleCapacityDisplay.setText(capacity);
    lblVehicleStarsDisplay.setText(stars);
    
 
    lblVehiclePriceDisplay.setText(String.format("%,.2f", price)); 
    
    lblPaymentVehicleName.setText(carName);
    lblPaymentCapacity.setText(capacity);
    lblPaymentRatings.setText(stars);
    lblPayment.setText(String.format("%,.2f", price)); 
    
}

public void updatePaymentDisplay(int days, double rentalRate, double insRate, double deliveryFee) {
  
double totalRental = days * rentalRate;
    

    double repairCost = 0.0;
    try {
        if (BookingData.repairPrice != null && !BookingData.repairPrice.isEmpty()) {
            repairCost = Double.parseDouble(BookingData.repairPrice.replace(",", ""));
        }
    } catch (NumberFormatException e) { repairCost = 0.0; }


    double insurance = isRentalActive ? insRate : 0.0;
    double fee = isRentalActive ? deliveryFee : 0.0;
    double total = totalRental + insurance + fee + repairCost;

   
    lblRentalVal.setText(String.format("%.2f", totalRental));
    lblInsuranceVal.setText(String.format("%.2f", insurance));
    lblDeliveryVal.setText(String.format("%.2f", fee));
    
    
    lblRepairService.setText(BookingData.serviceType != null ? BookingData.serviceType : "N/A");
    lblRepairPrice.setText(String.format("%.2f", repairCost));
    
    
    
    lblTotalPayment.setText(String.format("%.2f", total));
    
    BookingData.totalAmount = String.format("%.2f", total);
}

public void updateRepairSelection(String serviceType) {

   panelOilOption.setBackground(java.awt.Color.WHITE);
    panelTireOption.setBackground(java.awt.Color.WHITE);
    panelBrakeOption.setBackground(java.awt.Color.WHITE);
    panelEngineOption.setBackground(java.awt.Color.WHITE);

    java.awt.Color lightRedBg = new java.awt.Color(255, 230, 230);
    java.awt.Color selectedRed = new java.awt.Color(180, 0, 0);

    // Set price and visual feedback
   if (serviceType.equals("OIL")) {
    panelOilOption.setBackground(selectedRed);
    selectedRepairName = "OIL CHANGE";
    selectedRepairPrice = 1500.00; 
} else if (serviceType.equals("TIRE")) {
    panelTireOption.setBackground(selectedRed);
    selectedRepairName = "TIRE & WHEEL";
    selectedRepairPrice = 2500.00; 
} else if (serviceType.equals("BRAKE")) {
    panelBrakeOption.setBackground(selectedRed);
    selectedRepairName = "BRAKE SERVICE";
    selectedRepairPrice = 3000.00; 
} else if (serviceType.equals("ENGINE")) {
    panelEngineOption.setBackground(selectedRed);
    selectedRepairName = "ENGINE DIAGNOSTICS";
    selectedRepairPrice = 4500.00; 
    
    panelOilOption.setBackground(lightRedBg);
        panelTireOption.setBackground(lightRedBg);
        panelBrakeOption.setBackground(lightRedBg);
        panelEngineOption.setBackground(lightRedBg);
}
}
   public String getSelectedPaymentMethod() {
    if (rdoCash.isSelected()) return "Cash (Pay at Pick-up / Delivery)";
    if (rdoCredit.isSelected()) return "Credit / Debit Card";
    if (rdoGCash.isSelected()) return "GCash";
    if (rdoMaya.isSelected()) return "Maya";

    return null; 
}
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnrental = new javax.swing.JButton();
        btnrepair1 = new javax.swing.JButton();
        btntransaction = new javax.swing.JButton();
        btnpi = new javax.swing.JButton();
        btnpayment = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        dbtab = new javax.swing.JTabbedPane();
        Rental = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        dbtab2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        lblEverestPhoto = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lblWigoPhoto = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblMiragePhoto = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        btnmirage = new javax.swing.JButton();
        btnwigo = new javax.swing.JButton();
        btnever = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        lblTravoPhoto = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        lblRangerPhoto = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lblHiluxPhoto = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        btnhilux = new javax.swing.JButton();
        btntravo = new javax.swing.JButton();
        btnranger = new javax.swing.JButton();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnwagon = new javax.swing.JButton();
        btnhice = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblWagonPhoto = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblAlphardPhoto = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblHicePhoto = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        btnalphard = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        Repair = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        btnScheduleOilAction = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        btnScheduleTireAction = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        btnScheduleBrakeAction = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        btnScheduleEngineAction = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        Transaction = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtReturnDate = new com.toedter.calendar.JDateChooser();
        txtPickUpDate = new com.toedter.calendar.JDateChooser();
        txtDaysRented = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        lblVehiclePriceDisplay = new javax.swing.JLabel();
        lblVehicleNameDisplay = new javax.swing.JLabel();
        lblVehicleCapacityDisplay = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        lblVehicleImageDisplay = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        lblVehicleStarsDisplay = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        panelEngineOption = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        panelTireOption = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        panelBrakeOption = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        panelOilOption = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        btntransactproceed = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        lblAppointmentDate = new com.toedter.calendar.JDateChooser();
        jLabel159 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        txtTypeOfCar = new javax.swing.JTextField();
        Pi = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel157 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtemailaddress = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        btnproceedpi = new javax.swing.JButton();
        btnbrowse = new javax.swing.JButton();
        txtIDPath = new javax.swing.JTextField();
        lblIDPreview = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        txtDeliveryAddress = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        btnproceedpi1 = new javax.swing.JButton();
        Payment = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblVehicleImageDisplay1 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        lblVehicleStarsDisplay1 = new javax.swing.JLabel();
        lblPaymentCapacity = new javax.swing.JLabel();
        lblPaymentVehicleName = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        lblPaymentRatings = new javax.swing.JLabel();
        lblRentalVal = new javax.swing.JLabel();
        txtType = new javax.swing.JLabel();
        lblDeliveryVal = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        lblPayment = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        lblTotalPayment = new javax.swing.JLabel();
        lblVehicleStarsDisplay2 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        lblInsuranceVal = new javax.swing.JLabel();
        lblRepairService = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        lblRepairPrice = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        rdoGCash = new javax.swing.JRadioButton();
        rdoCash = new javax.swing.JRadioButton();
        rdoCredit = new javax.swing.JRadioButton();
        rdoMaya = new javax.swing.JRadioButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btnproceed = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1450, 910));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnrental.setBackground(new java.awt.Color(102, 0, 0));
        btnrental.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        btnrental.setForeground(new java.awt.Color(255, 255, 255));
        btnrental.setText("RENTAL");
        btnrental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrentalActionPerformed(evt);
            }
        });
        jPanel1.add(btnrental, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 230, 80));

        btnrepair1.setBackground(new java.awt.Color(102, 0, 0));
        btnrepair1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        btnrepair1.setForeground(new java.awt.Color(255, 255, 255));
        btnrepair1.setText("REPAIR");
        btnrepair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrepair1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnrepair1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 230, 80));

        btntransaction.setBackground(new java.awt.Color(102, 0, 0));
        btntransaction.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        btntransaction.setForeground(new java.awt.Color(255, 255, 255));
        btntransaction.setText("TRANSACTION");
        btntransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransactionActionPerformed(evt);
            }
        });
        jPanel1.add(btntransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, 80));

        btnpi.setBackground(new java.awt.Color(102, 0, 0));
        btnpi.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        btnpi.setForeground(new java.awt.Color(255, 255, 255));
        btnpi.setText("PERSONAL INFORMATION");
        btnpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpiActionPerformed(evt);
            }
        });
        jPanel1.add(btnpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 230, 80));

        btnpayment.setBackground(new java.awt.Color(102, 0, 0));
        btnpayment.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        btnpayment.setForeground(new java.awt.Color(255, 255, 255));
        btnpayment.setText("PAYMENT");
        btnpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaymentActionPerformed(evt);
            }
        });
        jPanel1.add(btnpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 230, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 740));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Rental.setBackground(new java.awt.Color(255, 255, 255));
        Rental.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 5));
        Rental.setPreferredSize(new java.awt.Dimension(1164, 761));
        Rental.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/van.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 50));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel9.setText("Categories");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel31.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 29)); // NOI18N
        jLabel31.setText("QUICK FILTERS");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 13)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/suv (1).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 70, 50));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 13)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\New User\\OneDrive\\Documents\\NetBeansProjects\\carrental\\src\\stars\\pickup.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 70, 50));

        Rental.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 490, 160));

        dbtab2.setBackground(new java.awt.Color(204, 204, 204));
        dbtab2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        dbtab2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 3, true));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        jPanel11.setInheritsPopupMenu(true);
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel26.setText("BYD");
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        lblEverestPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/Ford Everest Titanium.png"))); // NOI18N
        jPanel11.add(lblEverestPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel27.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 0, 0));
        jLabel27.setText("Ford Everest ");
        jPanel11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel28.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/a (2) (1).png"))); // NOI18N
        jLabel28.setText("4-6 person");
        jPanel11.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/gemini-svg (1).png"))); // NOI18N
        jPanel11.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 250, 40));

        jLabel136.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel136.setText("AUTOMATIC");
        jPanel11.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 290, 250));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/Toyota Alphard.png"))); // NOI18N
        jPanel12.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 200, 110));

        jLabel33.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel33.setText("VAN");
        jPanel12.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 70, 20));

        jLabel35.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel35.setText("BYD");
        jPanel12.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblWigoPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/Toyota wigo.png"))); // NOI18N
        jPanel12.add(lblWigoPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 120));

        jLabel37.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(153, 0, 0));
        jLabel37.setText("Toyota wigo");
        jPanel12.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel38.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/a (2) (1).png"))); // NOI18N
        jLabel38.setText("4-6 person");
        jPanel12.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/gemini-svg (1).png"))); // NOI18N
        jPanel12.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 40));

        jLabel137.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel137.setText("AUTOMATIC");
        jPanel12.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jPanel8.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 300, 250));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMiragePhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/Mitsubishi Mirage.png"))); // NOI18N
        jPanel13.add(lblMiragePhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 120));

        jLabel40.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel40.setText("BYD");
        jPanel13.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/gemini-svg (1).png"))); // NOI18N
        jPanel13.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 40));

        jLabel42.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(153, 0, 0));
        jLabel42.setText(" Mirage");
        jPanel13.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel43.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/a (2) (1).png"))); // NOI18N
        jLabel43.setText("4 person");
        jPanel13.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel135.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel135.setText("AUTOMATIC");
        jPanel13.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jPanel8.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 290, 250));

        btnmirage.setBackground(new java.awt.Color(153, 0, 0));
        btnmirage.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        btnmirage.setForeground(new java.awt.Color(255, 255, 255));
        btnmirage.setText("RENT NOW");
        btnmirage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmirageActionPerformed(evt);
            }
        });
        jPanel8.add(btnmirage, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 200, 60));

        btnwigo.setBackground(new java.awt.Color(153, 0, 0));
        btnwigo.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        btnwigo.setForeground(new java.awt.Color(255, 255, 255));
        btnwigo.setText("RENT NOW");
        btnwigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwigoActionPerformed(evt);
            }
        });
        jPanel8.add(btnwigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 200, 60));

        btnever.setBackground(new java.awt.Color(153, 0, 0));
        btnever.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        btnever.setForeground(new java.awt.Color(255, 255, 255));
        btnever.setText("RENT NOW");
        btnever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneverActionPerformed(evt);
            }
        });
        jPanel8.add(btnever, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 200, 60));

        jLabel44.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 29)); // NOI18N
        jLabel44.setText("AVAILABLE VEHICLES");
        jPanel8.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel124.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel124.setText("₱2,500 / day");
        jPanel8.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, -1, -1));

        jLabel125.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel125.setText("₱4,500 / day");
        jPanel8.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jLabel126.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel126.setText("₱3,500 / day");
        jPanel8.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        dbtab2.addTab("", jPanel8);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 3, true));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        jPanel15.setInheritsPopupMenu(true);
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel48.setText("BYD");
        jPanel15.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        lblTravoPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/hilux travo pick up truck.png"))); // NOI18N
        jPanel15.add(lblTravoPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 120));

        jLabel50.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(153, 0, 0));
        jLabel50.setText("Hilux Travo");
        jPanel15.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel51.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/a (2) (1).png"))); // NOI18N
        jLabel51.setText("4-6 person");
        jPanel15.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/gemini-svg (1).png"))); // NOI18N
        jPanel15.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 40));

        jLabel132.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel132.setText("MANUAL");
        jPanel15.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 290, 250));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/Toyota Alphard.png"))); // NOI18N
        jPanel16.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 200, 110));

        jLabel53.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel53.setText("VAN");
        jPanel16.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 70, 20));

        jLabel55.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel55.setText("BYD");
        jPanel16.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblRangerPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/fors.png"))); // NOI18N
        jPanel16.add(lblRangerPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 120));

        jLabel57.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(153, 0, 0));
        jLabel57.setText("Ford Ranger");
        jPanel16.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel58.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/a (2) (1).png"))); // NOI18N
        jLabel58.setText("4-6 person");
        jPanel16.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/gemini-svg (1).png"))); // NOI18N
        jPanel16.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 40));

        jLabel129.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel129.setText("AUTOMATIC");
        jPanel16.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 300, 250));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHiluxPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/hilux.png"))); // NOI18N
        jPanel17.add(lblHiluxPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 120));

        jLabel60.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel60.setText("BYD");
        jPanel17.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/gemini-svg (1).png"))); // NOI18N
        jPanel17.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 40));

        jLabel62.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(153, 0, 0));
        jLabel62.setText("Toyota Hilux");
        jPanel17.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 50));

        jLabel63.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/a (2) (1).png"))); // NOI18N
        jLabel63.setText("4-6 person");
        jPanel17.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel130.setText("MANUAL");
        jPanel17.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jPanel14.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 290, 250));

        jLabel64.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 29)); // NOI18N
        jLabel64.setText("AVAILABLE VEHICLES");
        jPanel14.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnhilux.setBackground(new java.awt.Color(102, 0, 0));
        btnhilux.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        btnhilux.setForeground(new java.awt.Color(255, 255, 255));
        btnhilux.setText("RENT NOW");
        btnhilux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhiluxActionPerformed(evt);
            }
        });
        jPanel14.add(btnhilux, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 200, 60));

        btntravo.setBackground(new java.awt.Color(102, 0, 0));
        btntravo.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        btntravo.setForeground(new java.awt.Color(255, 255, 255));
        btntravo.setText("RENT NOW");
        btntravo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntravoActionPerformed(evt);
            }
        });
        jPanel14.add(btntravo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 200, 60));

        btnranger.setBackground(new java.awt.Color(102, 0, 0));
        btnranger.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        btnranger.setForeground(new java.awt.Color(255, 255, 255));
        btnranger.setText("RENT NOW");
        btnranger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrangerActionPerformed(evt);
            }
        });
        jPanel14.add(btnranger, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 200, 60));

        jLabel121.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel121.setText("₱6,500 / day");
        jPanel14.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jLabel122.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel122.setText("₱6,500 / day");
        jPanel14.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, -1, -1));

        jLabel123.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel123.setText("₱3,500 / day");
        jPanel14.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        jLabel127.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 12)); // NOI18N
        jLabel127.setText("AUTOMATIC");
        jPanel14.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, 20));

        dbtab2.addTab("", jPanel14);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnwagon.setBackground(new java.awt.Color(102, 0, 0));
        btnwagon.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        btnwagon.setForeground(new java.awt.Color(255, 255, 255));
        btnwagon.setText("RENT NOW");
        btnwagon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwagonActionPerformed(evt);
            }
        });
        jPanel6.add(btnwagon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 200, 60));

        btnhice.setBackground(new java.awt.Color(102, 0, 0));
        btnhice.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        btnhice.setForeground(new java.awt.Color(255, 255, 255));
        btnhice.setText("RENT NOW");
        btnhice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhiceActionPerformed(evt);
            }
        });
        jPanel6.add(btnhice, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 200, 60));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        jPanel7.setInheritsPopupMenu(true);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/gemini-svg.png"))); // NOI18N
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/gemini-svg.png"))); // NOI18N
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/gemini-svg.png"))); // NOI18N
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 40));

        lblWagonPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/Suzuki Every Wagon.png"))); // NOI18N
        jPanel7.add(lblWagonPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 100));

        jLabel22.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 0, 0));
        jLabel22.setText("Suzuki Wagon");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel21.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/a (2) (1).png"))); // NOI18N
        jLabel21.setText("4-6 person");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel18.setText("MINIVAN");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel133.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel133.setText("AUTOMATIC");
        jPanel7.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 290, 250));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/Toyota Alphard.png"))); // NOI18N
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 200, 110));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel8.setText("VAN");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 70, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/gemini-svg (1).png"))); // NOI18N
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 40));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel7.setText("VAN");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblAlphardPhoto.setBackground(new java.awt.Color(255, 255, 255));
        lblAlphardPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/Toyota Alphard.png"))); // NOI18N
        jPanel9.add(lblAlphardPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 120));

        jLabel23.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 0, 0));
        jLabel23.setText("Toyota Alphard");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel24.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/a (2) (1).png"))); // NOI18N
        jLabel24.setText("6-10 person");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel134.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel134.setText("AUTOMATIC");
        jPanel9.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 310, 250));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHicePhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/Toyota Hiace Commuter Deluxe.png"))); // NOI18N
        jPanel10.add(lblHicePhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 120));

        jLabel20.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel20.setText("VAN");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/gemini-svg (1).png"))); // NOI18N
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 40));

        jLabel29.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 0, 0));
        jLabel29.setText("Toyota Hice");
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel30.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/a (2) (1).png"))); // NOI18N
        jLabel30.setText("6-10 person");
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel131.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel131.setText("AUTOMATIC");
        jPanel10.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 290, 250));

        btnalphard.setBackground(new java.awt.Color(102, 0, 0));
        btnalphard.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        btnalphard.setForeground(new java.awt.Color(255, 255, 255));
        btnalphard.setText("RENT NOW");
        btnalphard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalphardActionPerformed(evt);
            }
        });
        jPanel6.add(btnalphard, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 200, 60));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 29)); // NOI18N
        jLabel10.setText("AVAILABLE VEHICLES");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel118.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel118.setText("₱4,500 / day");
        jPanel6.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, -1, -1));

        jLabel119.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel119.setText("₱1,500 / day");
        jPanel6.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        jLabel120.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel120.setText("₱5,500 / day");
        jPanel6.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        jLabel128.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 12)); // NOI18N
        jLabel128.setText("AUTOMATIC");
        jPanel6.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, 20));

        dbtab2.addTab("", jPanel6);

        Rental.add(dbtab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1070, 550));

        dbtab.addTab("tab1", Rental);

        Repair.setBackground(new java.awt.Color(255, 255, 255));
        Repair.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("and top-off all fluids.");
        jPanel18.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel68.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel68.setText("filter replacement. Check");
        jPanel18.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/download (3).png"))); // NOI18N
        jPanel18.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        btnScheduleOilAction.setBackground(new java.awt.Color(102, 0, 0));
        btnScheduleOilAction.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnScheduleOilAction.setForeground(new java.awt.Color(255, 255, 255));
        btnScheduleOilAction.setText("REPAIR NOW");
        btnScheduleOilAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleOilActionActionPerformed(evt);
            }
        });
        jPanel18.add(btnScheduleOilAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 420, 50));

        jLabel73.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel73.setText("Premium oil change with");
        jPanel18.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel107.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(102, 0, 0));
        jLabel107.setText("OIL CHANGE");
        jPanel18.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel150.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(102, 0, 0));
        jLabel150.setText("₱ 1,500");
        jPanel18.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        Repair.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 460, 270));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/download (4).png"))); // NOI18N
        jPanel19.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnScheduleTireAction.setBackground(new java.awt.Color(102, 0, 0));
        btnScheduleTireAction.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnScheduleTireAction.setForeground(new java.awt.Color(255, 255, 255));
        btnScheduleTireAction.setText("REPAIR NOW");
        btnScheduleTireAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleTireActionActionPerformed(evt);
            }
        });
        jPanel19.add(btnScheduleTireAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 420, 50));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/download (3).png"))); // NOI18N
        jPanel22.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton8.setBackground(new java.awt.Color(153, 0, 0));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("SCHEDULE OIL CHANGE");
        jPanel22.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 420, 50));

        jPanel19.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 460, 250));

        jLabel75.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(102, 0, 0));
        jLabel75.setText(" SERVICE");
        jPanel19.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel76.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel76.setText("Tire balance, rotation");
        jPanel19.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel77.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel77.setText("pressure check, and tire");
        jPanel19.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabel78.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel78.setText("replacement services.");
        jPanel19.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel103.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(102, 0, 0));
        jLabel103.setText("TIRE & WHEEL ");
        jPanel19.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel151.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(102, 0, 0));
        jLabel151.setText("₱ 1,000");
        jPanel19.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        Repair.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 460, 270));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/download (5).png"))); // NOI18N
        jPanel20.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnScheduleBrakeAction.setBackground(new java.awt.Color(102, 0, 0));
        btnScheduleBrakeAction.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnScheduleBrakeAction.setForeground(new java.awt.Color(255, 255, 255));
        btnScheduleBrakeAction.setText("REPAIR NOW");
        btnScheduleBrakeAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleBrakeActionActionPerformed(evt);
            }
        });
        jPanel20.add(btnScheduleBrakeAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 420, 50));

        jLabel101.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel101.setText("rotor, and fluid inspection");
        jPanel20.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, 20));

        jLabel102.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel102.setText("and service.");
        jPanel20.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, 20));

        jLabel99.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(102, 0, 0));
        jLabel99.setText("REPAIR");
        jPanel20.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jLabel100.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel100.setText("Comprehensive brake pad");
        jPanel20.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, 20));

        jLabel104.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(102, 0, 0));
        jLabel104.setText("BRAKE SYSTEM ");
        jPanel20.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel105.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(102, 0, 0));
        jLabel105.setText("INSPECTION & ");
        jPanel20.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel149.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(102, 0, 0));
        jLabel149.setText("₱ 1,600");
        jPanel20.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        Repair.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 460, 270));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrental/Cars/download (6).png"))); // NOI18N
        jPanel21.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        btnScheduleEngineAction.setBackground(new java.awt.Color(102, 0, 0));
        btnScheduleEngineAction.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnScheduleEngineAction.setForeground(new java.awt.Color(255, 255, 255));
        btnScheduleEngineAction.setText("REPAIR NOW");
        btnScheduleEngineAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleEngineActionActionPerformed(evt);
            }
        });
        jPanel21.add(btnScheduleEngineAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 420, 50));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/download (3).png"))); // NOI18N
        jPanel23.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton9.setBackground(new java.awt.Color(153, 0, 0));
        jButton9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("SCHEDULE OIL CHANGE");
        jPanel23.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 420, 50));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/download (3).png"))); // NOI18N
        jPanel24.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton10.setBackground(new java.awt.Color(153, 0, 0));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("SCHEDULE OIL CHANGE");
        jPanel24.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 420, 50));

        jPanel23.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 460, 250));

        jLabel81.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(102, 0, 0));
        jLabel81.setText("OIL CHANGE");
        jPanel23.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel82.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel82.setText("Premium oil change with");
        jPanel23.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel83.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel83.setText("filter replacement. Check");
        jPanel23.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabel84.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel84.setText("and top-off all fluids.");
        jPanel23.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jPanel21.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 460, 250));

        jLabel85.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 0, 0));
        jLabel85.setText(" DIAGNOSTICS");
        jPanel21.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jLabel89.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel89.setText("check fault code analysis, and");
        jPanel21.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/download (3).png"))); // NOI18N
        jPanel25.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton11.setBackground(new java.awt.Color(153, 0, 0));
        jButton11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("SCHEDULE OIL CHANGE");
        jPanel25.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 420, 50));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/download (3).png"))); // NOI18N
        jPanel26.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton12.setBackground(new java.awt.Color(153, 0, 0));
        jButton12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("SCHEDULE OIL CHANGE");
        jPanel26.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 420, 50));

        jPanel25.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 460, 250));

        jLabel92.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(102, 0, 0));
        jLabel92.setText("OIL CHANGE");
        jPanel25.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel93.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel93.setText("Premium oil change with");
        jPanel25.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel94.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel94.setText("filter replacement. Check");
        jPanel25.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabel95.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel95.setText("and top-off all fluids.");
        jPanel25.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jPanel21.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 460, 250));

        jLabel96.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel96.setText("Full vehicle diagnostic check");
        jPanel21.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jLabel98.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel98.setText("repair estimate.");
        jPanel21.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel106.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(102, 0, 0));
        jLabel106.setText("ENGINE ");
        jPanel21.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel152.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(102, 0, 0));
        jLabel152.setText("₱ 2,200");
        jPanel21.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        Repair.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 460, 270));

        jPanel37.setBackground(new java.awt.Color(102, 0, 0));

        jLabel72.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("VEHICLE REPAIR & MAINTENANCE SERVICES");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel72)
                .addContainerGap(628, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Repair.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 1130, 60));

        dbtab.addTab("tab2", Repair);

        Transaction.setPreferredSize(new java.awt.Dimension(1164, 761));
        Transaction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(102, 0, 0));
        jPanel27.setPreferredSize(new java.awt.Dimension(1800, 900));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BOOKING REVIEW & PERSONAL INFORMATION");
        jPanel27.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Transaction.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1170, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1164, 759));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel34.setBackground(new java.awt.Color(102, 0, 0));

        jLabel49.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Choose Date for Booking");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel28.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        jLabel39.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel39.setText("Days Rented:");
        jPanel28.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 30));

        jLabel47.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel47.setText("Return Date:");
        jPanel28.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        txtReturnDate.setDateFormatString("MMMM d, yy");
        txtReturnDate.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jPanel28.add(txtReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 220, 40));

        txtPickUpDate.setDateFormatString("MMMM d, yy");
        txtPickUpDate.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jPanel28.add(txtPickUpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 220, 40));
        jPanel28.add(txtDaysRented, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 220, 40));

        jLabel59.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel59.setText("Pick-up Date: ");
        jPanel28.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jPanel3.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 510, 240));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 3, true));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVehiclePriceDisplay.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblVehiclePriceDisplay.setText("__________________");
        jPanel30.add(lblVehiclePriceDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 160, -1));

        lblVehicleNameDisplay.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblVehicleNameDisplay.setText("__________________");
        jPanel30.add(lblVehicleNameDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 200, -1));

        lblVehicleCapacityDisplay.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblVehicleCapacityDisplay.setText("__________________");
        jPanel30.add(lblVehicleCapacityDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 200, -1));

        jLabel86.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel86.setText("Vehicle Price:");
        jPanel30.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jLabel113.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel113.setText("SELECTED VEHICLE");
        jPanel30.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel114.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel114.setText("Vehicle Name:");
        jPanel30.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jLabel115.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel115.setText("Capacity:");
        jPanel30.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        lblVehicleImageDisplay.setBackground(new java.awt.Color(255, 255, 255));
        lblVehicleImageDisplay.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        lblVehicleImageDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVehicleImageDisplay.setText("__________________");
        lblVehicleImageDisplay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 3, true));
        jPanel30.add(lblVehicleImageDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, 160));

        jLabel145.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel145.setText("Ratings:");
        jPanel30.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        lblVehicleStarsDisplay.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblVehicleStarsDisplay.setText("__________________");
        jPanel30.add(lblVehicleStarsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 160, -1));

        jPanel3.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 510, 230));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 3, true));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEngineOption.setBackground(new java.awt.Color(255, 255, 255));
        panelEngineOption.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 3, true));
        panelEngineOption.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/download (6).png"))); // NOI18N
        panelEngineOption.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel88.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel88.setText("DIAGNOSTICS");
        panelEngineOption.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jLabel111.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel111.setText("ENGINE");
        panelEngineOption.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel32.add(panelEngineOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 110, 240));

        panelTireOption.setBackground(new java.awt.Color(255, 255, 255));
        panelTireOption.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 3, true));
        panelTireOption.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/download (4).png"))); // NOI18N
        panelTireOption.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/download (3).png"))); // NOI18N
        panelTireOption.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel109.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel109.setText("TIRE & WHEEL");
        panelTireOption.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel110.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel110.setText("SERVICE");
        panelTireOption.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jPanel32.add(panelTireOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 120, 240));

        panelBrakeOption.setBackground(new java.awt.Color(255, 255, 255));
        panelBrakeOption.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 3, true));
        panelBrakeOption.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/download (5).png"))); // NOI18N
        panelBrakeOption.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel97.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel97.setText("& REPAIR");
        panelBrakeOption.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel108.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel108.setText("BRAKE SYSTEM");
        panelBrakeOption.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, -1));

        jLabel67.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        panelBrakeOption.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel112.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel112.setText("INSPECTION");
        panelBrakeOption.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jPanel32.add(panelBrakeOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 120, 240));

        panelOilOption.setBackground(new java.awt.Color(255, 255, 255));
        panelOilOption.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 3, true));
        panelOilOption.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/download (3).png"))); // NOI18N
        panelOilOption.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel87.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel87.setText("OIL CHANGE");
        panelOilOption.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jPanel32.add(panelOilOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 240));

        jLabel66.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel66.setText("REPAIR OPTIONS");
        jPanel32.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel3.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 520, 320));

        btntransactproceed.setBackground(new java.awt.Color(102, 0, 0));
        btntransactproceed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btntransactproceed.setForeground(new java.awt.Color(255, 255, 255));
        btntransactproceed.setText("PROCEED ");
        btntransactproceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransactproceedActionPerformed(evt);
            }
        });
        jPanel3.add(btntransactproceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 630, 260, 50));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel38.setBackground(new java.awt.Color(102, 0, 0));

        jLabel116.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("Choose Date for Appointment");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel116)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel36.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        lblAppointmentDate.setDateFormatString("MMMM d, yy");
        lblAppointmentDate.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jPanel36.add(lblAppointmentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 220, 40));

        jLabel159.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel159.setText("Type of Car:");
        jPanel36.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        jLabel163.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel163.setText("Appointment Date:");
        jPanel36.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        txtTypeOfCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeOfCarActionPerformed(evt);
            }
        });
        jPanel36.add(txtTypeOfCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 200, 40));

        jPanel3.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 310));

        Transaction.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1190, 690));

        dbtab.addTab("tab3", Transaction);

        Pi.setBackground(new java.awt.Color(255, 255, 255));
        Pi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(102, 0, 0));

        jLabel157.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setText("CUSTOMER INFORMATION");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel157)
                .addContainerGap(829, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Pi.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 70));

        jLabel143.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel143.setText("Upload Valid ID");
        Pi.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, 40));

        jLabel158.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel158.setText("Full name:");
        Pi.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 40));

        jLabel160.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel160.setText("Email Address:");
        Pi.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 40));

        jLabel161.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel161.setText("Phone Number:");
        Pi.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 40));

        jLabel162.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel162.setText("Drivers License No.");
        Pi.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 40));

        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Pi.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 240, 40));

        txtFullName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Pi.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 240, 40));

        txtemailaddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Pi.add(txtemailaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 240, 40));

        txtphone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Pi.add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 240, 40));

        btnproceedpi.setBackground(new java.awt.Color(102, 0, 0));
        btnproceedpi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnproceedpi.setForeground(new java.awt.Color(255, 255, 255));
        btnproceedpi.setText("BACK");
        btnproceedpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproceedpiActionPerformed(evt);
            }
        });
        Pi.add(btnproceedpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 190, 60));

        btnbrowse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnbrowse.setText("Browse");
        btnbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseActionPerformed(evt);
            }
        });
        Pi.add(btnbrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, -1, -1));

        txtIDPath.setEditable(false);
        txtIDPath.setDoubleBuffered(true);
        Pi.add(txtIDPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 240, 30));

        lblIDPreview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDPreview.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 2, true));
        Pi.add(lblIDPreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 230, 190));

        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Pi.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 240, 40));

        txtDeliveryAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtDeliveryAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeliveryAddressActionPerformed(evt);
            }
        });
        Pi.add(txtDeliveryAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 240, 40));

        jLabel166.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel166.setText("Delivery Address:");
        Pi.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 40));

        btnproceedpi1.setBackground(new java.awt.Color(102, 0, 0));
        btnproceedpi1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnproceedpi1.setForeground(new java.awt.Color(255, 255, 255));
        btnproceedpi1.setText("PROCEED  TO PAYMENT");
        btnproceedpi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproceedpi1ActionPerformed(evt);
            }
        });
        Pi.add(btnproceedpi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, 60));

        dbtab.addTab("tab5", Pi);

        Payment.setBackground(new java.awt.Color(255, 255, 255));
        Payment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 3, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVehicleImageDisplay1.setBackground(new java.awt.Color(255, 255, 255));
        lblVehicleImageDisplay1.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        lblVehicleImageDisplay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVehicleImageDisplay1.setText("__________________");
        lblVehicleImageDisplay1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 3, true));
        jPanel5.add(lblVehicleImageDisplay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 160));

        jLabel139.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel139.setText("Capacity:");
        jPanel5.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel140.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel140.setText("Ratings:");
        jPanel5.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        lblVehicleStarsDisplay1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblVehicleStarsDisplay1.setText("__________________________________________________________________");
        jPanel5.add(lblVehicleStarsDisplay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 550, -1));

        lblPaymentCapacity.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel5.add(lblPaymentCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 200, 40));

        lblPaymentVehicleName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel5.add(lblPaymentVehicleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 200, 60));

        jLabel141.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel141.setText("Vehicle Name:");
        jPanel5.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel142.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel142.setText("Price:");
        jPanel5.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel144.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel144.setText("Optional Insurance:");
        jPanel5.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        lblPaymentRatings.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel5.add(lblPaymentRatings, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 140, 50));

        lblRentalVal.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel5.add(lblRentalVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 280, 60));

        txtType.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel5.add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 240, 40));

        lblDeliveryVal.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel5.add(lblDeliveryVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 220, 50));

        jLabel146.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel146.setText("Vehicle Price:");
        jPanel5.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        lblPayment.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel5.add(lblPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 160, 50));

        jLabel147.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel147.setText("Vehicle Repair Summary");
        jPanel5.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel148.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel148.setText("TOTAL PAYMENT:");
        jPanel5.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        lblTotalPayment.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jPanel5.add(lblTotalPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 230, 50));

        lblVehicleStarsDisplay2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblVehicleStarsDisplay2.setText("__________________________________________________________________");
        jPanel5.add(lblVehicleStarsDisplay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 710, -1));

        jLabel153.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel153.setText("Delivery / Pickup Fee:");
        jPanel5.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel154.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel154.setText("Vehicle Rental Summary");
        jPanel5.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        jLabel155.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel155.setText("Vehicle Rental:");
        jPanel5.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel156.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel156.setText("Type of Car:");
        jPanel5.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        lblInsuranceVal.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel5.add(lblInsuranceVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 240, 50));

        lblRepairService.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel5.add(lblRepairService, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 240, 70));

        jLabel165.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel165.setText("Service:");
        jPanel5.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        lblRepairPrice.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel5.add(lblRepairPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 240, 50));

        Payment.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 530, 650));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 3, true));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 3, true));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rdoGCash.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoGCash);
        rdoGCash.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        rdoGCash.setText("Gcash");
        rdoGCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGCashActionPerformed(evt);
            }
        });
        jPanel29.add(rdoGCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 370, -1));

        rdoCash.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoCash);
        rdoCash.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        rdoCash.setText("Cash(Pay Pickup/Delivery)");
        rdoCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCashActionPerformed(evt);
            }
        });
        jPanel29.add(rdoCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 370, -1));

        rdoCredit.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoCredit);
        rdoCredit.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        rdoCredit.setText("Credit/Debit Card");
        rdoCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCreditActionPerformed(evt);
            }
        });
        jPanel29.add(rdoCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 370, -1));

        rdoMaya.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoMaya);
        rdoMaya.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        rdoMaya.setText("Maya");
        rdoMaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMayaActionPerformed(evt);
            }
        });
        jPanel29.add(rdoMaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 370, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/icons8-paymaya-32.png"))); // NOI18N
        jPanel29.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/icons8-cash-32.png"))); // NOI18N
        jPanel29.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/icons8-credit-card-32.png"))); // NOI18N
        jPanel29.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/icons8-gcash-32.png"))); // NOI18N
        jPanel29.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Select Payment Method:");
        jPanel29.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jPanel33.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 480, 340));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setText("Payment Method");
        jPanel33.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnproceed.setBackground(new java.awt.Color(255, 255, 255));
        btnproceed.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnproceed.setText("PROCEED");
        btnproceed.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 2, true));
        btnproceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproceedActionPerformed(evt);
            }
        });
        jPanel33.add(btnproceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 210, 70));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel33.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 210, 70));

        Payment.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 90, 530, 650));

        jPanel35.setBackground(new java.awt.Color(102, 0, 0));

        jLabel11.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CAR RENTAL PAYMENT");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(831, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Payment.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1110, 60));

        dbtab.addTab("tab4", Payment);

        jPanel2.add(dbtab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 780));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -30, 1100, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrentalActionPerformed
        dbtab.setSelectedIndex(0);
    }//GEN-LAST:event_btnrentalActionPerformed

    private void btntransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransactionActionPerformed
        dbtab.setSelectedIndex(2);
    }//GEN-LAST:event_btntransactionActionPerformed

    private void btnrepair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrepair1ActionPerformed
                dbtab.setSelectedIndex(1);
    }//GEN-LAST:event_btnrepair1ActionPerformed

    private void btnwagonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwagonActionPerformed
     javax.swing.ImageIcon img = (javax.swing.ImageIcon) lblWagonPhoto.getIcon();
    selectedVehiclePrice = 1500.00;
  
    isRentalActive = true; 
    isRepairActive = false;
    updateAppointmentDetails("Suzuki Wagon", img, "4-6 person", " 5/5", selectedVehiclePrice);
    dbtab.setSelectedIndex(2);
    }//GEN-LAST:event_btnwagonActionPerformed

    private void btnhiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhiceActionPerformed
         javax.swing.ImageIcon img = (javax.swing.ImageIcon) lblHicePhoto.getIcon();
    selectedVehiclePrice = 4500.00;
    
    isRentalActive = true; 
    isRepairActive = false;
    updateAppointmentDetails("Toyota Hice", img, "4-6 person", " 5/5", selectedVehiclePrice);
    dbtab.setSelectedIndex(2);
    }//GEN-LAST:event_btnhiceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dbtab2.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnalphardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalphardActionPerformed
     javax.swing.ImageIcon img = (javax.swing.ImageIcon) lblAlphardPhoto.getIcon();
      selectedVehiclePrice = 5500.00;
      
    isRentalActive = true; 
    isRepairActive = false;
      updateAppointmentDetails("Toyota Alphard", img, " 4-6 person", " 5/5", selectedVehiclePrice);
      dbtab.setSelectedIndex(2);

    }//GEN-LAST:event_btnalphardActionPerformed

    private void btnmirageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmirageActionPerformed
   javax.swing.ImageIcon img = (javax.swing.ImageIcon) lblMiragePhoto.getIcon();
   selectedVehiclePrice = 2500.00;
   
    isRentalActive = true; 
    isRepairActive = false;
   updateAppointmentDetails("Mitsubishi Mirage", img, " 4-6 person", " 5/5", selectedVehiclePrice);
   dbtab.setSelectedIndex(2);
    }//GEN-LAST:event_btnmirageActionPerformed

    private void btnwigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwigoActionPerformed
         javax.swing.ImageIcon img = (javax.swing.ImageIcon) lblWigoPhoto.getIcon();
         selectedVehiclePrice = 3500.00;
         
    isRentalActive = true; 
    isRepairActive = false;
      updateAppointmentDetails("Toyota Wigo", img, " 4-6 person", " 5/5", selectedVehiclePrice);
      
    dbtab.setSelectedIndex(2);
    }//GEN-LAST:event_btnwigoActionPerformed

    private void btneverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneverActionPerformed
          javax.swing.ImageIcon img = (javax.swing.ImageIcon) lblEverestPhoto.getIcon();
          selectedVehiclePrice = 4500.00;
          
    isRentalActive = true; 
    isRepairActive = false;
      updateAppointmentDetails("Ford Everest", img, " 4-6 person", " 5/5", selectedVehiclePrice);
     
    dbtab.setSelectedIndex(2);
    }//GEN-LAST:event_btneverActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       dbtab2.setSelectedIndex(1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dbtab2.setSelectedIndex(2);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnhiluxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhiluxActionPerformed
javax.swing.ImageIcon img = (javax.swing.ImageIcon) lblHiluxPhoto.getIcon();
selectedVehiclePrice = 6500.00;

    isRentalActive = true; 
    isRepairActive = false;
      updateAppointmentDetails("Toyota Hilux", img, " 4-6 person", " 5/5", selectedVehiclePrice);
      
    dbtab.setSelectedIndex(2);

    }//GEN-LAST:event_btnhiluxActionPerformed

    private void btntravoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntravoActionPerformed
       javax.swing.ImageIcon img = (javax.swing.ImageIcon) lblTravoPhoto.getIcon();
       selectedVehiclePrice = 6500.00;
       
    isRentalActive = true; 
    isRepairActive = false;
      updateAppointmentDetails("Hilux Travo", img, " 4-6 person", " 5/5", selectedVehiclePrice);
      
    dbtab.setSelectedIndex(2);
    }//GEN-LAST:event_btntravoActionPerformed

    private void btnrangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrangerActionPerformed
         javax.swing.ImageIcon img = (javax.swing.ImageIcon) lblRangerPhoto.getIcon();
         selectedVehiclePrice = 3500.00;
         
    isRentalActive = true; 
    isRepairActive = false;
      updateAppointmentDetails("Ford Ranger", img, " 4-6 person", " 5/5", selectedVehiclePrice);
    
    dbtab.setSelectedIndex(2);
    }//GEN-LAST:event_btnrangerActionPerformed

    private void btnScheduleTireActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleTireActionActionPerformed
 updateRepairSelection("TIRE");
    BookingData.serviceType = "Tire & Wheel Service";
    BookingData.repairPrice = "1000.00";
    

    isRepairActive = true;
    isRentalActive = false;
    
 
    dbtab.setSelectedIndex(2);
    }//GEN-LAST:event_btnScheduleTireActionActionPerformed

    private void btnScheduleOilActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleOilActionActionPerformed
updateRepairSelection("OIL"); 
    BookingData.serviceType = "Oil Change"; 
    BookingData.repairPrice = "1500.00";
    
   
    dbtab.setSelectedIndex(2);
    }//GEN-LAST:event_btnScheduleOilActionActionPerformed

    private void btnScheduleBrakeActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleBrakeActionActionPerformed
      updateRepairSelection("BRAKE");
    BookingData.serviceType = "Brake System Inspection & Repair";
    BookingData.repairPrice = "1600.00";
    
    dbtab.setSelectedIndex(2);
    }//GEN-LAST:event_btnScheduleBrakeActionActionPerformed

    private void btnScheduleEngineActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleEngineActionActionPerformed
     updateRepairSelection("ENGINE");
    BookingData.serviceType = "Engine Diagnostics";
    BookingData.repairPrice = "2200.00";
    
    dbtab.setSelectedIndex(2);
    }//GEN-LAST:event_btnScheduleEngineActionActionPerformed

    private void btnpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaymentActionPerformed
dbtab.setSelectedIndex(4);
    }//GEN-LAST:event_btnpaymentActionPerformed

    private void btntransactproceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransactproceedActionPerformed
  System.out.println("isRentalActive: " + isRentalActive);
    System.out.println("isRepairActive: " + isRepairActive);

  
    if (isRentalActive) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MM-dd-yyyy");
        String pDate = (txtPickUpDate.getDate() != null) ? sdf.format(txtPickUpDate.getDate()) : "N/A";
        String rDate = (txtReturnDate.getDate() != null) ? sdf.format(txtReturnDate.getDate()) : "N/A";
        BookingData.rentalDates = pDate + " to " + rDate;
        
    }


    if (isRepairActive) {
        BookingData.apptDate = (lblAppointmentDate.getDate() != null) ? new java.text.SimpleDateFormat("MM-dd-yyyy").format(lblAppointmentDate.getDate()) : "N/A";
        BookingData.typeofcar = txtTypeOfCar.getText();
    }


    BookingData.carImage = (javax.swing.ImageIcon) lblVehicleImageDisplay.getIcon();
    BookingData.fullName = txtFullName.getText();
    BookingData.email = txtemailaddress.getText();
    BookingData.phone = txtphone.getText();
    BookingData.address = txtDeliveryAddress.getText();

 
    int days = 0;
    if (isRentalActive) {
        try {
            String rentalInput = txtDaysRented.getText();
            if (rentalInput != null && !rentalInput.isEmpty()) {
                days = Integer.parseInt(rentalInput);
            }
        } catch (NumberFormatException e) {
            days = 1;
        }
        
        if (txtPickUpDate.getDate() != null && txtReturnDate.getDate() != null) {
            long diff = txtReturnDate.getDate().getTime() - txtPickUpDate.getDate().getTime();
            days = (int) java.util.concurrent.TimeUnit.DAYS.convert(diff, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (days <= 0) days = 1;
        }
    }


    updatePaymentDisplay(days, this.selectedVehiclePrice, 300.0, 50.0);

    dbtab.setSelectedIndex(3);
    

   

    }//GEN-LAST:event_btntransactproceedActionPerformed

    private void btnpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpiActionPerformed
  dbtab.setSelectedIndex(3);        
    }//GEN-LAST:event_btnpiActionPerformed

    private void txtTypeOfCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeOfCarActionPerformed
     
    }//GEN-LAST:event_txtTypeOfCarActionPerformed

    private void btnproceedpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproceedpiActionPerformed
      
        dbtab.setSelectedIndex(3);
    }//GEN-LAST:event_btnproceedpiActionPerformed

    private void btnbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrowseActionPerformed
         javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    

    fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Images", "jpg", "png", "jpeg"));
    
    int result = fileChooser.showOpenDialog(this);
    
    if (result == javax.swing.JFileChooser.APPROVE_OPTION) {
        java.io.File selectedFile = fileChooser.getSelectedFile();
        String path = selectedFile.getAbsolutePath();
        
     
        txtIDPath.setText(path);
        
        
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(path);
        

        java.awt.Image img = icon.getImage().getScaledInstance(lblIDPreview.getWidth(), lblIDPreview.getHeight(), java.awt.Image.SCALE_SMOOTH);
        
       
        lblIDPreview.setIcon(new javax.swing.ImageIcon(img));
    }

    

    }//GEN-LAST:event_btnbrowseActionPerformed

    private void rdoGCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoGCashActionPerformed

    private void rdoCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoCashActionPerformed

    private void rdoCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoCreditActionPerformed

    private void rdoMayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoMayaActionPerformed

    private void btnproceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproceedActionPerformed
     BookingData.customerName = txtFullName.getText();
BookingData.phoneNumber = txtphone.getText();
BookingData.deliveryAddress = txtDeliveryAddress.getText();
        BookingData.paymentMethod = getSelectedPaymentMethod();
    BookingData.totalAmount = lblTotalPayment.getText();
    
 
    reviewbooking reviewFrame = new reviewbooking();
    
 
    reviewFrame.displayAllDetails(); 
    
 
    reviewFrame.setVisible(true);
    reviewFrame.setLocationRelativeTo(null);
    
    }//GEN-LAST:event_btnproceedActionPerformed

    private void txtDeliveryAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeliveryAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeliveryAddressActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dbtab.setSelectedIndex(3);  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnproceedpi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproceedpi1ActionPerformed
      txtType.setText(txtTypeOfCar.getText()); 
        dbtab.setSelectedIndex(4);
    }//GEN-LAST:event_btnproceedpi1ActionPerformed
    
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
    private javax.swing.JPanel Payment;
    private javax.swing.JPanel Pi;
    private javax.swing.JPanel Rental;
    private javax.swing.JPanel Repair;
    private javax.swing.JPanel Transaction;
    private javax.swing.JButton btnScheduleBrakeAction;
    private javax.swing.JButton btnScheduleEngineAction;
    private javax.swing.JButton btnScheduleOilAction;
    private javax.swing.JButton btnScheduleTireAction;
    private javax.swing.JButton btnalphard;
    private javax.swing.JButton btnbrowse;
    private javax.swing.JButton btnever;
    private javax.swing.JButton btnhice;
    private javax.swing.JButton btnhilux;
    private javax.swing.JButton btnmirage;
    private javax.swing.JButton btnpayment;
    private javax.swing.JButton btnpi;
    private javax.swing.JButton btnproceed;
    private javax.swing.JButton btnproceedpi;
    private javax.swing.JButton btnproceedpi1;
    private javax.swing.JButton btnranger;
    private javax.swing.JButton btnrental;
    private javax.swing.JButton btnrepair1;
    private javax.swing.JButton btntransaction;
    private javax.swing.JButton btntransactproceed;
    private javax.swing.JButton btntravo;
    private javax.swing.JButton btnwagon;
    private javax.swing.JButton btnwigo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTabbedPane dbtab;
    private javax.swing.JTabbedPane dbtab2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblAlphardPhoto;
    private com.toedter.calendar.JDateChooser lblAppointmentDate;
    private javax.swing.JLabel lblDeliveryVal;
    private javax.swing.JLabel lblEverestPhoto;
    private javax.swing.JLabel lblHicePhoto;
    private javax.swing.JLabel lblHiluxPhoto;
    private javax.swing.JLabel lblIDPreview;
    private javax.swing.JLabel lblInsuranceVal;
    private javax.swing.JLabel lblMiragePhoto;
    private javax.swing.JLabel lblPayment;
    private javax.swing.JLabel lblPaymentCapacity;
    private javax.swing.JLabel lblPaymentRatings;
    private javax.swing.JLabel lblPaymentVehicleName;
    private javax.swing.JLabel lblRangerPhoto;
    private javax.swing.JLabel lblRentalVal;
    private javax.swing.JLabel lblRepairPrice;
    private javax.swing.JLabel lblRepairService;
    private javax.swing.JLabel lblTotalPayment;
    private javax.swing.JLabel lblTravoPhoto;
    private javax.swing.JLabel lblVehicleCapacityDisplay;
    private javax.swing.JLabel lblVehicleImageDisplay;
    private javax.swing.JLabel lblVehicleImageDisplay1;
    private javax.swing.JLabel lblVehicleNameDisplay;
    private javax.swing.JLabel lblVehiclePriceDisplay;
    private javax.swing.JLabel lblVehicleStarsDisplay;
    private javax.swing.JLabel lblVehicleStarsDisplay1;
    private javax.swing.JLabel lblVehicleStarsDisplay2;
    private javax.swing.JLabel lblWagonPhoto;
    private javax.swing.JLabel lblWigoPhoto;
    private javax.swing.JPanel panelBrakeOption;
    private javax.swing.JPanel panelEngineOption;
    private javax.swing.JPanel panelOilOption;
    private javax.swing.JPanel panelTireOption;
    private javax.swing.JRadioButton rdoCash;
    private javax.swing.JRadioButton rdoCredit;
    private javax.swing.JRadioButton rdoGCash;
    private javax.swing.JRadioButton rdoMaya;
    private javax.swing.JTextField txtDaysRented;
    private javax.swing.JTextField txtDeliveryAddress;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtIDPath;
    private com.toedter.calendar.JDateChooser txtPickUpDate;
    private com.toedter.calendar.JDateChooser txtReturnDate;
    private javax.swing.JLabel txtType;
    private javax.swing.JTextField txtTypeOfCar;
    private javax.swing.JTextField txtemailaddress;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
