public class Item {
    private String ItemId;
    private String name;
    private int quantity;
    private double price;

    public Item(String ItemId, String name, int quantity, double price){
        this.ItemId = ItemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemId() {
        return ItemId;
    }

    public void setItemId(String itemId) {
        ItemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) { this.price = price; }
}
