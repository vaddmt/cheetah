package cheetahGUI;

import java.awt.*;

public class ButtonSelect extends ButtonMain {

    protected boolean currentState = false;

    public ButtonSelect(String s, int w, int h) {
        super("", w, h); 
    }

    public void setState(boolean state) { currentState = state; }   

    @Override   
    public void paintComponent(Graphics g) {	
        if(currentState) {
            g.setColor(new Color(255, 255, 128, 128));
        }
        else {
            g.setColor(new Color(0, 0, 0, 128));
        }
        g.fillPolygon(shape);
        g.setColor(Color.YELLOW);
        g.drawPolygon(shape);
    }
}
