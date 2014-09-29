package cheetahGUI;

import cheetahMGR.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelFrwdMain extends PanelBack implements ActionListener {
    
    MainButton btnNewGame, btnRecords, btnAbout, btnExit;
    
    public PanelFrwdMain(){
        super();
        this.setLayout(null);
              
        btnNewGame = new MainButton("NEW GAME", 240, 40);
        btnRecords = new MainButton("RECORDS",  240, 40);
        btnAbout   = new MainButton("ABOUT",    240, 40);
        btnExit    = new MainButton("EXIT",     240, 40);
        
        int interval = 0;
        btnNewGame.setLocation(0, interval += 50);
        btnRecords.setLocation(0, interval += 50);
        btnAbout.setLocation(0, interval += 50);
        btnExit.setLocation(0, interval += 50);
        
        btnNewGame.addActionListener(this);
        btnRecords.addActionListener(this);
        btnAbout.addActionListener(this);
        btnExit.addActionListener(this);        

        this.add(btnNewGame);
        this.add(btnRecords);
        this.add(btnAbout);
        this.add(btnExit);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        Object source = event.getSource();
        
        if(source == btnNewGame){
            Globals.mainFrame.getContentPane().remove(Globals.mainFrame.panelA);
            Globals.mainFrame.getContentPane().add(Globals.mainFrame.panelB);
            Globals.mainFrame.invalidate();
            Globals.mainFrame.validate();
            Globals.mainFrame.repaint();
        }
        else if(source == btnRecords){
            Messenger.Output("btnRecords was pressed!");
        }
        else if(source == btnAbout){
            Messenger.Output("btnAbout was pressed!");
        }
        else if(source == btnExit){
            System.exit(0);
        }
    }
}
