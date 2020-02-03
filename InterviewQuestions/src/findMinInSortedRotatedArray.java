
public class findMinInSortedRotatedArray {

	public int findMin(int a[]) {
		
		int currMin = Integer.MAX_VALUE;
		currMin = findMinRecur(a, 0, a.length - 1, currMin);
		return currMin;
		
	}
	
	private int findMinRecur(int[] a, int start, int end, int currMin) {
		if(start >= end)
			return Math.min(currMin, a[start]);
		
		int mid = start + (end-start)/2;
		
		if(a[start]< a[mid]) {
			currMin = Math.min(a[start], currMin);
			currMin = Math.min(currMin, findMinRecur(a, mid+1, end, currMin));
		}
		else {
			currMin = Math.min(currMin, a[mid]);
			currMin = Math.min(currMin, findMinRecur(a, start, mid-1, currMin));
		}
		return currMin;
	}
}
