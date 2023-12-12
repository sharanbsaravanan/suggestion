package codePractice;

public class Test1 {

    public static void main(String[] args) {

        int a = 5, b=3;
        System.out.println(a+b);

     //   int c= 12-7;
        System.out.println(12-7);
         a= 4; b=5;
        System.out.println(a*b);
        int c =20 , d= 4;
        System.out.println(c/d);
        c =17;
        d= 3;
        System.out.println(c%d);

        if(7>3){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        a= 10;
        b=8;
        boolean bool = a<=b;
        if(bool){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        if(5==5){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if(4!=4){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(7>3 && bool){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if(7>3 || bool ){
            System.out.println("true");

        }
        else {
            System.out.println("false");
        }
        boolean x= true;
        boolean y = false;
        boolean z = x&&y;
        System.out.println(z);
        z=!(x&&y);
        if (z){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        int num = 10;
        num+= 5;
        System.out.println(num);

        double price =12.99;
        price-= 2.00;
        System.out.println(price);

        int value= 5*3;
        System.out.println(value);


        int val = 5;
        String result;
        if(val%2==0) {
            result = "true";
        }
        else
        {
            result = "false";
        }
        System.out.println(result);

        result=val%2==0 ?"true" :"false";

        a=2;
        b=1;

       int r= a<b ? a :b;
       if(a<b){
           r= a;
       }
       else{
           r=b;

       }
        System.out.println(r);

       int age =16;
       String result1;
       if(age>=18){
           result1 ="can vote";
       }
       else{
           result1 ="cannot vote";
       }
        result1=(age>=18) ?"can vote" :"cannot vote";
        System.out.println(result1);

        String name ="rishi";
        boolean isString = name instanceof String;
        System.out.println(isString);



    }

}
