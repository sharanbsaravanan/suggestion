package codePractice;

import static javax.management.Query.value;

public class Operators {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c;
        double d;
        c=a+b;
        System.out.println(c);
        c =a-b;
        System.out.println(c);
        c=a*b;
        System.out.println(c);
        d= a/b;
        System.out.println(d);
        c = a%b;
        System.out.println(c);
         c=a++;
        System.out.println(c);
        c=a--;
        System.out.println(c);
        c+= a;
        System.out.println(c);
        c-= b;
        System.out.println(c);
        c*= c;
        System.out.println(c);
        c/=c;
        System.out.println(c);
        c%= b;
        System.out.println(c);

        if (a==b)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        String value = a==b ?"true" : "false";
        System.out.println(value);

        if(a==b){
            System.out.println("a==b");
        }else{
            if(a>b){
                System.out.println("a>b");
            }else{
                System.out.println("a<b");
            }
        }

       String value1= a==b ? "a==b" :  ( a>b ? "a>b" : "a<b");

        if (a>b && a>c) {
            System.out.println("true");
        }
            else{
                System.out.println("false");

            }

            if (a>b || a>c){
                System.out.println("true");

            }
            else {
                System.out.println("false");
            }

        }

    }

