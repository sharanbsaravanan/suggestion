package codePractice;


import java.util.Scanner;

//Write a program to check if a number is prime or not using a for loop.
public class CheckLoopForPrime {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= scanner.nextInt();

        if(isPrime(number)){
            System.out.println(number + " is prime number");
        }
        else {
            System.out.println(number + "  not prime number");
        }

    }

 public static  boolean  isPrime(int number) {
     if(number<= 1){
         return false;
     }
     for(int i=2; i<=number/2; i++){
         if (number % i == 0) {
             return false;
         }
     }

     return true;
     }
 }