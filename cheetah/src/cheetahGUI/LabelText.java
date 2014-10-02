package cheetahGUI;

import cheetahMGR.Globals;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;

public class LabelText extends JLabel {
    public LabelText(String s, int size, Color c) {
        super(s);
        this.setSize(Globals.SCREEN_RESOLUTION_WIDTH, 60);
        this.setFont(new Font("Arial", Font.BOLD, size));
        this.setForeground(c);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
