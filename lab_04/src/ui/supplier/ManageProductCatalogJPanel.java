/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.supplier;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Product;
import model.Supplier;

/**
 *
 * @author aditi
 */
public class ManageProductCatalogJPanel extends javax.swing.JPanel {
    JPanel workArea;
    Supplier supplier;
    
    /**
     * Creates new form ManageProductCatalogJPanel
     */
    public ManageProductCatalogJPanel(JPanel workArea, Supplier supplier) {
        initComponents();
        this.workArea = workArea;
        this.supplier = supplier;

        if(supplier.getLogoImage()!=null) imgLogo.setIcon(supplier.getLogoImage());
        else imgLogo.setText("No Logo");
        

        refreshTable(); // Ensure refreshTable() is defined and works as expected


        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnView = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        imgLogo = new javax.swing.JLabel();

        btnView.setText("View Details...");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnCreate.setText("Add Product...");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTitle.setText("Manage Product Catalog");

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Product ID", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblProducts);

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch)
                            .addComponent(lblTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnView)
                    .addComponent(btnCreate)
                    .addComponent(btnSearch))
                .addContainerGap(210, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int row=tblProducts.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table first","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product selectedProduct=(Product) tblProducts.getValueAt(row,0);
        ViewProductDetailJPanel vpdjp=new ViewProductDetailJPanel(workArea,selectedProduct);
        workArea.add("ViewProductDetailJPanelSupplier",vpdjp);
        CardLayout layout=(CardLayout) workArea.getLayout();
        layout.next(workArea);


    }//GEN-LAST:event_btnViewActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        CreateNewProductJPanel cnpjp = new CreateNewProductJPanel(workArea, supplier);
        workArea.add("SupplierWorkAreaJPanel", cnpjp);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        SearchForProductJPanel sfpjp=new SearchForProductJPanel(workArea,supplier);
        workArea.add("SearchForProductJPanel",sfpjp);
        CardLayout layout=(CardLayout) workArea.getLayout();
        layout.next(workArea);

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row=tblProducts.getSelectedRow();
        if(row<0){
          JOptionPane.showMessageDialog(null,"Please select a row from the table first","Warning",JOptionPane.WARNING_MESSAGE);
          return;
    }
        Product selectedProduct=(Product) tblProducts.getValueAt(row,0);
        supplier.getProductCatalog().removeProduct(selectedProduct);
        refreshTable();


    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblProducts;
    // End of variables declaration//GEN-END:variables

    void refreshTable() {
        
        DefaultTableModel model= (DefaultTableModel)tblProducts.getModel();
        model.setRowCount(0);
        
        for(Product p: supplier.getProductCatalog().getProductCatalog()){
            Object row[]= new Object[3];
            row[0]= p;
            row[1]=p.getId();
            row[2]=p.getPrice();
            model.addRow(row);
        }
    
    }
    }

    

