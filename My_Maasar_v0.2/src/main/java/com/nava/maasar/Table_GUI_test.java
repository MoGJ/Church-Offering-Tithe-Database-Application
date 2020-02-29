package com.nava.maasar;

import com.nava.maasar.maasarDao.Member;
import com.nava.maasar.maasarDao.Tithe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
//import java.util.Vector;
//import javax.swing.table.DefaultTableModel;
        
/**
 *
 * @author j713n
 */
public class Table_GUI_test extends javax.swing.JFrame {

    /** Creates new form Table_GUI */
    public Table_GUI_test() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Maasar - Enter Tithes For Today (" + 
            LocalDate.now() + ")");
        setName("TableGui_Frame"); // NOI18N

        jScrollPane2.setBackground(new java.awt.Color(195, 248, 210));
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setName("Main_Scrollpane"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(195, 248, 210));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Offerings Table");

        jTable2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Wednesday Offering", "Friday Offering", "Sunday School Offering", "Sunday Service Offering"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setName("Offerings_Table"); // NOI18N
        jTable2.setSelectionBackground(new java.awt.Color(204, 255, 153));
        jTable2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable2.setShowGrid(true);
        jScrollPane6.setViewportView(jTable2);

        jButton1.setText("Go Home");
        jButton1.setToolTipText("Go Back To The Home Page");
        jButton1.setName("GoHome_Button"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(195, 248, 210));

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Cash Amt", "Credit/Debit Amt", "Check Amt", "", "Tithe Amt", "Offering Amt", "Pro Temple Amt", "Other"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setName("Tithes_Table"); // NOI18N
        jTable1.setSelectionBackground(new java.awt.Color(204, 255, 153));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        //jSpinner1.addPropertyChangeListener(new java.beans.PropertyChangeListener()
            //		{
                //			public void propertyChange(java.beans.PropertyChangeEvent evt) 
                //			{
                    //				try {
                        //        				jSpinner1.commitEdit();
                        //        			} catch (java.text.ParseException e){
                        //            
                        //        			}
                    //
                    //				int jSpinValue = (Integer) jSpinner1.getValue();
                    //
                    //                                int rowCount = jTable1.getModel().getRowCount();
                    //        
                    //                                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    //        
                    //				if(jSpinValue > 10) {
                        //                                    Vector rowData = null;
                        //                                    model.addRow(rowData);
                        //                                    jTable1.validate();
                        //                                }
                    //                                
                    //                                if((jSpinValue < 10) && (rowCount > 0)) {
                        //                                    model.removeRow(rowCount - 1);
                        //                                    jTable1.validate();
                        //                                }
                    //				
                    //			}
                //		});
        jScrollPane1.setViewportView(jTable1);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(10, 0, 1000, 1));
        jSpinner1.setName("TithesNumber_Spinner"); // NOI18N
        jSpinner1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSpinner1PropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tithes Table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(195, 248, 210));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Totals Tables");
        jLabel3.setToolTipText("");

        jScrollPane3.setName("TotalCash_Table"); // NOI18N

        jTable3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"$0.01", null},
                {"$0.05", null},
                {"$0.10", null},
                {"$0.25", null},
                {"$0.50", null},
                {"$1.00", null},
                {"$2.00", null},
                {"$5.00", null},
                {"$10.00", null},
                {"$20.00", null},
                {"$50.00", null},
                {"$100.00", null}
            },
            new String [] {
                "Cash Amt", "# of Amt Recieved"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setSelectionBackground(new java.awt.Color(204, 255, 153));
        jTable3.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable3.setShowGrid(true);
        jScrollPane3.setViewportView(jTable3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cash Total");

        jTable4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"#1", null},
                {"#2", null},
                {"#3", null},
                {"#4", null},
                {"#5", null},
                {"#6", null},
                {"#7", null},
                {"#8", null},
                {"#9", null},
                {"#10", null},
                {"#11", null},
                {"#12", null}
            },
            new String [] {
                "# of Checks", "Amt of Check"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.setName("ChecksTotal_Table"); // NOI18N
        jTable4.setSelectionBackground(new java.awt.Color(204, 255, 153));
        jTable4.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable4.setShowGrid(true);
        jScrollPane4.setViewportView(jTable4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Checks Total");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Total Received");
        jLabel6.setToolTipText("The SUM of cash, deb/cred, and check amounts");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Amount");
        jLabel7.setName("TotalAmount_Label"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Amounts Match?");
        jLabel8.setToolTipText("If the amounts entered in the Totals Tables match the amounts entered in the Tithes and Offering table, YES will be displayed. If not, NO will be displayed.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("YES/NO");
        jLabel9.setName("AmountsMatch_Label"); // NOI18N

        jScrollPane5.setName("TotalAmounts_Table"); // NOI18N

        jTable5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Total Cash Amt", "Total Debit/Credit Amt", "Total Checks Amt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable5.setToolTipText("Used to check amounts entered from Offerings & Tithes Tables to the Totals Tables amounts");
        jTable5.setSelectionBackground(new java.awt.Color(204, 255, 153));
        jTable5.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable5.setShowGrid(true);
        jScrollPane5.setViewportView(jTable5);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Save");
        jButton2.setToolTipText("Save the Report");
        jButton2.setName("Save_Button"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(17, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //To use when Save button is clicked to save Offering values into Offering table in database
    public void OfferingSaveBactionPerformed() {
        int cols = jTable2.getModel().getColumnCount();
        int rows = jTable2.getModel().getRowCount();
        System.out.println("Offering - Rows:" + rows + "\nCols:" + cols);
        try {
            for (int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    double element = (Double) jTable2.getModel().getValueAt(i, j);
                    //offeringValues.
                    System.out.println("Offering value is: " + element);
                }
            
            //offeringValues.add(i, //);
            
            }
        } catch(java.lang.NullPointerException e) {
            
        }
        

    }
    
        //To use when Save button is clicked to save Tithe values into Tithe table in database
        public void TitheSaveBactionPerformed() {
        int cols = jTable1.getModel().getColumnCount();
        int rows = jTable1.getModel().getRowCount();
        ArrayList<Tithe> titheValues = new ArrayList<>();
        //to use in the for loop below
        String element; 
        double elementNumb;
        
        try {
            for (int i = 0; i < rows; i++) {
                Tithe tithe = new Tithe();
                
                //if statement to stop loop if there is not a value detected for first name
                if (jTable1.getModel().getValueAt(i, 0) == null) {
                    continue;
                }
            for(int j = 0; j < cols; j++) {
                //if j==5, skip to next iteration (table does not have a value in the 5th column)
                if((j==5)) {
                        continue;
                    }
                //switch statement to set values from table to correct Tithe class value
                switch(j) {
                    case 0:
                            element = (String) jTable1.getModel().getValueAt(i, j);
                            tithe.setFirst_name(element);
                            break;
                            
                    case 1:
                            element = (String) jTable1.getModel().getValueAt(i, j);
                            tithe.setLast_name(element);
                            break;
                            
                    case 2:
                            elementNumb = (Double) jTable1.getModel().getValueAt(i, j);
                            tithe.setCash_amount(elementNumb);
                            break;
                    case 3:
                            elementNumb = (Double) jTable1.getModel().getValueAt(i, j);
                            tithe.setCreditOrDebit_amount(elementNumb);
                            break;
                    case 4:
                            elementNumb = (Double) jTable1.getModel().getValueAt(i, j);
                            tithe.setCheck_amount(elementNumb);
                            break;
                    case 6:
                            elementNumb = (Double) jTable1.getModel().getValueAt(i, j);
                            tithe.setTithe_amount(elementNumb);
                            break;
                    case 7:
                            elementNumb = (Double) jTable1.getModel().getValueAt(i, j);
                            tithe.setOffering_amount(elementNumb);
                            break;
                    case 8:
                            elementNumb = (Double) jTable1.getModel().getValueAt(i, j);
                            tithe.setProTemple_amount(elementNumb);
                            break;
                    case 9:
                            elementNumb = (Double) jTable1.getModel().getValueAt(i, j);
                            tithe.setOther_amount(elementNumb);
                            break;
                }
//                //check to see if value received is a String or double value
//                if (jTable1.getModel().getValueAt(i, j) instanceof Double) { 
//                    element = Double.toString((Double) jTable1.getModel().getValueAt(i, j));
//                    
//                } else {
//                    element = (String) jTable1.getModel().getValueAt(i, j);
//                    }
//                
//                System.out.println("Tithe value is: " + element);
//                
              }
            
            titheValues.add(tithe);
            
        }
        } catch(java.lang.NullPointerException e) {
            
        }
        
        //Adding the Array of tithe values into database
        for(int i = 0; i < titheValues.size(); i++) {
            titheValues.get(i).printInfo();
            //String insert statement returned
            String insertStatement = titheValues.get(i).insertStatement();
            
                Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
                    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                    String connURL = "jdbc:mysql://localhost:3306/***DATABASE NAME GOES HERE"; //DEFAULT MYSQL CONFIG SHOWN
                    String user = "***USERNAME GOES HERE"; //DEFAULT MYSQL USER - root
                    String pwd = "***PASSWORD GOES HERE";
                    conn = DriverManager.getConnection(connURL, user, pwd);
                    stmt = conn.createStatement();		
                    int result = stmt.executeUpdate(insertStatement);

		} catch(SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			System.out.println("Could not add entries into database...");

		}
		
			try {
				//rs.close();
				stmt.close();
				conn.close();
			}
			catch (SQLException | NullPointerException e) {
				// TODO Auto-generated catch block
				
			}

		
        }
        
        System.out.println("Entries added into database: " + (titheValues.size()));
        
    }
        
    
        //To use when Save button is clicked to save Member values into Member table in database
        public void MemberSaveBactionPerformed() {
        int cols = jTable1.getModel().getColumnCount();
        int rows = jTable1.getModel().getRowCount();
        ArrayList<Member> memberValues = new ArrayList<>();
        Member member = new Member();
        String[] memberVal = {"first_name","last_name"};
        System.out.println("Offering - Rows:" + rows + "\nCols:" + cols);
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                String element = (String) jTable1.getModel().getValueAt(i, j);
                //offeringValues.
                System.out.println("Member value is: " + element);
            }
            
            //offeringValues.add(i, //);
            
        }
        // Do whatever you want with the values...
    }
        
    //Used to get the value of the spinner and change number of table1 rows (Tithe table rows)
    private void jSpinner1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSpinner1PropertyChange
        //get value of jSpinner1 if value is typed
        try {
            jSpinner1.commitEdit();
        } catch (java.text.ParseException e){
            
        }
        int jSpinValue = (Integer) jSpinner1.getValue();
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.setRowCount(jSpinValue);
        
        System.out.println("JSpinner value = " + jSpinValue);
        
    }//GEN-LAST:event_jSpinner1PropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        OfferingSaveBactionPerformed();
        TitheSaveBactionPerformed();
        super.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Table_GUI_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table_GUI_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table_GUI_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table_GUI_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table_GUI_test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables

}