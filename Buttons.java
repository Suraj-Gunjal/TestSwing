import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
    
    public class Buttons extends JFrame{
    
    JLabel label;
    JButton button;
    Buttons(){

        ImageIcon icon = new ImageIcon("logo.jpg.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH)");
        ImageIcon icon2 = new ImageIcon("alone.jpg.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH)");
        

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(e ->System.out.println("It Works"));
        button.setText("Click Me");
        button.setFont(new Font("Comic sans",Font.BOLD,15));
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

    public static void main(String[] args) {
        Buttons b = new Buttons();
    }
}
