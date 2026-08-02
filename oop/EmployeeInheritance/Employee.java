
public class Employee extends Person{
    private String employeeId;
    
    public Employee(){
        this.employeeId = "";
    }
    
    public Employee(String n, String p, String e, String i) {
        super(n,p,e);
        this.employeeId = i;
    }
    
    public String getEmployeeId(){
        return employeeId;
    }
    
    public void setEmployeeId(String i) {
        this.employeeId = i;
    }
    
    public String toString() {
        return super.toString() + "\nEmployee Number: " + employeeId;
    }
}
