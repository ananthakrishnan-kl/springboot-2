package java8;

//implementation class for the interface ExampleInterface
public class ImplementClass implements ExampleInterface { 
	  
	    public static void main(String[] args) 
	    { 
	        ImplementClass interfaceDemo = new ImplementClass(); 
	  
	        
	        ExampleInterface.hello(); //static method
	        interfaceDemo.hai();//default method
	        
	    } 
	  
	 
	  
	  
	} 
	

