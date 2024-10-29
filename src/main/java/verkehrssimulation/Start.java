package verkehrssimulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Start {

    // To DO:
    //        Kollisionskontrolle im Moment können die Autos durch die Kommazahlen aneinander vorbeifahren.
    //        Daumenkino
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Map.txt");
        String content = Files.readString(path);
        System.out.println(content);

        List<Road> strassen = strasseInit(content);

        Car auto1 = new Car(3, 2, 0, 'o');
        Car auto2 = new Car(3, 2, 0, 'w');

        int iterationen = 0;
        do {
            auto1.changeSpeed(strassen);
            auto2.changeSpeed(strassen);
            auto1.move(strassen);
            auto2.move(strassen);
            iterationen++;

        } while (auto1.getX() != auto2.getX() && auto1.getY() != auto2.getY());
        System.out.println("Nach " + iterationen + " Iterationen crashen die Autos.");
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
                String richtung = "os";
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
                String richtung = "nw";
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
