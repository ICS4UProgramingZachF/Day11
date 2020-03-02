package MainCode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class App {

    private JPanel PanelMain;
    private JTextField txtMath1;
    private JTextField txtMath2;
    private JButton btncal;
    private JLabel lblAnwser;
    private JLabel lb;
    private JLabel lbl;
    double Subtotal;
    double Total;

    private static DecimalFormat df = new DecimalFormat("#####.##");

    public App() {

        lb.setText("Enter a Lenght");
        lbl.setText("Enter a With");

        btncal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int Lenght = Integer.parseInt(txtMath1.getText());
                int With = Integer.parseInt(txtMath2.getText());

                Subtotal = Lenght * With;
                Total = Subtotal / 144;

                lblAnwser.setText(" The you have:   " + df.format(Total) + " Foot");
            }
        });
    txtMath2.addKeyListener(new KeyAdapter() { } );}

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
