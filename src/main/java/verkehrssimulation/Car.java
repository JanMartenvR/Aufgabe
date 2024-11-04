package verkehrssimulation;

import java.util.List;
import java.util.Objects;

public class Car {
    private float x;
    private float y;
    private float speed;
    private char direction;
    private boolean inCurve;

    public Car(float x, float y, float speed, char direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    public boolean isInCurve() {
        return inCurve;
    }

    public void setInCurve(boolean inCurve) {
        this.inCurve = inCurve;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
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
        int x = Math.round(this.x);
        int y = Math.round(this.y);
        for (Road road : strassen) {
            if (road.positionX == x && road.positionY == y) {
                if (Objects.equals(road.direction, "wos")) {
                    if (this.direction == 'n') {
                        this.direction = 'o';
                        this.x += this.speed;
                    } else if (this.direction == 'o') {
                        this.x += this.speed;
                    } else if (this.direction == 'w') {
                        this.x -= this.speed;
                    }

                } else if (Objects.equals(road.direction, "os")) {
                    if (this.direction == 'n') {
                        this.direction = 'o';
                        this.x += this.speed;
                    } else if (this.direction == 'w') {
                        this.direction = 's';
                        this.y += this.speed;
                    }

                } else if (Objects.equals(road.direction, "ws")) {
                    if (this.direction == 'n') {
                        this.direction = 'w';
                        this.x -= this.speed;
                    } else if (this.direction == 'o') {
                        this.direction = 's';
                        this.y += this.speed;
                    }
                } else if (Objects.equals(road.direction, "no")) {
                    if (this.direction == 's') {
                        this.direction = 'o';
                        this.x += this.speed;
                    } else if (this.direction == 'w') {
                        this.direction = 'n';
                        this.y -= this.speed;
                    }
                } else if (Objects.equals(road.direction, "nw")) {
                    if (this.direction == 'o') {
                        this.direction = 'n';
                        this.y -= this.speed;
                    } else if (this.direction == 's') {
                        this.direction = 'w';
                        this.x -= this.speed;
                    }
                } else if (Objects.equals(road.direction, "wo")) {
                    if (this.direction == 'o') {
                        this.x += this.speed;
                    } else {
                        this.x -= this.speed;
                    }

                } else if (Objects.equals(road.direction, "ns")) {
                    if (this.direction == 's') {
                        this.y += this.speed;
                    } else {
                        this.y -= this.speed;
                    }
                }
            }
        }
    }

    public void changeSpeed(List<Road> roads) {
        int x = Math.round(this.x);
        int y = Math.round(this.y);
        for (Road road : roads) {
            if (road.positionX == x && road.positionY == y) {
                if (!road.curve && !road.intersection && this.speed < 1) {
                    this.inCurve = false;
                    this.speed += 0.2F;
                    if (this.speed > 1) {
                        this.speed = 1;
                    }
                } else if (road.curve && !this.inCurve) {
                    this.speed /= 2;
                    this.inCurve = true;
                    if (this.speed < 0.1) {
                        this.speed = 0.1F;
                    }
                    //Enums
                    //boolean für eintritt in kurve?
                    //Es fehlt noch die Situation, dass das Auto nicht nach einer Iteration aus der Kurve kommt. Dann darf nicht nochmal gebremst werden.
                } else if (road.curve && this.inCurve) {
                    this.speed += 0.2F;
                    if (this.speed > 1) {
                        this.speed = 1;
                    }
                } else {

                    if (Objects.equals(road.direction, "wos")) {
                        if (this.direction == 'n') {
                            this.direction = 'o';
                            this.speed /= 2;
                            if (this.speed < 0.1) {
                                this.speed = 0.1F;
                            }
                        } else if (this.direction == 'o') {
                            this.speed += 0.2F;
                            if (this.speed > 1) {
                                this.speed = 1;
                            }

                        } else if (this.direction == 'w') {
                            this.speed += 0.2F;
                            if (this.speed > 1) {
                                this.speed = 1;
                            }
                        }

                    }

                }
            }
        }

    }
}
