/*
 *  Aayan Faisal
 *  6/25/2026
 *  JDK 26
 *  Practice with methods
 */
import java.util.Scanner;
public class WritingCalculations {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Would you like to add, subtract, multiply, "
              + "or divide");
      String choice=input.next();
      System.out.println("Pick an integer: ");
      int n1=input.nextInt();
      System.out.println("Pick another integer: ");
      int n2=input.nextInt();
      int r1=Calculations.generateRandomNumber(n1, n2);
      int r2=Calculations.generateRandomNumber(n1, n2);
      switch(choice.toLowerCase()){
        case "add":
              System.out.println(r1+"+"+r2+"="+Calculations.add(r1, r2));
              break;
        case "subtract":
              System.out.println(r1+"-"+r2+"="+Calculations.subtract(r1, r2));
              break;
        case "multiply":
              System.out.println(r1+"*"+r2+"="+Calculations.multiply(r1, r2));
              break; 
        case "divide":
              System.out.println(r1+"/"+r2+"="+Calculations.divide(r1, r2));
              break;
        default:
            System.out.println("Invalid");
      }
    }
}
