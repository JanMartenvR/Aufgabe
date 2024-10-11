package lambdas;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(12);
        intList.add(23);

        intList.forEach(System.out::println);

    }
}
