package cheetahGUI;

import java.awt.*;
import javax.swing.*;

public class ButtonMain extends JButton {
    
    protected Polygon shape;
    
    public ButtonMain(String s, int w, int h) {
        super(s);
	this.setSize(w, h);
	this.setContentAreaFilled(false);
	this.setFocusPainted(false);
	this.setBorder(null);

	shape = new Polygon();
	shape.addPoint(0, 0);
	shape.addPoint(this.getSize().width - 1, 0);
	shape.addPoint(this.getSize().width - 1, this.getSize().height - 1);
	shape.addPoint(0, this.getSize().height - 1);
    }
    
    @Override
    public void paintComponent(Graphics g){
        if(getModel().isArmed()) {
            g.setColor(Color.ORANGE);
        }
        else {
            if(this.isEnabled()) {
                g.setColor(Color.YELLOW);
            }
            else {
                g.setColor(Color.GRAY);
            }
        }
        
        g.fillPolygon(shape);
        super.paintComponent(g);
    }
}
