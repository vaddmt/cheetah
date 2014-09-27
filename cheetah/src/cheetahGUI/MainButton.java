package cheetahGUI;

import javax.swing.*;
import java.awt.*;
import cheetahMGR.*;

public class MainButton extends JButton {   
    public MainButton(String s){
        super();
        this.setText(s);
        this.setBorder(null);
        this.setSize(Globals.SCREEN_RESOLUTION_WIDTH * 2 / 3, 40);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.YELLOW);
        if(getModel().isPressed()){
            g2.setColor(Color.ORANGE);
        }
        g2.fill(this.getVisibleRect());      
        g2.setColor(Color.BLACK);
        g2.drawString(this.getText(), 10, 25);
    }
}
