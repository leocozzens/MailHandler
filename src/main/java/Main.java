// Local packages
import graphical.*;

public class Main {
    private static final String interfaceTitle = "MailHandler";
    private static final String internalIconPath = "images/icon.png";
    private static final double[] screenSize = ScreenManager.getScreenDim();
    private static final int interfaceWidth = (int) (screenSize[0]*0.55F);
    private static final int interfaceHeight = (int) (screenSize[1]*0.45F);
    public static void main(String[] args) {
        Interface graphInterface = new Interface(interfaceTitle, interfaceWidth, interfaceHeight, internalIconPath, Main.class);
        graphInterface.run();
    }
}