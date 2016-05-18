package src;

import java.util.ArrayList;
import java.util.Arrays;

public class randomPictionary {
	String[] easyWords = { "cat", "sun", "cup", "ghost", "flower", "pie", "cow",
			"banana", "snowflake", "bug", "book", "jar", "snake", "smile",
			"swing", "coat", "shoe", "water", "heart", "hat", "ocean",
			"kite", "dog", "mouth", "milk", "duck", "eyes", "skateboard",
			"bird", "boy", "apple", "person", "girl", "mouse", "ball",
			"house", "star", "nose", "bed", "whale", "jacket", "shirt",
			"hippo", "beach", "egg", "face", "cookie", "cheese",
			"ice cream cone", "drum", "circle", "spoon", "worm",
			"spider web"};
	public String getRandomPictionary() {

		int size = easyWords.length;
		int rand = (int)(Math.random() * 54);
		System.out.println(easyWords[rand]);
		return easyWords[rand];
	}
	public static void main(String args[]) {
		randomPictionary random = new randomPictionary();
		String randy = random.getRandomPictionary();
		
	
}}

