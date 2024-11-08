package finalized;

import java.util.HashMap;
import java.util.Map;

public class duplicate_string {

	public static void main(String[] args) {
		String name="i love banana love apple";
		String []words=name.split(" ");
		Map<String,Integer>wordcount=new HashMap<>();
		
		for(String wo:words) {
			wordcount.put(wo, wordcount.getOrDefault(wo, 0)+1);
		}
		for(String wo:wordcount.keySet()) {
			if(wordcount.get(wo)>1) {
				System.out.println(wo+" occurance "+wordcount.get(wo));
			}
		}
	}

}
