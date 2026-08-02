package inheritance;

public class Motorcycle extends Vehicle implements VehicleInterface{
    private boolean hasSidecar;
    
    public Motorcycle(String m, String y, boolean s) {
        super(m, y);
        hasSidecar = s;
    }
    
    public void setHasSidecar(boolean s) {
        hasSidecar = s;
    }
    
    public boolean getHasSidecar() {
        return hasSidecar;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nHas Sidecar: " + hasSidecar;
    }
    
    @Override
    public String getPurpose() {
        return "Motorcycles are fast & efficient transportation";
    }
}
