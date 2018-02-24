package javav5;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane; //Needed for Dialog box
public class v5 {

	

/*
 * javaGamev5.java
 * November 10, 2017
 * Authors: Karen Miller
 * Description: Program which prompts the user for the correct answers of 7 questions
 *	     and display the answers back to the user.
 *	     
 *Version 5 updates:
 *		Read Questions from a file questions.txt
 *		Store high score to highScore.txt
 *		Determine if the user is correct/incorrect after each questions
 *		Display whether or not the user is correct
 *		Points system and an accumulator added to each question, which shows total points after the user answers a question.  
 *		
 */






	

	public static void main(String[] args) throws IOException {
		//Declare variables
		char menuChoice;
		String question = "", answerA = "", answerB = "", answerC = "", answerD = "", name;
		char correctAnswer = ' '; 
		int userScore = 0, highScore = 0, pointValue = 0;
		
		//Display intro
		JOptionPane.showMessageDialog(null,"\tWho wants to be a Java Progammer? v.5\n=================================");
						
		//Prompt user for name
		name = JOptionPane.showInputDialog(null,"Enter your name here: ","Who wants to be a Java Progammer? v.5",JOptionPane.INFORMATION_MESSAGE);
				
		//Display name back to user with a greeting
		JOptionPane.showMessageDialog(null,"Hello " + name + 
			", Welcome to who wants to be a Java Programmer!!" + "\n===================================================","Who wants to be a Java Progammer? v.5 ", +
				JOptionPane.INFORMATION_MESSAGE);
		
		do{
			menuChoice = displayMenu();
		 
		 switch(menuChoice) {
		 case '1':
			 displayRules();
		 break;
		 case '2':
			 userScore = processQuestion(question, answerA, answerB, answerC, answerD, correctAnswer, pointValue);
			 highScore = readInHighScore();
			 compareScore( highScore, userScore);
		break;
		
		 case '3':
				//Display good bye message
				JOptionPane.showMessageDialog(null, "Good bye \nI hope you enjoyed this game!", "Who wants to be a Java Progammer? v.5",JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}while(menuChoice != '3');
	}
	
	
		
	//return type: character
	//parameters: none
	//Description: Display main menu
	public static char displayMenu() {
		String menu = JOptionPane.showInputDialog(null,"Please choose a Menu choice\n1) See Rules\n2) Play Game\n3) Exit", "Menu", JOptionPane.INFORMATION_MESSAGE);
		char menuChoice = menu.charAt(0);
		
		return menuChoice;
	}
	
	
	//return type: void
	//parameters: Display Rules of the game
	//Description: Display the rules of the game
	public static void displayRules() {
		//Declare constant
		final String rules = 
		"1. You must get a question right to move on to next question.\n" +
		"2. If you answer a question incorrectly your total points will be shown and it's game over.\n" +
		"3. To win you must get highest ranking score.\n" +
		"4. You can answer each question by the letters (a, b, c, d).\n" +
		"5. Answers to questions  are not case sensitive.";
		
		JOptionPane.showMessageDialog(null, rules, "Game Rules", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	//return type: integer
	//parameters: 7 parameters (q1, ansA, asnsB, ansC, ansD, correctAns, pointValue)
	//Description: Read questions from the questions.txt into the dialog boxes
	public static int processQuestion(String q1, String ansA, String ansB, String ansC, String ansD, char correctAns, int pointValue) throws FileNotFoundException {
		
		
		// The name of the file to open.
		File fileName = new File("questions.txt");
		
		Scanner filein = new Scanner(fileName); //replace System.in with the name of the File object
		int total =  pointValue;
		final int NUM_OF_QUESTIONS  = 8;
		
		for (int i = 0; i < NUM_OF_QUESTIONS ; i++) {
				// Read File
				 q1 = filein.nextLine();
				 ansA = filein.nextLine();
				 ansB = filein.nextLine();
				 ansC = filein.nextLine();
				 ansD = filein.nextLine();
				 correctAns = filein.nextLine().charAt(0);
				 pointValue = Integer.parseInt(filein.nextLine());	
		
							
				// Set flag
				boolean validated = false;	
				
				do {
					
					String ans = JOptionPane.showInputDialog(null, q1+"\n"+ansA+"\n"+ansB+"\n"+ansC+"\n"+ansD+"\n");	
					
					
					// Get user answer
					char answer = ans.charAt(0);
					
					// Print line for formatting
					System.out.println();

			
					if(answer == correctAns) {
						JOptionPane.showMessageDialog(null, answer + " is correct");
						total += pointValue;
						displayScore(total);
						validated = true;
					}
					else if(answer == 'a' || answer == 'b' || answer == 'c' || answer == 'd') {
						JOptionPane.showMessageDialog(null, answer + " is incorrect\n");
						displayScore(total);
						validated = true;
					}
					else {
						
						JOptionPane.showMessageDialog(null,answer + " is not valid\nPlease try again\n");
						
						// Print line for formatting
						System.out.println();
					}
				} while (!validated);

		
				// Read space in file between questions and print for formatting
				System.out.println(filein.nextLine());
				
		}
			
			// close question file 
			filein.close();
			return total;
	}
	
	
	//return type: integer
	//parameters: none
	//Description: Read highScore into text file
	public static int readInHighScore() throws FileNotFoundException  {

		int currentScore = 0;
		
		// The name of the file to open.
		File scoreFileName = new File("highScore.txt");
				
		Scanner scoreFileIn = new Scanner(scoreFileName); //replace System.in with the name of the File object
		
		//String playerName = scoreFileIn.nextLine();
		currentScore = scoreFileIn.nextInt();
		scoreFileIn.close();
		
		return currentScore;
	}
	
	//return type: void
	//parameters: 2 integer parameters (highScore, userScore)
	//Description: compare userScore and highScore 
	public static void compareScore(int highScore, int userScore) throws FileNotFoundException {
		if (userScore >= highScore ) {
			
			PrintWriter scorefile = new PrintWriter("highScore.txt"); //write to file
					
			//scorefile.println(name);
			scorefile.println(userScore);
			// display high score to player
			//System.out.println("\nCongratulations " + name + "\n");
			JOptionPane.showMessageDialog(null,"======== High Score: " + userScore +  " ==========");
			scorefile.close(); //close file
		}
		else if(userScore < highScore) {
					//System.out.println(currentScore + " is the highest score");
					//System.out.println("\nNice play " + name + "\n");
			JOptionPane.showMessageDialog(null,"Your Score: " + userScore);
					//System.out.println(playerName + "score is the highest score: " + currentScore);
					
		}
	}
	
	//return type: void
	//parameters: 1 parameter(score)
	//Description: Display the current score as the user is playing through the game
	public static void displayScore(int score) {
		JOptionPane.showMessageDialog(null,"Current Score:" + score + "\n");
	}
}

