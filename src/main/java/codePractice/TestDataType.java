package codePractice;

public class TestDataType {
    public static void main(String[] args) {


    byte byte1 = 2;
    byte byte2 = 7;
    byte byte3 = (byte) (byte1 + byte2);

        short short1 = 21;
        short short2 = 31;
        short short3 = (short) (short1 +short2);

        int int1 = 788;
        int int2 = 355;
        int int3 = int1 + int2;


        long long1 = 79745;
        long long2 = 71265;
        long long3 = long1 + long2;

        double double1 = 457255.00;
        double double2 = 789512.01;
        double double3 = double1 + double2;


        float float1 = 23.02f;
        float float2 =58.021f;
        float float3= float1 + float2;

      /*  char char1 = 'a';
        char char2 = 's';
        String char3 = String.valueOf(char1 + char2); */

        long phoneNumber = 9876543210L;
        String phoneNo = String.valueOf(phoneNumber);

        boolean boolean1 = true;

        System.out.println(byte3 + short3 + int3 + long3+ float3 + double3 +phoneNo+boolean1);


    }

}
