/*
Draw a flowchart and write a Java program to take a positive integer N as user input and print the
 first N perfect numbers starting from 2. Your code should check all the positive integers starting
  from 2 and determine whether they are prime or not until N prime numbers are found.
*** Sample Input 1: **
2
*** Sample Output 1: ***
6 28
 */
import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt(); //3
        int count=0;
        int num =2;
        int sum =0;

        while(count< N){

            for(int i=1; i<num; i++){
                if(num%i==0){

                    sum = sum+i;
                }
            }

            if(sum==num){
                System.out.println(num);
                count++;
            }
            sum=0;
            num++;

        }
    }
}
