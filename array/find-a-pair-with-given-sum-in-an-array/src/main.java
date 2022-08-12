
public class main {
	// bruteforcing method to find any pair in an array with given target sum
	// only returns one of the possible outputs based on what it finds first
	
	public static void findPairBruteForce(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					System.out.println("Pair found (" + nums[i] + "," + nums[j] + ")");
					return;
				}
			}
		}
		
		System.out.println("No suitable pairs.");
		return;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int target = 90;
		findPairBruteForce(nums, target);
	}

}
