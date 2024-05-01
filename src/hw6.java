/*
Write a Java program that will ask the user to specify a range, indicating the starting and
ending numbers for generating a times table. The program will generate and display the times
table for the specified numbers.
explaination: if the provided range is 3 to 5, it will print the tables of 3,4 and 5
 */
import java.util.Scanner;
public class hw6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Start: ");
        int a = scanner.nextInt();
        System.out.print("end: ");
        int b = scanner.nextInt();

        for(int p = a; p<=b; p++){
            System.out.println("Times Table of: " + p);
            for(int i = 1; i<=10; i++){

                System.out.print( p + " x " + i + " = " + p*i ); //this can also be written as: System.out.printf("%d X %d = %d",p,i, p*i );
                System.out.println();
            }
            System.out.println();
        }
    }
}
