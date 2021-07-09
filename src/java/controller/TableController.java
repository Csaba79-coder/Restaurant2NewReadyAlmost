package controller;

import table.Table;

import java.util.ArrayList;
import java.util.List;

public class TableController {
    /**
     * TableController class shall be used to control our customer requests for each table
     * Shall cooperate with the StorageController
     */
    private List<Table> tables = new ArrayList<>();

    public TableController() {
    }

    public TableController(int tableCount) {
        prepareTables(tableCount);
    }

    private void prepareTables(int tableCount) {
        for (int i = 0; i < tableCount; i++) {
            tables.add(new Table());
        }
    }
}
