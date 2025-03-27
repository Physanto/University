import javax.swing.*;

public class VistaMain extends JFrame{
    
    public void wherever(){

        JFrame jframe = new JFrame();

        JLabel lblTitle = new JLabel();
        lblTitle.setText("GESTION COPIA");
        lblTitle.setSize(100,100);

        JTextField txtId = new JTextField();
        txtId.setSize(50, 20);

        jframe.add(lblTitle);
        jframe.add(txtId);

        lblTitle.setVisible(true);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }




    public static void main(String[] args){
        VistaMain vistaMain = new VistaMain();
        vistaMain.wherever();
    }
}
