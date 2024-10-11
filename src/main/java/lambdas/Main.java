package lambdas;

public class Main {
    public static void main(String[] args) {


        //Eine Klasse erstellt für das Interface wichtig: Nur bei einer Methode im Interface, also einem Functional Interfac möglich
        ILebewesen benjamin = new ILebewesen() {
            @Override
            public void macheEtwas() {
                System.out.println("Töröö");

            }
        };
        benjamin.macheEtwas();

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
}
