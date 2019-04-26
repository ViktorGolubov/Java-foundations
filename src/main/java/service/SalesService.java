package service;

import model.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalesService implements OnlineOrderOps {

    public List<Order> readDocument() throws IOException {

        BufferedReader reader = null;
        List<Order> orders = new ArrayList<Order>();

        try
        {

            File file = new File("C:\\Users\\Виктор\\IdeaProjects\\javafoundations\\src\\main\\resources");
            reader = new BufferedReader(new FileReader(file));
            reader.readLine();
            String line1 = null;

            String line;
            while ((line = reader.readLine()) != null) {

                String[] items = line.split(",");

                for (int i = 0; i <= items.length - 1; i++) {
                    System.out.println(items[i]);

                try{
                } catch(
                        IOException e;

                {
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

        }}}

    public int getNumberOrders(List orders) {
        return 0;
    }

    public Object getOrder(List orders, int orderId) {
        return null;
    }

    public String getAllOrdersToString(List orders) {
        return null;
    }

    public Dish getDish(List dishes, int dishId) {
        return null;
    }

    public String getAllDishToString(List dishes) {
        return null;
    }

    public List getDishesByType(List dishes, String dishType) {
        return null;
    }

    public List getDishesByCategory(List dishes, String category) {
        return null;
    }

    public String getStatsByCategory(List dishes, String category) {
        return null;
    }
}
