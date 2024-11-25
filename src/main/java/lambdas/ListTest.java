package lambdas;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(12);
        intList.add(23);
        intList.add(17);

        // forEach Methode der Listen Klasse von Java arbeitet mit einem functional Interface -> Lambdas bieten sich an
        intList.forEach(System.out::println);

    }
}
