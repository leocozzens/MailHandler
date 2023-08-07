package graphical.components.panels;

// JDK packages
import java.util.ArrayList;

// GUI packages
import java.awt.Component;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ScrollablePanel extends JScrollPane {
    private JPanel viewportPanel;

    public ScrollablePanel(ArrayList<Component> subComponents, Color bgColor) {
        constructPanel(subComponents, bgColor);
    }

    public ScrollablePanel(Color bgColor) {
        constructPanel(getDefaultScrollables(), bgColor);
    }

    public void constructPanel(ArrayList<Component> subComponents, Color bgColor) {
        this.viewportPanel = new JPanel();
        this.viewportPanel.setBackground(bgColor);
        this.setViewportView(this.viewportPanel);
        this.viewportPanel.setBackground(bgColor);

        for(int i = 0; i < subComponents.size(); i++) {
            this.viewportPanel.add(subComponents.get(i));
        }
    }

    public static ArrayList<Component> getDefaultScrollables() {
        ArrayList<Component> newComponents = new ArrayList<Component>();
        JTextArea textArea = new JTextArea("TEST", 50, 1);
        textArea.setLineWrap(true);
        newComponents.add(textArea);
        return newComponents;
    }
}
