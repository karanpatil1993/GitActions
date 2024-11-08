package finalized;

public class Rev_FullName {

	public static void main(String[] args) {
		String name="karan manik patil";
		
		String[] words=name.split(" ");
		String rev_name="";
		for(String word:words) {
			String rev="";
			for(int i=word.length()-1;i>=0;i--) {
				rev=rev+word.charAt(i);
			}rev_name=rev_name+rev+ " ";
					
			}System.out.println(rev_name);
	}

}
