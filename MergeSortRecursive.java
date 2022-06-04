//best, avrg , worst -O(nlogn) space - O(n)
//its a stable sorting algo
//its best suitable when the input is large 

public class MergeSortRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {
				4,5,6,2,3,33,1,0,33,55,21,7,-12,99,32
		};
		int n=14;
		mergeSort(arr,0,n-1);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		

	}

	private static void mergeSort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i>=j)
			return;
		int mid=i+(j-i)/2;
		mergeSort(arr,0,mid);
		mergeSort(arr,mid+1,j);
		merge(arr,i,mid,j);
		
		
	}

	private static void merge(int[] arr, int i, int mid, int j) {
		// TODO Auto-generated method stub
		int l1=(mid-i)+1;
		int l2=(j-mid);
		int left[]=new int[l1];
		int right[]=new int[l2];
		
		int mainArrayIndex=i;
		for(int x=0;x<l1;x++)
			left[x]=arr[mainArrayIndex++];
		
		mainArrayIndex=mid+1;
		for(int y=0;y<l2;y++)
			right[y]=arr[mainArrayIndex++];
		
		int index1=0;
		int index2=0;
		
		mainArrayIndex=i;
		
		
		while(index1<l1 && index2<l2) {
			if(left[index1]<right[index2])
				arr[mainArrayIndex++]=left[index1++];
			else
				arr[mainArrayIndex++]=right[index2++];
			
			
			
		}
		while(index1<l1)
			arr[mainArrayIndex++]=left[index1++];
		
		while(index2<l2) 
			arr[mainArrayIndex++]=right[index2++];
		
		
	}

}
