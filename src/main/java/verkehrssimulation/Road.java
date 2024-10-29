package verkehrssimulation;

public class Road {
    boolean start;
    boolean kurve;
    boolean kreuzung;
    String richtung;
    int positionX;
    int positionY;


    public Road(boolean start, boolean kurve, boolean kreuzung, String richtung, int positionX, int positionY) {
        this.start = start;
        this.kurve = kurve;
        this.kreuzung = kreuzung;
        this.richtung = richtung;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}
