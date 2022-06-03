import java.util.Arrays;

//O(n2),O(1)
//values from unsorted part are picked and placed in the sorted part
//used when some elements are already sorted 
//used for small array size

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 6, 4, -1, 9 };
		int n = arr.length;
		int t, valueToPlace, posToPlace;
		for (int i = 1; i < n; i++) {
			valueToPlace = arr[i];
			posToPlace = i;
			while (posToPlace > 0 && valueToPlace < arr[posToPlace - 1]) {
				arr[posToPlace] = arr[posToPlace - 1];
				posToPlace--;
			}
			arr[posToPlace] = valueToPlace;

		}
		System.out.print(Arrays.toString(arr));

	}

}
