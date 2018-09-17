import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem itemParam)
    {
        if(itemParam != null)
        {
            // check if item has a quantity
            StockItem inStock = list.getOrDefault(itemParam.getName(), itemParam);
            // adjust quantity
            if(inStock != itemParam)
            {
                itemParam.adjustStock(inStock.quantityInStock());
            }

            list.put(itemParam.getName(), itemParam);
            return itemParam.quantityInStock();
        }
        //for no stock movement
        return 0;
    }


    public int sellStock(String itemParam, int quantityParam)
    {
       StockItem inStock = list.getOrDefault(itemParam, null);
       if( (inStock != null) && (inStock.quantityInStock() >= quantityParam) && (quantityParam > 0) )
       {
           inStock.adjustStock(-quantityParam);
           return quantityParam;
       }
       // Take nothing out of stock
       return 0;
    }

    public StockItem get(String key)
    {
        return list.get(key);
    }

    public Map<String, Double> PriceList(){
        Map<String, Double> prices = new LinkedHashMap<>();
        for( Map.Entry<String, StockItem> fred : list.entrySet())
        {
            prices.put(fred.getKey(), fred.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String, StockItem> Items()
    {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for( Map.Entry<String, StockItem> fred : list.entrySet())
        {
            StockItem stockItem = fred.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock, Value of items: ";
            s = s + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;

         }

         return s + "Total stock value " + totalCost;
    }
}
