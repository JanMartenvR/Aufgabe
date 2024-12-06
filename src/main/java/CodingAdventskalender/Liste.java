package CodingAdventskalender;


import queuelist.Array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Liste {
    public static void main(String[] args) {

        String filePath = "Liste.txt";

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String zeile;
            while ((zeile = br.readLine()) != null) {
                String[] spalten = zeile.trim().split("   ");
                if (spalten.length == 2) {
                    left.add(Integer.parseInt(spalten[0]));
                    right.add(Integer.parseInt(spalten[1]));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(left);
        Collections.sort(right);

        int diffSumme = 0;
        for (int i = 0; i <left.size(); i++) {
            int diff = Math.abs(left.get(i) - right.get(i));
            diffSumme += diff;
            System.out.println("Diff an Pos " + i +": " + diff);
        }
        System.out.println("Gesamt diff : " + diffSumme);

    }
}
