package cheetahGUI;

import javax.swing.*;
import java.awt.*;
import cheetahMGR.*;

public class MainButton extends JButton {
    
    protected int     width, height;
    protected Polygon shape;
    
    public MainButton(String s, int w, int h) {
        super(s);
	this.setSize(w, h);
	this.setContentAreaFilled(false);
	this.setFocusPainted(false);
	this.setBorder(null);

	shape = new Polygon();
	shape.addPoint(0, 0);
	shape.addPoint(this.getSize().width, 0);
	shape.addPoint(this.getSize().width, this.getSize().height);
	shape.addPoint(0, this.getSize().height);
    }
    
    @Override
    public void paintComponent(Graphics g){
        if(getModel().isArmed()) {
            g.setColor(Color.ORANGE);
        }
        else {
            g.setColor(Color.YELLOW);
        }
        
        g.fillPolygon(shape);
        super.paintComponent(g);
    }
}
