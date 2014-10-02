package cheetahGUI;

import cheetahMGR.Globals;
import java.awt.Graphics;

public class ButtonSelect extends ButtonMain {

    protected boolean currentState = false;

    public ButtonSelect(String s, int w, int h) {
        super("", w, h); 
    }

    public void setState(boolean state) { currentState = state; }   

    @Override   
    public void paintComponent(Graphics g) {	
        if(currentState) {
            g.setColor(Globals.COLOR_SELECT_ON);
        }
        else {
            g.setColor(Globals.COLOR_SELECT_OFF);
        }
        g.fillPolygon(shape);
        g.setColor(Globals.COLOR_BUTTON_PRIMARY);
        g.drawPolygon(shape);
    }
}
