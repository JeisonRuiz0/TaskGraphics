package persistence;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class FileManager {


    public void writeFile(ArrayList<String> tasks){

        JsonObject obj = new JsonObject();
        JsonArray list = new JsonArray();
        for (String nameTask: tasks) {
            list.add(nameTask);
        }
        obj.put("Tasks", list);

        try{
            FileWriter file = new FileWriter("src/files/data.json");
            file.write(obj.toJson());
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void readFile(ArrayList<String> tasks){
        tasks.clear();
        try {
            FileReader fileReader = new FileReader("src/files/data.json");
            JsonObject objects = (JsonObject) Jsoner.deserialize(fileReader);
            JsonArray arrayObjects = (JsonArray) objects.get("Tasks");
            for (int i = 0; i < arrayObjects.size(); i++) {
                tasks.add((String) arrayObjects.get(i));
                System.out.println((String) arrayObjects.get(i));
            }
        } catch (FileNotFoundException | JsonException e) {
            e.printStackTrace();
        }

    }
}
