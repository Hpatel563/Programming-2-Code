package n01393134_Assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	/**
	 * Hrishikesh Patel, N01393134
	 * Assignment 4
	 * 
	 * Project Description: This project basically accesses a file called "Employee.csv" and it 
	 * presents its content in a chart format. The user then is able to update the file.
	 * The project is suppose to simulate someone entering the information of employees into a database 
	 * and the database quickly being updated and printed back to them.
	 * 
	 * 
	 * 
	 * Class Description: This class basically has some print statements (to make the output look professional), a call to the 
	 * "readInFromFile" static function, and a scanner to take user input. Whatever the user enters is stored into a string and sent
	 * to the appendToFile static function in the IO class.
	 */
	
	
	/**
	 *  This function has a while loop to make sure the program loops forever, it has print statements to make the output look
	 *  professional, it has a scanner to take user input, and the user input is added up and sent to the IO class for appending purposes.
	 *  
	 */
	

	public static void main(String[] args) throws IOException  {
		
		
		while(true) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("The Employee.csv file contains:");
		System.out.println("FIRST     LAST     AGE    DEPARTMENT");
		System.out.println("---------------------------------------");
		ArrayList<String> list = IO.readInFromFile();
		
		
	   
		
		int count = 0;
		double inf = Double.POSITIVE_INFINITY;
		                                                                            
		                                                                           
		try {
		while(count < inf) {  // count controlled while loop set to infinity to make it so the arraylist appends as much as the user wants it to.
		
		System.out.println(list.get(count).replaceAll(",", "      "));  //replaceAll gets rid of the commas in the arraylist and indents it
		
		count++;
		
		}
		}
		catch(IndexOutOfBoundsException iobe)
        {
	
        }
		
		
		

		
		
		
		   System.out.println("---------------------------------------");
		
		
		System.out.println("Next you'll enter a new employee's information:");
		
		
		System.out.println("Please enter a new employee's First Name: ");
		String k = input.next();
		System.out.println("Please enter a new employee's Last Name: ");
		String k1 = input.next();
		System.out.println("Please enter a new employee's Age: ");
		int k2 =  input.nextInt();
		System.out.println("Please enter a new employee's Department #: ");
		int k3 = input.nextInt();
		
		 String k4 = k + "," + k1 + "," + k2 + "," + k3;
				 
		 
		 IO.appendToFile(k4);
		 
		
		System.out.println("Date added to Employee.csv. ");
		System.out.println("The Employee.csv file contains:");
		
		
          }
		
		
		
         }
		
		}
		
		
		

	


