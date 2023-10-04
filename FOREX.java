
public class FOREX {
    public final double startingUSDollars = 6500;
    public double cash;
    public double eurosSpent = 2163.76;
    public final double euroToUSDRate = 1.0535;
    public final double yenToUSDRate = 0.0091;
    public final double rupeeToUSDRate = 0.0136;
    public double yenSpent = 156000;
    public double rupeeSpent = 100000;

    public FOREX() {
        cash = startingUSDollars;
    }

    public double convertToUSD(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }

    public static void main(String[] args) {
        FOREX forex = new FOREX();
        System.out.println("--------------------------------------------------");
        System.out.println(
                "This Program Converts an amount of money" +
                "\nfrom a specific country into the equivalent" +
                "\ncurrency of another country give the current" +
                "\nexchange rate");

        // Euros
        System.out.println("--------------------------------------------------");
        System.out.println("\nStarting US Dollars:\t\t\t" + forex.cash);
        System.out.println("\nEurope:");
        System.out.println("\tEuros Spent:\t\t\t" + forex.eurosSpent);
        System.out.println("\tUS Dollars Equivalent:\t\t" + forex.convertToUSD(forex.eurosSpent, forex.euroToUSDRate));
        forex.cash -= forex.convertToUSD(forex.eurosSpent, forex.euroToUSDRate);
        System.out.println("\tUS Dollars Remaining:\t\t" + forex.cash);
        // Yen
        System.out.println("\nJapan:");
        System.out.println("\tYen Spent:\t\t\t" + forex.yenSpent);
        System.out.println("\tUS Dollars Equivalent:\t\t" + forex.convertToUSD(forex.yenSpent, forex.yenToUSDRate));
        forex.cash -= forex.convertToUSD(forex.yenSpent, forex.yenToUSDRate);
        System.out.println("\tUS Dollars Remaining:\t\t" + forex.cash);
        // Rupees
        System.out.println("\nIndia:");
        System.out.println("\tRupees Spent:\t\t\t" + forex.rupeeSpent);
        System.out.println( "\tUS Dollars Equivalent:\t\t" + forex.convertToUSD(forex.rupeeSpent, forex.rupeeToUSDRate));     
        forex.cash -= forex.convertToUSD(forex.rupeeSpent, forex.rupeeToUSDRate);
        // Calculating and displaying remaining money
        System.out.println("\tUS Dollars Remaining:\t\t" + forex.cash);
        System.out.println("--------------------------------------------------");
        System.out.println("Remaining US Dollars:\t\t\t" + forex.cash);
        // Calculating souvenir purchases
        System.out.println("\n\n--------------------------------------------------");
        System.out.println("Souvenir Purchases");
        System.out.println("\t(all values in US Dollars)");
        System.out.println("--------------------------------------------------");
        System.out.println("Item 1");
        System.out.println("\tCost Per Item:\t\t\t$12.99");
        System.out.println("\tBudget:\t\t\t\t$100.00");
        System.out.println("Total Items Purchased:\t\t\t" + (int) (100 / 12.99));
        System.out.println("Funds Remaining:\t\t\t$" + (int) (100 % 12.99));
        
        System.out.println("\nItem 2");
        System.out.println("\tCost Per Item:\t\t\t$29.99");
        System.out.println("\tBudget:\t\t\t\t$300.00");
        System.out.println("Total Items Purchased:\t\t\t" + (int) (300 / 29.99));
        System.out.println("Funds Remaining:\t\t\t$" + (int) (300 % 29.99));
    }  
}