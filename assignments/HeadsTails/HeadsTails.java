/**
 * Aayan Faisal
 * 6/16/2026
 * JDK 26
 * Tally heads and tails based on coin tosses f
 */
import java.util.Scanner;
public class HeadsTails {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many times would like to flip the coin?");
        int times=input.nextInt();
        int headCounter=0;
        int tailCounter=0;
        for(int i=0; i<times; i++){
            double r=Math.random();
            if(r>=.5){
                System.out.println("Heads");
                headCounter++;
            }else{
                System.out.println("Tails");
                tailCounter++;
            }
        }
        System.out.println("Number of heads: "+headCounter+
                "\nNumber of tails: "+tailCounter);
    }
    
}
