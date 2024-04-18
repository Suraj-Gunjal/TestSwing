import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class test {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("First GUI by me using Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        // by Default operation
        // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // Could not close the window
        frame.setSize(420,420);
        // frame.setResizable(false);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("logo.jpg");
        frame.setIconImage(image.getImage());
        //frame.getContentPane().setBackground(new Color(123,50,250));
        JLabel label = new JLabel();
        label.setText("Java is a Awesome Language...");
        frame.add(label);
        // ImageIcon image2 = new ImageIcon("alone.jpg");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0,0,255));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setBackground(Color.gray);
        label.setOpaque(true);


        Border border = BorderFactory.createLineBorder(Color.blue,3);
        label.setBorder(border);

        ImageIcon imageIcon = new ImageIcon("alone.jpg");
        Image image3 = imageIcon.getImage(); // transform it 
        Image newImg = image3.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        ImageIcon imageScaled = new ImageIcon(newImg);

        
        label.setIcon(imageScaled);
        frame.add(label);
        //label.setBounds(0,0,250,250);
        frame.pack();
    }
}