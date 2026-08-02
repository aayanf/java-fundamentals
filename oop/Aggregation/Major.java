
public class Major {
    private String name;
    private int reqCredits;
    
    public Major(String n, int c){
        this.name = n;
        this.reqCredits = c;
    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public void setReqCredits(int c) {
        if (c > 0)
            this.reqCredits = c;
    }
    public String getName() {
        return name;
    }
    
    public int getReqCredits() {
        return reqCredits;
    }
    
    public String toString() {
        return "Major: " + name + "\nRequired Credits: " + reqCredits;
    }
}
