// Local packages
import java.awt.Color;

import graphical.*;

public class Main {
    private static final String INTERFACE_TITLE = "MailHandler";
    private static final String ICON_PATH = "images/icon.png";
    private static final double[] SCREEN_SIZE = ScreenManager.getScreenDim();
    private static final int INTERFACE_WIDTH = (int) (SCREEN_SIZE[0]*0.55F);
    private static final int INTERFACE_HEIGHT = (int) (SCREEN_SIZE[1]*0.45F);
    private static final Color BG_COLOR = new Color(31, 31, 31);
    private static final Color PANEL_COLOR = new Color(62, 62, 62);
    public static void main(String[] args) {
        Interface graphInterface = new Interface(INTERFACE_TITLE, INTERFACE_WIDTH, INTERFACE_HEIGHT, ICON_PATH, Main.class);
        graphInterface.setComponents(Interface.getDefaultComponents(PANEL_COLOR));
        graphInterface.run(BG_COLOR);
    }
}