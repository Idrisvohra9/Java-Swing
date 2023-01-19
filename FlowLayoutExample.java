import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FlowLayoutExample {

    FlowLayoutExample(){
        JFrame frame = new JFrame("Flow Layout");
        frame.setLayout(new FlowLayout());
        frame.setSize(640,480);  
        frame.setVisible(true);  
        JTextField tf;
        JButton button,button1, button2, button3,button4;
        tf = new JTextField();
        tf.setSize(600, 50);
        button = new JButton("button 1");
        button.setSize(50, 50);
        button1 = new JButton("button 2");
        button1.setSize(50, 50);
        button2 = new JButton("button 3");
        button2.setSize(50, 50);
        button3 = new JButton("button 4");
        button3.setSize(50, 50);
        button4 = new JButton("button 5");
        button4.setSize(50, 50);

        frame.add(tf);
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
    
    }
    public static void main(String[] args) {
        new FlowLayoutExample();

    }

}