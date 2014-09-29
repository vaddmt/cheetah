package cheetahGUI;

import cheetahMGR.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

