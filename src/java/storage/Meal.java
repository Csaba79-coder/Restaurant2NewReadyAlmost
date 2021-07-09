package storage;

public class Meal extends StorageElement {
    /**
     * Meal class shall be used to follow the amount of our food
     * The food shall be identified by name (creating new classes are not necessary)
     *
     * hint: Set
     */

    public Meal() {
    }

    public Meal(String name, int amount) {
        super(name, amount);
    }
}
