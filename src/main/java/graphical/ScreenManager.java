package graphical;

// JDK packages
import java.net.URL;

// GUI packages
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;


public class ScreenManager {
    // Method to load the ImageIcon from within the JAR
    @SuppressWarnings("rawtypes")
    public static ImageIcon createImageIcon(String path, Class main) {
        URL imageURL = main.getResource("/" + path);
        if (imageURL != null) {
            return new ImageIcon(imageURL);
        }
        else {
            System.err.println("Couldn't find the image: " + path);
            return null;
        }
    }

    public static double[] getScreenDim() {
        double[] dimensions = new double[2];
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = defaultToolkit.getScreenSize();

        dimensions[0] = screenSize.getWidth();
        dimensions[1] = screenSize.getHeight();

        return dimensions;
    }
}
