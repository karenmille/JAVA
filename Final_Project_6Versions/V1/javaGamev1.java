

/*
* File Name: javagamev1.java
* Name: Karen Miller
* Date: October 18th 2017
* Description: This program is Game that Displays a menu: 1) See Rules 2) Play Game 3) Exit.
* 				Prompts the user to chose from the menu. 
				If the user decide to start playing 
* 				Displays the rules. Display 3 sets of questions with answers.
* 			    Prompt the user for each menu choice
* */

import javax.swing.JOptionPane;
public class javagamev1 {

	public static void main(String[] args) {
	
	//Declare and initialize variables and constants
				
				int userMenuChoice = 0, acumulator =0;
				
				String gamerName, answer1, answer2, answer3, answer4, answer5;
				String mainMenu = "1) See Rules \n2) Play Game  \n3) Exit";
				String rules ="Rules:\n\t1) Multiple Choice Questions: Please select only one: a, b, c or d. \n2) Each correct answer will be rewarded with a point";
				String question1 =" 1) JVM stands for __________.  \n\na. Java Variable Machine \nb. Java Variable Method \nc. Java Virtual Method \nd. Java Virtual Machine";
				String question2="2 )Which Scanner class method would you use to read a string as input?  \n\na. nextString \nb. nextLine \nc. readString \nd. getLine";
				String question3= "3) You can use this class to display dialog boxes.  \n\na. JOptionPane \nb. BufferedReader \nc. InputStreamReader \nd. DialogBox";
				String pleaseEnter ="\"Please type the letter of your answer:\",";
				
				//Display Intro
				
				
				JOptionPane.showMessageDialog(null, "   START GAME ", " WHO WANTS TO BE A JAVA PROGRAMMER?", JOptionPane.INFORMATION_MESSAGE);
				
				//Prompt the user for name
				
				gamerName = JOptionPane.showInputDialog("Please Enter your name");

				//Display main menu && prompt the user for menu choice
				
				
	
				userMenuChoice = Integer.parseInt(JOptionPane.showInputDialog(null,mainMenu, "MAIN MENU:Please Enter Your choice",JOptionPane.QUESTION_MESSAGE));

				//Structure for the menu
				//regarless of the user imput show the rules
		
				
				if (userMenuChoice ==1 )
				{
					//Display rules
					JOptionPane.showMessageDialog(null,rules," GAME ", JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if (userMenuChoice ==2)
				{
					//Display rules
					 JOptionPane.showMessageDialog(null,rules," GAME ", JOptionPane.INFORMATION_MESSAGE);
				//Display Question and answers && Prompt the user for each answer choice
				//Question#1
				answer1 = JOptionPane.showInputDialog(null, question1, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
				  
				 //Question#2	  
				answer2 = JOptionPane.showInputDialog(null, question2, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
				
				 //Question#3
				answer3= JOptionPane.showInputDialog(null, question3, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
				}
				 
					  
				JOptionPane.showMessageDialog(null, "   EXIT GAME ", " You have exit the game...see you later", JOptionPane.INFORMATION_MESSAGE);
				
			}
}
				

			
