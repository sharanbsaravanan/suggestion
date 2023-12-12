package codePractice;

import java.util.Scanner;

public class TestLoop {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= 10; i++)
            System.out.println(i);

        int x = 10;
        while (x >= 1) {
            System.out.println(x);
            x--;

        }

        for (int j = 1; j <= 10; j++)
            if (j % 2 == 0) {
                System.out.println(j);

            }

        System.out.println("Enter a postive Integer:  ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("negative number");
        } else {
            long factorial = 1;
            for (int a = 1; a <= num; a++) {
                factorial *= a;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }

        System.out.println("enter no:   ");
        int value = scanner.nextInt();
        System.out.println("multiply table" + value + ":");
        for (int f = 1; f <= 10; f++)
            System.out.println(value + "*" + f + "=" + (value * f));

        int N =8;
        Fibo(N);


    }


    static void Fibo(int N) {
        int num1 =0 ,num2 =1;
        int count =0;

        while (count < N){
            System.out.println(num1 + " ");

            int num3 = num1 + num2;
             num1 =num2;
             num2 = num3;
             count =count+1;
        }


    }

}
