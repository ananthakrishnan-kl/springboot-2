package java8;
//LOCAL DATE TIME API EXAMPLE 
import java.time.LocalDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		 LocalDateTime datetime1 = LocalDateTime.now();
	        LocalDateTime datetime2 = LocalDateTime.of(2021, 1, 5, 10, 15, 45);

	        
	        // compareTo() method
	        int diff = datetime1.compareTo(datetime2);
	        if(diff > 0) {
	            System.out.println(datetime1 + " is greater than " + datetime2);
	        } else if (diff < 0) {
	            System.out.println(datetime1 + " is less than " + datetime2);
	        } else {
	            System.out.println(datetime1 + " is equal to " + datetime2);
	        }
	    }

	}


