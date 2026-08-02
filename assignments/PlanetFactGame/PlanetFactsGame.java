/**
 * Aayan Faisal
 * 6/25/2026
 * JDK 26
 * Generates random planet facts and asks the user if it's true or false
 */

import java.util.Scanner;

public class PlanetFactsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain = "yes";
        
        while(playAgain.equalsIgnoreCase("yes")){
            int num = (int) (Math.random()*10+1);
            boolean answer = switchPlanet(num);
            System.out.println("True or False?");
            String response = input.next();
            compare(response, answer);
            System.out.println("Play again? (yes or no)");
            playAgain = input.next();
        }
    }
    
       public static boolean switchPlanet(int a) {
        switch (a) {
            case 1:
                System.out.println("Earth is the 3rd planet from the Sun.");
                return true;
            case 2:
                System.out.println("Mars is the 4th planet from the Sun.");
                return true;
            case 3:
                System.out.println("Jupiter is the largest planet in the Solar System.");
                return true;
            case 4:
                System.out.println("Earth is the densest planet in the Solar System.");
                return true;
            case 5:
                System.out.println("Saturn has rings made of ice and rock.");
                return true;
            case 6:
                System.out.println("Venus is the closest planet to the Sun.");
                return false;
            case 7:
                System.out.println("Mars has the largest ocean in the Solar System.");
                return false;
            case 8:
                System.out.println("Neptune is the hottest planet in the Solar System.");
                return false;
            case 9:
                System.out.println("Jupiter has only 2 moons.");
                return false;
            case 10:
                System.out.println("Earth is the 5th planet from the Sun.");
                return false;
            default:
                return false;
        }
    }
    
    public static void compare(String response, boolean answer){
        boolean userAnswer = response.equalsIgnoreCase("true");
        if(userAnswer == answer)
            System.out.println("Correct!");
        else
            System.out.println("Incorrect.");
    }
}
