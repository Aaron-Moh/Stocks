public class PortfolioTester
{
    public static void main(String[] args)
    {
        Stock[] stocks = new Stock[4];
        stocks[0] = new Stock("AAPL", 176.82);
        stocks[1] = new Stock("FB", 180.40);
        stocks[2] = new Stock("AMZN", 1523.61);
        stocks[3] = new Stock("GOOGL", 1094.76);
        
        Portfolio market = new Portfolio(stocks);        
        System.out.println("Cheapest: " + market.cheapest());
        System.out.println("Expected: AAPL");
        System.out.println("Total value: " + market.totalValue());
        System.out.println("Expected: 2975.59");
        
        stocks = new Stock[5];
        stocks[0] = new Stock("AAPL", 176.82);
        stocks[1] = new Stock("FB", 180.40);
        stocks[2] = new Stock("AMZN", 1523.61);
        stocks[3] = new Stock("GOOGL", 1094.76);
        stocks[4] = new Stock("MSFT", 93.64);
        
        market = new Portfolio(stocks);        
        System.out.println("Cheapest: " + market.cheapest());
        System.out.println("Expected: MSFT");
        System.out.println("Total value: " + market.totalValue());
        System.out.println("Expected: 3069.23");
    }
}


public class Portfolio {

    private Stock[] stocks;

    public Portfolio(Stock[] stocks) {
        this.stocks = stocks;
    }


    public String cheapest() {
        int index = 0;
        for(int i = 0; i < stocks.length; ++i) {
            if(stocks[i].getPrice() < stocks[index].getPrice()) {
                index = i;
            }
        }
        return stocks[index].getSymbol();
    }

    public double totalValue() {
        double total = 0;
        for(int i = 0; i < stocks.length; ++i) {
            total += stocks[i].getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < stocks.length; ++i) {
            s += stocks[i].toString();
            if(i != stocks.length-1) {
                s += "\n";
            }
        }
        return s;
    }
}

