

/*
 * javaGamev5.java
 * November 10, 2017
 * Author: Karen Miller
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


import java.io.*;
import java.util.*;
import javax.swing.JOptionPane; //Needed for Dialog box


public class javaGameV6 {
	
	// allocates memory for 10 integers
	static final int SIZE = 10, scoreSIZE = 3;
	
	public static void main(String[] args) throws IOException {
	  
	   String [] questionArray = new String [SIZE];
       String [] answerA = new String [SIZE];
       String [] answerB = new String[SIZE];
       String []answerC =  new String[SIZE];
       String []answerD =  new String[SIZE]; 
       char []correctAnswer  = new char[SIZE]; 
       String []pointValue = new String[SIZE];
       
       //
       String[] name = new String [scoreSIZE];
    	   String [] scores = new String[scoreSIZE];
    	   int [] scoresInt = new int[scoreSIZE];
    	   
       
       
		
		//Declare variables
		char menuChoice;
		int playerScore = 0;
		String userName;
		
		//Declare a scanner object
		//Scanner	userIn = new Scanner(System.in);
		
		
		//Display intro
		JOptionPane.showMessageDialog(null,"\tWho wants to be a Java Progammer? v.6\n=================================");
						
		//Prompt user for name
		userName = JOptionPane.showInputDialog(null,"Enter your name here: ","Who wants to be a Java Progammer? v.5",JOptionPane.INFORMATION_MESSAGE);
				
		//Display name back to user with a greeting
		//JOptionPane.showMessageDialog(null,"Hello " + name + 
			//", Welcome to who wants to be a Java Programmer!!" + "\n===================================================","Who wants to be a Java Progammer? v.6 ", +
			//	JOptionPane.INFORMATION_MESSAGE);
		
		do{
			menuChoice = displayMenu();
		 
		 switch(menuChoice) {
		 case '1':
			 displayRules();
		 break;
		 case '2':
			 playerScore = processQuestion(questionArray, answerA, answerB, answerC, answerD, correctAnswer, pointValue);
			 ReadHighScores(name, scores, scoresInt);
			 compareScores( playerScore, userName, name, scoresInt);
			 UpdateHighScores(name, scoresInt);
		break;
		
		 case '3':
				//Display good bye message
				JOptionPane.showMessageDialog(null, "Good bye \nI hope you enjoyed this game!", "Who wants to be a Java Progammer? v.6",JOptionPane.INFORMATION_MESSAGE);
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
	public static int processQuestion(String questionArray[], String ansA[], String ansB[], String ansC[], String ansD[], char correctAns[], String pointValue[]) throws FileNotFoundException {
		
		
		// The name of the file to open.
		File fileName = new File("questions.txt");
		
		Scanner filein = new Scanner(fileName); //replace System.in with the name of the File object
		int total =  0;
		final int NUM_OF_QUESTIONS  = 10;
		
		for (int i = 0; i < NUM_OF_QUESTIONS ; i++) {
				// Read File
			questionArray[i] = filein.nextLine();
			ansA[i] = filein.nextLine();
			ansB[i] = filein.nextLine();
			ansC[i] = filein.nextLine();
			ansD[i] = filein.nextLine();
			correctAns[i] = filein.nextLine().charAt(0);
			pointValue[i] =filein.nextLine();	
			int gameScore =  Integer.parseInt(pointValue[i]);
							
			// Set flag
			boolean validated = false;	
			
			do {
				
				String ans = JOptionPane.showInputDialog(null, questionArray[i]+"\n"+ansA[i]+"\n"+ansB[i]+"\n"+ansC[i]+"\n"+ansD[i]+"\n");	
				
				
				// Get user answer
				
				char answer = ans.charAt(0);
				
				// Print line for formatting
				System.out.println();

		
				if(answer == correctAns[i]) {
					total += gameScore;
					JOptionPane.showMessageDialog(null, answer + " is correct: ");
					displayScore(total);
					validated = true;
				}
				else if(answer == 'a' || answer == 'b' || answer == 'c' || answer == 'd') {
					
					JOptionPane.showMessageDialog(null, answer + " is incorrect: ");
					//displayScore(total);
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
	public static void ReadHighScores(String highNames[], String scores[], int scoresInt[]) throws FileNotFoundException {
		
		// The name of the file to open.
		File scoreFileName = new File("highScore.txt");
				
		Scanner scoreFileIn = new Scanner(scoreFileName); //replace System.in with the name of the File object
		
		for(int i = 0; i < scoresInt.length;i++) {
			highNames[i] = scoreFileIn.nextLine();
			scores[i] = scoreFileIn.nextLine();
			
			scoresInt[i] = Integer.parseInt(scores[i]);
		}
		scoreFileIn.close();
	}
	
	//return type: void
	//parameters: 2 integer parameters (highScore, userScore)
	//Description: compare userScore and highScore 
	public static void compareScores(int userScore, String userName, String[] name, int[] scoresInt) throws FileNotFoundException {
		if (userScore > scoresInt[0] ) {
			name[2] = name[1];
			scoresInt[2] = scoresInt[1];
			name[1] = name[0];
			scoresInt[1] = scoresInt[0];
			name[0] = userName;
			scoresInt[0] = userScore;
			JOptionPane.showMessageDialog(null,"======== High Score ==========\n" + userName + ": " + userScore);
		}
		else if(userScore > scoresInt[1]) {
			name[1] = name[2];
			scoresInt[1] = scoresInt[2];
			name[1] = userName;
			scoresInt[1] = userScore;
			JOptionPane.showMessageDialog(null,"Your Score: \n" + userName + ": " + userScore);
		}
		else if(userScore > scoresInt[2]) {
			name[2] = userName;
			scoresInt[2] = userScore;
			JOptionPane.showMessageDialog(null,"Your Score: \n" + userName + ": " + userScore);
		}
	}
	
	//return type: void
	//parameters: 1 parameter(score)
	//Description: Display the current score as the user is playing through the game
	public static void displayScore(int score) {
		JOptionPane.showMessageDialog(null,"Current Score:" + score + "\n");
	}
	
	//return type: void
	//parameters:
	//purpose:
	public static void UpdateHighScores(String name[], int scoresInt[]) throws FileNotFoundException {
		PrintWriter scorefile = new PrintWriter("highScore.txt"); //write to file
		for (int i = 0; i < scoresInt.length; i++) {
			scorefile.println(name[i]);
			scorefile.println(scoresInt[i]);	
		}
		scorefile.close();
	}
}
