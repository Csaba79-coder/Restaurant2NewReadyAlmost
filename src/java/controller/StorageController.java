package controller;

import storage.Drink;
import storage.Meal;
import storage.Tool;
import utils.DocumentReader;

import java.util.List;

public class StorageController {
    /**
     * StorageController class shall be used to handle our storages
     * It shall dynamically handle the amounts each of our storage elements
     */
    private static final String TYPE_DRINK = "Drink";
    private static final String TYPE_MEAL = "Meal";

    public List<Drink> drinkList;
    public List<Meal> mealList;
    public List<Tool> toolList;

    public StorageController() {
        DocumentReader docReader = new DocumentReader();
        drinkList = docReader.getDrinks();
        mealList = docReader.getMeals();
        toolList = docReader.getTools();
    }

    public boolean serveOrder(Drink drink, int amount) {
        int index = drinkList.indexOf(drink);
        if (index != -1 && drinkList.get(index).getAmount() >= amount) {
            if (serveTool(TYPE_DRINK, amount)) {
                drinkList.get(index).decrementAmount(amount);
                return true;
            }
        }
        return false;
    }

    public boolean serveOrder(Meal meal, int amount) {
        int index = mealList.indexOf(meal);
        if (index != -1 && mealList.get(index).getAmount() >= amount) {
            if (serveTool(TYPE_MEAL, amount)) {
                mealList.get(index).decrementAmount(amount);
                return true;
            }
        }

        return false;
    }

    private boolean serveTool(String type, int amount) {
        for (Tool tool : toolList) {
            if (type.equals(TYPE_DRINK) && tool.isDrinkTool()) {
                decrementToolAmount(tool, amount);
                /*if (tool.getAmount() >= amount) {
                    tool.decrementAmount(amount);
                } else {
                    return false;
                }*/
            } else if (type.equals(TYPE_MEAL) && tool.isMealTool()) {
                decrementToolAmount(tool, amount);
                /*if (tool.getAmount() >= amount) {
                    tool.decrementAmount(amount);
                } else {
                    return false;
                }*/
            }
        }

        return true;
    }

    private boolean decrementToolAmount (Tool tool, int amount) {
        if (tool.getAmount() >= amount) {
            tool.decrementAmount(amount);
            return true;
        } else {
            return false;
        }
    }
}
