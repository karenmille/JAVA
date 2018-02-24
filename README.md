# JAVA
COP1210C Lab 6

25 points
Who Wants to Be a Java Programmer? v.6
Arrays
File name: javaGamev6.java
• (3) Pseudocode
• (2) Add 1 more set of questions and answers. This question should
     come from the topics in Chapter 7.
• (2) Declare the following parallel arrays of size 10:
     Note: A constant value can be used to declare the size of the
     arrays.
     questionArray[]
     answerA[]
     answerB[]
     answerC[]
     answerD[]
     correctAnswer[]
     pointValue[]
• (4) Modify your for loop so that the data is stored into the above arrays when read from the file. Update your method calls as necessary.
• (1) Declare the following parallel arrays: highNames[3]
     highScores[3]
• (1) Modify your text file “highscore.txt” so that it includes three names and three scores.
     Example data:
• (4) Modify the method ReadHighScore() so that it uses the following method header:
public static void ReadInHighScores(string[] name, int[] score)
This method should read in the three names and scores from the file.
 John 3 Jane 2 Joe 1

The values should be stored in the parallel arrays highNames and highScores.
• (4) Modify the method CompareScore() so that it uses the following method header:
public static void CompareScores(int userScore, string userName, string[] name, int[] score)
This method should compare the user’s score to the high score list. If the user scores higher than any of the scores in the list, rearrange the scores and corresponding names in the arrays as necessary.
• (3) Create the following method:
public static void UpdateHighScores(string[] highName, int[] highScore) should update the file “highscore.txt” with the scores and names in the arrays.
• (1) Include documentation in your code to explain the updates that were made to this version.
 
