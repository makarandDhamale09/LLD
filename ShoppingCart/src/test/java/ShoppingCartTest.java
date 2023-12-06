import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class ShoppingCartTest {

    private Inventory inventory;
    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        Item item1 = Item.ItemBuilder.anItem()
                .withId("Item-1")
                .withItemType(ItemType.BOOK)
                .withName("Effective Java")
                .withPrice(BigDecimal.valueOf(4000))
                .build();

        Item item2 = Item.ItemBuilder.anItem()
                .withId("Item-2")
                .withItemType(ItemType.PEN)
                .withName("Ball Pen")
                .withPrice(BigDecimal.valueOf(250))
                .build();

        inventory = new Inventory();
        inventory.addItem(item1);
        inventory.addItem(item2);
        cart = new ShoppingCart(inventory);
    }

    @Test
    void should_add_an_item_to_cart() {
        cart.addItem(new LineItem("item-1"));

        int totalItemCount = cart.totalNumberOfItems();

        assertThat(totalItemCount).isEqualTo(1);
    }

    @Test
    void should_add_multiple_items_to_the_cart() {

        cart.addItem(new LineItem("Item-1"));
        cart.addItem(new LineItem("Item-2"));

        int totalItemCount = cart.totalNumberOfItems();

        assertThat(totalItemCount).isEqualTo(2);
    }

    @Test
    void should_add_multiple_quantity_of_same_item_to_the_cart() {
        cart.addItem(new LineItem("Item-1",2));

        int totalItemCount = cart.totalNumberOfItems();

        assertThat(totalItemCount).isEqualTo(2);
    }

    @Test
    void should_remove_item_from_cart(){
        cart.addItem(new LineItem("Item-1"));
        cart.addItem(new LineItem("Item-2"));

        cart.removeItem(new LineItem("Item-1"));

        int totalItemCount = cart.totalNumberOfItems();

        assertThat(totalItemCount).isEqualTo(1);
    }

    @Test
    void should_remove_specific_quantity_of_item_from_cart(){
        cart.addItem(new LineItem("Item-1",4));
        cart.addItem(new LineItem("Item-2",3));

        cart.removeItem(new LineItem("Item-1",2));
        cart.removeItem(new LineItem("Item-2",1));

        int totalItemCount = cart.totalNumberOfItems();

        assertThat(totalItemCount).isEqualTo(4);
    }
}