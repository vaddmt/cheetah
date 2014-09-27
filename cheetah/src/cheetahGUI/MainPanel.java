package cheetahGUI;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    
    MainButton btnNewGame, btnRecords, btnAbout, btnExit;
    
    public MainPanel(){
        super();
        this.setLayout(null);
        
        int interval = 0;      
        btnNewGame = new MainButton("New Game");
        btnNewGame.setLocation(0, interval += 50);      
        btnRecords = new MainButton("Records");
        btnRecords.setLocation(0, interval += 50);    
        btnAbout = new MainButton("About");
        btnAbout.setLocation(0, interval += 50);   
        btnExit = new MainButton("Exit");
        btnExit.setLocation(0, interval += 50);
        
        this.add(btnNewGame);
        this.add(btnRecords);
        this.add(btnAbout);
        this.add(btnExit);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.BLACK);
        g2.fill(this.getVisibleRect());
    }
}
