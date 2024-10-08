package WO2;

import java.util.Arrays;
import java.util.Scanner;

public class TuermeStapeln {
    public static int[] stabEins;
    public static int[] stabZwei;
    public static int[] stabDrei;

    public static void main(String[] args) {

        int hoehe = nutzerEingabe();
        arrayIntialisierung(hoehe);
        printStab();
        solve(hoehe, stabEins, stabDrei, stabZwei, 0, 2, 1);

    }

    public static int nutzerEingabe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gebe die Höhe der Stapel ein:");
        return scanner.nextInt();
    }

    public static void arrayIntialisierung(int hoehe) {
        stabEins = new int[hoehe];
        stabZwei = new int[hoehe];
        stabDrei = new int[hoehe];
        for (int i = 0; i < hoehe; i++) {
            stabEins[i] = i + 1;
            stabZwei[i] = 0;
            stabDrei[i] = 0;
        }
    }

    public static void printStab() {
        System.out.println("------------------------------------");
        System.out.println("Stab 1: " + Arrays.toString(stabEins));
        System.out.println("Stab 2: " + Arrays.toString(stabZwei));
        System.out.println("Stab 3: " + Arrays.toString(stabDrei));
        System.out.println("------------------------------------");

    }

    public static void solve(int hoehe, int[] von, int[] nach, int[] hilfsStab, int vonZaehler, int nachZaehler, int hilfZaehler) {
        if (hoehe == 1) {
            move(von, nach, vonZaehler, nachZaehler);
            printStab();
            return;
        }

        solve(hoehe - 1, von, hilfsStab, nach, vonZaehler, hilfZaehler, nachZaehler);
        move(von, nach, vonZaehler, nachZaehler);
        printStab();
        solve(hoehe - 1, hilfsStab, nach, von, hilfZaehler, nachZaehler, vonZaehler);
    }

    public static void move(int[] von, int[] nach, int vonZaehler, int nachZaehler) {
        int scheibe = 0;
        for (int i = 0; i < von.length; i++) {
            if (von[i] != 0) {
                scheibe = von[i];
                von[i] = 0;
                break;
            }

        }

        for (int i = nach.length - 1; i >= 0; i--) {
            if (nach[i] == 0) {
                nach[i] = scheibe;
                break;
            }
        }
        System.out.println("Bewege die Scheibe " + scheibe + " von Stab " + (vonZaehler + 1) + " zu Stab " + (nachZaehler + 1) + ".");

    }
}
