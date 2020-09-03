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

        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.next();
        while (true) {
            if (action.endsWith("remaining")) {
                print(amountOfWater,amountOfMilk,amountOfCoffeeBeans,amountOfDisposableCups,amountOfMoney);
            } else if (action.endsWith("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                int order;
                try{
                    order = scanner.nextInt();
                    if (buy(amountOfWater,amountOfMilk,amountOfCoffeeBeans,amountOfDisposableCups,amountOfMoney,order)) {
                        if(order == 1) {
                            amountOfWater -= 250;
                            amountOfCoffeeBeans -= 16;
                            amountOfMoney += 4;
                        } else if (order == 2) {
                            amountOfWater -= 350;
                            amountOfMilk -= 75;
                            amountOfCoffeeBeans -= 20;
                            amountOfMoney += 7;
                        } else {
                            amountOfWater -= 200;
                            amountOfMilk -= 100;
                            amountOfCoffeeBeans -= 12;
                            amountOfMoney += 6;
                        }
                        amountOfDisposableCups -= 1;
                    }

                }
                catch (Exception e){

                }


            } else if (action.endsWith("fill")) {
                System.out.println("Write how many ml of water do you want to add:");
                amountOfWater += scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                amountOfMilk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                amountOfCoffeeBeans += scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                amountOfDisposableCups += scanner.nextInt();
            } else if (action.endsWith("take")) {
                System.out.println("I gave you " + amountOfMoney);
                amountOfMoney = 0;
            } else if(action.endsWith("exit")){
                break;
            }
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();

        }
    }
    public static void print(int amountOfWater, int amountOfMilk, int amountOfCoffeeBeans, int amountOfDisposableCups, int amountOfMoney) {
        System.out.println("\nThe coffee machine has:");
        System.out.println(amountOfWater + " of water");
        System.out.println(amountOfMilk + " of milk");
        System.out.println(amountOfCoffeeBeans + " of coffee beans");
        System.out.println(amountOfDisposableCups + " of disposable cups");
        System.out.println(amountOfMoney + " of money");
    }
    public static boolean buy(int amountOfWater, int amountOfMilk, int amountOfCoffeeBeans, int amountOfDisposableCups, int amountOfMoney, int order) {
        if (order == 1) {
            if (amountOfWater >= 250 && amountOfCoffeeBeans >= 16) {
                System.out.println("I have enough resources, making you a coffee!");
                return true;
            } else if (amountOfWater < 250) {
                System.out.println("Sorry, not enough water!");
            } else {
                System.out.println("Sorry, not coffee beans!");
            }
            return false;
        } else if (order == 2) {
            if (amountOfWater >= 350 && amountOfMilk >= 75 && amountOfCoffeeBeans >= 20) {
                System.out.println("I have enough resources, making you a coffee!");
                return true;
            } else if (amountOfWater < 350) {
                System.out.println("Sorry, not enough water!");
            } else if(amountOfMilk < 75){
                System.out.println("Sorry, not enough milk!");
            } else {
                System.out.println("Sorry, not coffee beans!");
            }
            return false;
        } else{
            if (amountOfWater >= 200 && amountOfMilk >= 100 && amountOfCoffeeBeans >= 12) {
                System.out.println("I have enough resources, making you a coffee!");
                return true;
            } else if (amountOfWater < 200) {
                System.out.println("Sorry, not enough water!");
            } else if (amountOfMilk < 100) {
                System.out.println("Sorry, not enough milk!");
            } else {
                System.out.println("Sorry, not coffee beans!");
            }
            return false;
        }

    }
}
