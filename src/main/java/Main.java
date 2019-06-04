
import service.SalesService;
import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        SalesService ordersManager = new SalesService();
        List<String> orderList = ordersManager.readDocument();

        System.out.println("-------------Welcome to BtsMdsd-Restaurant--------------");
        System.out.println();
        System.out.println("# Number of orders: ");
        System.out.println(ordersManager.getNumberOrders(orderList));
        System.out.println("# All orders");
        System.out.println(ordersManager.getAllOrdersToString(orderList));
    }
}
