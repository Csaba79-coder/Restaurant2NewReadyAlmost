package controller;

public class RequestController {
    /**
     * Responsible for handling storages and tables by the customer requests
     */
    private StorageController storageController;
    private TableController tableController;

    /**
     * Prepare before opening
     */
    public RequestController() {
        storageController = new StorageController();
        tableController = new TableController(30);
    }


}
