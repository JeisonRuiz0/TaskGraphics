package views;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainWindow extends JFrame {

    private MainPanel mainPanel;

    public MainWindow(ArrayList<String> files){
        this.setSize(new Dimension((int)this.getMaximumSize().getWidth(), (int)this.getMaximumSize().getHeight()));
        this.setResizable(false);
        this.setTitle("View Task App");
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("src/Resource/file.png").getImage());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        initComponents(files);
    }

    public void initComponents(ArrayList<String> files){
        mainPanel = new MainPanel(files);
        this.getContentPane().add(mainPanel);
    }

    public MainPanel getMainPanel() {
        return mainPanel;
    }
}
