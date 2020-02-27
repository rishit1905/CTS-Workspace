package com.cts.cd.ui;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {		
        PriorityQueue<String> pQ = new PriorityQueue<String>(); 
        
        pQ.add("Richards");
	    pQ.add("Mary"); 
	    pQ.add("Simon");
	    pQ.add("Neha");
	    pQ.add("Diana");
	    pQ.add("Rohan");
	    pQ.add("Risht"); 
	    pQ.add("Donald");
	    pQ.add("Mahesh");
	    pQ.add("Suresh"); 
         
        System.out.println("Queue elements:"); 
        Iterator<String> it = pQ.iterator(); 
        while (it.hasNext()) 
            System.out.println(it.next()); 
        
        System.out.println("Removed element: "+pQ.remove());
	    System.out.println("Head: "+pQ.peek());
	    System.out.println("poll(): "+pQ.poll());
  
	    boolean bool = pQ.contains("Dipesh"); 
        System.out.println("Priority queue contains Dipesh "
                           + "or not: " + bool); 
    }

}
