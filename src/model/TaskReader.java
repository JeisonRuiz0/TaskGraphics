package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskReader {

    public TaskReader(){
        readerTask();
    }


    private void readerTask(){
        try {
            String line;
            Process p = Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
            BufferedReader input =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                System.out.println(line); //<-- Parse data here.
            }
            input.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TaskReader();
    }
}
