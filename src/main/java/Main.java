
import service.SalesService;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {


        System.out.println("-------------Welcome to BtsMdsd-Restaurant--------------");
        System.out.println();
        System.out.println("# Number of orders: ");
        System.out.println();
        System.out.println("# All orders");
        SalesService ordersManager = new SalesService();
        System.out.println( ordersManager.readDocument());
    }
}
