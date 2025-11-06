import java.util.Scanner;
public class SiakadFor04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = 0, lowest = 100, highest = 0;
        int passCount = 0, failCount = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter the score for student-" + i + ":");
            score = sc.nextDouble();
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
            if (score >= 60) passCount++;
            else failCount++;
        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Passed: " + passCount);
        System.out.println("Failed: " + failCount);
        sc.close();
    }
}