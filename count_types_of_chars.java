package finalized;

public class count_types_of_chars {
	public static void main(String[] args) {
		String ch="JU^%$658766MNhgsdnj";
		int len=ch.length();
		System.out.println(len);
		char []ch1=ch.toCharArray();
		int upper=0,lower=0,spchar=0;
		int digit=0;
		for(char ch2:ch1) {
			if(Character.isDigit(ch2)) {
				digit++;
			}
			else if(Character.isUpperCase(ch2)) {
				upper++;
			}
			else if(Character.isLowerCase(ch2)) {
				lower++;
			}
			else {
				spchar++;}
		}
		System.out.println("digit"+digit);
		System.out.println("lower"+lower);
		System.out.println("upper"+upper);
		System.out.println("special chars"+spchar);
	}

}
