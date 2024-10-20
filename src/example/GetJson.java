package example;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GetJson extends PassGenerator {
    ArrayList<String> passwordList = new ArrayList<>();

    protected String setJson() {
        StringBuilder jsonString = new StringBuilder();

        if (!passwordList.contains(getShuffpass())) {
            passwordList.add(getShuffpass());
        }

        jsonString.append("{\n  \"passwords\": [\n");

        for (int i = 0; i < passwordList.size(); i++) {
            jsonString.append("    \"").append(passwordList.get(i)).append("\"");
            if (i < passwordList.size() - 1) {
                jsonString.append(",\n");
            }
        }
        jsonString.append("\n  ]\n}");
        return jsonString.toString();
    }

    protected void writePassInFile() {
        String jsonFile = setJson();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resource/password.json"))) {
            writer.write(jsonFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
