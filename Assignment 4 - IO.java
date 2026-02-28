package n01393134_Assignment4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class IO {
	
	/**
	 * Class Description: This class is home to the readInFromFile and appendToFile function. As the name suggests, the readInFromFile
	 * function reads in the contents of "employee.csv" and the appendToFile function then updates "employee.csv" with the user input
	 * taken from main class.
	 */
	
	
	
	/**
	 * This is the readInFromFile function, as you can see, its connected to a specific file on my computer. This function
	 * basically reads in the contents of employees.csv, stores the contents into an arraylist, and then returns the arraylist.
	 */
	
	
	public static ArrayList<String> readInFromFile() throws IOException 
	{
		
		  
		BufferedReader reader = new BufferedReader(new FileReader("C:/Users/hpate/Downloads/employees.csv"));
		ArrayList<String>list = new ArrayList<String>();
		
	  
		Scanner scan = new Scanner(reader);
		
		while(scan.hasNext()) {
		list.add(scan.nextLine());
		
		
		
		
		
		
		}
		
		
		
		reader.close();
		
		
		
		
		return list;
		
	
	}     
		
		
		
		
		
		
	/**
	 * This is the appendToFile function. As you can see, this function basically gives you access to appending the file with new
	 * content. This function specifically takes in the user's input from main class and uses it to append the file.
	 */
	
	public static void appendToFile(String k4) throws IOException

	{
		
		Scanner input = new Scanner(System.in);
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/hpate/Downloads/employees.csv", true));
 
    	writer.write(k4+ "\n");
 
    	writer.close();
    	
   
    	
    	}
    	
		
}
		
		
		
		
    	
    	
    	
    	
		
	
