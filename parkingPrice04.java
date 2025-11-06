import java.util.Scanner;

public class parkingPrice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type, duration;
        int total = 0, fee = 0;
        final int carFee = 3000, motorcycleFee = 2000, maxFee = 12500;

        while (true) {
            System.out.println("===== PARKING FEE CALCULATOR =====");
            System.out.print("Input Vehicle Type: (1 = Car, 2 = Motorcycle, 0 = Done) : ");
            type = sc.nextInt();

            if (type == 0) {
                break;
            }

            if (type != 1 && type != 2) {
                System.out.println("Invalid vehicle type! Please re-enter.\n");
                continue;
            }

            System.out.print("Parking Duration (hours): ");
            duration = sc.nextInt();

            if (duration < 0) {
                System.out.println("Duration cannot be negative!\n");
                continue;
            }

            if (duration > 5) {
                fee = maxFee;
                System.out.println("Flat rate applied: Rp " + maxFee);
            } else if (type == 1) { // mobil
                fee = duration * carFee;
                System.out.println("Car : " + duration + " hours Rp " + carFee + " = Rp " + fee);
            } else if (type == 2) { // motor
                fee = duration * motorcycleFee;
                System.out.println("Motorcycle : " + duration + " hours Rp " + motorcycleFee + " = Rp " + fee);
            }

            total += fee;
            System.out.println("Parking fee for this vehicle: Rp " + fee);
            System.out.println("------------------------------------\n");
        }

        System.out.println("====================================");
        System.out.println("Transaction Done!");
        System.out.println("Total Parking Fee for All Vehicles: Rp " + total);
        System.out.println("====================================");

        sc.close();
    }
}
