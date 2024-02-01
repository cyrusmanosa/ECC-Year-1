package J2Kad12Challenge;

public class MenuItem {
    private String name;
    private int price;
    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String toString() { return name; }
    public int getPrice() { return price; }
}
