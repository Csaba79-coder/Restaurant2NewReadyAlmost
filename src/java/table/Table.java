package table;

import storage.Drink;
import storage.Meal;
import storage.Tool;

import java.util.ArrayList;
import java.util.List;

public class Table {
    /**
     * Table class is used to follow our customer requests
     * Needs to contain and follow the storage elements requested by our customers
     */
    private static int tableCount = 1;
    private static final int MAX_TABLE_COUNT = 30;

    private int ID;
    private List<Drink> drinkRequests = new ArrayList<>();
    private List<Meal> mealRequests = new ArrayList<>();
    private List<Tool> toolRequests = new ArrayList<>();

    public Table() {
    }

    public Table(List<Drink> drinkRequests, List<Meal> mealRequests, List<Tool> toolRequests) {
        this.drinkRequests = drinkRequests;
        this.mealRequests = mealRequests;
        this.toolRequests = toolRequests;
    }

    private void generateID() {
        if (tableCount != MAX_TABLE_COUNT) {
            ID = tableCount++;
        } else {
            System.out.println("Fullhouse!");
        }
    }

    public int getID() {
        return ID;
    }

    public List<Drink> getDrinkRequests() {
        return drinkRequests;
    }

    public void setDrinkRequests(List<Drink> drinkRequests) {
        this.drinkRequests = drinkRequests;
    }

    public List<Meal> getMealRequests() {
        return mealRequests;
    }

    public void setMealRequests(List<Meal> mealRequests) {
        this.mealRequests = mealRequests;
    }

    public List<Tool> getToolRequests() {
        return toolRequests;
    }

    public void setToolRequests(List<Tool> toolRequests) {
        this.toolRequests = toolRequests;
    }
}
