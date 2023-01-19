import java.awt.BorderLayout;

// import javax.swing.JButton;
// import javax.swing.JFrame;
import javax.swing.*;

public class BorderLayoutExample {
    
    BorderLayoutExample(){
        JFrame frame = new JFrame("Border Layout");
        frame.setSize(300,300); 
        frame.setVisible(true);
        JButton button,button1, button2, button3,button4;
        JTextField tf;
        button = new JButton("left");
        button1 = new JButton("right");
        // button2 = new JButton("top");
        tf = new JTextField();
        // tf.setSize(200, 300);
        tf.setBounds(0, 10, 300, 150);
        // button2.setSize(500,10);
        button3 = new JButton("bottom");
        button4 = new JButton("center");
        frame.add(button,BorderLayout.WEST);
        frame.add(button1, BorderLayout.EAST);
        frame.add(tf);
        frame.add(button3, BorderLayout.SOUTH);
        frame.add(button4, BorderLayout.CENTER);
        
    }

    public  static void main(String[] args){
        new BorderLayoutExample();
    }
}