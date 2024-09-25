package WO2;

import java.util.Scanner;

public class QuadratischeGleichungen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] zahlen = new int[3];
        System.out.println("Bitte geben Sie drei Variablen der quadratischen Gleichung ein: ");
        zahlen[0] = scanner.nextInt();
        zahlen[1] = scanner.nextInt();
        zahlen[2] = scanner.nextInt();

        for (int i = 0; i < zahlen.length; i++){
            System.out.println(zahlen[i]);
        }
    }
}
