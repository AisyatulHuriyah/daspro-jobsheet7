import java.util.Scanner;

public class CinemaTickets04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ticketPrice = 50000, discount = 0, totalPrice;
        int ticket;
        double totalSales = 0;

        do {
            System.out.print("Input number of ticket purchased (Type '0' to done): ");
            ticket = sc.nextInt();

            if (ticket == 0) {
                break;
            }

            if (ticket < 0) {
                System.out.println("Invalid input. Please Re-enter a valid input!\n");
                continue;
            }

            // menentukan diskon
            if (ticket > 10) {
                discount = 0.15;
            } else if (ticket > 4) {
                discount = 0.10;
            }

            // menghitung total harga setelah diskon
            totalPrice = ticket * ticketPrice * (1 - discount);

            // menampilkan hasil
            System.out.println("Number of Ticket: " + ticket);
            System.out.println("Normal Price: Rp " + (ticket * ticketPrice));
            System.out.println("Discount: " + discount);
            System.out.println("Total to be paid: Rp " + totalPrice);

            // menambahkan ke total penjualan
            totalSales += totalPrice;

        } while (true);

        // menampilkan total akhir penjualan
        System.out.println("Total sales today: Rp " + totalSales);
    }
}