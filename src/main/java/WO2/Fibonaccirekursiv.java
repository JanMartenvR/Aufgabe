package WO2;

import java.util.Scanner;

public class Fibonaccirekursiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie an welche Zahl der Fibonacci-Folge Sie erhalten wollen: ");
        int n = scanner.nextInt();

        int zahl = fibonacci(n);
        System.out.println("Die " + n + ". Fibonaccizahl ist: " + zahl);

    }
    public static int fibonacci(int n) {
        int zahl = 0;
        if (n >= 0) {

            n--;

            return fibonacci(n);
        } else {
            return zahl;
        }
    }
}
