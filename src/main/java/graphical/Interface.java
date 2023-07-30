package graphical;

// GUI packages
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Interface {
    private static final Color bgColor = new Color(31, 31, 31);

    private String title;
    private int xSize;
    private int ySize;
    private ImageIcon icon;

    @SuppressWarnings("rawtypes")
    public Interface(String title, int xSize, int ySize, String path, Class main) {
        this.title = title;
        this.xSize = xSize;
        this.ySize = ySize;
        this.icon = ScreenManager.createImageIcon(path, main);
    }

    public void run() {
        JFrame window = new JFrame(this.title);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(this.xSize, this.ySize);
        window.setIconImage(this.icon.getImage());
        window.getContentPane().setBackground(bgColor);
        window.setVisible(true);
    }
}