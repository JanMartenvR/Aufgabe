package verkehrssimulation;

public class Road {
    boolean start;
    boolean kurve;
    boolean kreuzung;
    String richtung;
    int positionX;
    int positionY;

    public boolean isStart() {
        return start;
    }

    public boolean isKurve() {
        return kurve;
    }

    public boolean isKreuzung() {
        return kreuzung;
    }

    public String getRichtung() {
        return richtung;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public Road(boolean start, boolean kurve, boolean kreuzung, String richtung, int positionX, int positionY) {
        this.start = start;
        this.kurve = kurve;
        this.kreuzung = kreuzung;
        this.richtung = richtung;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}
