import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 3.45, 25);
        stockList.addStock(temp);

        temp = new StockItem("beer", 4.99, 8);
        stockList.addStock(temp);

        temp = new StockItem("chips", 3.49, 10);
        stockList.addStock(temp);


        temp = new StockItem("cereal", 2.99, 4);
        stockList.addStock(temp);


        temp = new StockItem("beef", 4.85, 5);
        stockList.addStock(temp);


        temp = new StockItem("pizza", 12.49, 7);
        stockList.addStock(temp);


        temp = new StockItem("milk", 4.99, 4);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String fred : stockList.Items().keySet())
        {
            System.out.println(fred);
        }

        Basket testBasket = new Basket("Test");
        sellItem(testBasket, "milk", 1);
        System.out.println(testBasket);

        sellItem(testBasket, "cereal", 1);
        System.out.println(testBasket);

        if( sellItem(testBasket, "cereal", 22) != 1)
        {
            System.out.println("\nCurrently sold ouf of cereal");
        }
        System.out.println(testBasket);

        sellItem(testBasket, "bacon", 1);
        System.out.println(testBasket);

        //System.out.println(stockList);

        // check to see if unmodifiableMap is working if yes,
        // code below will throw an error
//        temp = new StockItem("paper", 1.50);
//        stockList.Items().put(temp.getName(), temp);

        stockList.Items().get("beer").adjustStock(34);
        stockList.get("beer").adjustStock(-14);
        System.out.println(stockList);

        for( Map.Entry<String, Double> price : stockList.PriceList().entrySet() )
        {
            System.out.println(price.getKey() + " costs" + price.getValue() );
        }
    }


    public static int sellItem(Basket basketParam, String itemParam, int quantityParam)
    {
        // retrieve item from stock list
        StockItem stockItem = stockList.get(itemParam);

        if( stockItem == null )
        {
            System.out.println(itemParam + " is not an item that is sold");
            return 0;
        }

        if( stockList.sellStock(itemParam, quantityParam) != 0)
        {
            basketParam.addToBasket(stockItem, quantityParam);
            return quantityParam;
        }

        return 0;
    }
}
