package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int amountOfCoffee = scanner.nextInt();
        System.out.println("For " + amountOfCoffee + "cups of coffee you will need:");
        System.out.println(amountOfCoffee * 200 + "ml of water");
        System.out.println(amountOfCoffee * 50 + "ml of milk");
        System.out.println(amountOfCoffee * 15 +"g of coffee beans");
    }
}
