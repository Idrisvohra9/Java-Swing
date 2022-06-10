import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;

public class Notepad extends JFrame {
    final JTextArea mainScreen;

    final Font f1 = new Font("Helvetica",Font.PLAIN,16), f2 = new Font("Verdana",Font.BOLD,20), f3 = new Font("sans-serif",Font.PLAIN,12);
    
     JMenuBar MainMenuBar;

     JMenu file, edit, view;
    // for file:
     JMenuItem open, save, saveas, exit;

    // for edit:
     JMenuItem cut, copy, paste, selectall, replace, font;

    // for view:
     JMenuItem zoom, statusbar;

    final JLabel l;
// For menubar:
    void MainMenuBar(){
        // main menu:
        MainMenuBar = new JMenuBar();
        // JMenu creating and appending to the JMenuBar:
        file = new JMenu("File");
        file.setSize(50,70);
        edit = new JMenu("Edit");
        edit.setSize(50,70);
        view = new JMenu("View");
        view.setSize(50,70);
        
        
        // file contents creating and appending to the JMenu:
        open = new JMenuItem("Open");
        MenuItemDecor(open);
        save = new JMenuItem("Save");
        MenuItemDecor(save);
        saveas = new JMenuItem("Save As");
        MenuItemDecor(saveas);
        exit = new JMenuItem("Exit");
        MenuItemDecor(exit);
        
        // Edit contents creating and appending to the JMenu:
        cut = new JMenuItem("Cut");
        MenuItemDecor(cut);
        copy = new JMenuItem("Copy");
        MenuItemDecor(copy);
        paste = new JMenuItem("Paste");
        MenuItemDecor(paste);
        selectall = new JMenuItem("Select All");
        MenuItemDecor(selectall);
        replace = new JMenuItem("Replace");
        MenuItemDecor(replace);
        font = new JMenuItem("Font");
        MenuItemDecor(font);
        // Adding functionality to the edit JMenuItems:
        WorkingEdit(cut);
        WorkingEdit(copy);
        WorkingEdit(paste);
        WorkingEdit(selectall);
        
        // View contents creating and appending to the JMenu:
        zoom = new JMenuItem("Zoom");
        MenuItemDecor(zoom);
        statusbar = new JMenuItem("Statusbar");
        MenuItemDecor(statusbar);
        
        // Adding each JMenuItem to their specific JMenu(s):
        file.add(open);
        file.add(save);
        file.add(saveas);
        file.add(exit);
        
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectall);
        edit.add(replace);
        edit.add(font);

        view.add(zoom);
        view.add(statusbar);
        
        MainMenuBar.add(file);
        MainMenuBar.add(edit);
        MainMenuBar.add(view);
        
        MainMenuBar.setBackground(Color.WHITE);
        file.setFont(f1);
        edit.setFont(f1);
        view.setFont(f1);

        setJMenuBar(MainMenuBar);
    }
// For decoration of menu items:
    void MenuItemDecor(JMenuItem m){
        m.setBackground(Color.WHITE);
        m.setFont(f3);
    }
    // For making edit JMenuItems working:
    void WorkingEdit(JMenuItem m){
        m.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==cut) mainScreen.cut();
                if(e.getSource()==copy) mainScreen.copy();
                if(e.getSource()==paste) mainScreen.paste();
                if(e.getSource()==selectall) mainScreen.selectAll();
                // if(e.getSource()==replace) mainScreen.replace()
            }
        });
    }
    public Notepad(){
        int width =700,height =500;
        setTitle("Notepad");
        setSize(width, height);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(255,255,255));
        // container = new JPanel();
        // container.setBackground(new Color(255,255,255));
        // add(container);
        mainScreen = new JTextArea();
        MainMenuBar();
        mainScreen.setBounds(20, 20, width-10, height-20);
        mainScreen.setFont(f1);
        // mainScreen.addInputMethodListener(new InputMethodListener() {

        // });
        add(mainScreen);
        l = new JLabel("Hello");
        l.setBounds(0,510,100,40);
        l.setFont(f2);
        add(l);
    }
    public void getInputMethodRequests(InputVerifier e) {
        int rowC= 1, colC= 1;
        String c = mainScreen.getText();
        System.out.println(c);
        boolean start= true;
        l.setText(String.format("Content: "+ c));
        // if(c.contains("plz")){
        //     rowC++;
        // }
    }
    public static void main(String[] args) {
        new Notepad();
    }
}
