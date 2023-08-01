package graphical.components;

// GUI packages
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Title extends JLabel {
    private static final Font textFont = new Font("SansSerif", Font.PLAIN, 30);

    public Title(String title, Color textColor) {
        this.setText(title);
        this.setFont(textFont);
        this.setForeground(textColor);
    }
}
