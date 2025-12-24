import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int number;
        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if (number <= 1) {
            isPrime = false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is NOT a Prime number");
        }

        sc.close();
    }
}
