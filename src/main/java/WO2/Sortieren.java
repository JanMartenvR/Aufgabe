package WO2;

public class Sortieren {
    public static void main(String[] args) {
        int[] zahlen = {5, 13, 6, 8, 11};

        System.out.println("Unsortiertes Array");
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }

        sort(zahlen);

        System.out.println("Sortiertes Array: ");
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }

    }

    public static void sort(int[] zahlen) {

        int length = zahlen.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (zahlen[j] > zahlen[j + 1]) {
                    int tmp = zahlen[j];
                    zahlen[j] = zahlen[j + 1];
                    zahlen[j + 1] = tmp;
                }
            }
        }

    }
}
