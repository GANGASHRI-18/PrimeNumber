import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        int number, reverse = 0, remainder;
        int originalNumber;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        originalNumber = number;

        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a Palindrome number");
        } else {
            System.out.println(originalNumber + " is NOT a Palindrome number");
        }

        sc.close();
    }
}

