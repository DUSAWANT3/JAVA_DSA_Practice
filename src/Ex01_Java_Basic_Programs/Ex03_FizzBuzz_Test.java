package Ex01_Java_Basic_Programs;

//Write a Java program to print "FizzBuzz" for numbers from 1 to 100.
//For multiples of 3, print "Fizz" instead of the number,
//and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."

public class Ex03_FizzBuzz_Test {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) { //Divide i by 3, and return the remainder.
                System.out.println(i + " = FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " = Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " = Buzz");
            } else {
               // System.out.println(i);
            }
        }
    }
}

