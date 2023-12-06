import java.math.BigDecimal;

public class Item {
    private final String id;
    private final ItemType itemType;
    private final String name;
    private final BigDecimal price;

    public Item(String id, ItemType itemType, String name, BigDecimal price) {
        this.id= id;
        this.itemType= itemType;
        this.name=name;
        this.price=price;
    }

    public String getId() {
        return id;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }


    public static final class ItemBuilder {
        private String id;
        private ItemType itemType;
        private String name;
        private BigDecimal price;

        private ItemBuilder() {
        }

        public static ItemBuilder anItem() {
            return new ItemBuilder();
        }

        public ItemBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public ItemBuilder withItemType(ItemType itemType) {
            this.itemType = itemType;
            return this;
        }

        public ItemBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ItemBuilder withPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Item build() {
            return new Item(id, itemType, name, price);
        }
    }
}
