package cheetahGUI;

import cheetahMGR.Globals;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Polygon;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;

public class LabelDial extends JLabel {
    
    protected Polygon shapeTOP, shapeBOTTOM;
    protected int edge;
    protected int gap;
    
    public LabelDial(String s, int w, int h, int edge_size){
        super(s);
        this.setSize(w, h);
        this.setFont(new Font("Arial", Font.BOLD, 64));
        this.setForeground(new Color(0, 0, 0, 200));
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
        GradientPaint gradient = new GradientPaint(0, 0, Color.GRAY, 0, this.getSize().height / 2, Color.DARK_GRAY, true);
        g2.setPaint(gradient);
        g.fillPolygon(shapeTOP);
        
        gradient = new GradientPaint(0, this.getSize().height / 2, Color.GRAY, 0, this.getSize().height, Color.DARK_GRAY, true);
        g2.setPaint(gradient);
        g.fillPolygon(shapeBOTTOM);
        super.paintComponent(g);
        g2.setColor(Color.BLACK);
        g2.drawLine(0, this.getSize().height / 2, this.getSize().width, this.getSize().height / 2);
    }
}
