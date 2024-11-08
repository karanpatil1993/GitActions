package finalized;

public class Prime_no {

	public static void main(String[] args) {
	int a=4;
	int count=0;
	for(int i=2;i<a-1;i--) {
		if(a%2==0) {
			count++;
		}    
		

	}if (count==0) {
		System.out.println("it is prime no");
	}
	else {System.out.println("it is not a prime no");}
}

}
