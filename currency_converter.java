import java.util.Scanner;

public class currency_converter
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.println("Select the currency to convert from (USD, EUR, RUPEES):");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.println("Select the currency to convert to (USD, EUR, RUPEES): ");
        String toCurrency = scanner.next().toUpperCase();

        double exchangeRate = getExchangeRate(fromCurrency, toCurrency);
        double convertedAmount = convertCurrency(amount, exchangeRate);

        System.out.println(amount + " " + fromCurrency + " is equal to " + convertedAmount + " " + toCurrency);
    }

    private static double getExchangeRate(String fromCurrency, String toCurrency)
     {
        // Add your exchange rates here
        // For example: 1 USD = 0.85 EUR, 1 USD = 83.38 RUPEES, 1 EUR = 89.97 RUPEES
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) 
        {
            return 0.85;
        }
         else if (fromCurrency.equals("USD") && toCurrency.equals("RUPEES")) 
         {
            return 83.38;
         }
          else if (fromCurrency.equals("EUR") && toCurrency.equals("RUPEES"))
        {
            return 89.97;
        }
         else if (fromCurrency.equals(toCurrency)) 
        {
            return 1.0; // Same currency, no conversion needed
        } 
        else 
        {
            System.out.println("Unsupported conversion: " + fromCurrency + " to " + toCurrency);
            System.exit(1);
            return -1; // 
        }
    }

    private static double convertCurrency(double amount, double exchangeRate) 
    {
        return amount * exchangeRate;
    }
}