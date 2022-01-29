package com.dezji.rockpaperscissors;

public class RPSGame implements Methods {

	public String rock_paper_scissors() {
		
		String decision = "";
		switch ((int) (Math.random() * 3)) {
		case 0: 
			decision = "rock";
			break;
		case 1:
			decision = "paper";
			break;
		case 2:
			decision = "scissors";
			break;
		}
		return decision;
	}


	public String gameLogic(String userChoice, String computerChoice) {
		String beginning = "\nYou played " + userChoice + " and the AI played " + computerChoice + ". ";
		String tied = "The results are tied!\n\n";	
		String win = "Congratulations player, you win!\n";
		String loss = "Unfortunately, you lose. Better luck next time!\n";
		
		String winningPhrases = "";
		switch ((int) (Math.random() * 3)) {
		case 0: 
			winningPhrases = "Winner, winner! Chicken dinner! Who's buying?\n\n";
			break;
		case 1:
			winningPhrases = "Nice one, I have to hand it to ya. I didn't think you were gonna win.\n\n";
			break;
		case 2:
			winningPhrases = "*Slow clap* Brb I'm gonna go cry now.\n\n";
			break;
		}
		
		String losingPhrases = "";
		switch ((int) (Math.random() * 3)) {
		case 0: 
			losingPhrases = "Wow, I just witnessed someone taking the biggest L of their life. Hint hint, it's you.\n\n";
			break;
		case 1:
			losingPhrases = "This just in, looks like there's NOT a new champion in town!\n\n";
			break;
		case 2:
			losingPhrases = "Cough, cough, loser. Omg, who said that??\n\n";
			break;
		}
		
		if (userChoice.equals(computerChoice)) {
			return beginning + tied;
		}
		
		else if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
			return beginning + win + winningPhrases;
		}
		
		else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
			return beginning + win + winningPhrases;
		}
		
		else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
			return beginning + win + winningPhrases;
		}
		
		else if (computerChoice.equals("paper") && userChoice.equals("rock")) {
			return beginning + loss + losingPhrases;
		}
		
		else if (computerChoice.equals("scissors") && userChoice.equals("paper")) {
			return beginning + loss + losingPhrases;
		}
		
		else if (computerChoice.equals("rock") && userChoice.equals("scissors")) {
			return beginning + loss + losingPhrases;
		}
		
		return "unknown error occured";
	}

	public String gamePersonality() {
		String personality = "";
		
		switch ((int) (Math.random() * 4)) {
		case 0:
			personality = "\nWow, what an amazing choice! Let's see if you win!";
			break;
		case 1:
			personality = "\nOof, I would have NOT choosen that but hey, you do you fam.";
			break;
		case 2:
			personality = "\n...Interesting choice there fella.";
			break;
		case 3:
			personality = "\nHey man, if that choice makes you win, I'm gonna take some notes!";
			break;
		}
		
		return personality;
	}
}



