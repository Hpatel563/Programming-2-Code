package n01393134_Assignment5;

import java.util.Random;

public class Main {
	 static Random rand = new Random(100);
	 
	 

	public static void main(String[] args) 
	{
		Queue q1 = new Queue();
		Queue q2 = new Queue();
		
		
		System.out.println("-------Before Merge-----");
		System.out.println("Queue 1:");
		
		double numOne = rand.nextDouble(100);
	
		System.out.printf("%.1f", numOne);
		System.out.print(", ");
		
		
		q1.offer(numOne);
		
		double numTwo = rand.nextDouble(100);
		
		System.out.printf("%.1f", numTwo);
		System.out.print(", ");
		
		q1.offer(numTwo);
		
		double numThree = rand.nextDouble(100);
		
		System.out.printf("%.1f", numThree);
		System.out.print(", ");
		q1.offer(numThree);
		
       double numFourth = rand.nextDouble(100);
		
       System.out.printf("%.1f", numFourth);
		System.out.print(", ");
	
		q1.offer(numFourth);
		
		double numFive = rand.nextDouble(100);
		
		System.out.printf("%.1f", numFive);
		
	
		q1.offer(numFive);
		
		System.out.println("\t");
		System.out.println("\t");
		System.out.println("Queue 2:");
		
		double numSixth =rand.nextDouble(100);
		
		System.out.printf("%.1f", numSixth);
		System.out.print(", ");
		q2.offer(numSixth);
		double numSeventh = rand.nextDouble(100);
		System.out.printf("%.1f", numSeventh);
		System.out.print(", ");
		q2.offer(numSeventh);
		double numEight = rand.nextDouble(100);
		System.out.printf("%.1f", numEight);
		System.out.print(", ");
		q2.offer(numEight);
		
		double numNinth = rand.nextDouble(100);
		System.out.printf("%.1f",numNinth);
		System.out.print(", ");
		
		q2.offer(numNinth);
		
		double numTenth = rand.nextDouble(100);
		System.out.printf("%.1f",numTenth);
		q2.offer(numTenth);
		
		
		
		System.out.println("\t");
		System.out.println("\t");
		System.out.println("\t");
		System.out.println("--After Merge--");
		
		System.out.println("Queue 1:");
		
	    int count = 0;
		while(count < 9) {
		System.out.printf("%.1f",concatQueue(q1,q2).poll());
		System.out.print(", ");
		count++;
		}
		System.out.printf("%.1f",concatQueue(q1,q2).poll());

		
        
	}
	
	public static Queue concatQueue(Queue q1, Queue q2)
	{
			
             
            	 q1.offer(q2.poll()); q1.offer(q2.poll());
            	 q1.offer(q2.poll());
            	 q1.offer(q2.poll());
            	 q1.offer(q2.poll());
            	 
           
                 
					
		            
		            return q1;
		          
		            
		 }

	
	
		            
		           
		    		
		            
		          
		            		    
		   
		
	}

