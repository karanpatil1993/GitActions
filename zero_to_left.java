package finalized;

import java.util.Arrays;

public class zero_to_left {

	public static void main(String[] args) {
		int arr[]= {0,2,0,3,0,4,0,5};
		int len=arr.length-1;
		for(int i=len;i>=0;i--) {
			if(arr[i]!=0) {
				arr[len]=arr[i];
				len--;
				
			}
		}
		for (int i=0;i<=len;i++) {
			arr[i]=0;
		}System.out.println(Arrays.toString(arr));

	}

}
