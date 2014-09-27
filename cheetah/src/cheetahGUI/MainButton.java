package cheetahGUI;

import javax.swing.*;
import java.awt.*;

public class MainButton extends JButton {
    public MainButton(String s){
        super();
        this.setText(s);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.YELLOW);
        g2.fill(this.getVisibleRect());
        g2.setColor(Color.BLACK);
        g2.drawString(this.getText(), 10, 25);
    }
}
