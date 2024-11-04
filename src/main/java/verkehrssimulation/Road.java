package verkehrssimulation;

public class Road {
    boolean start;
    boolean curve;
    boolean intersection;
    String direction;
    int positionX;
    int positionY;

    public boolean isStart() {
        return start;
    }

    public boolean isCurve() {
        return curve;
    }

    public boolean isIntersection() {
        return intersection;
    }

    public String getDirection() {
        return direction;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public Road(boolean start, boolean curve, boolean intersection, String direction, int positionX, int positionY) {
        this.start = start;
        this.curve = curve;
        this.intersection = intersection;
        this.direction = direction;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}
