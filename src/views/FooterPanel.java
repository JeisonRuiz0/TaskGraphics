package views;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {

    public FooterPanel(){
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
        layout.setHgap(20);
        layout.setVgap(20);
        this.setBackground(Color.decode("#ea907a"));
        this.setPreferredSize(new Dimension( 600, 100));
        initComponents();
    }

    public void initComponents(){
    }
}
