package model;

import java.util.Arrays;
import java.util.List;

public class Order {

    private String customerName;
    private Starter starter;
    private MainCourse mainCourse;
    private Dessert dessert;
    private Customer customer;


    public Order() {}


    public Order(String customerName, Customer customer) {
        this.customerName = customerName;
        this.customer = customer;
    }


    public Order(String customerName, Starter starter, MainCourse mainCourse, Dessert dessert) {
        this.customerName = customerName;
        this.starter = starter;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }


    public List<Customer> getAllDishes() { return Arrays.asList(starter, mainCourse, dessert); }

    public String getCustomerName() { return customerName; }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public Order getOrder() { return this; }

    public void setOrder(Customer customer) {
        this.customer = customer;
    }

    public Starter getStarter() { return starter; }

    public void setStarter(Customer starter) {
        this.starter = (Starter) starter;
    }

    public MainCourse getMainCourse() { return mainCourse; }

    public void setMainCourse(Customer mainCourse) {
        this.mainCourse = (MainCourse) mainCourse;
    }

    public Dessert getDessert() { return dessert; }

    public void setDessert(Customer dessert) {
        this.dessert = (Dessert) dessert;
    }

    @Override
    public String toString() {
        String result = "This order of " + customerName + " includes these dishes:\n";
        if(starter != null) {
            result += starter.toString() + "\n";
        }
        if(mainCourse != null) {
            result += mainCourse.toString() + "\n";
        }
        if(dessert != null) {
            result += dessert.toString() + "\n";
        }
        return result;
    }
}