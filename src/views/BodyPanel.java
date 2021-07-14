package views;

import views.components.GirdBagLayoutTheme;
import views.components.TargetProcess;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BodyPanel extends JPanel {
    private int i = 0;
    private GridBagConstraints gbc;
    public BodyPanel(ArrayList<String> processName){
        gbc = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);

    }


    public void addTask(String taskName){
        GirdBagLayoutTheme.addComponent(gbc,(int) (Math.random() * 20) +1,(int) (Math.random() * 20) +1, (int) (Math.random() * 2) +1, (int) (Math.random() * 2) +1);
        i++;
        this.add(new TargetProcess(taskName), gbc);
        this.repaint();
        this.updateUI();
    }

    public void updateProcess(){

    }


}
