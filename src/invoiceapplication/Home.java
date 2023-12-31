/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package invoiceapplication;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author lunna
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    
    String billNo = "";
    Double totalAmount = 0.0;
    Double cash = 0.0;
    Double bHeight = 0.0;
    Double subTotals = 0.0;
    Double change = 0.0;
    
    ArrayList<String> itemName = new ArrayList<>();
    ArrayList<String> itemQuantity = new ArrayList<>();
    ArrayList<String> itemPrice = new ArrayList<>();
    ArrayList<String> subTotal = new ArrayList<>();
    
    Connection conn=null;
    PreparedStatement prestat=null;
    ResultSet rs=null;
    
    String itemNames;
    Double itemQuantities;
    Double itemPrices;
    Double subTotalNew;
    Double totalAmounts;
    Double billNos;
    Double cashs;
    Double changes;
    
    public Home() {
        initComponents();
        conn = DBConnection.connect();
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        labelInvoicePrintingSystem = new javax.swing.JLabel();
        labelItemName = new javax.swing.JLabel();
        labelQuantity = new javax.swing.JLabel();
        labelItemPrice = new javax.swing.JLabel();
        labelSubTotal = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        txtItemQuantity = new javax.swing.JTextField();
        txtItemPrice = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        labelTotalAmount = new javax.swing.JLabel();
        labelCash = new javax.swing.JLabel();
        labelChange = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        txtCash = new javax.swing.JTextField();
        txtChange = new javax.swing.JTextField();
        buttonPrint = new javax.swing.JButton();
        buttonPay = new javax.swing.JButton();
        txtBillNo = new javax.swing.JTextField();
        labelBillNo = new javax.swing.JLabel();

        jTextField4.setText("jTextField4");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelInvoicePrintingSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInvoicePrintingSystem.setText("Invoice Printing System");

        labelItemName.setText("Item Name");

        labelQuantity.setText("Quantity");

        labelItemPrice.setText("Item Price");

        labelSubTotal.setText("Sub Total");

        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });

        txtItemQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemQuantityActionPerformed(evt);
            }
        });

        txtItemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemPriceActionPerformed(evt);
            }
        });

        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        labelTotalAmount.setText("Total Amount");

        labelCash.setText("Cash");

        labelChange.setText("Change");

        txtTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAmountActionPerformed(evt);
            }
        });

        txtCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashActionPerformed(evt);
            }
        });

        txtChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChangeActionPerformed(evt);
            }
        });

        buttonPrint.setText("Print");
        buttonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintActionPerformed(evt);
            }
        });

        buttonPay.setText("Pay");
        buttonPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPayActionPerformed(evt);
            }
        });

        txtBillNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillNoActionPerformed(evt);
            }
        });

        labelBillNo.setText("Bill No.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelInvoicePrintingSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelItemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelItemPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelTotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(labelCash, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelChange))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtItemName, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(txtItemQuantity)
                            .addComponent(txtItemPrice)
                            .addComponent(txtSubTotal)
                            .addComponent(txtTotalAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCash, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtChange)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(buttonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(buttonPay, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInvoicePrintingSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBillNo)
                    .addComponent(txtBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelItemName)
                            .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelQuantity)
                            .addComponent(txtItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelItemPrice)
                            .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelSubTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(buttonAdd)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotalAmount)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCash))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelChange)
                    .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPay)
                    .addComponent(buttonPrint))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtItemQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemQuantityActionPerformed
        txtItemPrice.requestFocusInWindow();
    }//GEN-LAST:event_txtItemQuantityActionPerformed

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        txtItemQuantity.requestFocusInWindow();
    }//GEN-LAST:event_txtItemNameActionPerformed

    private void txtItemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemPriceActionPerformed
        txtSubTotal.requestFocusInWindow();
        subTotals = (Double.valueOf(txtItemQuantity.getText()) * Double.valueOf(txtItemPrice.getText()));
        txtSubTotal.setText(subTotals + "");
    }//GEN-LAST:event_txtItemPriceActionPerformed
    
    private void txtTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAmountActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
//        itemName.add(txtItemName.getText());
//        itemQuantity.add(txtItemQuantity.getText());
//        itemPrice.add(txtItemPrice.getText());
//        subTotal.add(txtSubTotal.getText());

        itemNames = txtItemName.getText();
        itemQuantities = Double.valueOf(txtItemQuantity.getText());
        itemPrices = Double.valueOf(txtItemPrice.getText());
        subTotalNew = Double.valueOf(txtSubTotal.getText());
        billNos = Double.valueOf(txtBillNo.getText());
        
        totalAmount = totalAmount + Double.valueOf(txtSubTotal.getText());
        txtTotalAmount.setText(totalAmount + "");
        
        try{
            String qr = "INSERT INTO `sale`(`bill_no`, `item_name`, `quantity`, `item_price`, `sub_total`) VALUES ('"+billNos+"','"+itemNames+"','"+itemQuantities+"','"+itemPrices+"','"+subTotalNew+"')";
            prestat = conn.prepareStatement(qr);
            prestat.execute();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
        
        clear();
        txtCash.requestFocusInWindow();
    }//GEN-LAST:event_buttonAddActionPerformed

    private void clear(){
        txtItemName.setText("");
        txtItemQuantity.setText("");
        txtItemPrice.setText("");
        txtSubTotal.setText("");
    }
    
    public PageFormat getPageFormat(PrinterJob pj) {
        
        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();
        
        double bodyHeight = bHeight;
        double headerHeight = 5.0;
        double footerHeight = 5.0;
        double width = cmToPp(8);
        double height = cmToPp(headerHeight + bodyHeight + footerHeight);
        paper.setSize(width, height);
        paper.setImageableArea(0, 10, width, height - cmToPp(1));
        
        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);
        return pf;
    }
    
    protected static double cmToPp(double cm) {
        return toPPI(cm * 0.393600787);
    } 
    
    protected static double toPPI(double inch) {
        return inch * 72d;
    }
    
    public class BillPrintable implements Printable{

        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            int r = itemName.size();
            ImageIcon icon = new ImageIcon("C:/Users/lunna/OneDrive/Documents/Koding/Java_Netbeans/InvoiceApplication/src/invoiceapplication/invoice.png");
            int result = NO_SUCH_PAGE;
            if(pageIndex == 0){
                Graphics2D g2d = (Graphics2D) graphics;
                double width = pageFormat.getImageableWidth();
                g2d.translate((int)pageFormat.getImageableX(), (int) pageFormat.getImageableY());
                
                
                try{
                    int y=20;
            int yShift = 10;
            int headerRectHeight=15;
            //int headerRectHeight=40;
            
                
            g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            g2d.drawImage(icon.getImage(), 60, 0, 90, 50, rootPane);y+=yShift+30;
            g2d.drawString("-------------------------------------",12,y);y+=yShift;
            g2d.drawString("         Rumah Makan Gampang       ",12,y);y+=yShift;
            g2d.drawString("      Jalan Soekarno Hatta No.1 ",12,y);y+=yShift;
            g2d.drawString("         Jakarta, Indonesia",12,y);y+=yShift;
            g2d.drawString("     www.facebook.com/RMGampang ",12,y);y+=yShift;
            g2d.drawString("           021-1122334455      ",12,y);y+=yShift;
            g2d.drawString("-------------------------------------",12,y);y+=headerRectHeight;
            g2d.drawString(" Item Name                  Price   ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",10,y);y+=headerRectHeight;
     
            for(int s=0; s<r; s++)
            {
            g2d.drawString(" "+itemName.get(s)+"                            ",10,y);y+=yShift;
            g2d.drawString("      "+itemQuantity.get(s)+" * "+itemPrice.get(s),10,y); g2d.drawString(subTotal.get(s),160,y);y+=yShift;

            }
          
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Total amount:               "+txtTotalAmount.getText()+"   ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Cash      :                 "+cash+"   ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Change   :                 "+txtChange.getText()+"   ",10,y);y+=yShift;
  
            g2d.drawString("*************************************",10,y);y+=yShift;
            g2d.drawString("             Thank You            ",10,y);y+=yShift;
            g2d.drawString("*************************************",10,y);y+=yShift;
            g2d.drawString("         Made by: Lunnardo         ",10,y);y+=yShift;
            g2d.drawString("    Contact: github.com/lunnardo       ",10,y);y+=yShift;       
           
                } 
                catch(Exception e){
                    e.printStackTrace();
                }
                result = PAGE_EXISTS;   
            }
            return result; 
        }
    }
    
    private void txtCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashActionPerformed
        cash = (Double.valueOf(txtCash.getText()));
        txtCash.setText(cash + "");
        txtChange.requestFocusInWindow();
        change = (Double.valueOf(txtCash.getText()) - Double.valueOf(txtTotalAmount.getText()));
        txtChange.setText(change + "");
    }//GEN-LAST:event_txtCashActionPerformed

    private void buttonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintActionPerformed
        getData();
        getBillData();
        bHeight = Double.valueOf(itemName.size());
        //JOptionPane.showConfirmDialog(rootPane, bHeight);
        
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(new BillPrintable(), getPageFormat(pj));
        try {
            pj.print();
        }
        catch(PrinterException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_buttonPrintActionPerformed
    
    private void getData(){
        try {
            String sql="SELECT `bill_no`, `item_name`, `quantity`, `item_price`, `sub_total` FROM `sale` WHERE bill_no='"+billNos+"'";
        prestat = conn.prepareStatement(sql);
             rs = prestat.executeQuery();
             while(rs.next())
             {
                 itemName.add(rs.getString("item_name"));
                 itemQuantity.add(rs.getString("quantity"));
                 itemPrice.add(rs.getString("item_price"));
                 subTotal.add(rs.getString("sub_total"));
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void getBillData(){
        try {
            String sql="SELECT `bill_no`, `total_amount`, `cash`, `cash_change` FROM `cash` WHERE bill_no='"+billNos+"'";
        prestat = conn.prepareStatement(sql);
             rs = prestat.executeQuery();
             while(rs.next())
             {
                 totalAmount = rs.getDouble("total_amount");
                 cash = rs.getDouble("cash");
                 change = rs.getDouble("cash_change");
                }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
       subTotals = (Double.valueOf(txtItemQuantity.getText()) * Double.valueOf(txtItemPrice.getText()));
       txtSubTotal.setText(subTotals + "");
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void txtChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChangeActionPerformed
        change = (Double.valueOf(txtCash.getText()) - Double.valueOf(txtTotalAmount.getText()));
        txtChange.setText(change + "");
    }//GEN-LAST:event_txtChangeActionPerformed

    private void buttonPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPayActionPerformed
        cashs = Double.valueOf(txtCash.getText());
        changes = Double.valueOf(txtChange.getText());
        totalAmounts = Double.valueOf(txtTotalAmount.getText());
        try{
            String qr = "INSERT INTO `cash`(`bill_no`, `total_amount`, `cash`, `cash_change`) VALUES ('"+billNos+"','"+totalAmounts+"','"+cashs+"','"+changes+"')";
            prestat = conn.prepareStatement(qr);
            prestat.execute();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }//GEN-LAST:event_buttonPayActionPerformed

    private void txtBillNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillNoActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonPay;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel labelBillNo;
    private javax.swing.JLabel labelCash;
    private javax.swing.JLabel labelChange;
    private javax.swing.JLabel labelInvoicePrintingSystem;
    private javax.swing.JLabel labelItemName;
    private javax.swing.JLabel labelItemPrice;
    private javax.swing.JLabel labelQuantity;
    private javax.swing.JLabel labelSubTotal;
    private javax.swing.JLabel labelTotalAmount;
    private javax.swing.JTextField txtBillNo;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemPrice;
    private javax.swing.JTextField txtItemQuantity;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables
}
