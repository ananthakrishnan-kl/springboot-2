package java8;

//implementation class of functional interface
public class Area {
	
		public static void main(String args[]) {
			int l = 2;
			int b = 4;
			FnInterface s = (int x, int y)->x*y; 
			
			int ans = s.calculate(l, b); 
	        System.out.println("area is :"+ans); 
		}
	    
	
	}


