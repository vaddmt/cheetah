package cheetahGUI;

import cheetahMGR.Globals;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.*;

public class PanelBack extends JPanel {
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        GradientPaint gradient = new GradientPaint(0, 0, Globals.COLOR_BACKGROUND_GRAD1,
                                                   0, Globals.SCREEN_RESOLUTION_HEIGHT, Globals.COLOR_BACKGROUND_GRAD2, true);
        g2.setPaint(gradient);
        g2.fill(this.getVisibleRect());
        g2.setColor(Globals.COLOR_GAPLINE);
        for(int i = 0; i < Globals.SCREEN_RESOLUTION_HEIGHT; i += 5) {
            g2.draw(new Line2D.Double(0, i, Globals.SCREEN_RESOLUTION_WIDTH, i));
        }
    }    
}
