/** Aayan Faisal
 *  7/18/2026
 *  JDK 26
 *  Practice with creating classes, methods, setters and getters.
 */
public class MonthCreator {
    public static void main(String[] args) {
        Month numbers = new Month(2);
        Month month2 = new Month(10);
        System.out.println(numbers.toString());
        System.out.println(month2.toString());
        if (month2.equals(numbers))
            System.out.println(month2 + " is equal to " + numbers);
        else
            System.out.println(month2 + " is not equal to " + numbers);
    }
}
