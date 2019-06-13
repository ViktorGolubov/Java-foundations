package model;

public class NewDish extends Dish {

    protected String dishName;
    protected DishType dishType;
    protected String type;
    protected boolean glutenFree;
    protected boolean vegetarian;
    protected boolean halalMeat;
    protected boolean seafoodFree;
    protected String extras;


    public NewDish() {
    }

    public NewDish(String dishName, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, String extras) {
        this.dishName = dishName;
        this.type = type;
        this.glutenFree = glutenFree;
        this.vegetarian = vegetarian;
        this.halalMeat = halalMeat;
        this.seafoodFree = seafoodFree;
        this.extras = extras;

    }



    public NewDish(String dishName) {
        this.dishName = dishName;
    }

    @Override
    public String getDishName() {
        return dishName;
    }

    @Override
    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public DishType getTypeOfDish() {
        return dishType;
    }

    public void setTypeOfDish(DishType typeOfDish) {
        this.dishType= typeOfDish;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public boolean isHalalMeat() {
        return halalMeat;
    }

    public void setHalalMeat(boolean halalMeat) {
        this.halalMeat = halalMeat;
    }

    public boolean isSeafoodFree() {
        return seafoodFree;
    }

    public void setSeafoodFree(boolean seafoodFree) {
        this.seafoodFree = seafoodFree;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "  Dish:" + this.dishName +", " + this.type + ", Gluten free: " +  this.glutenFree + ", Vegetarian: " + this.vegetarian + ", Halal-meat: " + this.halalMeat+ " ,Seafood: " + this.seafoodFree + ", Extras: " + this.extras + "\n";
    }
}