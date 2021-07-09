package storage;

public class Drink extends StorageElement {
    /**
     * Drink class shall be used to follow the states of our drinks
     * The drinks shall be identified by name (creating new classes are not necessary)
     * The amount of each drink shall be also followed
     *
     * hint: List
     */

    public Drink() {
    }

    public Drink(String name, int amount) {
        super(name, amount);
    }
}
