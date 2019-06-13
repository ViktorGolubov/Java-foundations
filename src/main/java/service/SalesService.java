package service;

import model.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;


public class SalesService implements OnlineOrderOps<Order, Customer> {

    public SalesService() {

    }


    public List<String> readDocument() throws IOException {

        BufferedReader reader = null;
        List<String> orders = new ArrayList<String>();

        try {
            File file = new File("./src/main/resources/online-order-sample.csv");
            reader = new BufferedReader(new FileReader(file));

            // In this way im skipping the first line of the csv file
            reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                orders.add(line);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally

        {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return orders;
    }

    public int getNumberOrders(List orderList) {
        return orderList.size();
    }


    public Order getOrder(List orderList, int orderIndex) {

        return (Order) orderList.get(orderIndex);
    }


    public String getAllOrdersToString(List orderList) {

        return String.valueOf(orderList);
    }


    public Customer getDish(List dishList, int dishIndex) {

        return (Customer) dishList.get(dishIndex);
    }


    public String getAllDishToString(List dishList) {

        return String.valueOf(dishList);
    }


    public List getDishesByType(List dishList, String dishType) {

        List result = new ArrayList<>();

        for (int i = 0; i <= dishList.size() - 1; i++) {
            String verify = dishList.get(i).toString();
            if (verify.contains(dishType)) {
                result.add(dishList.get(i));
            }
        }
        return result;
    }


    public List getDishesByFeature(List dishList, String feature) {

        List result = new ArrayList<>();

        for(Object verify : dishList){
            NewDish newDish = (NewDish) verify;
            if(newDish.isGlutenFree() && feature.equals("gfd")){
                result.add(newDish);
            } else if (newDish.isVegetarian() && feature.equals("vgd")){
                result.add(newDish);
            } else if(newDish.isHalalMeat() && feature.equals("hmd")){
                result.add(newDish);
            } else if (newDish.isSeafoodFree() && feature.equals("sfd")){
                result.add(newDish);
            }
        }
        return result;
    }


    public String getStatsByDishType(List dishList, String dishType) {
        return null;
    }
}