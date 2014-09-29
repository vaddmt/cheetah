package cheetahGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import cheetahMGR.*;

public class ServButton extends MainButton {
    
    protected int edge = 5;
    
    public ServButton(String s, int w, int h) {
        super(s, w, h);

        shape = new Polygon();
        shape.addPoint(0, edge);
        shape.addPoint(edge, 0);
        shape.addPoint(this.getSize().width - edge, 0);
        shape.addPoint(this.getSize().width, edge);
        shape.addPoint(this.getSize().width, this.getSize().height - edge - 1);
        shape.addPoint(this.getSize().width - edge, this.getSize().height - 1);
        shape.addPoint(edge, this.getSize().height - 1);
        shape.addPoint(0, this.getSize().height - edge - 1);
    }  
}

