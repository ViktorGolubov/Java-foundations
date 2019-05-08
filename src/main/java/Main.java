import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.print("C:\\Users\\Виктор\\IdeaProjects\\javafoundations\\src\\main\\resources\\online-order-sample.csv ");

            Scanner input = new Scanner(System.in);

            File file = new File(input.nextLine());

            input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

}
