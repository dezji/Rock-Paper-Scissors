package com.dezji.rockpaperscissors;

import static java.lang.System.out;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		RPSGame rpsGame = new RPSGame();
		Scanner input = new Scanner(System.in);
		
		
		String rpsPrompt = "\nWhat would you like to play?\nRock, Paper, or Scissors?\nOr Exit?";
		String exitPrompt = "\nThank you for playing with me! Goodbye :)";
		
		
		out.println("Welcome to Rock, Paper, Scissors!");
		
		while(true) {
			out.println(rpsPrompt);
			String userInput = input.nextLine();
			
			
			if (userInput.toLowerCase().equals("rock") ||
				userInput.toLowerCase().equals("paper") ||
				userInput.toLowerCase().equals("scissors")) {
				
				String computerChoice = rpsGame.rock_paper_scissors();
				out.println(rpsGame.gamePersonality());
				
				String results = rpsGame.gameLogic(userInput, computerChoice);
				
				out.print(results);
				
				out.print("Would you like to play again?\nPress any key to play again or type no to exit.\n");
				userInput = input.nextLine();
				
				if (userInput.equals("no")) {
					out.println(exitPrompt);
					break;
				}
			}
			
			else if (userInput.toLowerCase().equals("exit")) {
				out.println(exitPrompt);
				break;
			}
			
			else
				out.println("Incorrect input, please try again.\n");
			
			
		}
		input.close();

	}

}
