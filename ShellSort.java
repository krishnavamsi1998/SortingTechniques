import java.util.Arrays;

//average -O(nlogn) worst-O(n2)  ,space -O(1)
//optimised version of insertion sort 
//actually insertion sort has lot of swaps and lots of comparisions
//implementation is insertion sort only, but we use a concept of gaps
//watch codebasics shell sort video 
public class ShellSort {

	public static void main(String[] args) {

		int[] arr= {-100,3,4,65,-902,0,9};
		int n=arr.length;
		int gap=n/2;
		int j;
		int ele;
		while(gap>0) {
		for(int i=gap;i<n;i++) {
			
			j=i;
			ele=arr[j];
			
			while(j>=gap && ele<arr[j-gap])
			{
				arr[j]=arr[j-gap];
				j-=gap;
			}
			arr[j]=ele;
		}
		gap/=2;
		}
			
		System.out.println(Arrays.toString(arr));

	}

}
