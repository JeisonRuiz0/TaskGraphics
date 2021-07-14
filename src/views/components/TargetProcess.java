package views.components;

import javax.swing.*;
import java.awt.*;

public class TargetProcess extends JButton {
    public static  final Dimension DEFAULT_ICON_DIMENSION = new Dimension(50,50);
    public static final String IMAGE_ICON = "src/img/process_image.png";
    public TargetProcess(String text){
        super(text);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setIcon(new ImageIcon(new ImageIcon(IMAGE_ICON).getImage().getScaledInstance((int)DEFAULT_ICON_DIMENSION.getWidth(),
                (int)DEFAULT_ICON_DIMENSION.getHeight(),Image.SCALE_AREA_AVERAGING)));
        this.setFont(new Font("Roboto",Font.PLAIN,10));
        this.setForeground(Color.BLACK);
        this.setBackground(Color.WHITE);
        this.setOpaque(false);
        this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        this.setBorderPainted(false);

    }
}
