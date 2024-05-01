/*
question: Write a Java program that asks the user for a range, a starting number(inclusive)
 and an ending number (inclusive). Then, take another input for checking. If the product of
 all the digits of each number in the range is divisible by the third input, then print the product.
** Sample Input 1: **
25 30 4
** Sample Output 1: **
12 16 0
**Explanation: The product of all the digits of each number from 25 to 30 are 2 × 5, 2 × 6, 2 × 7, 2 × 8, 2 × 9 and 3 × 0.
 The final products are 10, 12, 14, 16, 18 and 0 respectively. Out of these numbers only 12, 16 and 0 are divisible by
 the third input 4 and therefore they are printed.**

 */
import java.util.Scanner;
public class hw7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter starting number: ");
        int a = sc.nextInt();
        System.out.print("enter ending number: ");
        int b = sc.nextInt();
        System.out.print("divisiblle by: ");
        int c = sc.nextInt();
        int p = 4;
        for (int i = a; i <=b ; i++) {
            int temp =i;
            int prod =1;
            while (temp!=0){
                int x=temp%10;
                prod= prod*x;
                temp=temp/10;
            }
            if(prod%c==0){
                System.out.print(prod + " ");
            }
            prod=1;
        }
    }
}
