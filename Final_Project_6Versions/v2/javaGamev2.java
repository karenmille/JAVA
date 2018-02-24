package javaGamev2;

/*
* File Name: javagamev2.java
* Name: Karen Miller
* Date: October 18th 2017
* Description: This program is Game that Displays a menu: 1) See Rules 2) Play Game 3) Exit.
* 				Prompts the user to chose from the menu. If the user decide to start playing 
* 				Displays the rules. Display 5 sets of questions with answers.
* 			    Prompts the user for the correct answer. Add a point value to each question and include an accumulator to add to the total points when the user answers.
* */
import javax.swing.JOptionPane;
public class javagamev2 {

	public static void main(String[] args) {
	
				//Declare and initialize variables and constants
				
				int userMenuChoice = 0, acumulator =0;
				
				String gamerName, answer1, answer2, answer3, answer4, answer5;
				String mainMenu = "1) See Rules \n2) Play Game  \n3) Exit";
				String rules ="Rules:\n\t1) Multiple Choice Questions: Please select only one: a, b, c or d. \n2) Each correct answer will be rewarded with a point";
				String question1 =" 1) JVM stands for __________.  \n\na. Java Variable Machine \nb. Java Variable Method \nc. Java Virtual Method \nd. Java Virtual Machine";
				String question2="2 )Which Scanner class method would you use to read a string as input?  \n\na. nextString \nb. nextLine \nc. readString \nd. getLine";
				String question3= "3) You can use this class to display dialog boxes.  \n\na. JOptionPane \nb. BufferedReader \nc. InputStreamReader \nd. DialogBox";
				String question4="4) The if statement is an example of a _________.\n\na. sequence structure \nb. decision structure\\nc. pathway structure \nd. class structure";
				String question5="5) This is a boolean variable that signals when some condition exists in the program.\na. flag\nb. signal \nc. sentinel \nd. siren";
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
				  if(answer1.equalsIgnoreCase("d") ) 
				  {
					  acumulator++;
					  JOptionPane.showMessageDialog(null, "CURRENT SCORE: " + acumulator + "/1"," Correct ", JOptionPane.INFORMATION_MESSAGE);
				  }
				  else 
				  
					  JOptionPane.showMessageDialog(null, "CURRENT SCORE: " + acumulator + "/1"," Incorrect ", JOptionPane.INFORMATION_MESSAGE);
				  
				 //Question#2	  
				answer2 = JOptionPane.showInputDialog(null, question2, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
				 	
				 if(answer2.equalsIgnoreCase("b") ) 
				  {
					  acumulator++;
					  JOptionPane.showMessageDialog(null, "CURRENT SCORE: " + acumulator + "/2"," Correct ", JOptionPane.INFORMATION_MESSAGE);
				  }
				  else 
			
					  JOptionPane.showMessageDialog(null, "CURRENT SCORE: " + acumulator + "/2"," Incorrect ", JOptionPane.INFORMATION_MESSAGE);
				 
				 //Question#3
				answer3= JOptionPane.showInputDialog(null, question3, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
				 if(answer3.equalsIgnoreCase("a") ) 
				  {
					  acumulator++;
					  JOptionPane.showMessageDialog(null, "CURRENT SCORE: " + acumulator + "/3"," Correct ", JOptionPane.INFORMATION_MESSAGE);
					  
				  }
				  else 
				  
					  JOptionPane.showMessageDialog(null, "CURRENT SCORE: " + acumulator + "/3"," Incorrect ", JOptionPane.INFORMATION_MESSAGE);
				  
				 //Question#4
				 answer4= JOptionPane.showInputDialog(null, question4, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
				 if(answer4.equalsIgnoreCase("b") ) 
				  {
					  acumulator++;
					  JOptionPane.showMessageDialog(null, "CURRENT SCORE: " + acumulator + "/4"," Correct ", JOptionPane.INFORMATION_MESSAGE);
					  
				  }
				  else 
				   
					  JOptionPane.showMessageDialog(null, "CURRENT SCORE: " + acumulator + "/4"," Incorrect ", JOptionPane.INFORMATION_MESSAGE);
				  
				 //Question#5
				 answer5= JOptionPane.showInputDialog(null, question5, pleaseEnter, JOptionPane.QUESTION_MESSAGE);
				 if(answer5.equalsIgnoreCase("a") ) 
				  {
					  acumulator++;
					  JOptionPane.showMessageDialog(null, "FINAL SCORE: " + acumulator + "/5"," Correct ", JOptionPane.INFORMATION_MESSAGE);
				  }  
				  else 
				  
					  JOptionPane.showMessageDialog(null, "FINAL SCORE: " + acumulator + "/5"," Incorrect ", JOptionPane.INFORMATION_MESSAGE);
				 
				}
				 
				JOptionPane.showMessageDialog(null, "   EXIT GAME ", " You have exit the game...see you later", JOptionPane.INFORMATION_MESSAGE);
				
			}
}
				


	


