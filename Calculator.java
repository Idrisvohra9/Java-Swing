import javax.swing.*;
import java.awt.*;
import javax.swing.JComponent.*;
import java.awt.event.*;
import java.awt.Color.*;

public class Calculator extends JFrame implements ActionListener{
    String s0, s1, s2;
    final JTextField screen = new JTextField("0");
    final JButton mod, ce, c, backspace, onebyx, sqr, sqrt, div, seven, eight, nine, mul, four, five, six, min, one, two, three, plus, plusmin, zero, point, equals;
    
    public void ElemDesing(JComponent b){
        b.setForeground(Color.white);
        b.setBackground(Color.darkGray);
    }

    public Calculator(){
        s0 = s1 = s2 = "";
        setTitle("Calculator");
        setSize(395,440);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(30,30,30));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getRootPane().setBackground(new Color(30,30,30));
        
        // // Making the screen:
        Font f = new Font("Arial",Font.BOLD,36);
        screen.setBackground(new Color(30,30,30));
        screen.setForeground(Color.white);
        screen.setFont(f);
        screen.setBounds(0,20,380,90);
        // Making the objects of buttons:
        // Assigning the signs:
        mod = new JButton("%");
        ce = new JButton("CE");
        c = new JButton("C");
        backspace = new JButton("<-");
        onebyx = new JButton("1/x");
        sqr = new JButton("x**2");
        sqrt = new JButton("sqrt");
        div = new JButton("/");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        mul = new JButton("*");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        min = new JButton("-");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        plus = new JButton("+");
        plusmin = new JButton("+/-");
        zero = new JButton("0");
        point = new JButton(".");
        equals = new JButton("=");

        // Setting bounds:
        mod.setBounds(0,120,87,35);
        ce.setBounds(98,120,87,35);
        c.setBounds(196,120,87,35);
        backspace.setBounds(294,120,87,35);

        onebyx.setBounds(0,157,87,35);
        sqr.setBounds(98,157,87,35);
        sqrt.setBounds(196,157,87,35);
        div.setBounds(294,157,87,35);

        seven.setBounds(0,194,87,35);
        eight.setBounds(98,194,87,35);
        nine.setBounds(196,194,87,35);
        mul.setBounds(294,194,87,35);

        four.setBounds(0,231,87,35);
        five.setBounds(98,231,87,35);
        six.setBounds(196,231,87,35);
        min.setBounds(294,231,87,35);

        one.setBounds(0,268,87,35);
        two.setBounds(98,268,87,35);
        three.setBounds(196,268,87,35);
        plus.setBounds(294,268,87,35);

        plusmin.setBounds(0,305,87,35);
        zero.setBounds(98,305,87,35);
        point.setBounds(196,305,87,35);
        equals.setBounds(294,305,87,35);

        // Foreground coloring:
        ElemDesing(mod);
        // ColorSetter(mod);
        ElemDesing(ce);
        ElemDesing(c);
        ElemDesing(backspace);
        ElemDesing(onebyx);
        ElemDesing(sqr);
        ElemDesing(sqrt);
        ElemDesing(div);
        ElemDesing(seven);
        ElemDesing(eight);
        ElemDesing(nine);
        ElemDesing(mul);
        ElemDesing(four);
        ElemDesing(five);
        ElemDesing(six);
        ElemDesing(min);
        ElemDesing(one);
        ElemDesing(two);
        ElemDesing(three);
        ElemDesing(plus);
        ElemDesing(plusmin);
        ElemDesing(zero);
        ElemDesing(point);
        ElemDesing(equals);

        mod.addActionListener(this);
        ce.addActionListener(this);
        c.addActionListener(this);
        backspace.addActionListener(this);
        onebyx.addActionListener(this);
        sqr.addActionListener(this);
        sqrt.addActionListener(this);
        div.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        mul.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        min.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        plus.addActionListener(this);
        plusmin.addActionListener(this);
        zero.addActionListener(this);
        point.addActionListener(this);
        equals.addActionListener(this);
    
        add(screen);
        add(mod);
        add(ce);
        add(c);
        add(backspace);
        add(onebyx);
        add(sqr);
        add(sqrt);
        add(div);
        add(seven);
        add(eight);
        add(nine);
        add(mul);
        add(four);
        add(five);
        add(six);
        add(min);
        add(one);
        add(two);
        add(three);
        add(plus);
        add(plusmin);
        add(zero);
        add(point);
        add(equals);
        
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
    public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();

		// if the value is a number
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
			// if operand is present then add to second no
			if (!s1.equals(""))
				s2 = s2 + s;
			else
				s0 = s0 + s;

			// set the value of text
			screen.setText(s0+" " + s1+" " + s2+" ");
		}
		else if (s.charAt(0) == 'C') {
			// clear the one letter
			s0 = s1 = s2 = "";

			// set the value of text
			screen.setText(s0+" " + s1+" " + s2);
		}
		else if (s.charAt(0) == '=') {

			double te;

			// store the value in 1st
			if (s1.equals("+"))
				te = (Double.parseDouble(s0) + Double.parseDouble(s2));
			else if (s1.equals("-"))
				te = (Double.parseDouble(s0) - Double.parseDouble(s2));
			else if (s1.equals("/"))
				te = (Double.parseDouble(s0) / Double.parseDouble(s2));
			else
				te = (Double.parseDouble(s0) * Double.parseDouble(s2));

			// set the value of text
			screen.setText(s0 +" "+ s1+" " + s2+" " + "="+" " + te);

			// convert it to string
			s0 = Double.toString(te);

			s1 = s2 = "";
		}
		else {
			// if there was no operand
			if (s1.equals("") || s2.equals(""))
				s1 = s;
			// else evaluate
			else {
				double te=0;

				// store the value in 1st
				if (s1.equals("+"))
					te = (Double.parseDouble(s0) + Double.parseDouble(s2));
				else if (s1.equals("-"))
					te = (Double.parseDouble(s0) - Double.parseDouble(s2));
				else if (s1.equals("/"))
					te = (Double.parseDouble(s0) / Double.parseDouble(s2));
				else if (s1.equals("*"))
					te = (Double.parseDouble(s0) * Double.parseDouble(s2));

				// convert it to string
				s0 = Double.toString(te);

				// place the operator
				s1 = s;

				// make the operand blank
				s2 = "";
			}

			// set the value of text
			screen.setText(s0+" " + s1+" " + s2+" ");
		}
	}
}
