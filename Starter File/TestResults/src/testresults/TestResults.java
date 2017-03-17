package testresults;
import java.util.Scanner;

/**
 *
 * @author Zach Murphy
 */
public class TestResults {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input your test score #1: ");
        double scoreOne = input.nextDouble();
        
        System.out.println("Please input your test score #2: ");
        double scoreTwo = input.nextDouble();
        
        System.out.println("Please input your test score #3: ");
        double scoreThree = input.nextDouble();
        
        double avg = (scoreOne + scoreTwo + scoreThree) /3 ;
        
        if (avg <60){
            System.out.println("Your grade is  F.");
        }
        else if (avg < 70){
            System.out.println("Your grade is  D.");
        }
        else if (avg < 80){
            System.out.println("Your grade is C.");
        }
        else if (avg < 90){
            System.out.println("Your score is B.");
        }
        else{
            System.out.println("Your score is A.");
        }
        
    }
    
}
