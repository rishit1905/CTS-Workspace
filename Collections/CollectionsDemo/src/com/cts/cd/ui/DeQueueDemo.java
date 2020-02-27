package com.cts.cd.ui;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueueDemo {

	public static void main(String[] args) {
		Deque<String> dq = new LinkedList<String>();
		    
	      dq.add("Richards");
	      dq.add("Mary"); 
	      dq.add("Simon");
	      dq.add("Neha");
	      dq.add("Diana");
	      dq.add("Rohan");
	      dq.add("Risht"); 
	      dq.add("Donald");
	      dq.add("Mahesh");
	      dq.add("Suresh");
	      
	      System.out.println("Elements in Queue:"+dq);
	      System.out.println("Removed element: "+dq.remove());
	      System.out.println("Head: "+dq.element());
	      System.out.println("peek(): "+dq.peek());
	      System.out.println("poll(): "+dq.poll());
	      System.out.println("Elements in Queue:"+dq);

	}

}
