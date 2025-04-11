import java.util.Scanner;                                                                                       

class NegativeNumberException extends Exception {
    public NegativeNumberException(int num) {
        super("Negative number entered: " + num);
    }
}

public class SimpleAVG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.print("Enter how many numbers you want to input: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();

            try {
                if (num < 0) {
                    throw new NegativeNumberException(num);
                }
                sum += num;
                count++;
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of valid numbers: " + average);
        } else {
            System.out.println("No valid (positive) numbers entered.");
        }

        scanner.close();
    }
}
