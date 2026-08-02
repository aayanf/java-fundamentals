/* Aayan Faisal
    7/1/2026
    JDK 26
    Practice with creating class and setters and getters
 */
package customercreator;

public class CustomerCreator {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Aayan", 741);
        System.out.println("Name: "+customer1.getName());
        System.out.println("Credit Score: "+customer1.getCreditScore());
        System.out.println("Credit Rating: "+customer1.getCreditRating());
    }
}
