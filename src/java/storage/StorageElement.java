package storage;

public class StorageElement {
    /**
     * StorageElement shall be a parent class for the element types in the Storage
     */
    protected String name = "N/A";
    protected int amount = 0;

    public StorageElement() {
    }

    public StorageElement(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            System.out.println("The amount cannot be negative");
        }
    }

    public void decrementAmount(int value) {
        this.amount -= value;
    }
}
