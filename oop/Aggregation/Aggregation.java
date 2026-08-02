/** Aayan Faisal
 *  7/15/2025
 *  JDK 26
 *  Example of aggregation
 */
public class Aggregation {
    public static void main(String[] args) {
        Major cs = new Major("Computer Science", 60);
        Major me = new Major("Mechanical Engineering", 55);
        
        System.out.println("Name: " + cs.getName());
        System.out.println("Required Credits: " + cs.getReqCredits());
        System.out.println("Name: " + me.getName());
        System.out.println("Required Credits: " + me.getReqCredits());
        
        Student s1 = new Student("Aayan", cs);
        Student s2 = new Student("Vanessa", cs);
        System.out.println(s1);
        System.out.println("Are students equal? " + s1.equals(s2));
    }
    
}
