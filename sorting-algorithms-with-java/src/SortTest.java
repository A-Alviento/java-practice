

public class SortTest {
	
	public static void main(String[] args) {
		
		// generate array of int
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.print(arr[i] + " ");
		}
		
		InsertionSort s1 = new InsertionSort(arr);
		System.out.println();
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
