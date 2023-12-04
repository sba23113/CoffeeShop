package coffeeshop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeShop cafe = new CoffeeShop();
        cafe.addItem("Bagel", "Food", 8.50);
        cafe.addItem("Burger", "Food", 14.50);
        cafe.addItem("Sandwich", "Food", 11.20);
        cafe.addItem("Quiche", "Food", 18.90);
        cafe.addItem("Coffee", "Food", 3.50);
        cafe.addItem("Tea", "Food", 2.50);
        cafe.addItem("Sparkling Water", "Food", 2.00);
        
        while (true) {
            System.out.println("**************");
            System.out.println("1: show cafe menu");
            System.out.println("2: place an order");
            System.out.println("3: list orders");
            System.out.println("4: fulfill order");
            System.out.println("x: exit");
            System.out.print("Enter request: ");
            String action = scanner.next();
            System.out.println("**************");

            if (action.equals("x")) {
                System.out.println("Thank you for your visit! Bye!");
                break;
            }                        
            if (action.equals("1")) {
                for (Item item : cafe.getMenu()) {
                    System.out.println(item);
                }
            }
        }
    }
}