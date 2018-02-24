

/*
* File Name: javagamev3.java
* Name: Karen Miller
* Date: October 18th 2017
* Description: This program is Game that Displays a menu: 1) See Rules 2) Play Game 3) Exit.
* 				Prompts the user to chose from the menu. If the user decide to start playing 
* 				Displays the rules. Display 5 sets of questions with answers.
* 			    Prompts the user for the correct answer. Add a point value to each question and include an accumulator to add to the total points when the user answers.
* */
import javax.swing.JOptionPane;
public class javagamev3 {

	public static void main(String[] args) {
	
				//Declare and initialize variables and constants
				boolean play = true;
				int userMenuChoice = 0, acumulator =0;
				
				String gamerName;
				String input;
				final String answer1 = "d"; 
				final String answer2 = "b";  
				final String answer3= "a"; 
				final String answer4= "b"; 
				final String answer5= "a"; 
				final String answer6= "b";
				final String answer7= "d";
				String mainMenu = "1) See Rules \n2) Play Game  \n3) Exit";
				String rules ="Rules:\n\t1) Multiple Choice Questions: Please select only one: a, b, c or d. \n2) Each correct answer will be rewarded with a point";
				String question1 =" 1)JVM stands for __________.  \n\na. Java Variable Machine \nb. Java Variable Method \nc. Java Virtual Method \nd. Java Virtual Machine";
				String question2="2)Which Scanner class method would you use to read a string as input?  \n\na. nextString \nb. nextLine \nc. readString \nd. getLine";
				String question3="3). You can use this class to display dialog boxes.  \n\na. JOptionPane \nb. BufferedReader \nc. InputStreamReader \nd. DialogBox";
				//This version #2 adds 2 more questions from chapter 3
				String question4="4)The if statement is an example of a _________.\n\na. sequence structure \nb. decision structure\nc. pathway structure \nd. class structure";
				String question5="5)This is a boolean variable that signals when some condition exists in the program.\na. flag\nb. signal \nc. sentinel \nd. siren";
				//This version #3 adds 2 more questions from chapter 4
				String question6="6)When a program is finished using a file, it should do this.\n\na. erase the file\nb. close the file\nc. throw an exception\nd. reset the read position";
				String question7="7)This class allows you to use the print and println methods to write data to a file.\n\na. File\nb. FileReader\nc. OutputFile\nd. PrintWriter";
				String pleaseEnter ="\"Please type the letter of your answer:\",";
				
				
				
				 
				
				//Display Intro
				
				
				JOptionPane.showMessageDialog(null, "   START GAME ", " WHO WANTS TO BE A JAVA PROGRAMMER?", JOptionPane.INFORMATION_MESSAGE);
				
				
				
				
				//Prompt the user for name
				
				gamerName = JOptionPane.showInputDialog("Please Enter your name");

				
				
				//Display main menu && prompt the user for menu choice
				
				// 1) See Rules
				// 2) Play Game
				// 3) Exit
		do 
		{
			userMenuChoice = Integer.parseInt(JOptionPane.showInputDialog(null,mainMenu, "MAIN MENU:Please Enter Your choice",JOptionPane.QUESTION_MESSAGE));


			//This version(v3) menu change to cases		
			switch (userMenuChoice) {
				
			case 1:
					//Display rules
					JOptionPane.showMessageDialog(null,rules," GAME ", JOptionPane.INFORMATION_MESSAGE);
					break;
				
			case 2:	
					//Display rules
					JOptionPane.showMessageDialog(null,rules," GAME ", JOptionPane.INFORMATION_MESSAGE);
	
					//Display Question and answers && Prompt the user for each answer choice
					//This version contains do while loop for each question
					//Question#1
					do {
						
						input = JOptionPane.showInputDialog(null, question1, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
					
						if(input.equalsIgnoreCase(answer1) ) 
						{
							acumulator++;
							JOptionPane.showMessageDialog(null, "CURRENT SCORE: " + acumulator + "/1"," Correct ", JOptionPane.INFORMATION_MESSAGE);
							break;
						}
						else if(input.equalsIgnoreCase("a")||input.equalsIgnoreCase("b")||input.equalsIgnoreCase("c")||input.equalsIgnoreCase("d") )
						{
							JOptionPane.showMessageDialog(null, "0 Point"," Incorrect answer", JOptionPane.INFORMATION_MESSAGE);
							break;
						}
						JOptionPane.showMessageDialog(null, "Please try again only options: a,b,c or d"," Incorrect answer ", JOptionPane.INFORMATION_MESSAGE);
		
					} while (true);
					
					//Question#2
					do {
						input = JOptionPane.showInputDialog(null, question2, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
				 	
						if(input.equalsIgnoreCase(answer2) ) 
						{
							acumulator++;
							JOptionPane.showMessageDialog(null, "CURRENT SCORE: " + acumulator + "/2"," Correct ", JOptionPane.INFORMATION_MESSAGE);
							break;
						}
						else if(input.equalsIgnoreCase("a")||input.equalsIgnoreCase("b")||input.equalsIgnoreCase("c")||input.equalsIgnoreCase("d") )
						{
							JOptionPane.showMessageDialog(null, "0 Point"," Incorrect answer", JOptionPane.INFORMATION_MESSAGE);
							break;
						}
						JOptionPane.showMessageDialog(null, "Please try again only options: a,b,c or d"," Incorrect answer ", JOptionPane.INFORMATION_MESSAGE);
		
					} while (true);
					
					
					//Question#3
					do {
						input= JOptionPane.showInputDialog(null, question3, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
						if(input.equalsIgnoreCase(answer3) ) 
						{
							acumulator++;
							JOptionPane.showMessageDialog(null, "CURRENT SCORE: " + acumulator + "/3"," Correct ", JOptionPane.INFORMATION_MESSAGE);	
							break;
						}
						else 
							JOptionPane.showMessageDialog(null, "Please try again"," Incorrect ", JOptionPane.INFORMATION_MESSAGE);
					
					} while (true);
					
					

					//Question#4
					do {
						input= JOptionPane.showInputDialog(null, question4, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
						if(input.equalsIgnoreCase(answer4) ) 
						{
							acumulator++;
							JOptionPane.showMessageDialog(null, "CURRENT SCORE: " + acumulator + "/4"," Correct ", JOptionPane.INFORMATION_MESSAGE);	
							break;
						}
						else if(input.equalsIgnoreCase("a")||input.equalsIgnoreCase("b")||input.equalsIgnoreCase("c")||input.equalsIgnoreCase("d") )
						{
							JOptionPane.showMessageDialog(null, "0 Point"," Incorrect answer", JOptionPane.INFORMATION_MESSAGE);
							break;
						}
						JOptionPane.showMessageDialog(null, "Please try again only options: a,b,c or d"," Incorrect answer ", JOptionPane.INFORMATION_MESSAGE);
		
					} while (true);
					
					
					//Question#5
					do {
						input= JOptionPane.showInputDialog(null, question5, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
						if(input.equalsIgnoreCase(answer5) ) 
						{
							acumulator++;
							JOptionPane.showMessageDialog(null, "FINAL SCORE: " + acumulator + "/5"," Correct ", JOptionPane.INFORMATION_MESSAGE);	
							break;
						}
						else if(input.equalsIgnoreCase("a")||input.equalsIgnoreCase("b")||input.equalsIgnoreCase("c")||input.equalsIgnoreCase("d") )
						{
							JOptionPane.showMessageDialog(null, "0 Point"," Incorrect answer", JOptionPane.INFORMATION_MESSAGE);
							break;
						}
						JOptionPane.showMessageDialog(null, "Please try again only options: a,b,c or d"," Incorrect answer ", JOptionPane.INFORMATION_MESSAGE);
		
					} while (true);
					
			
				
				//Question#6
				do {
					input= JOptionPane.showInputDialog(null, question6, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
					if(input.equalsIgnoreCase(answer6) ) 
					{
						acumulator++;
						JOptionPane.showMessageDialog(null, "FINAL SCORE: " + acumulator + "/6"," Correct ", JOptionPane.INFORMATION_MESSAGE);	
						break;
					}
					else if(input.equalsIgnoreCase("a")||input.equalsIgnoreCase("b")||input.equalsIgnoreCase("c")||input.equalsIgnoreCase("d") )
					{
						JOptionPane.showMessageDialog(null, "0 Point"," Incorrect answer", JOptionPane.INFORMATION_MESSAGE);
						break;
					}
					JOptionPane.showMessageDialog(null, "Please try again only options: a,b,c or d"," Incorrect answer ", JOptionPane.INFORMATION_MESSAGE);
		
				} while (true);
				
			
			
			//Question#7
			do {
				input= JOptionPane.showInputDialog(null, question7, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
				if(input.equalsIgnoreCase(answer7) ) 
				{
					acumulator++;
					JOptionPane.showMessageDialog(null, "FINAL SCORE: " + acumulator + "/7"," Correct ", JOptionPane.INFORMATION_MESSAGE);	
					break;
				}
				else if(input.equalsIgnoreCase("a")||input.equalsIgnoreCase("b")||input.equalsIgnoreCase("c")||input.equalsIgnoreCase("d") )
						{
							JOptionPane.showMessageDialog(null, "0 Point"," Incorrect answer", JOptionPane.INFORMATION_MESSAGE);
							break;
						}
				JOptionPane.showMessageDialog(null, "Please try again only options: a,b,c or d"," Incorrect answer ", JOptionPane.INFORMATION_MESSAGE);
		
			} while (true);
			
		break;
				
			case 3:
				 play = false;
				 break;
				 
			default:
				 JOptionPane.showMessageDialog(null, "Please try again"," INVALID ENTRY  ", JOptionPane.INFORMATION_MESSAGE);
				break;
				
				}
				
	} while (play);
				
				JOptionPane.showMessageDialog(null, " You have exit the game...see you later","EXIT GAME ", JOptionPane.INFORMATION_MESSAGE);
				
				

			}

	


	}


