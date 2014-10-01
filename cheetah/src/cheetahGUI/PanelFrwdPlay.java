package cheetahGUI;

import cheetahMGR.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelFrwdPlay extends PanelBack implements ActionListener {
    
    public PanelFrwdPlay() {
        super();
        this.setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);   
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        Globals.mainFrame.repaint();
    }
}
