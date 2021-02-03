package java8;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		  ArrayList<StudentSort> studentlist = new ArrayList<StudentSort>();
	      studentlist.add(new StudentSort("Akhil", 18, 1004)); 
	      studentlist.add(new StudentSort("Amal", 20, 1001)); 
	      studentlist.add(new StudentSort("John", 19, 1002)); 
	      studentlist.add(new StudentSort("Rahul", 21, 1005)); 
	      studentlist.add(new StudentSort("Aromal", 22, 1003));
	      System.out.println("Before Sorting the student data:"); 
	 
	      
	      studentlist.forEach((s)->System.out.println(s));

	       
	      System.out.println(" After Sorting the student data by Id:");        
	     
	      studentlist.sort((StudentSort s1, StudentSort s2)->s1.getId()-s2.getId()); //lambda expression for sorting
	      studentlist.forEach((s)->System.out.println(s)); 
	   }
	

	}


