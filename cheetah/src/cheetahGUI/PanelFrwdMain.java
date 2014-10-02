package cheetahGUI;

import cheetahMGR.Globals;
import cheetahMGR.Messenger;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelFrwdMain extends PanelBack implements ActionListener {
    
    ButtonMain btnNewGame, btnRecords, btnAbout, btnExit;
    
    public PanelFrwdMain(){
        super();
        this.setLayout(null);
              
        btnNewGame = new ButtonMain("NEW GAME", 250, 50);
        btnRecords = new ButtonMain("RECORDS",  250, 50);
        btnAbout   = new ButtonMain("ABOUT",    250, 50);
        btnExit    = new ButtonMain("EXIT",     250, 50);
        
        int interval = 0;
        btnNewGame.setLocation(0, interval += 60);
        btnRecords.setLocation(0, interval += 60);
        btnAbout.setLocation(0, interval += 60);
        btnExit.setLocation(0, interval += 60);
        
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
        
        Globals.mainFrame.invalidate();
        Globals.mainFrame.validate();
        Globals.mainFrame.repaint();
    }
}
