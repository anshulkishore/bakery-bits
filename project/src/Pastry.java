import java.awt.Color;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Pastry.java
 *
 * Created on Oct 23, 2013, 12:37:47 PM
 */

/**
 *
 * @author lab2
 */
public class Pastry extends javax.swing.JFrame {
    
    /** Creates new form Pastry */
    public Pastry() {
        initComponents();
        getContentPane().setBackground(Color.decode("#fdffcc"));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bshowall = new javax.swing.JButton();
        bcclear = new javax.swing.JButton();
        lcpic = new javax.swing.JLabel();
        border = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ccrange = new javax.swing.JComboBox();
        tcvalue = new javax.swing.JTextField();
        bselpastry = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpastry = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PASTRY !!");

        bshowall.setFont(new java.awt.Font("AR JULIAN", 0, 14)); // NOI18N
        bshowall.setText("SHOW ALL PASTRY");
        bshowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bshowallActionPerformed(evt);
            }
        });

        bcclear.setFont(new java.awt.Font("AR JULIAN", 0, 14)); // NOI18N
        bcclear.setText("CLear");
        bcclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcclearActionPerformed(evt);
            }
        });

        border.setFont(new java.awt.Font("AR JULIAN", 0, 14)); // NOI18N
        border.setText("ORDER");
        border.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borderActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRICE  RANGE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AR JULIAN", 0, 11))); // NOI18N

        ccrange.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<", ">", "<=", ">=", "=" }));

        bselpastry.setFont(new java.awt.Font("AR JULIAN", 0, 14)); // NOI18N
        bselpastry.setText("SELECTION");
        bselpastry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bselpastryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bselpastry))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ccrange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(tcvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccrange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(bselpastry)
                .addContainerGap())
        );

        tpastry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CID", "TYPE", "PRICE PER PIECE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tpastry.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tpastry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpastryMouseClicked(evt);
            }
        });
        tpastry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tpastryKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tpastry);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pastry menu !!");

        back.setFont(new java.awt.Font("AR JULIAN", 0, 14)); // NOI18N
        back.setText("BACK TO MAIN PAGE");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bshowall)
                                .addGap(18, 18, 18)
                                .addComponent(bcclear))
                            .addComponent(lcpic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(back))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(border)))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bshowall)
                            .addComponent(bcclear))
                        .addGap(18, 18, 18)
                        .addComponent(lcpic, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(border)
                        .addGap(33, 33, 33)
                        .addComponent(back)
                        .addGap(46, 46, 46))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bshowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bshowallActionPerformed
        bcclear.doClick();
        DefaultTableModel dm=(DefaultTableModel)tpastry.getModel();
        try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/project","root","tiger");
            //System.out.println("connected");
            Statement s1=con.createStatement();
            String sql="Select * from pastry;";
            ResultSet r1=s1.executeQuery(sql);
            String  id=null,name=null;
            int price=0;
            while(r1.next()) {
                id=r1.getString(1);
                name =r1.getString(2);
                price=r1.getInt(3);
                dm.addRow(new Object[]{id,name,price});
            }


        } catch(Exception ex) {
            System.out.println(ex);
        }
        tpastry.changeSelection(0, 0, false, false);
        int j=tpastry.getSelectedRow();
        //System.out.print("  "+j);
        String pic=(String) dm.getValueAt(j, 0);
        if(pic.equals("P1"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/eclair_pastry.jpg")));
        
        tpastry.requestFocus();
        tpastry.editCellAt(0,1);
        // TODO add your handling code here:
}//GEN-LAST:event_bshowallActionPerformed

    private void bcclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcclearActionPerformed
        //tcvalue.setText("");
        DefaultTableModel dm=(DefaultTableModel)tpastry.getModel();
        int rc=dm.getRowCount();
        for(int i=rc-1;i>=0;i--)
            dm.removeRow(i);
        lcpic.setIcon(null);

        // TODO add your handling code here:
}//GEN-LAST:event_bcclearActionPerformed

    private void borderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borderActionPerformed
        DefaultTableModel dm1= (DefaultTableModel)tpastry.getModel();
        int i=tpastry.getSelectedRow();
        //System.out.print("  "+i);
        String name=(String) dm1.getValueAt(i, 1);
        Object pr=dm1.getValueAt(i,2);
        new bill(name,pr).setVisible(true);
}//GEN-LAST:event_borderActionPerformed

    private void bselpastryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bselpastryActionPerformed
        bcclear.doClick();
        DefaultTableModel dm=(DefaultTableModel)tpastry.getModel();
        try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/project","root","tiger");
        //    System.out.println("connected");
            Statement s1=con.createStatement();
            String sym=(String)ccrange.getSelectedItem();

            int Val=Integer.parseInt(tcvalue.getText());
            String sql="Select * from pastry where price_per_piece"+sym+Val+";";
            ResultSet r1=s1.executeQuery(sql);
            String  id=null,name=null;
            int price=0;
            while(r1.next()) {
                id=r1.getString(1);
                name =r1.getString(2);
                price=r1.getInt(3);
                dm.addRow(new Object[]{id,name,price});
            }


        } catch(Exception ex) {
            System.out.println(ex);
        }
        
        tpastry.changeSelection(0, 0, false, false);
        int j=tpastry.getSelectedRow();
        //System.out.print("  "+j);
        String pic=(String) dm.getValueAt(j, 0);
        if(pic.equals("P1"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/eclair_pastry.jpg")));
        if(pic.equals("P2"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/butterscotch_pastry.jpg")));
        if(pic.equals("P3"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/black_current_pastry.jpg")));
        if(pic.equals("P4"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/forest_pastry.jpg")));
        if(pic.equals("P5"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/pineapple_pastry.jpg")));
        if(pic.equals("P6"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/vanilla_pastry.jpg")));
        if(pic.equals("P7"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/blueberry_pastry.jpg")));
        
        tpastry.requestFocus();
        tpastry.editCellAt(0,1);
// TODO add your handling code here:
}//GEN-LAST:event_bselpastryActionPerformed

    private void tpastryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpastryMouseClicked
        DefaultTableModel dm1= (DefaultTableModel)tpastry.getModel();
        int j=tpastry.getSelectedRow();
        //System.out.print("  "+j);
        String pic=(String) dm1.getValueAt(j, 0);
        if(pic.equals("P1"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/eclair_pastry.jpg")));
        if(pic.equals("P2"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/butterscotch_pastry.jpg")));
        if(pic.equals("P3"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/black_current_pastry.jpg")));
        if(pic.equals("P4"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/forest_pastry.jpg")));
        if(pic.equals("P5"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/pineapple_pastry.jpg")));
        if(pic.equals("P6"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/vanilla_pastry.jpg")));
        if(pic.equals("P7"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/blueberry_pastry.jpg")));
       
        // TODO add your handling code here:
    }//GEN-LAST:event_tpastryMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void tpastryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpastryKeyReleased
        DefaultTableModel dm1= (DefaultTableModel)tpastry.getModel();
        int j=tpastry.getSelectedRow();
        //System.out.print("  "+j);
        String pic=(String) dm1.getValueAt(j, 0);
        if(pic.equals("P1"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/eclair_pastry.jpg")));
        if(pic.equals("P2"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/butterscotch_pastry.jpg")));
        if(pic.equals("P3"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/black_current_pastry.jpg")));
        if(pic.equals("P4"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/forest_pastry.jpg")));
        if(pic.equals("P5"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/pineapple_pastry.jpg")));
        if(pic.equals("P6"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/vanilla_pastry.jpg")));
        if(pic.equals("P7"))
            lcpic.setIcon(new ImageIcon(getClass().getResource("/blueberry_pastry.jpg")));        // TODO add your handling code here:
    }//GEN-LAST:event_tpastryKeyReleased

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pastry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton bcclear;
    private javax.swing.JButton border;
    private javax.swing.JButton bselpastry;
    private javax.swing.JButton bshowall;
    private javax.swing.JComboBox ccrange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lcpic;
    private javax.swing.JTextField tcvalue;
    private javax.swing.JTable tpastry;
    // End of variables declaration//GEN-END:variables

}
