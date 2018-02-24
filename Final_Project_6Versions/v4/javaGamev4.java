package v4 

/*
 * javaGamev4.java
 * October 10, 2017
 * Author: Karen Miller
 * Description: Program which prompts the user for the correct answers of 7 questions
 *	     and display the answers back to the user.
 *	     
 *Version 3 updates:
 *		Read Questions from a file questions.txt
 *		Store high score to highScore.txt
 *		Determine if the user is correct/incorrect after each questions
 *		Display whether or not the user is correct
 *		Points system and an accumulator added to each question, which shows total points after the user answers a question.  
 *		
 */


import java.io.* 
import java.util.* 
import javax.swing.JOptionPane  //Needed for Dialog box


public class javaGamev4 {

	private static Scanner userIn  

	public static void main(String[] args) throws IOException {
		//Declare and initialize variables
		String name, menu 
		char menuChoice 
		int total = 0 
		final int NUM_OF_QUESTIONS = 7 
		
		
		
		//Declare constant
		final String rules = 
			"1. You must get a question right to move on to next question.\n" +
			"2. If you answer a question incorrectly your total points will be shown and it's game over.\n" +
			"3. To win you must get highest ranking score.\n" +
			"4. You can answer each question by the letters (a, b, c, d).\n" +
			"5. Answers to questions  are not case sensitive." 
		
		//Declare a scanner object
		userIn = new Scanner(System.in) 
						
		
		//Display intro
		JOptionPane.showMessageDialog(null,"\tWho wants to be a Java Progammer? v.4\n=================================") 
				
		//Prompt user for name
		name = JOptionPane.showInputDialog(null,"Enter your name here: ","Who wants to be a Java Progammer? v.4",JOptionPane.INFORMATION_MESSAGE) 
		
		//Display name back to user with a greeting
		JOptionPane.showMessageDialog(null,"Hello " + name + 
				", Welcome to who wants to be a Java Programmer!!" + "\n===================================================","Who wants to be a Java Progammer? v.4 ", +
				JOptionPane.INFORMATION_MESSAGE) 
		
		//Validating Main Menu
		do {		
		//Display Main Menu	
		menu = JOptionPane.showInputDialog(null,"Please choose a Menu choice\n1) See Rules\n2) Play Game\n3) Exit", "Menu", JOptionPane.INFORMATION_MESSAGE) 
		menuChoice = menu.charAt(0) 
		
			switch(menuChoice) {
			case '1':
				//Display rules of the game
				JOptionPane.showMessageDialog(null, rules, "Game Rules", JOptionPane.INFORMATION_MESSAGE) 
				break 
			case '2':
				// The name of the file to open.
				File fileName = new File("questions.txt") 
				
				Scanner filein = new Scanner(fileName)  //replace System.in with the name of the File object
				
				int count = 0 
				total = 0 
				
				
				for (int i = 0  i < NUM_OF_QUESTIONS  i++)
				//while(filein.hasNext())
				{
					// Read File
					String question = filein.nextLine() 
					String answerA = filein.nextLine() 
					String answerB = filein.nextLine() 
					String answerC = filein.nextLine() 
					String answerD = filein.nextLine() 
					String correctAnswer = filein.nextLine() 
					int pointValue = Integer.parseInt(filein.nextLine()) 	
										
					// Set flag
					boolean validated = false 	
					
					do {
						
						// Print Question 
						System.out.println(question+"\n"+answerA+"\n"+answerB+"\n"+answerC+"\n"+answerD+"\n") 	
						
						// Get user answer
						System.out.print("Please select your answer: ") 
						String answer = userIn.nextLine() 
						
						// Print line for formatting
						System.out.println() 
	
				
						if(answer.equalsIgnoreCase(correctAnswer)) {
							System.out.println(answer + " is correct") 
							total += pointValue 
							System.out.println("Current Score:" + total + "\n") 
							validated = true 
						}
						else if(answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c")|| answer.equalsIgnoreCase("d")) {
							System.out.println(answer + " is incorrect\n") 
							System.out.println("Current Score:" + total + "\n") 
							validated = true 
						}
						else {
							
							System.out.println(answer + " is not valid\nPlease try again\n") 
							
							// Print line for formatting
							System.out.println() 
						}
					} while (!validated) 

					
					// Read space in file between questions and print for formatting
					System.out.println(filein.nextLine()) 
					
				}		// end of questions
				
				// close question file 
				filein.close() 
						
				int currentScore = 0 
						
				// The name of the file to open.
				File scoreFileName = new File("highScore.txt") 
						
				Scanner scoreFileIn = new Scanner(scoreFileName)  //replace System.in with the name of the File object
							
				currentScore = scoreFileIn.nextInt() 
				scoreFileIn.close() 
						
				if (total >= currentScore ) {
					
					PrintWriter scorefile = new PrintWriter(scoreFileName)  //write to file
							
					scorefile.println(total) 
					// display high score to player
					System.out.println("\nCongratulations " + name + "\n") 
					System.out.println("======== High Score: " + total +  " ==========") 
					scorefile.close()  //close file
				}
				else if(total < currentScore) {
							//System.out.println(currentScore + " is the highest score") 
							System.out.println("\nNice play " + name + "\n") 
							System.out.println("Your Score: " + total) 
				}
						
				break 
	
		case '3':
				//Display good bye message
				JOptionPane.showMessageDialog(null, "Good bye " + name + "\nI hope you enjoyed this game!", "Who wants to be a Java Progammer? v.4",JOptionPane.INFORMATION_MESSAGE) 
				break 
			}
				
	}while(menuChoice != '3') 
	
	
	
	}
}

