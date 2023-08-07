package graphical.components.text;

// GUI packages
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Title extends JLabel {
    private static final Font TEXT_FONT = new Font("SansSerif", Font.PLAIN, 25);

    public Title(String title, Color textColor) {
        this.setText(title);
        this.setFont(TEXT_FONT);
        this.setForeground(textColor);
    }
}
