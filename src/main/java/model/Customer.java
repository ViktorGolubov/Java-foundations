package model;


public class Customer extends Dish {

    protected String customerName;
    protected String dishName;
    protected DishType type = DishType.STARTER;
    protected boolean gfd​;
    protected boolean vgd;
    protected boolean hmd;
    protected boolean sfd;
    protected String extras;


    public Customer(String dishName) {

    }

    public Customer(String customerName, String dishName, DishType type, boolean gfd​, boolean vgd, boolean hmd, boolean sfd, String extras) {
        this.customerName = customerName;
        this.dishName = dishName;
        this.type = type;
        this.gfd​ = gfd​;
        this.vgd = vgd;
        this.hmd = hmd;
        this.sfd = sfd;
        this.extras = extras;
    }

    public Customer(String dishName, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, String extras) {

    }

    public Customer(String item, DishType valueOf, boolean parseBoolean, boolean parseBoolean1, boolean parseBoolean2, boolean parseBoolean3, String item1) {

    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public DishType getType() {
        return type;
    }

    public void setType(DishType type) {
        this.type = type;
    }

    public boolean isGfd​() {
        return gfd​;
    }

    public void setGfd​(boolean gfd​) {
        this.gfd​ = gfd​;
    }

    public boolean isVgd() {
        return vgd;
    }

    public void setVgd(boolean vgd) {
        this.vgd = vgd;
    }

    public boolean isHmd() {
        return hmd;
    }

    public void setHmd(boolean hmd) {
        this.hmd = hmd;
    }

    public boolean isSfd() {
        return sfd;
    }

    public void setSfd(boolean sfd) {
        this.sfd = sfd;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {

        String dishType = "";
        String extras = "";

        if (this.type == DishType.STARTER) {
            dishType = "Starter";
            extras = "Cutlery recommended: ";
        } else if (this.type == DishType.MAINCOURSE) {
            dishType = "Main Course";
            extras = "Drink recommendation: ";
        } else if (this.type == DishType.DESSERT) {
            dishType = "Dessert";
            extras = "Calories: ";
        }

        return this.dishName + ", Dish Type: " +
                dishType + ", " + " GlutenFree: " + this.gfd​ + ", " +
                " Vegetarian: " + this.vgd + ", " +
                ", " + "SeaFoodFree: " + this.sfd + ", " + extras + this.extras + ".\n";


    }
}