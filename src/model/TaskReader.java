package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskReader {

    private ArrayList<String> nameTasks;
    public TaskReader(){
        nameTasks = new ArrayList<>();
        readerTask();
    }


    private void readerTask(){
        try {
            String line;
            Process p = Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
            BufferedReader input =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                nameTasks.add(line);
                System.out.println(line); //<-- Parse data here.
            }
            input.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public ArrayList<String> getNameTasks() {
        return nameTasks;
    }

    public static void main(String[] args) {
        new TaskReader();
    }
}
