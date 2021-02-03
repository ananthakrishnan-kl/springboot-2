package java8;

import java.util.ArrayList;

public class ForeachExample {

	public static void main(String[] args) {
		 // creating ArrayList object of type String
        ArrayList<String> studentnames = new ArrayList<String>();
 
        // adding elements to ArrayList object
        studentnames.add("Akhil");
        studentnames.add("Amal");  
        studentnames.add("John");  
        studentnames.add("Sujith");
        studentnames.add("Aromal");
  
 
        // Iterating using enhanced for-loop

        System.out.println("Iterating using forEach in Java 8 :");
 
        //  Iterating using forEach() in Java 8
        studentnames.forEach(student -> System.out.println(student));  
    }

        }




