import javax.swing.*;
import java.awt.event.*;

public class menu_checkbox extends JFrame implements ActionListener {
    JLabel head;
    JCheckBox c1, c2, c3;
    JButton Order,Cancel;

    @Override
    public void actionPerformed(ActionEvent e) {
        int total = 0;
        String msg="";

        if(c1.isSelected()) {
            msg+="Pizza\t:\t100/-\n";
            total+= 100;
        }
        if(c2.isSelected()) {
            msg+="Burger\t:\t30/-\n";
            total+= 30;
        }
        if(c3.isSelected()) {
            msg+="Tea\t:\t10/-\n";
            total+= 10;
        }
        msg+="_______\nTotal\t:\t"+total;


        if (e.getSource() == Order){
            JOptionPane.showMessageDialog(
                    this,
                    msg,
                    "Total Bill",
                    JOptionPane.CLOSED_OPTION
            );
        }
    }

    menu_checkbox(){
        setVisible(true);
        setSize(500,500);
        setLayout(null);

        head = new JLabel("Food Ordering System");
        c1 = new JCheckBox("Pizza @ 100");
        c2 = new JCheckBox("Burger @ 30");
        c3 = new JCheckBox("Tea @ 10");
        Order = new JButton("Order");
        Cancel = new JButton("Cancel");

        head.setBounds(50,50,150,30);
        c1.setBounds(150,150,200,30);
        c2.setBounds(150,180,200,30);
        c3.setBounds(150,210,200,30);
        Order.setBounds(150,260,100,30);
        Cancel.setBounds(150,300,100,30);

        add(head);add(c1);add(c2);add(c3);add(Order);add(Cancel);

        Order.addActionListener(this);
    }

    public static void main(String[] args) {
        menu_checkbox obj = new menu_checkbox();
    }
}