public class LineItem {
    private final String itemId;
    private int quantity;

    public LineItem(String itemId, int quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public LineItem(String itemId) {
        this(itemId, 1);
    }

    public String getItemId() {
        return itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LineItem lineItem)) return false;

        if (quantity != lineItem.quantity) return false;
        return itemId.equals(lineItem.itemId);
    }

    @Override
    public int hashCode() {
        int result = itemId.hashCode();
        result = 31 * result + quantity;
        return result;
    }

    public void reduceQuantity(int quantityToReduce) {
        this.quantity -= quantityToReduce;
    }
}
