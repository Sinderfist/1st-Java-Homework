package week1Lab1;

import java.util.Arrays;
import java.util.Collections;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given a list of colors, create a map that keeps count of the number of occurrences of each color. 
//		Colors = [red, green, red, blue, yellow, red, blue]
//		Color_count = { red: 3, green: 1, blue: 2, yellow: 1} 
		
//		Given a list of colors
		String[] Colors = {"red", "green", "red", "blue", "yellow", "red", "blue"};

//		Calculate the frequency of each color in the list and provide it next to it's color in the console
		int freqRed = Collections.frequency(Arrays.asList(Colors), "red");
//		System.out.println(freqRed);
		
		int freqGreen = Collections.frequency(Arrays.asList(Colors), "green");
//		System.out.println(freqGreen);
		
		int freqBlue = Collections.frequency(Arrays.asList(Colors), "blue");
//		System.out.println(freqBlue);
		
		int freqYellow = Collections.frequency(Arrays.asList(Colors), "Yellow");
//		System.out.println(freqYellow);
		
		
//		Add each frequency to another array and add a bit of fluff for the console
//		iterate over the array to display everything
		
		String[] colorCount = {"red: " + freqRed, "green: " + freqGreen, "blue: " + freqBlue, "Yellow: " + freqYellow };
		for (int i = 0; i < colorCount.length; i++) {
		System.out.println(colorCount[i]);
		}
	}

}
