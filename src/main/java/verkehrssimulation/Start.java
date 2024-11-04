package verkehrssimulation;

import java.util.ArrayList;
import java.util.List;

public class Start {

    // To DO:
    //        Kurvenlogik funktioniert noch nicht. Auto wird nicht schneller, weil es nicht direkt aus der Kurve kommt.
    //        Daumenkino
    //        Simulations Klasse und dort die Initialisierung einbauen
    public static void main(String[] args) {


        System.out.println(Simulation.map());

        List<Road> roads = roadInit(Simulation.map());

        Car auto1 = new Car(3, 2, 0, 'o');
        Car auto2 = new Car(3, 2, 0, 'w');

        int iterationen = 0;

        do {
            auto1.changeSpeed(roads);
            auto2.changeSpeed(roads);
            auto1.move(roads);
            auto2.move(roads);
            iterationen++;
            System.out.println(Simulation.map());
            System.out.println(Math.round(auto1.getX()) + "|" + Math.round(auto1.getY()) + "    " + auto1.getX() + "|" + auto1.getY());
            System.out.println(Math.round(auto2.getX()) + "|" + Math.round(auto2.getY()) + "    " + auto2.getX() + "|" + auto2.getY());

        } while (!((Math.round(auto1.getX()) == Math.round(auto2.getX()) &&
                Math.round(auto1.getY()) == Math.round(auto2.getY())) &&
                (Math.round(auto1.getX()) != 3 || Math.round(auto1.getY()) != 2)));
        System.out.println("Nach " + iterationen + " Iterationen crashen die Autos.");
    }

    public static List<Road> roadInit(String content) {
        int i;
        int x = 0;
        int j = 0;
        List<Road> roads = new ArrayList<>();
        for (i = 0; i < content.length(); i++) {
            if (content.charAt(i) == '┌') {
                boolean start = false;
                boolean curve = true;
                boolean intersection = false;
                String direction = "os";
                Road road = new Road(start, curve, intersection, direction, x, j);
                roads.add(road);
                x++;
            } else if (content.charAt(i) == '─') {
                boolean start = false;
                boolean curve = false;
                boolean intersection = false;
                String direction = "wo";
                Road road = new Road(start, curve, intersection, direction, x, j);
                roads.add(road);
                x++;
            } else if (content.charAt(i) == '┬') {
                boolean start = false;
                boolean curve = false;
                boolean intersection = true;
                String direction = "wos";
                Road road = new Road(start, curve, intersection, direction, x, j);
                roads.add(road);
                x++;

            } else if (content.charAt(i) == '┐') {
                boolean start = false;
                boolean curve = true;
                boolean intersection = false;
                String direction = "ws";
                Road road = new Road(start, curve, intersection, direction, x, j);
                roads.add(road);
                x++;

            } else if (content.charAt(i) == '│') {
                boolean start = false;
                boolean curve = false;
                boolean intersection = false;
                String direction = "ns";
                Road road = new Road(start, curve, intersection, direction, x, j);
                roads.add(road);
                x++;

            } else if (content.charAt(i) == '└') {
                boolean start = false;
                boolean curve = true;
                boolean intersection = false;
                String direction = "no";
                Road road = new Road(start, curve, intersection, direction, x, j);
                roads.add(road);
                x++;

            } else if (content.charAt(i) == '┘') {
                boolean start = false;
                boolean curve = true;
                boolean intersection = false;
                String direction = "nw";
                Road road = new Road(start, curve, intersection, direction, x, j);
                roads.add(road);
                x++;

            } else if (content.charAt(i) == '╫') {
                boolean start = true;
                boolean curve = false;
                boolean intersection = false;
                String direction = "wo";
                Road road = new Road(start, curve, intersection, direction, x, j);
                roads.add(road);
                x++;

            } else if (content.charAt(i) == ' ') {
                x++;
            } else if (content.charAt(i) == '\n') {
                j++;
                x = 0;
            }
        }
        return roads;

    }
}
