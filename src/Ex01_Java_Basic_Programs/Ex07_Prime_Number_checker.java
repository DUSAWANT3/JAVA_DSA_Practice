package Ex01_Java_Basic_Programs;

import java.util.Scanner;

public class Ex07_Prime_Number_checker {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        //int number = sc.nextInt();
        //A prime number (or prime) is a natural number greater than 1
        // that has no positive divisors other than 1 and itself.
        int number = 29;
        boolean isPrime = checkPrime(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}