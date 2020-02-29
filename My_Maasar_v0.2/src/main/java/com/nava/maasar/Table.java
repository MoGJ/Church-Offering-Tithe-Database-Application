package com.nava.maasar;

import javax.swing.JFrame; 
import javax.swing.JPanel;
import javax.swing.JScrollPane; 
import javax.swing.JSpinner;
import javax.swing.JTable; 
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;

/**
 *
 * @author j713n
 */
public class Table extends JFrame{
    
    // Frame 
    JFrame f; 
    // Table 
    JTable table; 
    
    JPanel infoPanel;
    JPanel tablePanel;
    JPanel testPanel;
  
    // Constructor 
    public void Table() { 
        
        // Frame and panel initializations
        f = new JFrame();
        f.setSize(1100, 500); 
        
        infoPanel = new JPanel();
        tablePanel = new JPanel();
        tablePanel.setSize(1099,499);
        testPanel = new JPanel();
  
        //Frame Title 
        f.setTitle("My Maasar - Enter Tithes For Today (" + 
                LocalDate.now() + ")"); 
        
        //Info Panel Information
        tablePanel.setBounds(10, 10, 1089, 489);
        
        
  
        // JSpinner to set number of people of tithe in Table
        // creates a JSpinner with default value, min, max, and step value
        JSpinner s = new JSpinner(new SpinnerNumberModel(1,1,30,1)); 
        
        
        // get value from JSpinner s
        int spinnerValue = (Integer) s.getValue();
  
  
        // set Bounds for spinner 
        s.setBounds(1050, 20, 50, 40); 
        
        
        
        // Data to be displayed in the JTable 
        String[][] data = { 
            { "", "", "", "", "", "", "", "", "", "" }, 
            { "", "", "", "", "", "", "", "", "", "" },
            { "", "", "", "", "", "", "", "", "", "" },
            { "", "", "", "", "", "", "", "", "", "" },
            { "", "", "", "", "", "", "", "", "", "" },
            { "", "", "", "", "", "", "", "", "", "" },
            { "", "", "", "", "", "", "", "", "", "" },
            { "", "", "", "", "", "", "", "", "", "" },
            { "", "", "", "", "", "", "", "", "", "" },
            { "", "", "", "", "", "", "", "", "", "" }
        }; 
  
        // Column Names 
        final String[] columnNames = { "First Name", "Last Name", "Cash Amt", 
            "Credit/Debit Amt", "Check Amt", " ", "Tithe Amt",
            "Offering Amt", "Pro-Temple", "Other"}; 
  
        // Initializing the JTable and table model
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);
              
        table.setBounds(30, 30, 700, 400); 
  
        //Adding the table to tablePanel 
        JScrollPane sp = new JScrollPane(table);
        tablePanel.add(sp); 
        
        // add panel to frame
        tablePanel.add(s);
        
        //Add tablePanel to frame
        f.add(tablePanel);
        
        //Set frame to be visible
        f.setVisible(true);
        
        //Close JFrame upon clicking close button
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * Add button to create columns when button is clicked or JSpinner?????
     *      addColumn(TableColumn []column) - To add a column at end of table
     */
}
