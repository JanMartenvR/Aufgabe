package verkehrssimulation;

import java.util.List;

public class Car {
    private int x;
    private int y;
    private float speed;
    private char direction;

    public Car(int x, int y, float speed, char direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void changeSpeed(List<Road> strassen) {
        for(Road road : strassen) {
            if (road.positionX == this.x && road.positionY == this.y) {
                if (!road.kurve && !road.kreuzung && this.speed < 1) {
                    this.speed += 0.2F;
                } else if (road.kurve) {
                    this.speed /= 2;
                    if (this.speed < 0.1) {
                        this.speed = 0.1F;
                    }
                    //Es fehlt noch die Situation, dass das Auto nicht nach einer Iteration aus der Kurve kommt. Dann darf nicht nochmal gebremst werden.
                } else {
                    if () {
                        //Wenn das Auto durch eine Kreuzung geradeaus durchfährt, muss die Geschwindigkeit erhöht werden
                        // Wenn das Auto abbiegt halbiert.
                    }
                }
            }
        }

    }
    public void turn() {

    }
}
