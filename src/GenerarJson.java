import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GenerarJson {

    public void guardarJson(Moneda moneda) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter entrada = new FileWriter(moneda.base_code()+".json");

        entrada.write(gson.toJson(moneda));

        entrada.close();


    }

}
