package model;

public class Starter extends Customer {

    public Starter(String dishName, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, String extras) {
        super(dishName, glutenFree, vegetarian, halalMeat, seafoodFree, extras);
        this.setType(DishType.STARTER);
    }


    public Starter(String dishName) {
        super(dishName);
        this.setType(DishType.STARTER);
    }

    @Override
    public String toString() {
        return super.toString() + "plate: " + extras;
    }
}