/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AccountManger;


import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;import model.Account;
import model.AccountDirectory;

/**
 *
 * @author aditi
 */
public class ManageAccountsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    AccountDirectory accountDirectory;
    public ManageAccountsJPanel(JPanel container, AccountDirectory directory) {
        initComponents();
        userProcessContainer= container;
        accountDirectory= directory;
        
        populateTable();
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
        tblAccounts = new javax.swing.JTable();
        lblManageAccount = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearchBox = new javax.swing.JTextField();
        btnViewDetails = new javax.swing.JButton();

        tblAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bank Name", "Routing Number", "Account Number", "Balance"
            }
        ));
        jScrollPane1.setViewportView(tblAccounts);

        lblManageAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblManageAccount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblManageAccount.setText("                                                                                                                                                    Manage Account");

        btnBack.setText("<<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Accounts");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(lblManageAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addGap(33, 33, 33)
                                .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnViewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnSearch, btnViewDetails});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManageAccount)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnViewDetails)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnSearch, btnViewDetails});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
    userProcessContainer.remove(this);
    CardLayout layout=(CardLayout)userProcessContainer.getLayout();
    layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow=tblAccounts.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton=JOptionPane.YES_NO_OPTION;
            int dialogResult=JOptionPane.showConfirmDialog(null,"Are you sure want to delete the selected account","Warning",JOptionPane.WARNING_MESSAGE);
            if(dialogResult==JOptionPane.YES_NO_OPTION){
                Account selectedAccount=(Account) tblAccounts.getValueAt(selectedRow,0);
                accountDirectory.deleteAccount(selectedAccount);
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please select an account from the list","Warning" ,JOptionPane.WARNING_MESSAGE);

        }
            
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    
    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        int selectedRow = tblAccounts.getSelectedRow();
        if(selectedRow>=0){
          Account selectedAccount=(Account)tblAccounts.getValueAt(selectedRow,0);
          
          ViewAccountJPanel panel = new ViewAccountJPanel(userProcessContainer,accountDirectory, selectedAccount);
          userProcessContainer.add("ViewAccountJPanel", panel);
          CardLayout layout= (CardLayout)userProcessContainer.getLayout();
          layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null,"Please select an account from the list to view .", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
      
              if(!txtSearchBox.getText().isBlank()){
            String accountNumber= txtSearchBox.getText();
            Account foundAccount = accountDirectory.searchAccount(accountNumber);
        if(foundAccount!=null){
            ViewAccountJPanel panel= new ViewAccountJPanel(userProcessContainer,accountDirectory,foundAccount);
            userProcessContainer.add("ViewAccountJPanel",panel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null,"Account not found.Please check the account number and try again","warning",JOptionPane.WARNING_MESSAGE);
        }
        }
              else{
            JOptionPane.showMessageDialog(null,"Please type the account number to view","warning",JOptionPane.WARNING_MESSAGE);
                }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageAccount;
    private javax.swing.JTable tblAccounts;
    private javax.swing.JTextField txtSearchBox;
    // End of variables declaration//GEN-END:variables
    public void populateTable(){
        DefaultTableModel model= (DefaultTableModel) tblAccounts.getModel();
        model.setRowCount(0);
        
        for (Account a: accountDirectory.getAccounts()){
            Object[] row= new Object[4];
            row[0]= a;
            row[1]=a.getRountingNumber();
            row[2]=a.getAccountNumber();
            row[3]= String.valueOf(a.getBalance());
            
            model.addRow(row);
        }
    }

    
}
