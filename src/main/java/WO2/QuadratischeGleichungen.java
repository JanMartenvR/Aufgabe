package WO2;

import java.util.Scanner;

public class QuadratischeGleichungen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] zahlen = new float[3];
        System.out.println("Bitte geben Sie drei Variablen der quadratischen Gleichung ein ax^2+bx+c: ");
        zahlen[0] = scanner.nextFloat();
        zahlen[1] = scanner.nextFloat();
        zahlen[2] = scanner.nextFloat();

        int loesungen = 0;
        float diskriminante = zahlen[1] * zahlen[1] - 4 * zahlen[0] * zahlen[2];

        if (diskriminante > 0) {
            loesungen = 2;
        } else if (diskriminante == 0) {
            loesungen = 1;

        } else {
            loesungen = 0;
        }
        System.out.println("Die Gleichung hat " + loesungen + " reelle Lösungen.");

    }
}
