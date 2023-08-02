package graphical.components;

// JDK packages
import java.util.ArrayList;

// GUI packages
import java.awt.Color;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Panels {
    public static JPanel bgPanel(Color bgColor) {
        JPanel newPanel = new JPanel();
        newPanel.setBackground(bgColor);
        return newPanel;
    }

    public static ArrayList<Component> getDefaultScrollables() {
        ArrayList<Component> newComponents = new ArrayList<Component>();
        JTextArea textArea = new JTextArea("TEST", 50, 1);
        textArea.setLineWrap(true);
        newComponents.add(textArea);
        return newComponents;
    }

    public static JScrollPane scrollablePanel(ArrayList<Component> subComponents, Color bgColor) {
        JScrollPane newPane = new JScrollPane();
        JPanel viewportPanel = new JPanel();
        viewportPanel.setBackground(bgColor);
        newPane.setViewportView(viewportPanel);
        viewportPanel.setBackground(bgColor);

        for(int i = 0; i < subComponents.size(); i++) {
            viewportPanel.add(subComponents.get(i));
        }
        return newPane;
    }
}
