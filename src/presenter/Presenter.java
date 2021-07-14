package presenter;

import model.TaskReader;
import views.MainWindow;

public class Presenter {
    private TaskReader model;
    private MainWindow window;


    public Presenter(){
        model = new TaskReader();
        window = new MainWindow(model.getNameTasks());
        showProcess();
    }


    public void showProcess(){
        for (String task : model.getNameTasks()) {
            window.getMainPanel().getBodyPanel().addTask(task);
        }
    }

    public static void main(String[] args) {
        new Presenter();
    }
}
