package utils;

import java.util.*;

public class RequestGenerator {
    List<Integer> drinkIndexList = new ArrayList<>();
    List<Integer> mealIndexList = new ArrayList<>();
    Map<String, List<Integer>> requestIndexMap = new HashMap<>();

    public RequestGenerator(int sizeOfDrinks, int sizeOfMeals) {
        int numOfCustomers = requestNumOfCustomers();

        for (int customerIndex = 0; customerIndex < numOfCustomers; customerIndex++) {
            int numOfRequests = getRandom(5);
            for (int reqestIndex = 0; reqestIndex < numOfRequests; reqestIndex++) {
                int randType = getRandom(1);
                if (randType == 0) {
                    // get random drink
                    drinkIndexList.add(getRandom(sizeOfDrinks));
                } else {
                    // get random meal
                    mealIndexList.add(getRandom(sizeOfMeals));
                }
            }
        }
        requestIndexMap.put("Drink", drinkIndexList);
        requestIndexMap.put("Meal", mealIndexList);
    }

    /**
     * Responsible to read number of customers from terminal input
     */
    private int requestNumOfCustomers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány vendég jött?");
        return sc.nextInt();
    }

    /**
     * Get random number between 0 and maxValue
     * @param maxValue
     * @return
     */
    private int getRandom(int maxValue) {
        return (int) (Math.random() * (maxValue));
    }

    public List<Integer> getDrinkIndexList() {
        return drinkIndexList;
    }

    public List<Integer> getMealIndexList() {
        return mealIndexList;
    }
}
