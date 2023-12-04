package coffeeshop;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private List<Item> menu;
    private List<Order> ordersList;

    public CoffeeShop() {
        this.menu = new ArrayList<>();
        this.ordersList = new ArrayList<>();
    }

    public void addItem(String name, String type, Double price) {
        Item item = new Item(name, type, price);
        menu.add(item);
    }

    public List<Item> getMenu() {
        return menu;
    }

    public void addOrder(Order order) {
        ordersList.add(order);
    }

    public List<Order> getOrders() {
        return ordersList;
    }

    public Order removeOrder() {
        if (ordersList.isEmpty()) {
            return null;
        }

        Order removedOrder = ordersList.get(0);
        ordersList.remove(0);

        return removedOrder;
    }
}