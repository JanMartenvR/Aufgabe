package WO2;

import java.util.Scanner;

public class TuermeStapeln {
    public static int[]stabEins;
    public static int[]stabZwei;
    public static int[]stabDrei;
    public static void main(String[] args) {

        int hoehe = nutzerEingabe();
        arrayIntialisierung(hoehe);

        for (int zahl : stabEins) {
            System.out.print(zahl +" ");
        }

    }
    public static int nutzerEingabe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gebe die Höhe der Stapel ein:");
        int hoehe = scanner.nextInt();
        return hoehe;
    }
    public static void arrayIntialisierung (int hoehe) {
        stabEins = new int[hoehe];
        stabZwei = new int[hoehe];
        stabDrei = new int[hoehe];
        for (int i = 0; i < hoehe; i++) {
            stabEins[i] = i + 1;
            stabZwei[i] = 0;
            stabDrei[i] = 0;
        }
    }
    public static void solve(int hoehe) {
        if (hoehe == 1) {
            System.out.println("Bewege Scheibe 1 von Turm 1 zur Turm 3.");
            return;
        }


    }
}
