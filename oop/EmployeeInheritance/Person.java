public class Person {
    private String name;
    private String phoneNum;
    private String email;
    
    public Person() {
        this.name = "";
        this.phoneNum = "";
        this.email = "";
    }
    
    public Person(String n, String p, String e){
        this.name = n;
        this.phoneNum = p;
        this.email = e;
    }
    
    public void setName(String n){
        this.name = n;
    }
    public void setPhoneNum(String p) {
        this.phoneNum = p;
    }
    public void setEmail(String e) {
        this.email = e;
    }
    
    public String getName () {
        return name;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public String getEmail() {
        return email;
    }
    
    public String toString() {
        return "Name: " + name + "\nPhone: " + phoneNum + "\nEmail: " + email;
    }
}
