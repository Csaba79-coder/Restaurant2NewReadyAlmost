package utils;

import storage.Drink;
import storage.Meal;
import storage.StorageElement;
import storage.Tool;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DocumentReader {
    /**
     * FileHandler class should be used to uplaod data from files
     *
     * hint: String split() method
     */
    private static final String SOURCE_DIR = "src/resources/";
    private static final String SOURCE_DRINK = SOURCE_DIR + "Drinks.txt";
    private static final String SOURCE_MEAL = SOURCE_DIR + "Meals.txt";
    private static final String SOURCE_TOOL = SOURCE_DIR + "Tools.txt";

    private List<Drink> drinks = new ArrayList<>();
    private List<Meal> meals = new ArrayList<>();
    private List<Tool> tools = new ArrayList<>();

    public DocumentReader() {
        loadAllData();
    }

    private void loadAllData() {
        try {
            /*loadSingleList(SOURCE_DRINK);
            loadSingleList(SOURCE_MEAL);
            loadSingleList(SOURCE_TOOL);*/
            String[] sources = {
                    SOURCE_DRINK,
                    SOURCE_MEAL,
                    SOURCE_TOOL
            };
            for (String source : sources) {
                loadSingleList(source);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadSingleList(String fileName) throws IOException {
        BufferedReader bufferedReader = loadFileToBufferedReader(fileName);
        for (String line; (line = bufferedReader.readLine()) != null; ) {
            String[] parts = line.split(",");
            if (fileName.equals(SOURCE_DRINK)) {
                drinks.add(new Drink(parts[0], Integer.parseInt(parts[1])));
            } else if (fileName.equals(SOURCE_MEAL)) {
                meals.add(new Meal(parts[0], Integer.parseInt(parts[1])));
            } else if (fileName.equals(SOURCE_TOOL)) {
                tools.add(new Tool(
                        parts[0],
                        Integer.parseInt(parts[1]),
                        Boolean.parseBoolean(parts[2]),
                        Boolean.parseBoolean(parts[3])
                    ));
            }
        }
    }
    /*
    public List<Drink> loadDrinks() throws IOException {
        List<Drink> drinks = new ArrayList<>();
        BufferedReader bufferedReader = loadFileToBufferedReader(SOURCE_DRINK);
        for (String line; (line = bufferedReader.readLine()) != null; ) {
            drinks.add(loadDrinkFromLine(line));
        }

        return drinks;
    }

    public Drink loadDrinkFromLine(String line) {
        String[] parts = line.split(",");
        Drink drink = new Drink(parts[0], Integer.parseInt(parts[1]));
        return drink;
    }*/

    private BufferedReader loadFileToBufferedReader(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        return  bufferedReader;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public List<Tool> getTools() {
        return tools;
    }
}
