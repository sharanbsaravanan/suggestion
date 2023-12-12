package codePractice;

class Vehicle  {}
class Car extends Vehicle{}
class Flight{}
 public class Van extends Vehicle
    {
        public static void main(String[] args) {
            Vehicle vehicle1 = new Car();
            Vehicle vehicle2 = new Van();
            checkVehicleType(vehicle1);
            checkVehicleType(vehicle2);







            Vehicle v = new Vehicle();
            Flight f = new Flight();
            Van van = new Van();
            Vehicle vehicle = new Van();
            System.out.println(van instanceof Vehicle);
            System.out.println(vehicle instanceof Vehicle);
            checkInstanceOfVan(v);
            checkInstanceOfVan(f);
            checkInstanceOfVan(van);
            checkInstanceOfVan(vehicle);
            checkInstanceOfFlight(f);


            int num =10;
            while (num<=20) {
                System.out.println(num);
                num++;
                if(num ==18){
                    break;
                }
            }
            int number[] = {1,2,3,4,5,6,7,8,9};
            int j=0;
            while(j<number.length){
                System.out.println(number[j]);
                j++;
            }
            while(number[0]<1){

            }
            System.out.println(number[0]);
            for(int i=0; i<number.length; i++){
                System.out.println(number[i]);

            }
        }

        private static void checkVehicleType(Vehicle vehicle) {
            if(vehicle instanceof Van){
                System.out.println("van type");
            }
            if(vehicle instanceof Car){
                System.out.println("car type");
            }
        }


        public static void checkInstanceOfVan(Object o){
            if(o instanceof Van){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }

        public static void checkInstanceOfFlight(Object o){
            if(o instanceof Flight){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }



    }



