package verkehrssimulation;

import java.util.List;
import java.util.Objects;

public class Car {
    private float x;
    private float y;
    private float speed;
    private char direction;

    public Car(float x, float y, float speed, char direction) {
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

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void move(List<Road> strassen) {
        for (Road road : strassen) {
            if (road.positionX == this.x && road.positionY == this.y) {
                if (Objects.equals(road.richtung, "wos")) {
                    if (this.direction == 'n') {
                        this.direction = 'o';
                        this.x += this.speed;
                    } else if (this.direction == 'o') {
                        this.x += this.speed;
                    } else if (this.direction == 'w') {
                        this.x -= this.speed;
                    }

                } else if (Objects.equals(road.richtung, "os")) {
                    if (this.direction == 'n') {
                        this.direction = 'o';
                        this.x += this.speed;
                    } else if (this.direction == 'w') {
                        this.direction = 's';
                        this.y += this.speed;
                    }

                } else if (Objects.equals(road.richtung, "ws")) {
                    if (this.direction == 'n') {
                        this.direction = 'w';
                        this.x -= this.speed;
                    } else if (this.direction == 'o') {
                        this.direction = 's';
                        this.y += this.speed;
                    }
                } else if (Objects.equals(road.richtung, "no")) {
                    if (this.direction == 's') {
                        this.direction = 'o';
                        this.x += this.speed;
                    } else if (this.direction == 'w') {
                        this.direction = 'n';
                        this.y -= this.speed;
                    }
                } else if (Objects.equals(road.richtung, "nw")) {
                    if (this.direction == 'o') {
                        this.direction = 'n';
                    } else if (this.direction == 's') {
                        this.direction = 'w';
                    }
                }
            }
        }
    }


    //Rundungen fehlen noch um festzustellen auf welcher Straße die Autos sind
    public void changeSpeed(List<Road> strassen) {
        for (Road road : strassen) {
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

                    if (Objects.equals(road.richtung, "wos")) {
                        if (this.direction == 'n') {
                            this.direction = 'o';
                            this.speed /= 2;
                            if (this.speed < 0.1) {
                                this.speed = 0.1F;
                            }
                        } else if (this.direction == 'o') {
                            this.speed += 0.2F;
                        } else if (this.direction == 'w') {
                            this.speed += 0.2F;
                        }

                    }

                }
            }
        }

    }
}
