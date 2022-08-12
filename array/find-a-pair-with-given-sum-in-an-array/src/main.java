
public class main {
	// bruteforcing method to find any pair in an array with given target sum
	// only returns one of the possible outputs based on what it finds first
	
	public static void findPairBruteForce(int[] nums, int target) {
		// iterates over the array
		for(int i=0; i<nums.length; i++) {
			// i is fixed here, and we iterate from index i onwards excluding i
			for(int j=i+1; j<nums.length; j++) {
				// compares the sum of the value at index i and j with target value
				if(nums[i] + nums[j] == target) {
					// if matches, we print the value pair and end the method
					System.out.println("Pair found (" + nums[i] + "," + nums[j] + ")");
					return;
				}
			}
		}
		// only reaches this line when no suitable pairs found
		// prints failed message and terminates method
		System.out.println("No suitable pairs.");
		return;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int target = 90;
		findPairBruteForce(nums, target);
	}

}
