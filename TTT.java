import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TTT extends JFrame{
    Font objfont = new Font("sans-serif", Font.BOLD, 36), labelfont = new Font("Helvetica",20, Font.PLAIN);
    int turn = 0;
    JButton b1,b2,b3;
    JButton b4,b5,b6;
    JButton b7,b8,b9;
    JLabel p1,p2;
    JTextField n1,n2;
    JButton reset,setname;
    Boolean run=true;
    String player1="X";
    String player2="O";
    String winmsg="";
    int win=0;

//   Function For Setting Foreground and Background colors of buttons
    public void buttonDecor(JComponent c){
        c.setBackground(new Color(155,155,155));
        c.setForeground(new Color(10,10,10));
        c.setFont(objfont);
        c.setBorder(null);
    }

//    Function For Setting Text(O|X) in Buttons
    public void placer(JButton b){
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (!b.getText().equals("X") && !b.getText().equals("O")){
                    if(turn==0){
                        b.setText("X");
                        getContentPane().setBackground(new Color(0,45,205));
                        turn +=1;
                    }
                    else{
                        b.setText("O");
                        getContentPane().setBackground(new Color(205,45,0));
                        turn =0;
                    }
                }
        if(b.getText().equals("X") || b.getText().equals("O")){
            if(e.getSource()==b){

                    // Horizontal wins:
    
                    // 1st row
                    if(b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")){
                        win=1;
                        winmsg=player1+" Has won!!!";
                    }
                    else if(b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O")){
                        win=2;
                        winmsg=player2+" Has won!!!";
                    }
                    // 2nd row:
                    if(b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")){
                        win=1;
                        winmsg=player1+" Has won!!!";
                    }
                    else if(b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O")){
                        win=2;
                        winmsg=player2+" Has won!!!";
                    }
                    // 3rd row:
                    if(b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")){
                        win=1;
                        winmsg=player1+" Has won!!!";
                    }
                    else if(b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O")){
                        win=2;
                        winmsg=player2+" Has won!!!";
                    }
    
                    // Vertical wins:
    
                    // 1st col
                    if(b1.getText().equals("X") && b4.getText().equals("X") && b7.getText().equals("X")){
                        win=1;
                        winmsg=player1+" Has won!!!";
                    }
                    else if(b1.getText().equals("O") && b4.getText().equals("O") && b7.getText().equals("O")){
                        win=2;
                        winmsg=player2+" Has won!!!";
                    }
                    // 2nd col:
                    if(b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")){
                        win=1;
                        winmsg=player1+" Has won!!!";
                    }
                    else if(b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O")){
                        win=2;
                        winmsg=player2+" Has won!!!";
                    }
                    // 3rd col:
                    if(b3.getText().equals("X") && b6.getText().equals("X") && b9.getText().equals("X")){
                        win=1;
                        winmsg=player1+" Has won!!!";
                    }
                    else if(b3.getText().equals("O") && b6.getText().equals("O") && b9.getText().equals("O")){
                        win=2;
                        winmsg=player2+" Has won!!!";
                    }
    
                    // Diagonal wins:
    
                    // Forward slash Diagonal
                    if(b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")){
                        win=1;
                        winmsg=player1+" Has won!!!";
                    }
                    else if(b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O")){
                        win=2;
                        winmsg=player2+" Has won!!!";
                    }
                    // Back Slash Diagonal
                    if(b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")){
                        win=1;
                        winmsg=player1+" Has won!!!";
                    }
                    else if(b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O")){
                        win=2;
                        winmsg=player2+" Has won!!!";
                    }
    
                }
                if(win==1){
                    JOptionPane.showMessageDialog(
                        b,winmsg,"Congrats!!",JOptionPane.PLAIN_MESSAGE);
                    }
                    else if(win==2){
                        JOptionPane.showMessageDialog(
                            b,winmsg,"Congrats!!",JOptionPane.PLAIN_MESSAGE);
                        }
                    }
            else if(
               b1.getText().equals("X") || b1.getText().equals("O") 
            && b2.getText().equals("X") || b2.getText().equals("O") 
            && b3.getText().equals("X") || b3.getText().equals("O") 
            && b4.getText().equals("X") || b4.getText().equals("O")
            && b5.getText().equals("X") || b5.getText().equals("O")
            && b6.getText().equals("X") || b6.getText().equals("O")
            && b7.getText().equals("X") || b7.getText().equals("O")
            && b8.getText().equals("X") || b8.getText().equals("O")
            && b9.getText().equals("X") || b9.getText().equals("O")
            ){
                winmsg="The match resulted in a tie...";
                getContentPane().setBackground(new Color(35,35,35));
                JOptionPane.showMessageDialog(
                b,winmsg,"OOPS the Match resulted in a tie...",JOptionPane.CANCEL_OPTION);
            }
        }
        }
    );
    }

//    Constructor
    public TTT() {
        setTitle("Tic-Tac-Toe");
        setSize(600,600);
        setVisible(true);
        setLocation(300, 100);
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(35,35,35));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        boxes();
        OtherStuffs();
    }

//    Adding Buttons
    void boxes(){
//        Initiating Buttons
        b1= new JButton(" ");
        b2= new JButton(" ");
        b3= new JButton(" ");
        b4= new JButton(" ");
        b5= new JButton(" ");
        b6= new JButton(" ");
        b7= new JButton(" ");
        b8= new JButton(" ");
        b9= new JButton(" ");

//        Sizing button on the screen
        b1.setBounds(60+110, 30+120, 70, 70);
        b2.setBounds(140+110, 30+120, 70, 70);
        b3.setBounds(220+110, 30+120, 70, 70);

        b4.setBounds(60+110, 110+120, 70, 70);
        b5.setBounds(140+110, 110+120, 70, 70);
        b6.setBounds(220+110, 110+120, 70, 70);

        b7.setBounds(60+110, 190+120, 70, 70);
        b8.setBounds(140+110, 190+120, 70, 70);
        b9.setBounds(220+110, 190+120, 70, 70);

//       Buttons Decoration
        buttonDecor(b1);
        buttonDecor(b2);
        buttonDecor(b3);
        buttonDecor(b4);
        buttonDecor(b5);
        buttonDecor(b6);
        buttonDecor(b7);
        buttonDecor(b8);
        buttonDecor(b9);

// Making boxes Functional:
        placer(b1);
        placer(b2);
        placer(b3);
        placer(b4);
        placer(b5);
        placer(b6);
        placer(b7);
        placer(b8);
        placer(b9);

//        Adding button to frame
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
    }
    void OtherStuffs(){
        p1 = new JLabel("Player X's Name:");
        p2 = new JLabel("Player O's Name:");

        n1= new JTextField();
        n2 = new JTextField();

        setname = new JButton("Set");
        reset = new JButton("Reset");

        p1.setForeground(new Color(160,20,140));
        p2.setForeground(new Color(160,20,140));

        p1.setFont(labelfont);
        p2.setFont(labelfont);

        n1.setBackground(new Color(155,155,155));
        n2.setBackground(new Color(155,155,155));

        p1.setBounds(10,10,90,30);
        p2.setBounds(490,10,90,30);
        n1.setBounds(10,50,90,30);
        n2.setBounds(490,50,90,30);

        setname.setBackground(new Color(160,20,140));
        reset.setBackground(new Color(160,20,140));

        setname.setBounds(270,80,40,30);
        reset.setBounds(240,400,100,30);

        setname.setBorder(null);
        reset.setBorder(null);

    // Adding functionality to reset button:

        reset.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent r) {
            b1.setText(" ");
            b2.setText(" ");
            b3.setText(" ");
            b4.setText(" ");
            b5.setText(" ");
            b6.setText(" ");
            b7.setText(" ");
            b8.setText(" ");
            b9.setText(" ");
            getContentPane().setBackground(new Color(35,35,35));
            
        }});
        add(p1);
        add(p2);
        add(n1);
        add(n2);

        add(reset);
        add(setname);
    }

    void setName(JButton set){

    }
    public static void main(String[] args) {
        new TTT();
    }
}