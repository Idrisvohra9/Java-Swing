import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AL extends JFrame {
int clicks=0;
final JButton b,b2;
final JLabel l;
public AL() {
    setSize(400,400);  
    setLayout(null);  
    setVisible(true);   
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    l=new JLabel();
    b=new JButton(" ");
    l.setBounds(50,50, 150,30);
    b.setBounds(50,100,70,70);
    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            clicks++;
            if(clicks%2==0){
                b.setText("O");
            }
            else{
                b.setText("X");
            }
        }});
    b2=new JButton(" ");
    b2.setBounds(50,200,70,70);
    b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            clicks++;
            if(clicks%2==0){
                b2.setText("O");
            }
            // l.setText("Total clicks: " + clicks);
            else{
                b2.setText("X");
            }
        }
        }
        );
    // b2.addActionListener(new ActionListener() {
    //     public void actionPerformed(ActionEvent e){
    //         clicks+=2;
    //         l.setText("Total clicks: " + clicks);
    //     }
    //     }
    //     );
    add(b);
    add(b2);
    add(l);
        }
public static void main(String[] args) {
    new AL();
}
}
