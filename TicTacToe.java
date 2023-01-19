import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JFrame.*;

public class TicTacToe extends JFrame{
    
    Font objfont = new Font("sans-serif", Font.BOLD, 36);
    JButton b1,b2,b3;
    JButton b4,b5,b6;
    JButton b7,b8,b9;
    JPanel frame;
    // Image icon = new Image("icon.png");
    public TicTacToe(){
        setTitle("Tic-Tac-Toe");
        setSize(600,600);
        setVisible(true);
        setLocation(300, 100);
        setLayout(new BorderLayout());
        // setIconImage(icon);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(3,3,10,10));
        frameInit();
        frame.setVisible(true);
        frame.setBackground(new Color(35,35,35));
        
        frame.setBounds(100, 100, 100, 100);
        b1= new JButton(" ");
        b2= new JButton(" ");
        b3= new JButton(" ");
        b4= new JButton(" ");
        b5= new JButton(" ");
        b6= new JButton(" ");
        b7= new JButton(" ");
        b8= new JButton(" ");
        b9= new JButton(" ");
        b1.setBounds(10, 30, 20, 20);
        b2.setBounds(40, 30, 20, 20);
        b3.setBounds(70, 30, 20, 20);
        
        b4.setBounds(10, 60, 20, 20);
        b5.setBounds(40, 60, 20, 20);
        b6.setBounds(70, 60, 20, 20);
        
        b7.setBounds(10, 90, 20, 20);
        b8.setBounds(40, 90, 20, 20);
        b9.setBounds(70, 90, 20, 20);
        
        //         y(30): 10 20 10 20 10 20 10
        //         y(50): 10 20 10 20 10 20 10
        //         y(70): 10 20 10 20 10 20 10
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        // frame.setSize(100,100);
        add(frame,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        new TicTacToe();
    }
}
