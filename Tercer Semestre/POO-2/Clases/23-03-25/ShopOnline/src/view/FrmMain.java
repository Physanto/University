package view;

import controller.CategoryManager;
import controller.ProductManager;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Category;
import model.Product;

/**
 *
 * @author initmanfig
 */
public class FrmMain extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmMain.class.getName());
    private ProductManager productManager;
    private CategoryManager categoryManager;

    
    public FrmMain() {
        initComponents();
        txtCodeUpdate.setVisible(false);
        btnUpdateProduct.setVisible(false);
        categoryManager = new CategoryManager();
        productManager = new ProductManager();
        addItems(categoryManager);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        cbxCategory = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        txtCodeUpdate = new javax.swing.JTextField();
        btnUpdateProduct = new javax.swing.JButton();
        scrollPaneTable = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        btnSale = new javax.swing.JButton();
        btnSaleProduct = new javax.swing.JButton();
        txtCant = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnFrmCategory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FrmMain");
        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblTitle.setText("GESTION PRODUCTOS");

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

        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClean.setText("Limpiar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/tienda-online.png"))); // NOI18N

        txtCodeUpdate.setFont(new java.awt.Font("JetBrainsMono NF", 0, 14)); // NOI18N
        txtCodeUpdate.setForeground(new java.awt.Color(102, 102, 102));
        txtCodeUpdate.setText("nuevo Codigo");
        txtCodeUpdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodeUpdateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodeUpdateFocusLost(evt);
            }
        });

        btnUpdateProduct.setText("Actualizar Producto");
        btnUpdateProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Precio", "Stock", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(tblProducts);

        scrollPaneTable.setViewportView(jScrollPane1);

        btnSale.setText("Vender");
        btnSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleActionPerformed(evt);
            }
        });

        btnSaleProduct.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        btnSaleProduct.setText("Vender Producto");
        btnSaleProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleProductActionPerformed(evt);
            }
        });

        txtCant.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtCant.setForeground(new java.awt.Color(102, 102, 102));
        txtCant.setText("Cantidad");
        txtCant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantFocusLost(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/lupa.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnFrmCategory.setText("Categorias");
        btnFrmCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrmCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSaleProduct))
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitle)
                        .addGap(261, 261, 261))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnUpdate)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDelete))
                                            .addComponent(cbxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(19, 19, 19)
                                        .addComponent(btnAdd)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClean)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblImage))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(btnSale))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCode, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCodeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFrmCategory)
                        .addGap(166, 166, 166))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch)
                                    .addComponent(btnFrmCategory))))
                        .addGap(16, 16, 16)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)
                            .addComponent(btnAdd)
                            .addComponent(btnClean)
                            .addComponent(btnSale)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaleProduct)
                        .addGap(48, 48, 48)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        cbxCategory.getAccessibleContext().setAccessibleName("");

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

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        txtCode.setText("Codigo");
        txtCode.setForeground(Color.gray);
        txtName.setText("Nombre");
        txtName.setForeground(Color.gray);
        txtPrice.setText("Precio");
        txtPrice.setForeground(Color.gray);
        txtStock.setText("Stock");
        txtStock.setForeground(Color.gray);
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        if(txtCode.getText().isEmpty() || txtCode.getText().equals("Codigo")){
            JOptionPane.showMessageDialog(null, "Ingresa solo el codigo del producto a eliminar", "Informacion", JOptionPane.OK_OPTION);
            return;
        }
        
        if(productManager.deleteProduct(txtCode.getText())){
            JOptionPane.showMessageDialog(null, "Producto eliminado correctamente", "Informacion", JOptionPane.OK_OPTION);
            showDataTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Producto no eliminado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(txtCode.getText().equals("Codigo") || txtCode.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Ingresa el codigo del producto", "Informacion", JOptionPane.INFORMATION_MESSAGE);
           return;
        }
        
        Product product = productManager.searchProduct(txtCode.getText());
        
        if(product != null){
            txtCode.setEnabled(false);
            txtCodeUpdate.setVisible(true);
            txtCodeUpdate.getParent().revalidate();
            txtCodeUpdate.getParent().repaint();
            
            JOptionPane.showMessageDialog(null, "Ingresa la informacion del producto actualizar", "Informacion", JOptionPane.OK_OPTION);
            txtName.setText("Nombre");
            txtName.setForeground(Color.gray);
            txtPrice.setText("Precio");
            txtPrice.setForeground(Color.gray);
            txtStock.setText("Stock");
            txtStock.setForeground(Color.gray);
            btnUpdateProduct.setVisible(true);
            btnUpdate.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Producto no actualizado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private boolean validateData(){
        return (txtCode.getText().isEmpty() || txtCode.getText().equals("Codigo")) ||
           (txtName.getText().isEmpty() || txtName.getText().equals("Nombre")) ||
           (txtPrice.getText().isEmpty() || txtPrice.getText().equals("Precio")) ||
           (txtStock.getText().isEmpty() || txtStock.getText().equals("Stock"));
    }
    
    private void txtCodeUpdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodeUpdateFocusGained
        txtCodeUpdate.setText("");
        txtCodeUpdate.setForeground(Color.black);
    }//GEN-LAST:event_txtCodeUpdateFocusGained
    
    private void showDataTable(){
        String[] columns = {"Id", "Nombre", "Precio", "Stock", "Categoria"};
        DefaultTableModel manager = new DefaultTableModel(productManager.list(), columns);
        tblProducts.setModel(manager);
    }
    
    private void btnSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleActionPerformed
        /*JOptionPane.showMessageDialog(null, "Selecciona un producto de la tabla e ingresa la cantidad que vas a vender");
        btnSaleProduct.setVisible(true); */
    }//GEN-LAST:event_btnSaleActionPerformed

    private void btnSaleProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleProductActionPerformed
        
        /*
        if(tblProducts.getSelectedRow() == -1 ||
                txtCant.getText().equals("Cantidad")){
            JOptionPane.showMessageDialog(null, "Selecciona un producto de la tabla e ingresa la cantidad que vas a vender");
            return;
        }
        
        int index = tblProducts.getSelectedRow();
        Product product = productManager.getListProducts().get(index);
        
        if(product.getStock() < Double.parseDouble(txtCant.getText())){
            JOptionPane.showMessageDialog(this, "No se puede vender el producto ya que no alcanza el stock");
            return;
        }
        
        productManager.saleProduct(product.getid(), Integer.parseInt(txtCant.getText()));
        JOptionPane.showMessageDialog(null, "Elemento seleccionado " + productManager.getListProducts().get(index));
        tblProducts.getParent().revalidate();
        tblProducts.getParent().repaint();
        showDataTable(); */
        
        this.setVisible(false);
        FrmSale frmSale = new FrmSale(productManager, categoryManager,this);
        frmSale.setVisible(true);
    }//GEN-LAST:event_btnSaleProductActionPerformed

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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        if(txtCode.getText().equals("Codigo")){
            JOptionPane.showMessageDialog(null, "Para buscar un producto debes ingresar solo un codigo valido");
            return;

        }
        
        Product product = productManager.searchProduct(txtCode.getText());
        
        if(product != null){
            JOptionPane.showMessageDialog(null, "Producto encontrado");
        }
        else{
            JOptionPane.showMessageDialog(null, "Producto no encontrado");

        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnFrmCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrmCategoryActionPerformed
        this.setVisible(false);
        FrmCategory frmCategory = new FrmCategory(categoryManager, this);
        frmCategory.setVisible(true);
    }//GEN-LAST:event_btnFrmCategoryActionPerformed

    
    private void txtCodeUpdateFocusLost(java.awt.event.FocusEvent evt) {

    }

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
        if(validateData()) {
            JOptionPane.showMessageDialog(null, "Ingresa la informacion del producto a actualizar", "Informacion", JOptionPane.OK_OPTION);
            return;
        }
        
        if(!onlyNumbers(txtPrice.getText()) || !onlyNumbers(txtStock.getText())){
            JOptionPane.showMessageDialog(null, "no puedes ingresar en precio o stock letras", "Informacion", JOptionPane.OK_OPTION);
            return;
        }
        
        productManager.updateProduct(new Product(txtCodeUpdate.getText(), txtName.getText(), Double.parseDouble(txtPrice.getText()), 
                    Integer.parseInt(txtStock.getText()), (Category)cbxCategory.getSelectedItem()), txtCode.getText());
        
        JOptionPane.showMessageDialog(null, "Producto actualizado correctamente", "Informacion", JOptionPane.OK_OPTION);
        txtCode.setEnabled(true); 
        btnUpdateProduct.setVisible(false);
        txtCodeUpdate.setVisible(false);
        btnUpdate.setVisible(true);
        txtCode.setText("Codigo");
        txtCode.setForeground(Color.gray);
        txtName.setText("Nombre");
        txtName.setForeground(Color.gray);
        txtPrice.setText("Precio");
        txtPrice.setForeground(Color.gray);
        txtStock.setText("Stock");
        txtStock.setForeground(Color.gray); 
    }
    
    private void txtStockFocusLost(java.awt.event.FocusEvent evt) {
        if (txtStock.getText().isEmpty()) {
            txtStock.setText("Stock");
            txtStock.setForeground(Color.gray);
        }
    }                                  

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        
        if(validateData()){
            JOptionPane.showMessageDialog(null, "Ingresa la informacion del producto a actualizar", "Informacion", JOptionPane.OK_OPTION);
            return;
        }
        
        if(!onlyNumbers(txtPrice.getText()) || !onlyNumbers(txtStock.getText())){
            JOptionPane.showMessageDialog(null, "no puedes ingresar en precio o stock letras", "Informacion", JOptionPane.OK_OPTION);
            return;
        }
        
        productManager.addProduct(new Product(txtCode.getText(), txtName.getText(), Double.parseDouble(txtPrice.getText()), 
                Integer.parseInt(txtStock.getText()), (Category)cbxCategory.getSelectedItem()));
        
        JOptionPane.showMessageDialog(null, "Producto agregado correctamente", "Informacion", JOptionPane.OK_OPTION);
        txtCode.setText("Codigo");
        txtCode.setForeground(Color.gray);
        txtName.setText("Nombre");
        txtName.setForeground(Color.gray);
        txtPrice.setText("Precio");
        txtPrice.setForeground(Color.gray);
        txtStock.setText("Stock");
        txtStock.setForeground(Color.gray);   
        showDataTable();
    }
    
    private boolean onlyNumbers(String text){
        
        for(char caracter : text.trim().toCharArray()){
            if (!(Character.isDigit(caracter) || caracter == '.' || caracter == ',')) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new FrmMain().setVisible(true));     
    }
    
    public void addItems(CategoryManager categoryManager){
        for(Category category : categoryManager.getListCategorys()){
            cbxCategory.addItem(category);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFrmCategory;
    private javax.swing.JButton btnSale;
    private javax.swing.JButton btnSaleProduct;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JComboBox<Category> cbxCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtCodeUpdate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
