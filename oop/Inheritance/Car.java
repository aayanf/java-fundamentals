package inheritance;

public class Car extends Vehicle implements VehicleInterface {
    private int passengers;
    
    public Car(String m, String y, int p) {
        super(m, y);
        passengers = p;
    }
    
    public void setPassengers(int p) {
        passengers = p;
    }
    public int getPassengers() {
        return passengers;
    }
            
    @Override
    public String toString() {
        return super.toString() + "\nNumber of Passengers: " + passengers;
    }
    
    @Override
    public String getPurpose() {
        return " Cars are used for everyday personal transportation, "
                + "providing comfort, safety, and space for passengers.";
    }
}
