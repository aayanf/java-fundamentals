/*
 * Aayan Faisal
 * 6/17/26
 * JDK 26
 * Addition quiz
 */

import javax.swing.JOptionPane;
public class AdditionQuiz {
    public static void main(String[] args) {
        String response;
        int questions = 0;
        double correct=0;
        int answer;
        do{
        response = JOptionPane.showInputDialog(null, "How many questions would you like to solve? ");
        questions = Integer.parseInt(response);
        }while(questions <= 0);
        do{
            for (int i = 0; i < questions; i++){
                int num1 = (int)(Math.random() * 50) + 1;
                int num2 = (int)(Math.random() * 50) + 1;
                response = JOptionPane.showInputDialog(null,num1+" + "+num2+" =?");
                answer = Integer.parseInt(response);
                if (answer == num1 + num2){
                    JOptionPane.showMessageDialog(null, "Correct!");
                    correct++;
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect!");
                }
            }
            double percentage = (correct/questions)*100;
            JOptionPane.showMessageDialog(null, "You got "+correct+" out of "+questions+" correct which is "+percentage+"%");
            if (percentage<70){
               JOptionPane.showMessageDialog(null, "You did not pass this addition quiz. Please try again.");
            }else
                JOptionPane.showMessageDialog(null, "You passed this addition quiz. Congratulations!");
        }while((correct/questions)*100<70);
    }
}
