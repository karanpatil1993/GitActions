package finalized;

public class find_the_leaders {

	public static void main(String[] args) {
		int arr[]= {16, 17, 4, 3, 5, 2};
		int len=arr.length;
		
		int leader=(arr[len-1]);
		System.out.println(leader);
		for(int i=len-2;i>=0;i--) {
			if(arr[i]>leader) {
				leader=arr[i];
				System.out.println(leader+" ");
			}
		}
	}

}
