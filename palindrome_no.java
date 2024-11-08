package finalized;

public class palindrome_no {

	public static void main(String[] args) {
		int no=121;
		int rev=0;
		int no1=no;
		while(no>0) {
			int digit=no%10;
			rev=rev*10+digit;
			no=no/10;
		}System.out.println(rev);
		if(no1==rev) {
			System.out.println("no is palindrome");
		}
		else{System.out.println("no is not palindrome");}
	}

}
