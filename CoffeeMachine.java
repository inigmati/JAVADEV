import java.util.Scanner;
import java.math.*;
 
public class CoffeeMachine {
   public static Scanner scanner = new Scanner(System.in);
   public static int water = 400;
   public static int milk = 540;
   public static int coffeeBeans = 120;
   public static int disposalCups = 9;
   public static int money = 550;
   public static void main(String[] args) {
        
        boolean b = true;
        while(b){
           System.out.println("Write action (buy, fill, take, remaining, exit):");
            String n = scanner.next();
            switch(n){
                case "buy":
                    coffee();
                    break;
                case "take":
                    System.out.println("I gave you "+money);
                    money = 0;
                    break;
               case "fill":
                     fill();
                     break;
               case "remaining":
               System.out.println("The coffee machine has:\n"+water+" of water\n"+milk+" of milk\n"+coffeeBeans+" of coffee beans\n"+disposalCups+" of disposable cups\n$"+money+" of money");
                     break;
               case "exit":
                    System.out.println("exit");
                    b = false;
                    break;
               default:
                    System.out.println("wrong parameter!");
                    break;
            }
        }
    }
   public static void coffee(){
      System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
      String s = scanner.next();
      switch(s){
         case "1":
            if(Math.min(water/250,coffeeBeans/16)>=1){
               System.out.println("I have enough resources, making you a coffee!");
               water -= 250;               
               coffeeBeans -= 16;
               disposalCups--;
               money +=4;
            }
            else{
               resourceAvaibality(250,1,16,1);
            }
            break;
         case "2":
            if(Math.min(water/350, Math.min(milk/75, coffeeBeans/20))>=1){
               System.out.println("I have enough resources, making you a coffee!");
               water -= 350;
               milk -= 75;
               coffeeBeans -= 20;
               disposalCups--;
               money +=7;
            }
            else{
               resourceAvaibality(230,75,20,1);
            }
            break;
         case "3":
            if(Math.min(water/200, Math.min(milk/100, coffeeBeans/12))>=1){
               water -= 200;
               milk -= 100;
               coffeeBeans -= 12;
               disposalCups--;
               money +=6;
            }
            else{
               resourceAvaibality(200,100,12,1);
            }
            break;
         case "back":
            break;
         default:
            System.out.println("wrong parameter!");
            break;
      }
      
   }

   public static void resourceAvaibality(int minWater,int minMilk,int minCoffeeBeans,int minDisposals){
      if(water/minWater<1){
         System.out.println("Sorry, not enough water!");
      }
      if(milk/minMilk<1){
         System.out.println("Sorry, not enough milk!");
      }
      if(coffeeBeans/minCoffeeBeans<1){
         System.out.println("Sorry, not enough coffee beans!");
      }
      if(disposalCups/minDisposals<1){
         System.out.println("Sorry, not enough disposal cups!");
      }
   }

   public static void fill(){
        
      System.out.println("Write how many ml of water do you want to add:");
      int w = scanner.nextInt();
      System.out.println("Write how many ml of milk do you want to add:");
      int m = scanner.nextInt();
      System.out.println("Write how many grams of coffee beans do you want to add:");
      int cB = scanner.nextInt();
      System.out.println("Write how many disposable cups of coffee do you want to add:");
      int c = scanner.nextInt();
      water += w;
      milk += m;
      coffeeBeans += cB;
      disposalCups += c;
   
   }
}