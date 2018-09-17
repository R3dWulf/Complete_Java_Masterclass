import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Basket {

    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem itemParam, int quantityParam)
    {
        if( (itemParam != null) && quantityParam > 0)
        {
            int inBasket = list.getOrDefault(itemParam, 0);
            list.put(itemParam, inBasket + quantityParam);
            return inBasket;
        }
        return 0;
    }

    public Map<StockItem, Integer> Items()
    {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ( (list.size() == 1) ? "item" : " items") + "\n";
        double totalCost = 0.0;
        for( Map.Entry<StockItem, Integer> fred : list.entrySet() )
        {
            s = s + fred.getKey() + ". " + fred.getValue() + " purchased\n";
            totalCost += fred.getKey().getPrice() * fred.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
