package verkehrssimulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Simulation {

    public static String map() {
        Path path = Paths.get("Map.txt");
        String content = null;
        try {
            content = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content;
    }

}
