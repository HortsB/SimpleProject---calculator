import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
public class Calculator implements ActionListener {
    JFrame frame=new JFrame();
    JButton []buttons=new JButton[20];
    JPanel panel=new JPanel();
    JLabel textField=new JLabel();
    JPanel numbers_panel=new JPanel();
    JPanel tittle_panel=new JPanel();
    Calculator(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,600);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textField.setBackground(new Color(25,25,25));
        textField.setForeground(new Color(25,250,0));
        textField.setFont(new Font("Golos Text",Font.BOLD,65));
        textField.setHorizontalAlignment(JLabel.NORTH_EAST);
        textField.setText("Calculator");
        textField.setOpaque(true);

        tittle_panel.setLayout(new BorderLayout());
        tittle_panel.setBounds(0,0,400,100);

        numbers_panel.setLayout(new GridLayout(4,3) );

        for(int i=0;i<12;i++){
            buttons[i]=new JButton();
            numbers_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD,20));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        tittle_panel.add(textField);
        frame.add(tittle_panel,BorderLayout.NORTH);
        frame.add(numbers_panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
