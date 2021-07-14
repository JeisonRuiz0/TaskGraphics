package views.components;

import javax.swing.*;
import java.awt.*;

public class GirdBagLayoutTheme extends JComponent {

    public static void addComponent(GridBagConstraints gbc, int gridX, int gridY, int gridWidht, int gridHeight){
        gbc.gridx = gridX;
        gbc.gridy = gridY;
        gbc.gridwidth = gridWidht;
        gbc.gridheight= gridHeight;
        gbc.insets = new Insets(10,10,10,10);
    }
}
