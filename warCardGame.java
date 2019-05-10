import java.util.Scanner;
import java.util.Random;

public class warCardGame { 
	 public static void main(String[] StartGame) { 
		 //initializing as needed and coming back to add as needed
		 Scanner scan = new Scanner(System.in);
		 Random rando = new Random();
		 cardDeck deck = new cardDeck();
		 
		 //starting the game
		 int input = 0 ,computerWins, userWins;
		 
		 //prompting for card and reading it back out to them
		 while (input != 2) {
			 System.out.println("Press 1 to play.");
			 System.out.println("Press 2 to exit.");
			 input = scan.nextInt();
			 if (input == 1) {
				 System.out.println("Enter the value of your card");
				 int userCardNum = scan.nextInt();
				 	if (userCardNum >= 0 && userCardNum <= 51) {
				 		deck.systemTurn(userCardNum);
				 		
				 	}
				 	else {
				 		System.out.println("Invalid Card.");
				 	}
				 	
			 }
		 }
		 //Score for when game is over and user exits
	
		 System.out.println("Total computer wins: " + cardDeck.computerWins);
		 System.out.println("Total user wins: " + cardDeck.userWins);
		 
		 if (cardDeck.computerWins > cardDeck.userWins) {
			 System.out.println("The computer won the most games.");
		 }
			 else if (cardDeck.computerWins == cardDeck.userWins) {
				 System.out.println("It is a tie.");
			 }
				 else {
					 System.out.println("You won the most games.");
				 }
			 
		 }
	 }

//making card deck
class cardDeck { 
	public static int computerWins = 0, userWins = 0;
	
	String suits[] = { 
			"Spades", "Hearts", "Diamonds", "Clubs"
	};
	
	String cardSuit(int userCard) {
		int suit = userCard / 13;
		int rank = userCard % 13;
		String output = "" ;
		switch (rank) {
		case 0:

			output = "Ace of " + suits[suit];

			break;

			case 10:

			output = "Jack of " + suits[suit];

			break;

			case 11:

			output = "Queen of " + suits[suit];

			break;

			case 12:

			output = "King of " + suits[suit];

			break;

			default:

			output = rank + 1 + " of " + suits[suit];

			break;

			}

			return output;
		}
	
	int systemTurn(int userRank) {
			Random rando = new Random();
			int computerRank = rando.nextInt(52);
			
			System.out.println("You pulled " + userRank + ". Which is the " + cardSuit(userRank));
			System.out.println("The computer pulled " + computerRank + ". Which is the " + cardSuit(computerRank));
			
			if (computerRank > userRank) {
				computerWins++;
			}
			else {
				userWins++;
	
			}
			return computerRank;
		}
	}


	
