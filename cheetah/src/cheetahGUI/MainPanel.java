package cheetahGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import cheetahMGR.*;

public class MainPanel extends JPanel implements ActionListener {
    
    MainButton btnNewGame, btnRecords, btnAbout, btnExit;
    
    public MainPanel(){
        super();
        this.setLayout(null);
        
        int interval = 0;      
        btnNewGame = new MainButton("New Game");
        btnNewGame.setLocation(0, interval += 50);
        btnNewGame.addActionListener(this);
        btnRecords = new MainButton("Records");
        btnRecords.setLocation(0, interval += 50);
        btnRecords.addActionListener(this);
        btnAbout = new MainButton("About");
        btnAbout.setLocation(0, interval += 50);
        btnAbout.addActionListener(this);
        btnExit = new MainButton("Exit");
        btnExit.setLocation(0, interval += 50);
        btnExit.addActionListener(this);
        
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
    
    @Override
    public void actionPerformed(ActionEvent event){
        Object source = event.getSource();
        
        if(source == btnNewGame){
            Messenger.Output("btnNewGame was pressed!");
        }
        if(source == btnRecords){
            Messenger.Output("btnRecords was pressed!");
        }
        if(source == btnAbout){
            Messenger.Output("btnAbout was pressed!");
        }
        if(source == btnExit){
            System.exit(0);
        }
    }
}
