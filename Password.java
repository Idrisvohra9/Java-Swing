import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Password extends JFrame implements ActionListener
{
    JButton b1;
    JTextField tf;
    JPasswordField ptf;
    JLabel l1,l2;
    public void design()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        tf=new JTextField();
        ptf=new JPasswordField();
        l1=new JLabel("Username: ");
        l2=new JLabel("Password: ");
        b1=new JButton("Login");
        l1.setBounds(50,50,100,30);
        l2.setBounds(50,100,100,30);
        tf.setBounds(100,50,100,30);
        ptf.setBounds(100,100,100,30);
        add(l1);
        add(l2);
        add(tf);
        add(ptf);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args)
    {
        Password p=new Password();
        p.design();
    }
}