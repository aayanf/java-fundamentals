/*
    Aayan Faisal
    8/2/2026
    JDK 26
    Employee class extend Person class
*/
public class EmployeeInheritance {

    public static void main(String[] args) {
        Person[] people = {new Person("Aayan","555-555-555","a@gmail.com"),
                          new Person("Vanessa","555-555-555","v@gmail.com"),
                          new Employee("John Pork","555-555-555","j@gmail.com", "1"),
                          new Employee("Tim Cheese", "555-555-555", "t@gmail.com", "2")};
        for(Person p : people) {
            System.out.println(p);
        }
    }
}
