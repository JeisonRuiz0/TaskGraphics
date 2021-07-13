package FileWriter;

import com.github.cliftonlabs.json_simple.JsonObject;

public class FileWriter {

    public void writeFile(String nameProcess){
        JsonObject json = new JsonObject();
        json.put("name", "Víctor");
        json.put("age", 42);

        System.out.println(json.toString());
    }
}
