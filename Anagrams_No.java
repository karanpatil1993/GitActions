package finalized;

import java.util.Arrays;

public class Anagrams_No {

	public static void main(String[] args) {
		String name="silentw";
		String name1="listen";
		if(name.length()==name1.length()) {
			char[]chararray1=name.toCharArray();
			char[]chararray2=name1.toCharArray();
			//sort the char array
			Arrays.sort(chararray1);
			Arrays.sort(chararray2);
			boolean result= Arrays.equals(chararray1, chararray2);
			if(result) {
				System.out.println("Strings are anagram");
			}else {System.out.println("not anagram no");}
		}else {System.out.println("not anagram no");}
		  }
		}

	
