
import service.SalesService;
import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {

        SalesService salesService = new SalesService();
        List<String> orderList = salesService.readDocument();
        List dishes = salesService.createDishes("src/main/resources/online-order-sample.csv");

        System.out.println("-------------Welcome to BtsMdsd-Restaurant--------------");
        System.out.println();
        System.out.println(" Number of orders: " + salesService.getNumberOrders(orderList));

        System.out.println(" Order: ");
        System.out.println(" "+ salesService.getOrder(orderList,1));


        System.out.println(" All Orders: ");
        System.out.println(salesService.getAllOrdersToString(orderList) + "\n" );

        System.out.println(" Dish: ");
        System.out.println(salesService.getDish(dishes, 0)+ "\n");

        System.out.println(" All dishes: ");
        System.out.println(salesService.getAllDishToString(orderList)+ "\n");

        System.out.println(" Dish by Dessert type: ");
        System.out.println(salesService.getDishesByType(dishes, "ds") + "\n");

        System.out.println(" Dish by vgd feature: ");
        System.out.println(salesService.getDishesByFeature(dishes, "vgd")+ "\n");


    }
}
