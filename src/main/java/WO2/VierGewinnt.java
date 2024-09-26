package WO2;

import java.util.Scanner;

public class VierGewinnt {

    public static void main(String[] args) {
        System.out.println("Willkommen Spieler 1!");
        String spielerEins = registrierung();
        int eins = 1;
        System.out.println("Dein Name wurde als: " + spielerEins + " registriert.");

        System.out.println("Willkommen Spieler 2!");
        String spielerZwei = registrierung();
        int zwei = 2;
        System.out.println("Dein Name wurde als: " + spielerZwei + " registriert.");


        printBoard(genBoard());
        if (gewinnCheck(genBoard(), eins)) {
            System.out.println(spielerEins + " hat gewonnen!");
        } else if (gewinnCheck(genBoard(), zwei)) {
            System.out.println(spielerZwei + " hat gewonnen!");
        } else {
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

    public static int[][] genBoard() {
        int[][] board = new int[6][7];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
            return board;
        }
        return board;
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String spielzug(String spielerEins, String spielerZwei, int board[][]) {
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

    public static Boolean gewinnCheck(int[][] board, int spieler) {
        int rows = board.length;
        int cols = board[0].length;

        //Horizontal check
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols - 3; j++) {
                if (board[i][j] == spieler && board[i][j + 1] == spieler && board[i][j + 2] == spieler && board[i][j + 3] == spieler) {
                    return true;
                }
            }
        }

        //Vertikal check
        for (int i = 0; i < rows - 3; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == spieler && board[i + 1][j] == spieler && board[i + 2][j] == spieler && board[i + 3][j] == spieler) {
                    return true;
                }
            }
        }
        //Diagonal rechtoben
        for (int i = 3; i < rows; i++) {
            for (int j = 0; j < cols - 3; j++) {
                if (board[i][j] == spieler && board[i - 1][j + 1] == spieler && board[i - 2][j + 2] == spieler && board[i - 3][j + 3] == spieler) {
                    return true;
                }
            }
        }
        //Diagonal rechtsunten
        for (int i = 0; i < rows - 3; i++) {
            for (int j = 0; j < cols - 3; j++) {
                if (board[i][j] == spieler && board[i + 1][j + 1] == spieler && board[i + 2][j + 2] == spieler && board[i + 3][j + 3] == spieler) {
                    return true;
                }
            }
        }

        return false;
    }
}
