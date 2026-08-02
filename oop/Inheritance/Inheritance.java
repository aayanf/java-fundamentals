package inheritance;
/*
    Aayan Faisal
    8/1/2026
    JDK 26
    Inheritance example using vehicles and polymorphism
 */

public class Inheritance {
    public static void main(String[] args) {
        Motorcycle m1 = new Motorcycle("Ninja 500", "2024", false);
        Car c1 = new Car("Toyota Camry", "2020", 5);
        Car c2 = new Car("Honda Accord", "2021", 4);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Number of vehicles:" + Vehicle.getNumberOfVehicles());
        
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Toyota Camry", "2022", 4);
        vehicles[1] = new Car("Honda Accord", "2021", 4);
        vehicles[2] = new Motorcycle("Ninja 500", "2024", false);
        for (Vehicle v : vehicles) {
            System.out.println(v);
            System.out.println(v.getPurpose());
        }
    }
    
}
