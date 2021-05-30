package week1Lab1;

import java.util.Arrays;
import java.util.Collections;

public class Question3 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Use the force, or in this case the reverse method to help Yoda make some sense with his motivational talk to the young 
//		Jedi interns. Reverse this array* Yoda = ["try", "no", "is", "there", "not", "do", "or", "do"];
		
		String [] yodaArray = {"try", "no", "is", "there", "not", "do", "or", "do"};
		reverse(yodaArray);	
		
	}
	static void reverse(String yodaArray[]) {
			Collections.reverse(Arrays.asList(yodaArray));
			System.out.println("reversed array:" + Arrays.asList(yodaArray));
			}
	
	

		
		
		
		
	}