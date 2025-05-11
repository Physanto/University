
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cappuccino;
import model.Coffe;
import model.Topping;
import model.Water;

/**
 *
 * @author initmanfig
 */

public class FrmMain extends javax.swing.JFrame {
	
	private ArrayList<Water> waters;
	private ArrayList<Coffe> coffes;
	private Topping topping;

    public FrmMain() {
        initComponents();
		waters = new ArrayList<>();
		coffes = new ArrayList<>();
    }	

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTitle = new javax.swing.JButton();
        pnlAddCoffe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodeC = new javax.swing.JTextField();
        txtMarkC = new javax.swing.JTextField();
        txtTypeC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPriceC = new javax.swing.JTextField();
        btnAddCoffe = new javax.swing.JButton();
        pnlAddWater = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodeA = new javax.swing.JTextField();
        txtTypeA = new javax.swing.JTextField();
        txtCantA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPriceA = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAddWater = new javax.swing.JButton();
        pnlAddTopping = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        txtNameT = new javax.swing.JTextField();
        txtCantT = new javax.swing.JTextField();
        txtPriceT = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnAddTopping = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        pnlAddCappu = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        txtCodeCap = new javax.swing.JTextField();
        txtNameCap = new javax.swing.JTextField();
        txtPresentationCap = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        txtPriceCap = new javax.swing.JTextField();
        btnMakeCappuccino = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCappuccino = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("More Coffe");
        setBackground(new java.awt.Color(120, 212, 248));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        btnTitle.setBackground(new java.awt.Color(255, 244, 215));
        btnTitle.setFont(new java.awt.Font("Gargi-1.2b", 1, 36)); // NOI18N
        btnTitle.setForeground(new java.awt.Color(0, 0, 0));
        btnTitle.setText("MORE COFFE");

        pnlAddCoffe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 53, 32), 2));

        jLabel1.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel4.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel4.setText("Marca");

        jLabel3.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad");

        jLabel2.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel2.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("Adwaita Mono", 1, 20)); // NOI18N
        jLabel5.setText("Agregar Cafe al Capuchino");

        jLabel11.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel11.setText("Precio");

        btnAddCoffe.setBackground(new java.awt.Color(205, 148, 106));
        btnAddCoffe.setFont(new java.awt.Font("Adwaita Mono", 0, 19)); // NOI18N
        btnAddCoffe.setForeground(new java.awt.Color(0, 0, 0));
        btnAddCoffe.setText("Agregar Cafe");
        btnAddCoffe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCoffeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddCoffeLayout = new javax.swing.GroupLayout(pnlAddCoffe);
        pnlAddCoffe.setLayout(pnlAddCoffeLayout);
        pnlAddCoffeLayout.setHorizontalGroup(
            pnlAddCoffeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddCoffeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodeC, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMarkC, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTypeC, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantC, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPriceC, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(btnAddCoffe)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddCoffeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(470, 470, 470))
        );
        pnlAddCoffeLayout.setVerticalGroup(
            pnlAddCoffeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddCoffeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addGroup(pnlAddCoffeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtMarkC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTypeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtPriceC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCoffe))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pnlAddWater.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 53, 32), 2));

        jLabel6.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel6.setText("Codigo");

        jLabel7.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel7.setText("Tipo");

        jLabel8.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel8.setText("Precio");

        jLabel9.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel9.setText("Cantidad");

        jLabel10.setFont(new java.awt.Font("Adwaita Mono", 1, 20)); // NOI18N
        jLabel10.setText("Agregar Agua al Capuchino");

        btnAddWater.setBackground(new java.awt.Color(205, 148, 106));
        btnAddWater.setFont(new java.awt.Font("Adwaita Mono", 0, 19)); // NOI18N
        btnAddWater.setForeground(new java.awt.Color(0, 0, 0));
        btnAddWater.setText("Agregar Agua");
        btnAddWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWaterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddWaterLayout = new javax.swing.GroupLayout(pnlAddWater);
        pnlAddWater.setLayout(pnlAddWaterLayout);
        pnlAddWaterLayout.setHorizontalGroup(
            pnlAddWaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddWaterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddWaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(pnlAddWaterLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodeA, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTypeA, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantA, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPriceA, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(btnAddWater)
                .addContainerGap())
        );
        pnlAddWaterLayout.setVerticalGroup(
            pnlAddWaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddWaterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(47, 47, 47)
                .addGroup(pnlAddWaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCodeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTypeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCantA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPriceA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddWater))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnlAddTopping.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 53, 32), 2));

        jLabel12.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel12.setText("Nombre");

        jLabel123.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel123.setText("Cantidad");

        jLabel15.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel15.setText("Precio");

        jLabel16.setFont(new java.awt.Font("Adwaita Mono", 1, 20)); // NOI18N
        jLabel16.setText("Agregar Topping al Capuchino");

        btnAddTopping.setBackground(new java.awt.Color(205, 148, 106));
        btnAddTopping.setFont(new java.awt.Font("Adwaita Mono", 0, 19)); // NOI18N
        btnAddTopping.setForeground(new java.awt.Color(0, 0, 0));
        btnAddTopping.setText("Agregar Topping");
        btnAddTopping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToppingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddToppingLayout = new javax.swing.GroupLayout(pnlAddTopping);
        pnlAddTopping.setLayout(pnlAddToppingLayout);
        pnlAddToppingLayout.setHorizontalGroup(
            pnlAddToppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddToppingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtCantT, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(pnlAddToppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddToppingLayout.createSequentialGroup()
                        .addComponent(txtPriceT, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 491, Short.MAX_VALUE)
                        .addComponent(btnAddTopping))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddToppingLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(427, 427, 427)))
                .addContainerGap())
        );
        pnlAddToppingLayout.setVerticalGroup(
            pnlAddToppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddToppingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(48, 48, 48)
                .addGroup(pnlAddToppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123)
                    .addComponent(txtCantT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtPriceT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddTopping))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Ccafe.png"))); // NOI18N

        pnlAddCappu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 53, 32), 2));

        jLabel14.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel14.setText("Codigo");

        jLabel124.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel124.setText("Nombre");

        jLabel17.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel17.setText("Presentacion");

        jLabel18.setFont(new java.awt.Font("Adwaita Mono", 1, 20)); // NOI18N
        jLabel18.setText("Preparar Capuchino");

        jLabel125.setFont(new java.awt.Font("Adwaita Mono", 0, 18)); // NOI18N
        jLabel125.setText("Precio");

        btnMakeCappuccino.setBackground(new java.awt.Color(205, 148, 106));
        btnMakeCappuccino.setFont(new java.awt.Font("Adwaita Mono", 1, 22)); // NOI18N
        btnMakeCappuccino.setForeground(new java.awt.Color(0, 0, 0));
        btnMakeCappuccino.setText("Hacer Capuchino");
        btnMakeCappuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeCappuccinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddCappuLayout = new javax.swing.GroupLayout(pnlAddCappu);
        pnlAddCappu.setLayout(pnlAddCappuLayout);
        pnlAddCappuLayout.setHorizontalGroup(
            pnlAddCappuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddCappuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodeCap, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameCap, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(txtPresentationCap, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPriceCap, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMakeCappuccino)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddCappuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(492, 492, 492))
        );
        pnlAddCappuLayout.setVerticalGroup(
            pnlAddCappuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddCappuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(32, 32, 32)
                .addGroup(pnlAddCappuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCodeCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel124)
                    .addComponent(txtNameCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtPresentationCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel125)
                    .addComponent(txtPriceCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMakeCappuccino))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tblCappuccino.setBackground(new java.awt.Color(255, 255, 255));
        tblCappuccino.setFont(new java.awt.Font("Adwaita Mono", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(tblCappuccino);

        jLabel19.setFont(new java.awt.Font("Adwaita Mono", 1, 24)); // NOI18N
        jLabel19.setText("Resumen de Compra");

        jLabel20.setFont(new java.awt.Font("Adwaita Mono", 1, 15)); // NOI18N
        jLabel20.setText("Total");

        lblTotal.setFont(new java.awt.Font("Adwaita Mono", 2, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTitle)
                .addGap(754, 754, 754))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAddCappu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAddTopping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAddCoffe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAddWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(52, 52, 52)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTitle)
                    .addComponent(jLabel13))
                .addGap(42, 42, 42)
                .addComponent(pnlAddWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlAddCoffe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(pnlAddTopping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(pnlAddCappu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel19)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWaterActionPerformed
       	if(txtCodeA.getText().isEmpty() || txtTypeA.getText().isEmpty() || 
				txtCantA.getText().isEmpty() || txtPriceA.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Llena todos los campos para poder agregar agua al capuchino");
			return;
		}
		waters.add(new Water(txtCodeA.getText(), txtTypeA.getText(), Integer.parseInt(txtCantA.getText()), Double.parseDouble(txtPriceA.getText())));
		JOptionPane.showMessageDialog(this, "Agua agregada con exito");
    }//GEN-LAST:event_btnAddWaterActionPerformed

    private void btnAddCoffeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCoffeActionPerformed
		if(txtCodeC.getText().isEmpty() || txtMarkC.getText().isEmpty() || txtTypeC.getText().isEmpty() || 
				txtCantC.getText().isEmpty() || txtPriceC.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Llena todos los campos para poder agregar cafe al capuchino");
			return;
		}
		coffes.add(new Coffe(txtCodeC.getText(), txtMarkC.getText(), txtTypeC.getText(), Integer.parseInt(txtCantC.getText()), Double.parseDouble(txtPriceC.getText())));
		JOptionPane.showMessageDialog(this, "Cafe agregado con exito");
    }//GEN-LAST:event_btnAddCoffeActionPerformed

    private void btnAddToppingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToppingActionPerformed
		if(txtNameT.getText().isEmpty() || txtCantT.getText().isEmpty() || txtPriceT.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Llena todos los campos para poder agregar toppings al capuchino al capuchino");
			return;
		}	
		topping = new Topping(txtNameT.getText(), Integer.parseInt(txtCantT.getText()), Double.parseDouble(txtPriceT.getText()));
		JOptionPane.showMessageDialog(this, "Topping agregado con exito");
    }//GEN-LAST:event_btnAddToppingActionPerformed

    private void btnMakeCappuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeCappuccinoActionPerformed
		if(txtCodeCap.getText().isEmpty() || txtNameCap.getText().isEmpty() || txtPresentationCap.getText().isEmpty() || txtPresentationCap.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Llena todos los campos para poder agregar hacer el capuchino al capuchino");
			return;
		}
		Cappuccino cappuccino = new Cappuccino(txtCodeCap.getText(), txtNameCap.getText(), txtPresentationCap.getText(), 
				Double.parseDouble(txtPriceCap.getText()), waters, coffes);
		
		cappuccino.addTopping(topping);
		JOptionPane.showMessageDialog(this, "Capuchino realizado con exito");
		showDataTable(cappuccino);
		lblTotal.setText("$ "+cappuccino.calculateprice());
    }//GEN-LAST:event_btnMakeCappuccinoActionPerformed

	private void showDataTable(Cappuccino cappuccino){
		String[] columnNames = {"Nombre", "Tipo", "Cantidad", "Precio", "Subtotal"};
		DefaultTableModel defaultTableModel = new DefaultTableModel(cappuccino.dataComplete(), columnNames);
		tblCappuccino.setModel(defaultTableModel);
	}

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCoffe;
    private javax.swing.JButton btnAddTopping;
    private javax.swing.JButton btnAddWater;
    private javax.swing.JButton btnMakeCappuccino;
    private javax.swing.JButton btnTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlAddCappu;
    private javax.swing.JPanel pnlAddCoffe;
    private javax.swing.JPanel pnlAddTopping;
    private javax.swing.JPanel pnlAddWater;
    private javax.swing.JTable tblCappuccino;
    private javax.swing.JTextField txtCantA;
    private javax.swing.JTextField txtCantC;
    private javax.swing.JTextField txtCantT;
    private javax.swing.JTextField txtCodeA;
    private javax.swing.JTextField txtCodeC;
    private javax.swing.JTextField txtCodeCap;
    private javax.swing.JTextField txtMarkC;
    private javax.swing.JTextField txtNameCap;
    private javax.swing.JTextField txtNameT;
    private javax.swing.JTextField txtPresentationCap;
    private javax.swing.JTextField txtPriceA;
    private javax.swing.JTextField txtPriceC;
    private javax.swing.JTextField txtPriceCap;
    private javax.swing.JTextField txtPriceT;
    private javax.swing.JTextField txtTypeA;
    private javax.swing.JTextField txtTypeC;
    // End of variables declaration//GEN-END:variables
}
