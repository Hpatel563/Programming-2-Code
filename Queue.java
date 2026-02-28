package n01393134_Assignment5;

import java.util.ArrayList;
import java.util.Random;

public class Queue {
	
	
	
	private ArrayList<Double> queueList;
	
	//constructor
	Queue()
	{
		queueList = new ArrayList<Double>();
		
	}
	
	//offer(double num)
	public void offer(Double newValue)
	{
		queueList.add(newValue);
		
	}
	
	//poll()
	public Double poll()
	{
		try
		{
		return queueList.remove(0);
		} //end try
		catch(IndexOutOfBoundsException e)
		{
			return null;
		}
	}
	
	//peek
	public Double peek()
	{
		try
		{
		return queueList.get(0);
		}
		catch(IndexOutOfBoundsException e)
		{
			return null;
		}
		
	}
	
	//isEmpty
	public boolean isEmpty()
	{	
         
		return queueList.size() == 0;
	}


}

