package p2;

public class Item {
    public String name;
    public int price;
    public Item(String name, int price) {
    setFruit(name);
    setPrice(price);
    }
    public int getPrice() {
        return price;
    }
    public void setFruit(String fruit) {
        this.name = fruit;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
