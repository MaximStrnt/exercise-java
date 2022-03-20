package swimmers;

public class Ship implements Swim {

    private int speed;

    public Ship(int speed) {
        this.speed = speed;
    }

    @Override
    public void swim() {
        System.out.println("Ships do not swim, they head. The ship is heading, spinning its screws, at a speed of " + speed + " knots.");
    }
}


