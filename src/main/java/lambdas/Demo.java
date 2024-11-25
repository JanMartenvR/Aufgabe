package lambdas;

import java.util.concurrent.Flow;
import java.util.function.BinaryOperator;

public class Demo {
    public static void main(String[] args) {






        ILebewesen benjamin = test -> System.out.println(test + " Töröö");
        benjamin.macheEtwas("Was geht ab?");



        //ILebewesen benjamin = (vor, nach) -> {return vor +"Töröö" + nach;};





        //ILebewesen benjamin = new ILebewesen() {

            //public void macheEtwas() {
                //System.out.println("Töröö");

            //}
        //};
        //benjamin.macheEtwas();



        //Eine Klasse erstellt für das Interface wichtig: Nur bei einer Methode im Interface, also einem Functional Interfac möglich

        //Gleicher Ausdruck in Lambdas

        //ILebewesen benjamin = () -> System.out.println("Töröö");

        //ILebewesen benjamin = (String v) -> System.out.println(v + "Töröö");

        //Man kann auch die Klammern bei einem Datentyp und den Datentyp weglassen
        //ILebewesen benjamin = v -> System.out.println(v + "Töröö");

        //Bei Methoden mit Rückgabewert kann sogar auf return verzichtet werden
        //ILebewesen benjamin = v -> v + "Töröö";
        //String s = benjamin.macheEtwas("Das Lebewesen sagt: ");
        //System.put.println(s);


    }
    public static void rufeMethodeAuf(ILebewesen lebewesen) {
        lebewesen.macheEtwas("Das Lebewesen sagt: ");
    }
}
