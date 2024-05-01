/*
Write a Java program that will ask for a range (a starting number and an ending number) from
the user and print all the Armstrong numbers between that range.
[Armstrong Number: An Armstrong number is a number whose sum of digits raised to the power the number of digits equals to that number.
For example, 371 is an Armstrong number because 33 + 73 + 13 = 371, here the total number of digits in 371 is 3 ]

***Sample Input :***
Start: 300
End: 500
***Sample Output :***
Armstrong numbers: 370 , 371, 407
 */
import java.util.Scanner;
public class cw3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("start: ");
        int start = sc.nextInt();
        System.out.print("end: ");
        int end = sc.nextInt();
        int sum=0;
        int n;

        for (int i = start; i <=end ; i++) {
            n=i;
            while (n!=0) {
                int x = n % 10;
                sum += x * x * x;
                n = n / 10;
            }
            if(sum==i){
                System.out.println(i);
            }
            sum=0;
        }
    }
}
