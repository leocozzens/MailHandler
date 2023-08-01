package graphical;

// JDK packages
import java.util.ArrayList;

// GUI packages
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Local packages
import graphical.components.*;

public class Interface {

    private JFrame window;
    private ImageIcon icon;

    @SuppressWarnings("rawtypes")
    public Interface(String winTitle, int defaultWidth, int defaultHeight, String path, Class main) {
        this.icon = ScreenManager.createImageIcon(path, main);
        this.window = new JFrame(winTitle);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(defaultWidth, defaultHeight);
    }

    public static ArrayList<JLabel> makeLabels(int labelEstimate) {
        ArrayList<JLabel> labels = new ArrayList<JLabel>(labelEstimate);
        labels.add(new Title("Mail Handler", Color.WHITE, JLabel.CENTER, JLabel.TOP));

        labels.trimToSize();
        return labels;
    }

    public void run(ArrayList<JLabel> labels, Color bgColor) {
        this.window.setIconImage(this.icon.getImage());
        this.window.getContentPane().setBackground(bgColor);
        for(int i = 0; i < labels.size(); i++) {
            this.window.add(labels.get(i));
        }
        this.window.setVisible(true);
    }
}