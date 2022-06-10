import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;

public class Trollbutton extends JFrame implements ActionListener{
    JLabel l;
    JButton yes, no;
    Font f1= new Font("sans-serif",Font.PLAIN,30);
    int width=500, height=400;
    public Trollbutton(){
        setSize(width,height);
        // setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);// This will make it so nothing will happen if the window is closed.
        setDefaultCloseOperation(EXIT_ON_CLOSE);// This will make the window system.exit on click of the close button
        setLocation(360, 220);// The location of the window in the main screen.
        setVisible(true);
        setLayout(null);
        setTitle("Smart tester");
        setResizable(false);
        getContentPane().setBackground(new Color(30,30,30));
        setDefaultLookAndFeelDecorated(true);
        // getGlassPane().setBackground(Color.BLACK);
        // getRootPane().setBackground(Color.BLUE);

        l= new JLabel("Are you dumb?");
        l.setBounds(120, 40, 250, 50);
        l.setFont(f1);
        l.setForeground(Color.GREEN);
        add(l);

        yes = new JButton("Yes");
        yes.setBounds(110,120,75,40);
        no = new JButton("No");
        no.setBounds(240,120,75,40);
        yes.setBackground(Color.darkGray);
        no.setBackground(Color.darkGray);
        add(yes);
        add(no);
        yes.addActionListener(this);
        no.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        int rngN= (int) (Math.random()*6);
        int x=0,y=0;
        String ok = new String(":(");
        if (s.equals("Yes"))
        JOptionPane.showMessageDialog(this, ok,"I knew it :)",JOptionPane.INFORMATION_MESSAGE);
        if (rngN==0){
            x=250;
            y=130;
        }
        else if (rngN==1){
            x=240;
            y=150;
        }
        else if (rngN==2){
            x=260;
            y=120;
        }
        else if (rngN==3){
            x=240;
            y=110;
        }
        else if (rngN==4){
            x=220;
            y=110;
        }
        else if (rngN==5){
            x=210;
            y=160;
        }
            no.setLocation(x, y);
            no.repaint();
            // no.setVisible(false);
    }
    public static void main(String[] args) {
        new Trollbutton();
    }
}
