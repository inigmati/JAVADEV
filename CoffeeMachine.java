//package machine;
import java.util.Scanner;
import java.lang.Math;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        int totalCups = Math.min(water/200, Math.min(milk/50, coffeeBeans/15));

        if(totalCups>0){
            if(totalCups>cups){
                int k = totalCups - cups;
                System.out.println("Yes, I can make that amount of coffee (and even "+k+" more than that)");
            }   
            else if(totalCups==cups){
                System.out.println("Yes, I can make that amount of coffee");   
            }
            else{
                System.out.println("No, I can make only "+totalCups+" cup(s) of coffee");
            }
        }

        /*
        System.out.println("For "+cups+" cups of coffee you will need:");
        System.out.println(water+" ml of water");
        System.out.println(milk+" ml of milk");
        System.out.println(coffeeBeans+" g of coffee beans");
        */
    }
}