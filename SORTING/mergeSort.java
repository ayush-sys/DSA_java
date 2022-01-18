
package SORTING;

import java.util.Scanner;

class mergeSort
{
	public static void merge(int arr[], int l, int m, int r)
	{

		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		
		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void merge_sort(int arr[], int l, int r)
	{
		if (l < r) {
			int m =l+ (r-l)/2;
			
			merge_sort(arr, l, m);
			merge_sort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = in.nextInt();

		System.out.println("Given Array");
		printArray(arr);
        merge_sort(arr, 0, n-1);
		System.out.println("\nSorted array");
		printArray(arr);
	}
}