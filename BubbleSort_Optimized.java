package Sortings;

//best case : O(n),O(1)
// average : O(n2),O(1)

public class BubbleSort_Optimized {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 1, 6, 9 };
		int n = arr.length;
		boolean flag = true;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					flag = false;

					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;

				}
			}
			// no swap means array already sorted
			if (flag)
				break;
		}

		for (int i : arr)
			System.out.print(i + " ");

	}

}
