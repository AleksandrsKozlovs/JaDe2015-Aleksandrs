package m00;

import java.util.Arrays;

public class Search {
	
	/**
	 * Find the first occurrence of x in sorted array a.
	 * @param x value to find
	 * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
	 * @return lowest i such that a[i]==x, or -1 if x not found in a.
	 */
	public static int find(int x, int[] a) {
		return binarySearch(x, 0, a.length, a);
	} 
	

	/**
	 * Find x in sorted array a
	 * @param x value to find
	 * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
	 * @return position of x in array a
	 */
	public static int binarySearch(int x, int first, int last, int[] a) {
		
		int mid = (last + first)/ 2;
		if (x < a[mid]) {
			return binarySearch(x, first, mid, a);
		} else if (x > a[mid]) {
			return binarySearch(x, mid, last, a);
		} else if (x == a[mid]){
			return mid;
		}
		
		return -1;

	}
}
