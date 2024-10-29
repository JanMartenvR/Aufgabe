package verkehrssimulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Map.txt");
        String content = Files.readString(path);
        System.out.println(content);

        List<Road> strassen = strasseInit(content);

        for (Road test : strassen) {

            int x = test.getPositionX();
            int y = test.getPositionY();
            System.out.println("(" + x + "|" + y + ")");
        }


        Car auto1 = new Car(3, 2, 0);
        Car auto2 = new Car(3, 2, 0);


        //1 oben 2 recht

    }

    public static List<Road> strasseInit(String content) {
        int i;
        int x = 0;
        int j = 0;
        List<Road> strassen = new ArrayList<>();
        for (i = 0; i < content.length(); i++) {
            if (content.charAt(i) == '┌') {
                boolean start = false;
                boolean kurve = true;
                boolean kreuzung = false;
                String richtung = "so";
                Road road = new Road(start, kurve, kreuzung, richtung, x, j);
                strassen.add(road);
                x++;
            } else if (content.charAt(i) == '─') {
                boolean start = false;
                boolean kurve = false;
                boolean kreuzung = false;
                String richtung = "wo";
                Road road = new Road(start, kurve, kreuzung, richtung, x, j);
                strassen.add(road);
                x++;
            } else if (content.charAt(i) == '┬') {
                boolean start = false;
                boolean kurve = false;
                boolean kreuzung = true;
                String richtung = "wos";
                Road road = new Road(start, kurve, kreuzung, richtung, x, j);
                strassen.add(road);
                x++;

            } else if (content.charAt(i) == '┐') {
                boolean start = false;
                boolean kurve = true;
                boolean kreuzung = false;
                String richtung = "ws";
                Road road = new Road(start, kurve, kreuzung, richtung, x, j);
                strassen.add(road);
                x++;

            } else if (content.charAt(i) == '│') {
                boolean start = false;
                boolean kurve = false;
                boolean kreuzung = false;
                String richtung = "ns";
                Road road = new Road(start, kurve, kreuzung, richtung, x, j);
                strassen.add(road);
                x++;

            } else if (content.charAt(i) == '└') {
                boolean start = false;
                boolean kurve = true;
                boolean kreuzung = false;
                String richtung = "no";
                Road road = new Road(start, kurve, kreuzung, richtung, x, j);
                strassen.add(road);
                x++;

            } else if (content.charAt(i) == '┘') {
                boolean start = false;
                boolean kurve = true;
                boolean kreuzung = false;
                String richtung = "wo";
                Road road = new Road(start, kurve, kreuzung, richtung, x, j);
                strassen.add(road);
                x++;

            } else if (content.charAt(i) == '╫') {
                boolean start = true;
                boolean kurve = false;
                boolean kreuzung = false;
                String richtung = "wo";
                Road road = new Road(start, kurve, kreuzung, richtung, x, j);
                strassen.add(road);
                x++;

            } else if (content.charAt(i) == ' ') {
                x++;
            } else if (content.charAt(i) == '\n') {
                j++;
                x = 0;
            }
        }
        return strassen;

    }
}
