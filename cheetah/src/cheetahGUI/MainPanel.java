package cheetahGUI;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    
    MainButton btnNewGame, btnRecords, btnAbout, btnExit;
    
    public MainPanel(){
        super();
        this.setLayout(null);
        
        btnNewGame = new MainButton("New Game");
        btnNewGame.setLocation(0, 30);
        btnNewGame.setSize(210, 40);
        
        btnRecords = new MainButton("Records");
        btnRecords.setLocation(0, 80);
        btnRecords.setSize(210, 40);
        
        btnAbout = new MainButton("About");
        btnAbout.setLocation(0, 130);
        btnAbout.setSize(210, 40);
        
        btnExit = new MainButton("Exit");
        btnExit.setLocation(0, 180);
        btnExit.setSize(210, 40);
        
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
