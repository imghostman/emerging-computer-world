/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmergingComputerWorld;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Prashant
 */
public class Inventory extends javax.swing.JFrame {

    int id;

    /**
     * Creates new form Inventory
     */
    public Inventory() {
        initComponents();
        setLocationRelativeTo(null);
       // id = Manager.userId;
        //System.out.println("" + Integer.toString(id));
        UserIdlabel.setText("UserID: " + Integer.toString(Manager.userId));
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmanagement?&serverTimezone=UTC", "root", "");
            System.out.println("Connection is created succcessfully:");
            String sql;
            sql = "select * from hwstock where shopid=" + Manager.userId + ";";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                qty1label.setText(rs.getString("quantity"));
                rs.next();
                qty2label.setText(rs.getString("quantity"));
                rs.next();
                qty3label.setText(rs.getString("quantity"));
                rs.next();
                qty4label.setText(rs.getString("quantity"));
                rs.next();
                qty5label.setText(rs.getString("quantity"));
                rs.next();
                qty6label.setText(rs.getString("quantity"));
                rs.next();
                qty7label.setText(rs.getString("quantity"));
                rs.next();
                qty8label.setText(rs.getString("quantity"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        UserIdlabel = new javax.swing.JLabel();
        InventoryLabel = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        Laptoplabel = new javax.swing.JLabel();
        CAlabel = new javax.swing.JLabel();
        Desktoplabel = new javax.swing.JLabel();
        CClabel = new javax.swing.JLabel();
        DSlabel = new javax.swing.JLabel();
        Printerslabel = new javax.swing.JLabel();
        NetworkingLabel = new javax.swing.JLabel();
        Notebooklabel = new javax.swing.JLabel();
        ItemsLabel = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        MakeChangesButton = new javax.swing.JButton();
        qty1label = new javax.swing.JLabel();
        qty2label = new javax.swing.JLabel();
        qty3label = new javax.swing.JLabel();
        qty4label = new javax.swing.JLabel();
        qty5label = new javax.swing.JLabel();
        qty6label = new javax.swing.JLabel();
        qty7label = new javax.swing.JLabel();
        qty8label = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setUndecorated(true);

        UserIdlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        InventoryLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        InventoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InventoryLabel.setText("Inventory");

        HomeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EmergingComputerWorld/Home-icon.png"))); // NOI18N
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        Laptoplabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        Laptoplabel.setText("Laptop");

        CAlabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        CAlabel.setText("Computer Accessories");

        Desktoplabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        Desktoplabel.setText("Desktops");

        CClabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        CClabel.setText("Computer Components");

        DSlabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        DSlabel.setText("Drives and Storage");

        Printerslabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        Printerslabel.setText("Printers");

        NetworkingLabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        NetworkingLabel.setText("Networking");

        Notebooklabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        Notebooklabel.setText("Notebook");

        ItemsLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        ItemsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ItemsLabel.setText("ITEMS");

        QuantityLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        QuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuantityLabel.setText("Quantity");

        MakeChangesButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MakeChangesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EmergingComputerWorld/Knob-Valid-Green-icon.png"))); // NOI18N
        MakeChangesButton.setText("MAKE CHANGES");
        MakeChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeChangesButtonActionPerformed(evt);
            }
        });

        qty1label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qty1label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qty1label.setText("qty1");

        qty2label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qty2label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qty2label.setText("qty2");

        qty3label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qty3label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qty3label.setText("qty3");

        qty4label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qty4label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qty4label.setText("qty4");

        qty5label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qty5label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qty5label.setText("qty5");

        qty6label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qty6label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qty6label.setText("qty6");

        qty7label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qty7label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qty7label.setText("qty7");

        qty8label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qty8label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qty8label.setText("qty8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserIdlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(InventoryLabel)
                .addGap(72, 72, 72)
                .addComponent(HomeButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(ItemsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QuantityLabel)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Desktoplabel)
                    .addComponent(Laptoplabel)
                    .addComponent(CClabel)
                    .addComponent(DSlabel)
                    .addComponent(Printerslabel)
                    .addComponent(NetworkingLabel)
                    .addComponent(CAlabel)
                    .addComponent(Notebooklabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(qty1label, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(qty2label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qty3label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qty4label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qty5label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qty6label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qty7label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qty8label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(MakeChangesButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(InventoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(UserIdlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemsLabel)
                    .addComponent(QuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Laptoplabel)
                    .addComponent(qty1label))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CAlabel)
                    .addComponent(qty2label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CClabel)
                    .addComponent(qty3label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DSlabel)
                    .addComponent(qty4label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Printerslabel)
                    .addComponent(qty5label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetworkingLabel)
                    .addComponent(qty6label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Notebooklabel)
                    .addComponent(qty7label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Desktoplabel)
                    .addComponent(qty8label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MakeChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
        Manager.getInstance().homeFrame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void MakeChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeChangesButtonActionPerformed
        // TODO add your handling code here:
        new ADD_items().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MakeChangesButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CAlabel;
    private javax.swing.JLabel CClabel;
    private javax.swing.JLabel DSlabel;
    private javax.swing.JLabel Desktoplabel;
    private javax.swing.JButton HomeButton;
    private javax.swing.JLabel InventoryLabel;
    private javax.swing.JLabel ItemsLabel;
    private javax.swing.JLabel Laptoplabel;
    private javax.swing.JButton MakeChangesButton;
    private javax.swing.JLabel NetworkingLabel;
    private javax.swing.JLabel Notebooklabel;
    private javax.swing.JLabel Printerslabel;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JLabel UserIdlabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel qty1label;
    private javax.swing.JLabel qty2label;
    private javax.swing.JLabel qty3label;
    private javax.swing.JLabel qty4label;
    private javax.swing.JLabel qty5label;
    private javax.swing.JLabel qty6label;
    private javax.swing.JLabel qty7label;
    private javax.swing.JLabel qty8label;
    // End of variables declaration//GEN-END:variables
}
