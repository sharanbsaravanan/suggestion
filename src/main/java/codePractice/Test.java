package codePractice;

public class Test {
public void multiply(int x,int y)
{
    int z = x*y;
    System.out.println(z);
}

    public static void main(String[] args) {
        Test test = new Test();
        test.multiply(5 , 7);
        System.out.println(test);
    }
}
