package verkehrssimulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Map.txt");
        String content = Files.readString(path);
        System.out.println("Content: " + content);

    }
}
