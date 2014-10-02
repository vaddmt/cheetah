package cheetahMGR;

import cheetahGUI.*;
import java.awt.Color;
import java.awt.Font;

public class Globals {
    // System parameters
    public static int SCREEN_RESOLUTION_WIDTH   = 384;
    public static int SCREEN_RESOLUTION_HEIGHT  = 640;
    public static MainFrame mainFrame;
    
    // Colors
    public static Color COLOR_BUTTON_PRIMARY   = Color.YELLOW;
    public static Color COLOR_BUTTON_SECONDARY = Color.ORANGE;
    public static Color COLOR_BUTTON_DISABLE   = Color.GRAY;
    public static Color COLOR_SELECT_OFF       = new Color(0, 0, 0, 128);
    public static Color COLOR_SELECT_ON        = new Color(255, 255, 128, 128);
    public static Color COLOR_DIGITS           = new Color(0, 0, 0, 200);
    public static Color COLOR_DIGITS_GRADIENT1 = Color.GRAY;
    public static Color COLOR_DIGITS_GRADIENT2 = Color.DARK_GRAY;
    public static Color COLOR_GAPLINE          = Color.BLACK;
    public static Color COLOR_TEXT_ALTERNATIVE = new Color(255, 255, 128, 196);//Color.YELLOW;
    public static Color COLOR_BACKGROUND_GRAD1 = Color.BLACK;
    public static Color COLOR_BACKGROUND_GRAD2 = Color.GRAY;
    
    // Sizes
    
    // Fonts
    public static Font FONT_BUTTON_16 = new Font("Arial", Font.BOLD, 16);
    public static Font FONT_BUTTON_24 = new Font("Arial", Font.BOLD, 24);
    public static Font FONT_BUTTON_32 = new Font("Arial", Font.BOLD, 32);
    public static Font FONT_BUTTON_48 = new Font("Arial", Font.BOLD, 48);
    public static Font FONT_LABEL_64  = new Font("Arial", Font.BOLD, 64);
    
    // Other
    public static int MIN_VALUE = 11;
    public static int MAX_VALUE = 99;
    
}
