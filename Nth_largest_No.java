package finalized;

public class Nth_largest_No {

	public static void main(String[] args) {
		int arr[]= {6,3,4,2,45,5,1};
		int len=arr.length;
		int temp=0;
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}			
		}System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
	}

}
