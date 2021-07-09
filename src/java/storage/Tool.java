package storage;

public class Tool extends StorageElement {
    /**
     * KitchenTool class shall be used to follow the states of our tools
     * The tools shall be identified by name (creating new classes are not necessary)
     * The amount of each tool shall be also followed
     * The following states are mandatory:
     *      available
     *      in use
     *      dirty
     *      depreciated
     *
     * hint: Map
     */

    private String state = "available";
    private boolean isMealTool;
    private boolean isDrinkTool;

    public Tool() {
    }

    public Tool(String name, int amount, boolean isMealTool, boolean isDrinkTool) {
        super(name, amount);
        this.isMealTool = isMealTool;
        this.isDrinkTool = isDrinkTool;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isMealTool() {
        return isMealTool;
    }

    public boolean isDrinkTool() {
        return isDrinkTool;
    }
}
