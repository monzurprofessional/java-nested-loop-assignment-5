/*
Write a Java program to take a positive integer N as user input and print the first N prime
 numbers starting from 2. Your code should check all the positive integers starting from 2 and
 determine whether they are prime or not until N prime numbers are found.
**  Sample Input : 5  **
**  Sample Output : 2, 3, 5, 7, 11  **
 */
import java.util.Scanner;
public class cw2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int count = 0;
        int num = 2; 

        while(count<N){
            boolean isPrime = true;

            for(int i = 2; i<num; i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }

    }
}