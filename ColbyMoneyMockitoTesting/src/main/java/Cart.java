import java.util.List;

public class Cart {
    private ItemService itemService;
    private List<Item> items;


    public ItemService getItemService() {
        return itemService;
    }

    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getCartTotalAmount(){
        double totalAmount = 0.0;

        for(Item item:items){
            totalAmount += itemService.getPrice(item) * item.getQuantity();
        }
        return totalAmount;
    }

}
