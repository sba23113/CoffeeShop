package coffeeshop;

public class Item {
    private String name;
    private Double price;

    public Item(String item, String itemType, Double price) {
        this.name = item;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": " + price;
    }
}