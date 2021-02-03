package java8;


//EXAMPLE OF STREAM LIST METHODS WITH PIPELINE METHODS SUCH AS MAP,FILTER
import java.util.Arrays;
import java.util.stream.*;

public class StreamExample {
	
	 public static void main(String args[]) 
	  { 
	  
	    // A list of integers 
	    java.util.List<Integer> number = Arrays.asList(2,4,6,8,10); 
	  
	    // Example of map method 
	    java.util.List<Integer> square = number.stream().map(x -> x*x). 
	                           collect(Collectors.toList()); 
	    System.out.println(square); 
	    
	    // create a list of String 
	    java.util.List<String> names =  Arrays.asList("Hello","World"); 
	  
	    // demonstration of filter method 
	    java.util.List<String> result = names.stream().filter(s->s.startsWith("H")). 
	                          collect(Collectors.toList()); 
	    System.out.println(result); 
	  }
}
