package week1Lab1;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Help Nike sell more overpriced sneakers by changing their slogan from an array into a string.
//		Convert the shoe array and assign it to a variable named `shoeString`. Return the new variable.
//		var shoe = ["just", "do", "it"];

//		variable of shoe array
		String[] shoeArray = {"just", "do", "it"};
		
//		empty string object
		StringBuffer  emptyString= new StringBuffer();
		
//		iterate over the shoeArray with a for loop
		for(int i = 0; i < shoeArray.length ; i++) {
			
//		append each element of the array to the empty string using append
			emptyString.append(shoeArray[i]);
		}

//		assign string variable and apply the buffered string to string then print it
		String str = emptyString.toString();
		System.out.println(str);
		
		
		
	}

}
