/*
Write a Java code of a program that reads the value of N from the user and calculates the
value of y if the expression of y is as follows:
𝑦 = −(1)−(1+2)−(1+2+3)− ....− (1+2+3+ ... +𝑁)
 */
import java.util.Scanner;

public class ev1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The value of N: ");
        int N = sc.nextInt();
        int sum=0;
        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <=i ; j++) {
                sum=sum-j;
            }
        }
        System.out.println(sum);
    }
}
