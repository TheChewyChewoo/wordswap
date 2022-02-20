package swap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Swap {

	
	
	public static void main(String[] args) {
		
		
		String text = "";
		
		 try {
			List<String> lines = Files.readAllLines(Paths.get("words.txt"));
			
			StringBuilder sb = new StringBuilder();
			for (String line : lines) {
				if (!line.isEmpty())
				{
					sb.append(line);
				}
				
			}
			
			text = sb.toString();
			
			System.out.println("FILE CONTENTS");
			System.out.println(text);
			
		} catch (IOException e) {
			System.err.println("words.txt file was not found.");
		}
		
		
		
		
		// want to swap 2 for 4
		
		
		String[] words = text.split(" ");
		
		//System.out.println(text);
		
		String[] newWords = new String[words.length];
		
		for (int index = 0; index < words.length; index++) {
			
			// For inexperienced people who are just learning about coding, here's how this works:
			// The code basically just puts 4 words into groups. In this case 0 means the first word in the group. 1 means the second word. 2 means the third word. 3 means the fourth word. 
			if (words.length == 4)
			{
			newWords[0] = words[0];
			newWords[1] = words[1];
			newWords[0] = words[2];
			newWords[3] = words[3];
				
			}			
			else if ((index + 1) % 4 == 0)
			{
				String temporaryHolder = newWords[index - 2]; 
				newWords[index - 2] = words[index];
				newWords[index] = temporaryHolder;
			}
			else {
				newWords[index] = words[index];
			}
		}
		
			System.out.println("AFTER SWAP...");
			System.out.println(Arrays.toString(newWords).replace("[", "").replace("]", "").replace(",", ""));

	}

}
