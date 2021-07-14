package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainPanel extends JPanel {

    private BodyPanel bodyPanel;
    private FooterPanel footerPanel;
    public MainPanel(ArrayList<String> files){
        this.setLayout(new BorderLayout());
        initComponents(files);
    }

    public void initComponents(ArrayList<String> files){
        footerPanel = new FooterPanel();
        bodyPanel = new BodyPanel(files);


        this.add(bodyPanel, BorderLayout.CENTER);
        this.add(footerPanel, BorderLayout.SOUTH);


    }

    public BodyPanel getBodyPanel() {
        return bodyPanel;
    }
}
