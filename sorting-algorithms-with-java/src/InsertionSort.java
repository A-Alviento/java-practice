
public class InsertionSort {
	
	public InsertionSort(int[] arr) {
		int ptr,tmp;
		int arrLen = arr.length;
		
		// outer loop
		for(int i=1; i<arrLen; i++) {
			// sets the ptr to current iteration
			ptr = i;
			// inner loop to compare value at ptr with
			// all values to its left
			for(int j=i-1; i>=0; i--) {
				if (arr[ptr]<arr[j]) {
					tmp = arr[ptr];
					arr[ptr] = arr[j];
					arr[j] = tmp;
					tmp--;
				}
				else {
					break;
				}
			}
		}
	}
}
