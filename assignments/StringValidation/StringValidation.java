/** Aayan Faisal
 *  7/22/2026
 *  JDK 26
 *  String Validation.
 */
import java.util.Scanner;
public class StringValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean length = false;
        boolean containsAt = false;
        boolean hasNum = false;
        
        System.out.println("Enter your email: ");
        String email = input.nextLine();
        
        
        if (email.length() >= 15 && email.length() <= 25) 
            length = true;
        if (email.contains("@"))
            containsAt = true;
        for (int i = 0; i < email.length(); i++) {
            if (Character.isDigit(email.charAt(i)))
                    hasNum = true;
        }
        
        if (length && containsAt && hasNum)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
            
    }
    
}
