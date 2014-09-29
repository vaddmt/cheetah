package cheetahGUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import cheetahMGR.*;

public class PanelFrwdMode extends PanelBack implements ActionListener {
    
    ServButton btnBack;

    public PanelFrwdMode(){
        super();
        this.setLayout(null);
        btnBack = new ServButton("BACK", 120, 40);
        btnBack.setLocation(Globals.SCREEN_RESOLUTION_WIDTH / 2 - 60,
                            Globals.SCREEN_RESOLUTION_HEIGHT - 50 - 40);
        btnBack.addActionListener(this);        
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
            Globals.mainFrame.repaint();			        
        }
    }
}

