package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("Write how many ml of water the coffee machine has: ");
        int water = input.nextInt();
        // System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = input.nextInt();
        // System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = input.nextInt();

        int cups = input.nextInt();

        // System.out.println("Write how many cups of coffee you will need: " + cups);
        //System.out.println("For " + cups + " cups of coffee you will need:");
        //System.out.println((cups*200) + " ml of water");
        // System.out.println((cups*50) + " ml of milk");
        // System.out.println((cups*15) + " g of coffee beans");

        int w = water / 200;
        int m = milk / 50;
        int b = beans / 15;

        if(cups * 200 <= water && cups * 50 <= milk && cups * 15 <= beans){
            if(w <= m && w <= b){
              int n = w;
              int mid = n - cups;
              System.out.println("Yes, I can make that amount of coffee (and even " + mid + " more than that)");
            } else if(m <= w && m <= b){
                int n = m;
                int mid = n - cups;
                System.out.println("Yes, I can make that amount of coffee (and even " + mid + " more than that)");
            } else if(b <= m && b <= w){
                int n = b;
                int mid = n - cups;
                System.out.println("Yes, I can make that amount of coffee (and even " + mid + " more than that)");
            } else
            System.out.println("Yes, I can make that amount of coffee");

            // **** Do tuk beshe otlichno !!!
        } else if(cups * 200 > water || cups * 50 > milk || cups * 15 > beans){
            if(w <= m && w <= b){
                int n = w;
                System.out.println("No, I can make only " + n + " cup(s) of coffee");
            } else if(m <= w && m <= b){
                int n = m;
                System.out.println("No, I can make only " + n + " cup(s) of coffee");
            } else if(b <= m && b <= w){
                int n = b;
                System.out.println("No, I can make only " + n + " cup(s) of coffee");
            }
       } else if(water == 0 || milk == 0 || beans == 0){
            System.out.println("No, I can make only 0 cup(s) of coffee");
        }
    }
}
