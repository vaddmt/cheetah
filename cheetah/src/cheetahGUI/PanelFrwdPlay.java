package cheetahGUI;

import cheetahMGR.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelFrwdPlay extends PanelBack implements ActionListener {

    ButtonServ   btnBack, btnClear;
    ButtonServ[] digits;
    
    public PanelFrwdPlay() {
        super();
        this.setLayout(null);

        // initializing the BACK button
        btnBack = new ButtonServ("BACK", 130, 50);
        btnBack.setLocation(Globals.SCREEN_RESOLUTION_WIDTH / 2 - btnBack.getWidth() / 2,
                            Globals.SCREEN_RESOLUTION_HEIGHT - btnBack.getHeight() - 50);
        btnBack.addActionListener(this);
        
        // initializing the digits buttons
        digits = new ButtonServ[10];
        int digitsWidth  = (Globals.SCREEN_RESOLUTION_WIDTH - 15 - 5 * 5) / 6;
        int digitsHeight = 50;
        int digitColumns = 5;
        for(int i = 0; i < digits.length; i++) { 
            digits[i] = new ButtonServ(Integer.toString(i), digitsWidth, digitsHeight);
            digits[i].setLocation(5 + i * (digitsWidth + 5) - (i / digitColumns) * (i - i % digitColumns) * (digitsWidth + 5),
                                  Globals.SCREEN_RESOLUTION_HEIGHT - btnBack.getHeight() - digitsHeight * 2 - 50 - 25
                                  + (i / digitColumns) * (digitsHeight + 5));
            digits[i].addActionListener(this);
            this.add(digits[i]);
        }
        
        // initializing clear button
        btnClear = new ButtonServ("C", digitsWidth, digitsHeight * 2 + 5);
        btnClear.setLocation(Globals.SCREEN_RESOLUTION_WIDTH - digitsWidth - 10,
                          digits[0].getLocation().y);
        
        this.add(btnClear);
        this.add(btnBack);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);   
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if(source == btnBack) {
            Globals.mainFrame.getContentPane().remove(Globals.mainFrame.panelC);
            Globals.mainFrame.getContentPane().add(Globals.mainFrame.panelB);			        
        }
        
        Globals.mainFrame.invalidate();
        Globals.mainFrame.validate();
        Globals.mainFrame.repaint();
    }
}
