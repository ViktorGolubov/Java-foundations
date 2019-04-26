package model;

public class Dessert extends Customer {

    public Dessert(String dishName, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, String extras) {
        super(dishName, glutenFree, vegetarian, halalMeat, seafoodFree, extras);
        this.setType(DishType.DESSERT);
    }


    public Dessert(String dishName) {
        super(dishName);
        this.setType(DishType.DESSERT);
    }

    @Override
    public String toString() {
        return super.toString() + ", consist of: " + extras;
    }

}