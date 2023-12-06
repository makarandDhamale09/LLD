import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {

    private final Inventory inventory;
    List<LineItem> cartItems = new ArrayList<>();

    public ShoppingCart(Inventory inventory) {
        this.inventory = inventory;
    }

    public void addItem(LineItem item) {
        cartItems.add(item);
    }

    public int totalNumberOfItems() {
        int total = 0;
        for (LineItem lineItem : cartItems) {
            total += lineItem.getQuantity();
        }
        return total;
    }

    public void removeItem(LineItem itemToRemove) {
        for (LineItem cartItem : cartItems) {
            if (Objects.equals(cartItem.getItemId(), itemToRemove.getItemId())) {
                if (itemToRemove.getQuantity() == cartItem.getQuantity()) {
                    cartItems.remove(itemToRemove);
                } else {
                    cartItem.reduceQuantity(itemToRemove.getQuantity());
                }
            }
        }
    }
}
