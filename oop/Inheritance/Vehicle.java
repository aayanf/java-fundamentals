package inheritance;

public class Vehicle implements VehicleInterface{
    private String model;
    private String year;
    private static int counter;
    
    public Vehicle(String m, String y) {
        this.model = m;
        this.year = y;
        counter++;
    }
    
    public void setModel (String m){
        model = m;
    }
    
    public void setYear (String y) {
        year = y;
    }
    
    public String getModel () {
        return model;
    }
    
    public String getYear () {
        return year;
    }
    
    @Override
    public String toString() {
        return "Model: " + getModel() + "\nYear: " + getYear();
    }
    
    public static int getNumberOfVehicles() {
        return counter;
    }
    
    @Override
    public String getPurpose() {
        return "Vehicles are used for transportation";
    }
}
