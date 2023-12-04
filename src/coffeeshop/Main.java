package coffeeshop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        }
    }
}