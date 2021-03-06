package cheetahGUI;

import cheetahMGR.Globals;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JLabel;

public class LabelDial extends JLabel {
    
    protected Polygon shapeTOP, shapeBOTTOM;
    protected int edge;
    protected int gap;
    
    public LabelDial(String s, int w, int h, int edge_size){
        super(s);
        this.setSize(w, h);
        this.setFont(Globals.FONT_LABEL_64);
        this.setForeground(Globals.COLOR_DIGITS);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        edge = edge_size;
        gap = 0;

        shapeTOP = new Polygon();
        shapeTOP.addPoint(0, edge);
        shapeTOP.addPoint(edge, 0);
        shapeTOP.addPoint(this.getSize().width - edge, 0);
        shapeTOP.addPoint(this.getSize().width, edge);
        shapeTOP.addPoint(this.getSize().width, this.getSize().height / 2 - gap);
        shapeTOP.addPoint(0, this.getSize().height / 2 - gap);
        
        shapeBOTTOM = new Polygon();
        shapeBOTTOM.addPoint(0, this.getSize().height / 2);
        shapeBOTTOM.addPoint(this.getSize().width, this.getSize().height / 2);
        shapeBOTTOM.addPoint(this.getSize().width, this.getSize().height - edge);
        shapeBOTTOM.addPoint(this.getSize().width - edge, this.getSize().height);
        shapeBOTTOM.addPoint(edge, this.getSize().height);
        shapeBOTTOM.addPoint(0, this.getSize().height - edge);
    }
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        GradientPaint gradient = new GradientPaint(0, 0, Globals.COLOR_DIGITS_GRADIENT1,
                                                   0, this.getSize().height / 2, Globals.COLOR_DIGITS_GRADIENT2, true);
        g2.setPaint(gradient);
        g.fillPolygon(shapeTOP);
        
        gradient = new GradientPaint(0, this.getSize().height / 2, Globals.COLOR_DIGITS_GRADIENT1,
                                     0, this.getSize().height, Globals.COLOR_DIGITS_GRADIENT2, true);
        g2.setPaint(gradient);
        g.fillPolygon(shapeBOTTOM);
        
        super.paintComponent(g);
        
        g2.setColor(Globals.COLOR_GAPLINE);
        g2.drawLine(0, this.getSize().height / 2, this.getSize().width, this.getSize().height / 2);
    }
}
