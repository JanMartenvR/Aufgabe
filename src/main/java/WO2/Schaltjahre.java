package WO2;

import java.util.Scanner;

public class Schaltjahre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Jahr ein: ");
        int jahr = scanner.nextInt();
        int schaltjahr = 0;
        if (jahr % 4 == 0 && jahr % 100 != 0) {
            schaltjahr = 1;
        } else if (jahr % 400 == 0) {
            schaltjahr = 1;
        } else {
            schaltjahr = 0;
        }

        if (schaltjahr == 1) {
            System.out.println("Das Jahr ist ein Schaltjahr.");
        } else {
            System.out.println("Das Jahr ist kein Schaltjahr.");
        }

    }
}
