import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {

    public GridLayoutExample(){
        JFrame frame = new JFrame("Grid Layout");
        frame.setLayout(new GridLayout(6,4));
        frame.setSize(395,540);
        frame.setVisible(true); 
            JTextField screen = new JTextField();
            screen.setBounds(0,0,395,40);
            JButton one,two, three, four,five,six,seven,eight,nine,zero;
            nine = new JButton("9");
            eight = new JButton("8");
            seven = new JButton("7");
            six = new JButton("6");
            five = new JButton("5");
            four = new JButton("4");
            three = new JButton("3");
            two = new JButton("2");
            one = new JButton("1");
            zero = new JButton("0");
            

            frame.add(screen);
            frame.add(nine);
            frame.add(eight);
            frame.add(seven);
            frame.add(six);
            frame.add(five);
            frame.add(four);
            frame.add(three);
            frame.add(two);
            frame.add(one);
            frame.add(zero);
        
        }
        public static void main(String[] args) {
            new GridLayoutExample();

        }

    }