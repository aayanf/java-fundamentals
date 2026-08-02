/*
 Aayan Faisal 6/12/2026
 This program will break change into correct coins
 JDK 26
 */

import javax.swing.JOptionPane;
public class MoneyChanger {
    public static void main(String[] args) {
        int cents, centsLeft, dollars, quarters, dimes, nickels, pennies;
        String answer = JOptionPane.showInputDialog(null, "Enter amount of change");
        cents = (int)(Double.parseDouble(answer)*100);
        dollars = cents/100;
        centsLeft = cents%100;
        quarters = centsLeft/25;
        centsLeft = centsLeft %25;
        dimes = centsLeft/10;
        centsLeft = centsLeft%10;
        nickels = centsLeft/5;
        centsLeft = cents%5;
        pennies = centsLeft;
        JOptionPane.showMessageDialog(null, "Total Cents: "+cents
                +"\nDollars: " +dollars
                +"\nQuarters: "+quarters
                +"\nDimes: " +dimes
                +"\nNickels: "+nickels
                +"\nPennies: "+pennies);
    }
    
}
