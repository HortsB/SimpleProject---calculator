import java.awt.*;
import javax.swing.*;
public class Calculator {
    JFrame frame=new JFrame();
    JButton buttons=new JButton();
    Calculator(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,600);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        buttons.setLayout(new GridLayout(9,9));
    }
}
