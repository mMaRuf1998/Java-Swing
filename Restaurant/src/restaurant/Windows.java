/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



public class Windows extends javax.swing.JFrame {
    public Windows() {
        
        initComponents();
        edit_confirm.setEnabled(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

       
    }
int order = 0 ;
int x ; 
String bp,pp,sp,name,bills;
    public int burgers = 100;
    public int pizza = 200 ;
    public int soft_drink = 50 ;
    public int total = 0 ;
    int pp1= 0 ,bp1=0,sp1=0;
    
    public int calculate()
    {
        
        name = customers_name.getText();
        bp= burger_no.getText();
        pp= pizza_no.getText();
        sp= drink_no.getText();
        bp1 = Integer.parseInt(bp);
        pp1 = Integer.parseInt(pp);
        sp1 = Integer.parseInt(sp);
        total = bp1*burgers+pizza*pp1+sp1*soft_drink;
        bills= String.valueOf(total);
        return total;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pizza_no = new javax.swing.JTextField();
        drink_no = new javax.swing.JTextField();
        burger_no = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        bill = new javax.swing.JButton();
        receipt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        customers_name = new javax.swing.JTextField();
        price_label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        edit_confirm = new javax.swing.JButton();
        database = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Burger");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESTAURANT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pizza");

        jLabel4.setBackground(new java.awt.Color(255, 255, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Soft Drinks");

        jLabel5.setBackground(new java.awt.Color(255, 255, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Burger");

        pizza_no.setText("0");
        pizza_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizza_noActionPerformed(evt);
            }
        });

        drink_no.setText("0");
        drink_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink_noActionPerformed(evt);
            }
        });

        burger_no.setText("0");
        burger_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burger_noActionPerformed(evt);
            }
        });

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        bill.setText("BILL");
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });

        receipt.setText("RECEIPT");
        receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Customers Name ");

        customers_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customers_nameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        edit_confirm.setText("Button");
        edit_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_confirmActionPerformed(evt);
            }
        });

        database.setText("Database");
        database.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drink_no, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(burger_no, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pizza_no, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(price_label, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(database, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                            .addComponent(edit_confirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)
                        .addGap(47, 47, 47)
                        .addComponent(customers_name, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(customers_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(database, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(burger_no, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edit_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pizza_no, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price_label))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink_no, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pizza_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizza_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pizza_noActionPerformed

    private void drink_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drink_noActionPerformed

    private void burger_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burger_noActionPerformed

        
        
    }//GEN-LAST:event_burger_noActionPerformed
    void Enabling()
    {
        customers_name.setEnabled(true) ;
        bill.setEnabled(true);
        receipt.setEnabled(true);
        edit.setEnabled(true);
        refresh.setEnabled(true);
    }
    void Disabling()
    {
        customers_name.setEnabled(false) ;
        bill.setEnabled(false);
        receipt.setEnabled(false);
        edit.setEnabled(false);
        refresh.setEnabled(false);
    }
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
    JFrame f=new JFrame();   
    x =Integer.parseInt(JOptionPane.showInputDialog(f,"Enter Order Number : "));
    int var =x ;
    f.setVisible(true);
    edit_confirm.setEnabled(true);
    customers_name.setText("");
        burger_no.setText("0");
        pizza_no.setText("0");
        drink_no.setText("0");
        jLabel7.setText("");
        
    Disabling();
    
   
    }//GEN-LAST:event_editActionPerformed

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed

        jLabel7.setText("The Bill is : "+ calculate());
    }//GEN-LAST:event_billActionPerformed

    private void receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptActionPerformed

      
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb","root","root");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO SELLS VALUES(?,?,?,?,?,?)") ;
            Statement xtmt = con.createStatement();
            ResultSet rs = xtmt.executeQuery("SELECT MAX(ID) AS max_id FROM sells") ;
            // As max_id is used because the MAX(ID) theke amra , ekta maan pabo shetar kono ekta column name dewa lagbe  
            while(rs.next())
            {
                order = rs.getInt("max_id");
            }
          
//If you are adding values for all the columns of the table, you do not need to specify the column names in the SQL query.
           //INSERT INTO table_name VALUES (value1, value2, value3, ...);
              
               order++;
               stmt.setInt(1, order);
               stmt.setInt(2, Integer.parseInt(burger_no.getText()));
               stmt.setInt(3, Integer.parseInt(pizza_no.getText()));
               stmt.setInt(4, Integer.parseInt(drink_no.getText()));
               stmt.setInt(5, calculate());
               stmt.setString(6, customers_name.getText());
               stmt.executeUpdate();
       Receipt p = new Receipt();
       p.operation(name,bp,pp,sp,bills,order);
       p.setVisible(true);
        }
         catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Windows.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_receiptActionPerformed

    private void customers_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customers_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customers_nameActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        customers_name.setText("");
        burger_no.setText("0");
        pizza_no.setText("0");
        drink_no.setText("0");
        jLabel7.setText("");
        
        
    }//GEN-LAST:event_refreshActionPerformed

    private void edit_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_confirmActionPerformed
        // TODO add your handling code here:
        calculate(); 
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb","root","root");
        PreparedStatement stmt = con.prepareStatement("UPDATE sells SET TOTAL = ? , BURGER = ? , PIZZA = ? , SOFTDRINK = ? WHERE ID = ? ");
        stmt.setInt(1,total);
        stmt.setInt(2,bp1);
        stmt.setInt(3, pp1);
        stmt.setInt(4,sp1);
        stmt.setInt(5, x);
        stmt.executeUpdate();
        Enabling();
        customers_name.setText("");
        burger_no.setText("0");
        pizza_no.setText("0");
        drink_no.setText("0");
        jLabel7.setText("");
        Receipt p = new Receipt();
       p.operation(name,bp,pp,sp,bills,x);
       p.setVisible(true);
       setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }
    catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Windows.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_edit_confirmActionPerformed

    private void databaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseActionPerformed
        Database xs = new Database();
        xs.setVisible(true);       
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_databaseActionPerformed

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
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Windows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bill;
    private javax.swing.JTextField burger_no;
    private javax.swing.JTextField customers_name;
    private javax.swing.JButton database;
    private javax.swing.JTextField drink_no;
    private javax.swing.JButton edit;
    private javax.swing.JButton edit_confirm;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pizza_no;
    private javax.swing.JLabel price_label;
    private javax.swing.JButton receipt;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
