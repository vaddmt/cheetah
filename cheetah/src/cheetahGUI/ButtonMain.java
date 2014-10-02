package cheetahGUI;

import cheetahMGR.Globals;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JButton;

public class ButtonMain extends JButton {
    
    protected Polygon shape;
    
    public ButtonMain(String s, int w, int h) {
        super(s);
	this.setSize(w, h);
	this.setContentAreaFilled(false);
	this.setFocusPainted(false);
	this.setBorder(null);
        this.setFont(Globals.FONT_BUTTON_24);

	shape = new Polygon();
	shape.addPoint(0, 0);
	shape.addPoint(this.getSize().width - 1, 0);
	shape.addPoint(this.getSize().width - 1, this.getSize().height - 1);
	shape.addPoint(0, this.getSize().height - 1);
    }
    
    @Override
    public void paintComponent(Graphics g){
        if(getModel().isArmed()) {
            g.setColor(Globals.COLOR_BUTTON_SECONDARY);
        }
        else {
            if(this.isEnabled()) {
                g.setColor(Globals.COLOR_BUTTON_PRIMARY);
            }
            else {
                g.setColor(Globals.COLOR_BUTTON_DISABLE);
            }
        }
        
        g.fillPolygon(shape);
        super.paintComponent(g);
    }
}
