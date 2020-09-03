package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfWater = 400;
        int amountOfMilk = 540;
        int amountOfCoffeeBeans = 120;
        int amountOfDisposableCups = 9;
        int amountOfMoney = 550;

        System.out.println("\nThe coffee machine has:");
        System.out.println(amountOfWater  + " of water");
        System.out.println(amountOfMilk +" of milk");
        System.out.println(amountOfCoffeeBeans  + " of coffee beans");
        System.out.println(amountOfDisposableCups  + " of disposable cups");
        System.out.println( amountOfMoney + " of money");


        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();
        if (action.endsWith("buy")) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            int order = scanner.nextInt();
            buy(amountOfWater,amountOfMilk,amountOfCoffeeBeans,amountOfDisposableCups,amountOfMoney,order);
        }
        else if (action.endsWith("fill")) {

            System.out.println("Write how many ml of water do you want to add:");
            amountOfWater += scanner.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            amountOfMilk += scanner.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add:");
            amountOfCoffeeBeans += scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add:");
            amountOfDisposableCups += scanner.nextInt();
            System.out.println("The coffee machine has:");
            System.out.println(amountOfWater  + " of water");
            System.out.println(amountOfMilk +" of milk");
            System.out.println(amountOfCoffeeBeans  + " of coffee beans");
            System.out.println(amountOfDisposableCups  + " of disposable cups");
            System.out.println( amountOfMoney + " of money");


        }
        else {
            System.out.println("I gave you $" + amountOfMoney);
            System.out.println("\nThe coffee machine has:");
            System.out.println(amountOfWater  + " of water");
            System.out.println(amountOfMilk +" of milk");
            System.out.println(amountOfCoffeeBeans  + " of coffee beans");
            System.out.println(amountOfDisposableCups  + " of disposable cups");
            System.out.println("0 of money");
        }

    }
    public static void buy (int amountOfWater, int amountOfMilk, int amountOfCoffeeBeans, int amountOfDisposableCups, int amountOfMoney, int order) {
        System.out.println("The coffee machine has:");
        if (order == 1) {
            System.out.println(amountOfWater - 250 + " of water");
            System.out.println(amountOfMilk +" of milk");
            System.out.println(amountOfCoffeeBeans - 16 + " of coffee beans");
            System.out.println(amountOfDisposableCups - 1 + " of disposable cups");
            System.out.println(amountOfMoney + 4 + " of money");
        }
        else if (order == 2) {
            System.out.println(amountOfWater - 350 + " of water");
            System.out.println(amountOfMilk - 75 +" of milk");
            System.out.println(amountOfCoffeeBeans - 20 + " of coffee beans");
            System.out.println(amountOfDisposableCups - 1 + " of disposable cups");
            System.out.println(amountOfMoney + 7 + " of money");
        }
        else {
            System.out.println(amountOfWater - 200 + " of water");
            System.out.println(amountOfMilk - 100 +" of milk");
            System.out.println(amountOfCoffeeBeans - 12 + " of coffee beans");
            System.out.println(amountOfDisposableCups - 1  + " of disposable cups");
            System.out.println(amountOfMoney +  6 + " of money");
        }
    }
}
