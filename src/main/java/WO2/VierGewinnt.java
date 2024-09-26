package WO2;

import java.util.Scanner;

public class VierGewinnt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen Spieler 1!");
        String spielerEins = registrierung();
        System.out.println("Dein Name wurde als: " + spielerEins + " registriert.");

        System.out.println("Willkommen Spieler 2!");
        String spielerZwei = registrierung();
        System.out.println("Dein Name wurde als: " + spielerZwei + " registriert.");

        int[][] board = new int[6][7];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }

        int spieler = 1;
        while (true) {
            printBoard(board);
            System.out.println(spieler + " in welche Spalte möchten Sie Ihren Spielstein platzieren?");
            int zug = scanner.nextInt() - 1;
            spielzug(board, spieler, zug);
            if (gewinnCheck(board, spieler)) {
                printBoard(board);
                System.out.println(spielerEins + " hat gewonnen!");
                break;
            }

            spieler = (spieler == 1) ? 2:1;

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


    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] spielzug(int board[][], int player, int zug) {

        if (board[0][zug] == 0) {
            board[0][zug] = player;
        } else if (board[1][zug] == 0) {
            board[1][zug] = player;
        } else if (board[2][zug] == 0) {
            board[2][zug] = player;
        } else if (board[3][zug] == 0) {
            board[3][zug] = player;
        } else if (board[4][zug] == 0) {
            board[4][zug] = player;
        } else if (board[5][zug] == 0) {
            board[5][zug] = player;
        } else {
            System.out.println("Zug ungültig.");
            return spielzug(board, player, zug);
        }

        return board;
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
