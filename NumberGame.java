import java.util.Random;
import java.util.Scanner;
public class NumberGame {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		
		int minNum=1;
		int maxNum=100;
		int maxAttempts=5;
		int gscore=0;
		
		System.out.println("Task 1 Number Game!");
		System.out.println("Guess the number between"+minNum+"and"+maxNum);
		
		boolean playagain=true;
		while(playagain) {
			int targetNumber=r.nextInt(maxNum-minNum+1)+minNum;
			boolean guessedCorrectly=false;
			
			for(int attempts=1;attempts<=maxAttempts;attempts++){
				System.out.println("Attempt"+ attempts+"/"+maxAttempts+":Enter your Guess: ");
				int guess=s.nextInt();	
				
				if(guess<targetNumber) {
					System.out.println("Too low! Try again");
				}else if(guess>targetNumber){
					System.out.println("Too High! Try again");
				}else{
					guessedCorrectly=true;
					System.out.println("Congrats! You guessed the correct number"+targetNumber);
					break;
				}	
			}
			if(!guessedCorrectly) {
				System.out.println("Sorry, you didn't guess the number. The correct number was:"+targetNumber);
			}
			gscore++;
			
			System.out.println("Do you want to play again? (yes/no)");
			String playChoice=s.next();
			
			if(!playChoice.equalsIgnoreCase("yes")) {
				playagain=false;
			}
		}
		System.out.println("Game Over! Your total score is:"+gscore);
		s.close();
	}

}
