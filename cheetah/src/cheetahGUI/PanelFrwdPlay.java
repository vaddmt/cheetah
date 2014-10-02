package cheetahGUI;

import cheetahMGR.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;

public class PanelFrwdPlay extends PanelBack implements ActionListener {

    private ButtonServ   btnBack, btnClear;
    private ButtonServ[] btnDigits;
    private LabelDial    lblFirstVal, lblSecondVal, lblResultVal;
    private LabelText    lblYourAnswer, lblMathOperand;
    
    public PanelFrwdPlay() {
        super();
        this.setLayout(null);

        // initializing the BACK button
        btnBack = new ButtonServ("BACK", 130, 50);
        btnBack.setLocation(Globals.SCREEN_RESOLUTION_WIDTH / 2 - btnBack.getWidth() / 2,
                            Globals.SCREEN_RESOLUTION_HEIGHT - btnBack.getHeight() - 50);
        btnBack.addActionListener(this);
        
        // initializing the digits buttons
        btnDigits = new ButtonServ[10];
        int digitsWidth  = (Globals.SCREEN_RESOLUTION_WIDTH - 15 - 5 * 5) / 6;
        int digitsHeight = 50;
        int digitColumns = 5;
        for(int i = 0; i < btnDigits.length; i++) { 
            btnDigits[i] = new ButtonServ(Integer.toString(i), digitsWidth, digitsHeight);
            btnDigits[i].setLocation(5 + i * (digitsWidth + 5) - (i / digitColumns) * (i - i % digitColumns) * (digitsWidth + 5),
                                  Globals.SCREEN_RESOLUTION_HEIGHT - btnBack.getHeight() - digitsHeight * 2 - 50 - 25
                                  + (i / digitColumns) * (digitsHeight + 5));
            btnDigits[i].setFont(Globals.FONT_BUTTON_32);
            btnDigits[i].addActionListener(this);
            this.add(btnDigits[i]);
        }
        
        // initializing clear button
        btnClear = new ButtonServ("C", digitsWidth, digitsHeight * 2 + 5);
        btnClear.setLocation(Globals.SCREEN_RESOLUTION_WIDTH - digitsWidth - 10,
                          btnDigits[0].getLocation().y);
        btnClear.setFont(Globals.FONT_BUTTON_32);
        btnClear.addActionListener(this);
        
        // initializing labels
        lblFirstVal = new LabelDial("01234", 240, 60, 5);
        lblFirstVal.setLocation(5, Globals.SCREEN_RESOLUTION_HEIGHT / 2 - lblFirstVal.getHeight() * 4);
        
        lblSecondVal = new LabelDial("56789", 240, 60, 5);
        lblSecondVal.setLocation(Globals.SCREEN_RESOLUTION_WIDTH - lblSecondVal.getWidth() - 10,
                                 Globals.SCREEN_RESOLUTION_HEIGHT / 2 - lblFirstVal.getHeight() * 3 + 20);
        
        lblYourAnswer = new LabelText("Your answer is...", 24, Globals.COLOR_BUTTON_PRIMARY);
        lblYourAnswer.setLocation(0, lblSecondVal.getLocation().y + 70);
        
        lblResultVal = new LabelDial("", 300, 60, 5);
        lblResultVal.setLocation((Globals.SCREEN_RESOLUTION_WIDTH - lblResultVal.getWidth()) / 2,
                                 lblYourAnswer.getLocation().y + lblYourAnswer.getSize().height + 10);
        
        lblMathOperand = new LabelText("+", 64, Globals.COLOR_TEXT_ALTERNATIVE);
        lblMathOperand.setLocation(0, (lblSecondVal.getLocation().y + lblFirstVal.getLocation().y) / 2);
  
        this.add(lblYourAnswer);
        this.add(lblMathOperand);
        this.add(lblFirstVal);
        this.add(lblSecondVal);
        this.add(lblResultVal);
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
        
        for(int i = 0; i < btnDigits.length; i++) {
            if(source == btnDigits[i]) {
                if((i != 0 || lblResultVal.getText().length() != 0) && lblResultVal.getText().length() <= 7) {
                    lblResultVal.setText(lblResultVal.getText() + Integer.toString(i));
                }
            }
        }
        
        if(source == btnClear) {
            lblResultVal.setText("");
        }
        
        Globals.mainFrame.invalidate();
        Globals.mainFrame.validate();
        Globals.mainFrame.repaint();
    }
}
