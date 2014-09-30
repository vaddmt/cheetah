package cheetahGUI;

import cheetahMGR.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelFrwdMode extends PanelBack implements ActionListener {
    
    ButtonServ     btnBack;
    ButtonSelect[] modes;

    public PanelFrwdMode(){
        super();
        this.setLayout(null);
        
        // initializing the BACK button
        btnBack = new ButtonServ("BACK", 130, 50);
        btnBack.setLocation(Globals.SCREEN_RESOLUTION_WIDTH / 2 - 60,
                            Globals.SCREEN_RESOLUTION_HEIGHT - btnBack.getHeight() - 50);
        btnBack.addActionListener(this);
        
        // initializing 5 buttons for changing gamemode
        modes = new ButtonSelect[5];
        int panelsHeight = ((Globals.SCREEN_RESOLUTION_HEIGHT -
                             btnBack.getHeight() - 50 - 50) / modes.length);
        for(int i = 0; i < modes.length; i++) {
            modes[i] = new ButtonSelect("", Globals.SCREEN_RESOLUTION_WIDTH - 15, panelsHeight);
            modes[i].setLocation(5, 5 + (5 + panelsHeight) * i);
            modes[i].addActionListener(this);
            this.add(modes[i]);
        }
        
        this.add(btnBack);    
	}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);   
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if(source == btnBack) {
            Globals.mainFrame.getContentPane().remove(Globals.mainFrame.panelB);
            Globals.mainFrame.getContentPane().add(Globals.mainFrame.panelA);
            Globals.mainFrame.invalidate();
            Globals.mainFrame.validate();			        
        }
        
        for(int i = 0; i < modes.length; i++) {
            if(source == modes[i]) {
                modes[i].setState(true);
            }              
            else {
                modes[i].setState(false);
            }        
        }
        
        Globals.mainFrame.repaint();
    }
}

