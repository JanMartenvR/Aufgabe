package WO2;

import java.util.Scanner;

public class VierGewinnt {

    public static void main(String[] args) {
        System.out.println("Willkommen Spieler 1!");
        String spielerEins = registrierung();
        System.out.println("Dein Name wurde als: " + spielerEins + " registriert.");

        System.out.println("Willkommen Spieler 2!");
        String spielerZwei = registrierung();
        System.out.println("Dein Name wurde als: " + spielerZwei + " registriert.");


        printBoard(genBoard());
        while (gewinnCheck()){
            spielzug(spielerEins, spielerZwei, genBoard());
            printBoard(genBoard());
        }

    }

    public static String registrierung() {
        String name = "";
        Scanner scanner = new Scanner(System.in);
        while (name.length() <= 2 || name.length() >= 16) {
            System.out.print("Bitte gebe einen Namen ein (3-15 Zeichen):");
            name = scanner.nextLine();
        }
        return name;
    }
    public static int[][] genBoard () {
        int[][] board = new int [6][7];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
            return board;
        }
        return board;
    }
    public static void printBoard (int[][] board) {
        //Gibt Feld aus
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static String spielzug (String spielerEins, String spielerZwei, int board[][]) {
        Scanner scanner = new Scanner(System.in);
        int zug = 9999;
        int player = 1;
        String name = spielerEins;
        while (zug >= 7 || zug < 1) {
            if (player > 0) {
                name = spielerEins;
            } else {
                name = spielerZwei;
            }
            player *= -1;
            System.out.println(name + " in welche Spalte möchten Sie Ihren Spielstein platzieren?");
            zug = scanner.nextInt();
        }
        return "";
    }
    public static Boolean gewinnCheck () {
        if (true) { //gewinnbedingung einfügen
            return true;
        } else {
            return false;
        }
    }
}
