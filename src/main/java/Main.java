// Local packages
import java.awt.Color;

import graphical.*;

public class Main {
    private static final String interfaceTitle = "MailHandler";
    private static final String internalIconPath = "images/icon.png";
    private static final double[] screenSize = ScreenManager.getScreenDim();
    private static final int interfaceWidth = (int) (screenSize[0]*0.55F);
    private static final int interfaceHeight = (int) (screenSize[1]*0.45F);
    private static final Color bgColor = new Color(31, 31, 31);
    private static final Color panelColor = new Color(62, 62, 62);
    public static void main(String[] args) {
        Interface graphInterface = new Interface(interfaceTitle, interfaceWidth, interfaceHeight, internalIconPath, Main.class);
        graphInterface.setComponents(Interface.getDefaultComponents(panelColor));
        graphInterface.run(bgColor);
    }
}