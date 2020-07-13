package deliverable2;
import java.util.Scanner;
import java.util.Random;

public class Deliverable2 {
	

	public static void main(String[] args) {
		    int heads = 0;
	        int tails = 0;
	        int counter = 1;
	        int correctCount = 0;

	        double randNum = 0.0;

	        Scanner in = new Scanner(System.in);
	        Scanner headsOrTails = new Scanner(System.in);
	         
	        System.out.println("How many times will the coin be flipped? ");
	        int numberOfFlips = in.nextInt();
	        System.out.println("Will it flip more heads or tails?");
	        String headsOrTailsGuess = headsOrTails.nextLine();
	        System.out.println("you picked "  + headsOrTailsGuess);
	       
	         
	        while(counter <= numberOfFlips)
	        {
	            randNum = Math.random();

	             
	            if(randNum < .5) {
	                heads++;
	                System.out.println("heads");
	            }
	            
	            else {
	                tails++;
	                System.out.println("tails");
	             }
	            
	            counter++;      
	        }
	        
	    	if (headsOrTailsGuess.contentEquals("heads")) {
	    		correctCount=heads;
	    		headsOrTailsGuess = ("Heads was fliped " + correctCount + " times");
			}
	    	
			else if (headsOrTailsGuess.contentEquals("tails")) {
				correctCount= tails;
				headsOrTailsGuess = ("Tails was fliped " + correctCount + " times");
			}
	    	
	    	int correctPercent= (correctCount *100/ (counter - 1) ) ;
	        System.out.println("Number of Heads = " + heads);
	        System.out.println("Number of Tails = " + tails);
	        System.out.println("Your guess " + headsOrTailsGuess);
	        System.out.println("You got " + correctPercent +"% correct");
	}

}
