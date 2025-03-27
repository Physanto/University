import javax.swing.*;
import java.awt.*;

public class FrmTienda{

    private JFrame jFrame;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JButton jButton1;
    private JTextField jTextField1;

    public FrmTienda(){
        initComponents();
    }

    private void initComponents(){
        jFrame = new JFrame();
        jFrame.setSize(300,300);
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jLabel1 = new JLabel("TIENDA ONLINE");
        jLabel1.setSize(50, 50);
        jLabel1.setLocation(20, 100);

        jLabel2 = new JLabel("Nombre");
        jLabel2.setSize(20, 20);
        jLabel2.setLocation(50, 200);

        jButton1 = new JButton("Agregar Producto");
        jButton1.setSize(40,40);
        jButton1.setLocation(50,400);

        jFrame.add(jLabel1);
        jFrame.add(jLabel2);
        jFrame.add(jButton1);
        jFrame.setVisible(true);
    }

    public static void main(String[] args){
        FrmTienda frmTienda = new FrmTienda();
    }
}
