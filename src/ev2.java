/*
Write a Java program that will keep taking even positive integer numbers as inputs from the user
 and print the number of divisors of those numbers until it gets an odd number and then stops.
*** example:****
 Enter Number: 44
=> 44 has 6 divisors
Enter Number: 30
=> 30 has 8 divisors
Enter Number: 5
(nothing)
 */
import java.util.Scanner;
public class ev2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        while (n % 2 == 0) {
        int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % 2 != 0) {
                    break;
                }
                if (n % i == 0) {
                    count++;
                }
            }
            System.out.println( n + " has "+ count + " divisors");
            count=0;
            System.out.print("enter a number: ");
             n = sc.nextInt();

            }

    }
}
