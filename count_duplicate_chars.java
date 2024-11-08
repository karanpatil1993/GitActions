package finalized;

import java.util.HashMap;
import java.util.Map;

import practice.duplicate_char_count;

public class count_duplicate_chars {

	public static void main(String[] args) {
	String a="jhgsadjhhjgfdstweiuhjbyfcn";
	Map<Character,Integer>dup=new HashMap<>();
	char []ch=a.toCharArray();
	for(char ch1:ch) {
		if(dup.containsKey(ch1)) {
			dup.put(ch1, dup.get(ch1)+1);
			}
		else {dup.put(ch1, 1);
		}
		}
	dup.entrySet().removeIf(i->i.getValue()==1);
	System.out.println(dup);
	}}
