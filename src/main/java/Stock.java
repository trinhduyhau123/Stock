 class Stock {
    private String symbol;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public Stock() {
        symbol = "ORGL";
        previousClosingPrice = 35.4;
        currentPrice = 3.54;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return previousClosingPrice/currentPrice;
    }
     public static void main(String[] args) {
         Stock stock = new Stock();
         System.out.println("Symbol: "+ stock.getSymbol());
         System.out.println("Current Price: " + stock.getCurrentPrice());
         System.out.println("Change Price: " + stock.getChangePercent());
         System.out.println("Rate: " +stock.getChangePercent());
     }
}


