import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");

        // Currency conversion rates
        double inrToEuroRate = 0.011;
        double inrToPoundRate = 0.0094;
        double inrToYenRate = 1.71;
        double inrToUsdRate = 0.012;

        System.out.print("Enter the amount in INR: ");
        double inrAmount = scanner.nextDouble();

        System.out.println("Choose the currency to convert to:");
        System.out.println("1. Euro");
        System.out.println("2. British Pound");
        System.out.println("3. Japanese Yen");
        System.out.println("4. United States Dollar");

        int choice = scanner.nextInt();
        double convertedAmount = 0;

        switch (choice) {
            case 1:
                convertedAmount = inrAmount * inrToEuroRate;
                System.out.println("Converted amount: " + convertedAmount + " Euro");
                break;
            case 2:
                convertedAmount = inrAmount * inrToPoundRate;
                System.out.println("Converted amount: " + convertedAmount + " British Pound");
                break;
            case 3:
                convertedAmount = inrAmount * inrToYenRate;
                System.out.println("Converted amount: " + convertedAmount + " Japanese Yen");
                break;
             case 4:
                convertedAmount = inrAmount * inrToUsdRate;
                System.out.println("Converted amount: " + convertedAmount + " United States Dollar");
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
