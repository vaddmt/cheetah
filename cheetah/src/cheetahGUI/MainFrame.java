package cheetahGUI;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame(String caption, int width, int height){
        super(caption);
        this.setSize(width, height);
        this.setResizable(false);
        this.setLocation(50, 50);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.getContentPane().add(new MainPanel());
        
        this.setVisible(true);
    }
}
