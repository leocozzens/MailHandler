package graphical;

// JDK packages
import java.util.ArrayList;

// GUI packages
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

// Local packages
import graphical.components.Panels;

public class Interface {
    private static final int minWidth = 300;
    private static final int minHeight = 300;
    private static final int panelCount = 3;
    private static final int panelGap = 4;

    private ArrayList<Component> components;
    private JFrame window;
    private ImageIcon icon;

    @SuppressWarnings("rawtypes")
    public Interface(String winTitle, int defaultWidth, int defaultHeight, String path, Class main) {
        this.icon = ScreenManager.createImageIcon(path, main);
        this.window = new JFrame(winTitle);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(defaultWidth, defaultHeight);

        GridLayout winLayout = new GridLayout();
        winLayout.setHgap(panelGap);
        this.window.setLayout(winLayout);
    }

    public static ArrayList<Component> getDefaultComponents(Color panelColor) {
        ArrayList<Component> components = new ArrayList<Component>(panelCount);
        components.add(Panels.bgPanel(panelColor));
        components.add(Panels.scrollablePanel(Panels.getDefaultScrollables(), panelColor));
        components.add(Panels.bgPanel(panelColor));

        components.trimToSize();
        return components;
    }

    public void run(Color bgColor) {
        if(this.components == null) {
            System.err.println("ERROR: No components were set for window");
            System.exit(1);
        }
        this.window.setIconImage(this.icon.getImage());
        this.window.getContentPane().setBackground(bgColor);
        for(int i = 0; i < components.size(); i++) {
            this.window.add(components.get(i));
        }
        this.window.setMinimumSize(new Dimension(minWidth, minHeight));
        this.window.setVisible(true);
    }

    // Getters and setters
    public void setComponents(ArrayList<Component> components) {
        this.components = components;
    }
}