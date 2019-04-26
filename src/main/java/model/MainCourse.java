package model;

public class MainCourse extends Customer {

    public MainCourse(String dishName, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, String extras) {
        super(dishName, glutenFree, vegetarian, halalMeat, seafoodFree, extras);
        this.setType(DishType.MAINCOURSE);
    }


    public MainCourse(String dishName) {
        super(dishName);
        this.setType(DishType.MAINCOURSE);
    }

    @Override
    public String toString() {
        return super.toString() + ", main ingredients: " + extras;

    }
}