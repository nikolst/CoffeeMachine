package machine;
import java.util.Scanner; 

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cups = input.nextInt();

        System.out.println("Write how many cups of coffee you will need: " + cups);
        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println((cups*200) + " ml of water");
        System.out.println((cups*50) + " ml of milk");
        System.out.println((cups*15) + " g of coffee beans");
    }
}
