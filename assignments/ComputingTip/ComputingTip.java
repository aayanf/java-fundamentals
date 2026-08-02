/* Aayan Faisal
    6/11/2026
    JDK 26
    Calculate tip amount
*/


package computingtip;

import javax.swing.JOptionPane;
import java.text.NumberFormat;
public class ComputingTip {
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog(null,"Enter the total bill");
        double bill=Double.parseDouble(input);
        input=JOptionPane.showInputDialog(null,"Enter the tip percentage"
                + "as a decimal");
        double percentage=Double.parseDouble(input);
        double tipAmount=bill*percentage;
        double percentageConverted=percentage*100;
        NumberFormat formatter=NumberFormat.getNumberInstance();
        JOptionPane.showMessageDialog(null, "Bill amount: " +formatter.format(bill)+"\nTip"
                + "percentage: "+percentageConverted+"%"+"\n"
                        + "Tip amount: "+formatter.format(tipAmount));
    }
    
}
