import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private Map<String,Item> items = new HashMap<>();

    public void addItem(Item item) {
        this.items.put(item.getId(),item);
    }

    public Item get(String id){
        return items.get(id);
    }
}
