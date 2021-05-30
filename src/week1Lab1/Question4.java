package week1Lab1;

import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		People been lining up for hours to get the newest iphone release. Help manage the unruly crowd of privileged customers 
//		by serving them one at a time and assigning it to a variable named `nowServing`. Print this new variable as well as the waitList.*/
//		waitList = [ "Chance the Rapper", "Khalid", "Tay-Tay", "Barry Manilow", "Piko Taro" ];

		
//		Array of people to serve
		String[] waitList = { "Chance the Rapper", "Khalid", "Tay-Tay", "Barry Manilow", "Piko Taro" };
		System.out.println(waitList[0]);
		
		
//		nowServing next customer integer
		int nowServing = 0;
		System.out.println(nowServing);
		
//		for loop to iterate over the waitlist array to incriement the nowServing interger
		for(int i = 0; i <= waitList.length ; i++) {
			nowServing = i;
			System.out.println("now serving " + waitList[nowServing] + " at position number " + nowServing);
		}
		
		
		
		
	}

}
