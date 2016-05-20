package src;

import java.util.ArrayList;
import java.util.Arrays;

public class pictionary {
	String[] easyWords = { "cat", "sun", "cup", "ghost", "flower", "pie", "cow",
			"banana", "snowflake", "bug", "book", "jar", "snake", "smile",
			"swing", "coat", "shoe", "water", "heart", "hat", "ocean",
			"kite", "dog", "mouth", "milk", "duck", "eyes", "skateboard",
			"bird", "boy", "apple", "person", "girl", "mouse", "ball",
			"house", "star", "nose", "bed", "whale", "jacket", "shirt",
			"hippo", "beach", "egg", "face", "cookie", "cheese",
			"ice cream cone", "drum", "circle", "spoon", "worm",
			"spider web"};
	
	String[] mediumWords = {"ankle","arm","horse","song","trip","backbone",
			"bomb","round","treasure","garbage","park","pirate","ski","skate",
			"whistle","palace","baseball","coal","queen",
			"dominoes","photograph","computer","hockey","aircraft",
			"hot dog","salt and pepper","key","iPad",
			"whisk","frog","lawnmower","mattress","pinwheel",
			"cake","circus","battery","mailman","cowboy","password","bicycle","electricity",
			"lightsaber","thief","teapot","deep","spring","nature","shallow","outside","america"
			,"roller bladding","gingerbread man","bowtie",
			"half","spare","wax","light bulb","platypus","music"};
	
	String[] hardWords = {"vision","loiterer","observatory","century","atlantis","kilogram","netron",
			"stowaway","psychologist","gynecologist","exponential","aristocrat","eureka","parody","figment",
			"philosopher","ironic","zero","landfill","implode","armada","crisp","gallop","archeologist"
			,"hang ten","acre","blacksmith","upgrade","mine car","protestant","brunette","stout","quarantine",
			"tutor","positive","champion","pastry","tournament","rainwater",
			"random","lyrics","ice fishing","clue","flutter","slump","ligament","pomp",};

	
	public String geteasyWords() {

		int size = easyWords.length;
		int rand = (int)(Math.random() * 54);
		System.out.println(easyWords[rand]);
		return easyWords[rand];
	}
	
	public String getmediumWords() {

		int size = mediumWords.length;
		int rand = (int)(Math.random() * 54);
		System.out.println(mediumWords[rand]);
		return mediumWords[rand];
	}
	
	public String gethardWords() {

		int size = hardWords.length;
		int rand = (int)(Math.random() * 54);
		System.out.println(hardWords[rand]);
		return hardWords[rand];
		
	}
	public static void main(String args[]) {
		pictionary random = new pictionary();
		String randy = random.geteasyWords();
		
	
}
	}

