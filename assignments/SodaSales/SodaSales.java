/** Aayan Faisal
 *  7/7/2026
 *  JDK 26
 *  Record the sales for different sodas
 */

import javax.swing.JOptionPane;
public class SodaSales {

    public static void main(String[] args) {
        int sodaTypes=0;
        
        
        do {
        String response = JOptionPane.showInputDialog(null, "How many soda types do you want to sell?");
        sodaTypes = Integer.parseInt(response);
        } while(sodaTypes <= 0);
        
        String sodaNames[] = new String[sodaTypes];
        int sodaNum[] = new int[sodaTypes];
        
        
        for (int i=0; i < sodaTypes; i++){
            String response = JOptionPane.showInputDialog(null, "Enter the name of soda type "+ (i+1) + ": ");
            sodaNames[i]=response;
        }
        
        for (int i=0; i < sodaTypes; i++){
            int num;
            do{
                String response = JOptionPane.showInputDialog(null, "Enter the number of "+sodaNames[i]+" bottles sold:  ");
                num = Integer.parseInt(response);
            } while(num <= 0);
            sodaNum[i]=num;
        }
        
        int total = 0;
        int highest = sodaNum[0];
        int lowest = sodaNum[0];
        String highestName = sodaNames[0];
        String lowestName = sodaNames[0];
        
        for (int i=0; i < sodaTypes; i++){
            total += sodaNum[i];
        }
        
        for (int i=1; i < sodaTypes; i++){
            if(sodaNum[i]>sodaNum[i-1]){
                highest = sodaNum[i];
                highestName = sodaNames[i];
            }
            if(sodaNum[i]<sodaNum[i-1]){
                lowest = sodaNum[i];
                lowestName = sodaNames[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Total Sold: "+total+""
                + "\nHighest Sold: "+highestName+""
                + "\nLowest Sold: "+lowestName);
    }
}
