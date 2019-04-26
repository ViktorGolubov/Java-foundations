package model;

public enum DishType {
    STARTER ("ST"), MAINCOURSE ("MC"), DESSERT ("DS");


    private String initialString;

    DishType (String initialString) {
        this.initialString = initialString;
    }
}
