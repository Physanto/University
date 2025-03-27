package view;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author initmanfig
 */
public class FrmMain1{
    private JFrame jFrame;
    private JLabel jLabel1;
    private JButton jButton1;
    private JTextField jTextField1;

    public FrmMain1(){
        initComponents();
    }
    
    private void initComponents(){
        
        jFrame = new JFrame("Main");
        jFrame.setSize(600, 600);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        jLabel1 = new JLabel("TITULO");
        jLabel1.setSize(50, 50);
        jLabel1.setLocation(100, 100);
        jLabel1.setBackground(new Color(100,51,0));
        jLabel1.setForeground(new Color(210,60,2));

        jButton1 = new JButton("ENVIAR");
        jButton1.setSize(60,60);
        jButton1.setLocation(50, 200);
        jButton1.setContentAreaFilled(true); 
        jButton1.setBorderPainted(true);


        jFrame.add(jLabel1);
        jFrame.add(jButton1);
        jFrame.setVisible(true);
    } 

    public static void main(String args[]) {
        FrmMain1 frmMain = new FrmMain1();
    }
}
