import java.util.Scanner;
public class KafeDoWhile04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coffee, tea, bread;
        String customerName;
        int totalPrice, coffeePrice = 12000, teaPrice = 7000, breadPrice = 20000;
        do {
            System.out.print("Enter Customer Name (type 'cancel' to out): ");
            customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction Canceled. ");
                break;
            }
            System.out.print("Number of coffees : ");
            coffee = sc.nextInt();
            System.out.print("Number of teas: ");
            tea = sc.nextInt();
            System.out.print("Number of bread: ");
            bread = sc.nextInt();

            totalPrice = (coffee*coffeePrice) + (tea*teaPrice) + (bread*breadPrice);
            System.out.println("Total to be paid: Rp" + totalPrice);
            sc.nextLine();
        } while (true);

        System.out.println("All Transaction completed.");
        sc.close();
    }
}