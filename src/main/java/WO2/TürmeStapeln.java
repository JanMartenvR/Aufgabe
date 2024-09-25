package WO2;

import java.util.Scanner;

public class TürmeStapeln {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gebe die Höhe der Stapel ein:");
        int hoehe = scanner.nextInt();

        int[] stabEins = new int[hoehe];
        int[] stabZwei = new int[hoehe];
        int[] stabDrei = new int[hoehe];

        for (int i = 0; i < hoehe; i++) {
            stabEins[i] = i;
        }
        for (int zahl : stabEins) {
            System.out.print(zahl +" ");
        }

    }
}
