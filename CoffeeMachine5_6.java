package coffee_package;

import java.util.Scanner;

public class CoffeeMachine5_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String action = input.nextLine();
        while (action.equals("exit") == false) {
            if (action.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: \n");
                int typeOfCoffee = input.nextInt();
                buy(typeOfCoffee);
            } else if (action.equals("fill")) {
                fill();
            } else if (action.equals("take")) {
                take();
            } else if (action.equals("remaining")) {
            }
            action = input.nextLine();
        }
    }

    public static void printAmount(int water, int milk, int beans, int cups, int money){
        System.out.println("The coffee machine has:\n" + water + " of water\n"
                + milk + " of milk\n" + beans + " of coffee beans\n"
                + cups + " of disposable cups\n" + money + " of money");
    }

    public static void buy(int typeOfCoffee){
        int water = 1200;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        if (typeOfCoffee == 1){
            water = water - 250;
            beans = beans - 16;
            money = money + 4;
            cups = cups - 1;
            printAmount(water, milk, beans, cups, money);
        } else if (typeOfCoffee == 2){
            water = water - 350;
            milk = milk - 75;
            beans = beans - 20;
            money = money + 7;
            cups = cups - 1;
            printAmount(water, milk, beans, cups, money);
        } else if (typeOfCoffee == 3){
            water = water - 200;
            milk = milk - 100;
            beans = beans - 12;
            money = money + 6;
            cups = cups - 1;
            printAmount(water, milk, beans, cups, money);
        }
    }

    public static void fill(){
        Scanner input = new Scanner(System.in);
        int water = 1200;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        System.out.println("Write how many ml of water do you want to add:");
        int waterPlus = input.nextInt();
        water = water + waterPlus;
        System.out.println("Write how many ml of milk do you want to add:");
        int milkPlus = input.nextInt();
        milk = milk + milkPlus;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int beansPlus = input.nextInt();
        beans = beans + beansPlus;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cupsPlus = input.nextInt();
        cups = cups + cupsPlus;
        printAmount(water, milk, beans, cups, money);
    }

    public static void take(){
        int water = 1200;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 0;
        //System.out.println("I gave you $550\n");
        printAmount(water, milk, beans, cups, money);
    }
}
