import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP_AddressFinder extends JFrame implements ActionListener {
    JTextField tf;
    JLabel l;
    @Override
    public void actionPerformed(ActionEvent e) {
        String hostname=tf.getText();
        String ip=null;
        try {
            ip= InetAddress.getByName(hostname).getHostAddress();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        // System.out.println(ip);
        l.setText(String.format("The Ip address of Host:%s is:%s", hostname, ip));
    }
    public void component()
    {
        setVisible(true);
        setLayout(null);
        setSize(700,700);
        setBackground(Color.darkGray);

        tf=new JTextField();
        tf.setBounds(500,50,120,20);
        tf.setBackground(Color.GREEN);
        add(tf);

        Font label = new Font("Helvetica",Font.ITALIC,26);
        l=new JLabel();
        l.setForeground(Color.magenta);
        l.setFont(label);
        l.setBounds(500,100,700,60);
        add(l);

        JButton btn=new JButton("Get IP");
        btn.setForeground(Color.blue);
        btn.setBackground(Color.black);
        btn.setBounds(500,200,200,80);
        btn.addActionListener(this);
        add(btn);
    }

    public static void main(String[] args) {
        IP_AddressFinder i=new IP_AddressFinder();
        i.component();
    }
}