package view;

import controller.CategoryManager;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Category;
import model.Product;

/**
 *
 * @author initmanfig
 */
public class FrmCategory extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCategory.class.getName());

    private CategoryManager categoryManager;
    private FrmMain frmMain;

    public FrmCategory(CategoryManager categoryManager, FrmMain frmMain) {
        initComponents();
        btnUpdateCategory.setVisible(false);
        this.categoryManager = new CategoryManager();
        this.frmMain = frmMain;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        btnUpdateCategory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FrmCategory");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblTitle.setText("GESTION DE CATEGORIAS");

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

        txtDescription.setFont(new java.awt.Font("JetBrainsMono NF", 0, 14)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(153, 153, 153));
        txtDescription.setText("Descripcion");
        txtDescription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescriptionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescriptionFocusLost(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/lupa.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

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

        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCategory);

        btnUpdateCategory.setText("Actualizar Producto");
        btnUpdateCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        btnUpdateCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnUpdate)
                            .addGap(18, 18, 18)
                            .addComponent(btnDelete)
                            .addGap(18, 18, 18)
                            .addComponent(btnAdd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnClean)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCode)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearch)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd)
                    .addComponent(btnClean))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
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

    private void txtDescriptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusGained
        txtDescription.setText("");
        txtDescription.setForeground(Color.black);
    }//GEN-LAST:event_txtDescriptionFocusGained

    private void txtDescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusLost
        if (txtDescription.getText().isEmpty()) {
            txtDescription.setText("Precio");
            txtDescription.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtDescriptionFocusLost

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        if (txtCode.getText().equals("Codigo")) {
            JOptionPane.showMessageDialog(null, "Para buscar un producto debes ingresar solo un codigo valido");
            return;
        }

        Category category = categoryManager.searchCategory(txtCode.getText());

        if (category != null) {
            JOptionPane.showMessageDialog(null, "Categoria encontrada");
            Category categoryN = categoryManager.searchCategory(txtCode.getText());
            txtName.setText(categoryN.getName());
            txtName.setForeground(Color.black);
            txtDescription.setText(categoryN.getDescription());
            txtDescription.setForeground(Color.black);

        } else {
            JOptionPane.showMessageDialog(null, "Categoria no encontrada");

        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (txtCode.getText().equals("Codigo") || txtCode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa el codigo de la categoria", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Category category = categoryManager.searchCategory(txtCode.getText());

        if (category != null) {

            JOptionPane.showMessageDialog(null, "Ingresa la informacion de la categoria actualizar", "Informacion", JOptionPane.OK_OPTION);
            txtName.setText("Nombre");
            txtName.setForeground(Color.gray);
            txtDescription.setText("Precio");
            txtDescription.setForeground(Color.gray);
            btnUpdateCategory.setVisible(true);
            btnUpdate.setVisible(false);
            txtCode.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Categoria no actualizado", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if (txtCode.getText().isEmpty() || txtCode.getText().equals("Codigo")) {
            JOptionPane.showMessageDialog(null, "Ingresa solo el codigo de la categoria a eliminar", "Informacion", JOptionPane.OK_OPTION);
            return;
        }

        if (categoryManager.deleteCategory(txtCode.getText())) {
            JOptionPane.showMessageDialog(null, "Categoria eliminado correctamente", "Informacion", JOptionPane.OK_OPTION);
            showDataTable();
            clean();
        } else {
            JOptionPane.showMessageDialog(null, "Categoria no eliminado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (validateData()) {
            JOptionPane.showMessageDialog(null, "Ingresa la informacion del producto agregar", "Informacion", JOptionPane.OK_OPTION);
            return;
        }

        categoryManager.addCategory(new Category(txtCode.getText(), txtName.getText(), txtDescription.getText()));
        JOptionPane.showMessageDialog(null, "categoria agregado correctamente", "Informacion", JOptionPane.OK_OPTION);
        showDataTable();
        clean();
    }//GEN-LAST:event_btnAddActionPerformed

    private void showDataTable() {
        String[] columns = {"Id", "Nombre", "Descripcion"};
        DefaultTableModel manager = new DefaultTableModel(categoryManager.list(), columns);
        tblCategory.setModel(manager);
    }

    private boolean validateData() {
        return (txtCode.getText().isEmpty() || txtCode.getText().equals("Codigo"))
                || (txtName.getText().isEmpty() || txtName.getText().equals("Nombre"))
                || (txtDescription.getText().isEmpty() || txtDescription.getText().equals("Precio"));
    }

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        clean();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void clean(){
        txtCode.setText("Codigo");
        txtCode.setForeground(Color.gray);
        txtName.setText("Nombre");
        txtName.setForeground(Color.gray);
        txtDescription.setText("Precio");
        txtDescription.setForeground(Color.gray);
    }
    
    private void btnUpdateCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCategoryActionPerformed
        if (validateData()) {
            JOptionPane.showMessageDialog(null, "Ingresa la informacion de la categoria a actualizar", "Informacion", JOptionPane.OK_OPTION);
            return;
        }

        categoryManager.updateCategory(new Category(txtCode.getText(), txtName.getText(), txtDescription.getText()), txtCode.getText());

        JOptionPane.showMessageDialog(null, "Categoria actualizada correctamente", "Informacion", JOptionPane.OK_OPTION);
        txtCode.setEnabled(true);
        btnUpdateCategory.setVisible(false);
        btnUpdate.setVisible(true);
        txtCode.setText("Codigo");
        txtCode.setForeground(Color.gray);
        txtName.setText("Nombre");
        txtName.setForeground(Color.gray);
        txtDescription.setText("Precio");
        txtDescription.setForeground(Color.gray);
        showDataTable();
        txtCode.setEnabled(true);
    }//GEN-LAST:event_btnUpdateCategoryActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        frmMain.setVisible(true);
        frmMain.addItems(categoryManager);
    }//GEN-LAST:event_formWindowClosed

    /*public static void main(String args[]) {
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
        //</editor-fold>
    
        java.awt.EventQueue.invokeLater(() -> new FrmCategory(null).setVisible(true));
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
