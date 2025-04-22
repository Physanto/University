/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CategoryManager;
import controller.ProductManager;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Category;
import model.Product;
import model.ProductSale;

/**
 *
 * @author initmanfig
 */
public class FrmSale extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmSale.class.getName());
    private FrmMain frmMain;
    private ProductManager productManager;
    private CategoryManager categoryManager;
    private ArrayList<ProductSale> listProducts;
    
    public FrmSale(ProductManager productManager, CategoryManager categoryManager, FrmMain frmMain) {
        initComponents();
        this.frmMain = frmMain;
        this.productManager = productManager;
        this.categoryManager = categoryManager;
        listProducts = new ArrayList<>();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        cbxCategory = new javax.swing.JComboBox<>();
        txtCant = new javax.swing.JTextField();
        btnAddTable = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListProducts = new javax.swing.JTable();
        lblListProducts = new javax.swing.JLabel();
        btnAddPay = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblTitle.setText("VENTA DE PRODUCTOS");

        txtCode.setFont(new java.awt.Font("JetBrainsMono NF", 0, 14)); // NOI18N
        txtCode.setForeground(new java.awt.Color(153, 153, 153));
        txtCode.setText("Codigo");
        txtCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodeFocusLost(evt);
            }
        });

        txtName.setFont(new java.awt.Font("JetBrainsMono NF", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(153, 153, 153));
        txtName.setText("Nombre");
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        txtPrice.setFont(new java.awt.Font("JetBrainsMono NF", 0, 14)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(153, 153, 153));
        txtPrice.setText("Precio");
        txtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPriceFocusLost(evt);
            }
        });

        txtStock.setFont(new java.awt.Font("JetBrainsMono NF", 0, 14)); // NOI18N
        txtStock.setForeground(new java.awt.Color(153, 153, 153));
        txtStock.setText("Stock");
        txtStock.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStockFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStockFocusLost(evt);
            }
        });

        cbxCategory.setFont(new java.awt.Font("JetBrainsMono NF", 0, 14)); // NOI18N
        cbxCategory.setName("cbxCategory"); // NOI18N

        txtCant.setText("Cantidad");
        txtCant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantFocusLost(evt);
            }
        });

        btnAddTable.setText("Agregar a la lista");
        btnAddTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTableActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tblListProducts);

        lblListProducts.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        lblListProducts.setText("Lista de Productos");

        btnAddPay.setText("Vender");
        btnAddPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPayActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/lupa.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDeleteProduct.setText("Eliminar Producto");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(btnAddTable, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddPay, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteProduct)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lblListProducts)))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(btnAddTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(lblListProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddPay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteProduct)))
                .addGap(126, 126, 126))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodeFocusGained
        txtCode.setText("");
        txtCode.setForeground(Color.black);
    }//GEN-LAST:event_txtCodeFocusGained

    private void txtCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodeFocusLost
        if (txtCode.getText().isEmpty()) {
            txtCode.setText("Codigo");
            txtCode.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCodeFocusLost

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        txtName.setText("");
        txtName.setForeground(Color.black);
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if (txtName.getText().isEmpty()) {
            txtName.setText("Nombre");
            txtName.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
        txtPrice.setText("");
        txtPrice.setForeground(Color.black);
    }//GEN-LAST:event_txtPriceFocusGained

    private void txtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusLost
        if (txtPrice.getText().isEmpty()) {
            txtPrice.setText("Precio");
            txtPrice.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPriceFocusLost

    private void txtStockFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStockFocusGained
        txtStock.setText("");
        txtStock.setForeground(Color.black);
    }//GEN-LAST:event_txtStockFocusGained

    private void txtStockFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStockFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockFocusLost

    private void btnAddTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTableActionPerformed
        if(txtCant.getText().equals("Cantidad")){
            JOptionPane.showMessageDialog(this, "Ingresa una cantidad y/o codigo para el producto a agregar");
            return;
        }
        showDataTable(new Product(txtCode.getText(), txtName.getText(), Double.parseDouble(txtPrice.getText()), Integer.parseInt(txtStock.getText()), (Category)cbxCategory.getSelectedItem()));
    }//GEN-LAST:event_btnAddTableActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        if(txtCode.getText().equals("Codigo")){
            JOptionPane.showMessageDialog(null, "Para buscar un producto debes ingresar solo un codigo valido");
            return;
        }
        
        Product product = productManager.searchProduct(txtCode.getText());
        
        if(product != null){
            loadCategorys(categoryManager);
            txtName.setText(product.getName());
            txtPrice.setText(String.valueOf(product.getPrice()));
            txtStock.setText(String.valueOf(product.getStock()));
            cbxCategory.setSelectedItem(findCategory(txtCode.getText()));
        }
        else{
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtCantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantFocusGained
        txtCant.setText("");
        txtCant.setForeground(Color.black);
    }//GEN-LAST:event_txtCantFocusGained

    private void txtCantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantFocusLost
        if (txtCant.getText().isEmpty()) {
            txtCant.setText("Cantidad");
            txtCant.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCantFocusLost

    private void btnAddPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPayActionPerformed
                                       
        for (int i = 0; i < tblListProducts.getRowCount(); i++) {
            String code = tblListProducts.getValueAt(i, 0).toString();
            int cantSale = Integer.parseInt(tblListProducts.getValueAt(i, 5).toString());

            // Buscamos el producto real en ProductManager
            Product productReal = productManager.searchProduct(code);

            if (productReal != null) {
                int nuevoStock = productReal.getStock() - cantSale;
                if (nuevoStock < 0) {
                    JOptionPane.showMessageDialog(this, "Error: No hay suficiente stock de " + productReal.getName());
                    return;
                } else {
                    productReal.setStock(nuevoStock);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado: " + code);
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Venta realizada exitosamente!");

        listProducts.clear();
        DefaultTableModel model = (DefaultTableModel) tblListProducts.getModel();
        model.setRowCount(0); 
    }//GEN-LAST:event_btnAddPayActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        int selectedRow = tblListProducts.getSelectedRow();

        if (selectedRow != -1) {
            String code = tblListProducts.getValueAt(selectedRow, 0).toString();
            listProducts.remove(searchProductSale(code));
            
            DefaultTableModel model = (DefaultTableModel) tblListProducts.getModel();
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.");
        } 
        else{
            JOptionPane.showMessageDialog(this, "Por favor seleccione un producto para eliminar.");
        }
    }//GEN-LAST:event_btnDeleteProductActionPerformed
    
    private ProductSale searchProductSale(String code){
        for(ProductSale productSales : listProducts){
            if(productSales.getProduct().getid().equals(code)){
                return productSales;
            }
        }
        return null;
    }
    
    private Category findCategory(String code){
        for(Product product : productManager.getListProducts()){
            if(product.getid().equals(code)){
                return product.getCategory();
            }
        }
        return null;
    }
    
    private void loadCategorys(CategoryManager categoryManager){
        cbxCategory.removeAllItems();
        for(Category category : categoryManager.getListCategorys()){
            cbxCategory.addItem(category);
        }
    }
    
    private void showDataTable(Product product){
        /*String[] columnNames = {"Codigo", "Nombre", "Precio", "Stock", "Categoria", "Cantidad"};
        listProducts.add(product);
        DefaultTableModel defaultTableModel = new DefaultTableModel(dataTable(), columnNames);
        tblListProducts.setModel(defaultTableModel);
        
        DefaultTableModel modelo = (DefaultTableModel) tblListProducts.getModel();
        modelo.addRow(new Object[]{product.getid(), product.getName(), product.getPrice(), product.getStock(), product.getCategory(), txtCant.getText()});
        */
        ProductSale productSale = new ProductSale(product, Integer.parseInt(txtCant.getText()));
        listProducts.add(productSale);

        String[] columnNames = {"Codigo", "Nombre", "Precio", "Stock", "Categoria", "Cantidad", "Total"};
        DefaultTableModel defaultTableModel = new DefaultTableModel(dataTable(), columnNames);
        tblListProducts.setModel(defaultTableModel);
    }
    
    private Object[][] dataTable(){
        Object[][] data = new Object[listProducts.size()][7];
        int i = 0;
        for (ProductSale productSale : listProducts) {
            Product product = productSale.getProduct();
            int cantidad = productSale.getCantidad();
            data[i][0] = product.getid();
            data[i][1] = product.getName();
            data[i][2] = product.getPrice();
            data[i][3] = product.getStock();
            data[i][4] = product.getCategory();
            data[i][5] = cantidad;
            data[i][6] = cantidad * product.getPrice();
            i++;
        }
        return data;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPay;
    private javax.swing.JButton btnAddTable;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<Category> cbxCategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListProducts;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblListProducts;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
