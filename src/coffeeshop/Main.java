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
            System.out.println("****************************");
            System.out.println("1: show cafe menu");
            System.out.println("2: place an order");
            System.out.println("3: list orders");
            System.out.println("4: fulfill order");
            System.out.println("x: exit");
            System.out.print("Enter request: ");
            String action = scanner.next();
            System.out.println("****************************");

            if (action.equals("x")) {
                System.out.println("Thank you for your visit! Bye!");
                break;
            }                        
            if (action.equals("1")) {
                for (Item item : cafe.getMenu()) {
                    System.out.println(item);
                }
            }
            if (action.equals("2")) {
                System.out.print("What would you like to order? ");
                String item = scanner.next().toLowerCase();
                System.out.printf("How many %ss would you like to order: ", item);
                int qty = scanner.nextInt();
                Order order = new Order(item, qty);
                cafe.addOrder(order);
                System.out.printf("%dx %s coming up!", qty, item);
                System.out.println("");
            }
            if (action.equals("3")) {
                if (cafe.getOrders().isEmpty()) {
                    System.out.println("There are currently no unfulfilled orders.");
                    continue;
                } else {                
                    System.out.println("List of Orders: ");
                    for (Order o : cafe.getOrders()) {
                        System.out.println(o);
                    }
                }
            }
            if (action.equals("4")) {
                Order fulfilledOrder = cafe.removeOrder();
                if (fulfilledOrder!=null) {
                    System.out.println(fulfilledOrder.getQuantity() + "x " + fulfilledOrder.getItem() + " waiting for collection!");
                } else {
                    System.out.println("All orders have been fulfilled!");
                }
            }
        }
    }
}