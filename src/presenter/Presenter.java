package presenter;

import model.TaskReader;
import persistence.FileManager;
import views.MainWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter {
    private TaskReader model;
    private MainWindow window;
    private FileManager fileManager;

    public Presenter(){
        model = new TaskReader();
        window = new MainWindow(model.getNameTasks());
        fileManager = new FileManager();
        showProcess();
        asdas();

    }

    public void asdas(){
        javax.swing.Timer timer = new Timer(5000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                updateSystem();
            }
        });
        timer.start();
    }


    public void showProcess(){
        for (String task : model.getNameTasks()) {
            window.getMainPanel().getBodyPanel().addTask(task);
        }
        fileManager.writeFile(model.getNameTasks());
    }

    public void updateSystem(){
        fileManager.readFile(model.getNameTasks());
       /* for (String task : model.getNameTasks()) {
            window.getMainPanel().getBodyPanel().addTask(task);
        }*/
    }

    public static void main(String[] args) {
        new Presenter();
    }
}
