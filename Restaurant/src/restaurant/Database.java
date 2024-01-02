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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maruf
 */
public class Database extends javax.swing.JFrame {

    /**
     * Creates new form Database
     */
    public Database() {
        initComponents();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        refresh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        editi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        editname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        editb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        editp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edits = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Burger", "Pizza", "Soft Drinks", "Total"
            }
        ));
        jScrollPane1.setViewportView(table);

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID :");

        editi.setText("(Not Changeable) ");

        jLabel3.setText("Name :");

        jLabel4.setText("Burger :");

        editb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbActionPerformed(evt);
            }
        });

        jLabel5.setText("Pizza : ");

        jLabel6.setText("Drinks :");

        edits.setText(" ");

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Receipt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(refresh)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editi)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editname, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edits, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(0, 209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(editi)
                    .addComponent(jLabel3)
                    .addComponent(editname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(editb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(editp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(edits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refresh)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void turnNormal()
    {
        editb.setText("0");
        editp.setText("0");
        edits.setText("0");
        editname.setText("");
    }
    void refresh()
    {
         try {
            DefaultTableModel model = (DefaultTableModel)table.getModel() ;
            model.setRowCount(0);
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb","root","root");
            System.out.println("Connection Succesfull");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM sells ");
            while(rs.next())
            {
               int id = rs.getInt("ID") ;
               int b = rs.getInt("BURGER") ;
               int p = rs.getInt("PIZZA") ;
               int s = rs.getInt("SOFTDRINK") ;
               int t = rs.getInt("TOTAL") ;
               String customer = rs.getString("CUSTOMER");
               model.addRow(new Object[]{id,customer,b,p,s,t} );
            }
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
            
       refresh();
    }//GEN-LAST:event_refreshActionPerformed
    int burger;
    int pizza ;
    int softdrinks ;
    int total ;
    int id ;
    String customer ;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel)table.getModel() ;
        int row  = table.getSelectedRow();
        id = Integer.parseInt(model.getValueAt(row, 0).toString());
        burger = Integer.parseInt(model.getValueAt(row, 2).toString());
         pizza = Integer.parseInt(model.getValueAt(row, 3).toString());
         softdrinks = Integer.parseInt(model.getValueAt(row, 4).toString());
         total = Integer.parseInt(model.getValueAt(row, 5).toString());
         customer = (String)model.getValueAt(row, 1);
        editname.setText(customer);
        editi.setText("Unchangeable" + String.valueOf(id));
        editp.setText(String.valueOf(pizza));
        edits.setText(String.valueOf(softdrinks));
        editb.setText(String.valueOf(burger));
        
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editbActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb","root","root");
        PreparedStatement stmt = con.prepareStatement("UPDATE sells SET TOTAL = ? , BURGER = ? , PIZZA = ? , SOFTDRINK = ? WHERE ID = ? ");
       int bur = Integer.parseInt(editb.getText()) ;
       int piz = Integer.parseInt(editp.getText()) ;
       int sof = Integer.parseInt(edits.getText()) ;
       total = bur*100+piz*200+sof*50;
        stmt.setInt(1,total);
        stmt.setInt(2,bur);
        stmt.setInt(3, piz);
        stmt.setInt(4,sof);
        stmt.setInt(5, id);
        stmt.executeUpdate();
        System.out.print("UPDATED");
        turnNormal();
        con.close();
        refresh();
        
       
   
    }
    catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
            Logger.getLogger(Windows.class.getName()).log(Level.SEVERE, null, ex);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Receipt p = new Receipt();
      
       int bur = Integer.parseInt(editb.getText()) ;
       int piz = Integer.parseInt(editp.getText()) ;
       int sof = Integer.parseInt(edits.getText()) ;
       total = bur*100+piz*200+sof*50;
       p.operation(editname.getText(),editb.getText(),editp.getText(),edits.getText(),String.valueOf(total),id);
       p.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Database().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField editb;
    private javax.swing.JLabel editi;
    private javax.swing.JTextField editname;
    private javax.swing.JTextField editp;
    private javax.swing.JTextField edits;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
