import java.util.Arrays;

public class ArrayFundamentals {

	/**
	 * Returns the position of the largest element of the array. If the element
	 * appears in two places in the array, the first index of the element will
	 * be returned.
	 */
	public static int positionOfLargest(int[] nums) {
		int[] largest = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largest[1]) {
				largest[0] = i;
				largest[1] = nums[i];
			}
		}

		return largest[0];
	}

	/**
	 * Returns the first index of "val" in the array. If "val" is not in the
	 * array, returns -1. The array is not in sorted order.
	 */
	public static int indexOf(int[] nums, int val) {
		return 0;
	}

	/**
	 * Returns the number of times "val" appears in the array.  If "val" is not 
	* in the array, returns 0.
	*/
	public static int count(int[] nums, int val) {
		int valNum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				valNum++;
			}
		}
		return valNum;
	}


	/**
	 * Returns the last index of "val" in the array. If "val" is not in the
	 * array, returns -1. The array is not in sorted order.
	 */
	public static int lastIndexOf(int[] nums, int val) {
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] == val) {
				return i;
			}
		}
		return -1;
	}

	
	/**
	 * Moves all elements of the array left by one position. The right-most
	 * element of the array receives the value from the left-most element. For
	 * example, rotateLeft ({9, 12, 14, 43}) becomes {12, 14, 43, 9}.
	 */
	public static void rotateLeft(int[] nums) {
		//
		// TODO
		// 
	}

	/**
	 * Moves all elements of the array right by one position. The left-most
	 * element of the array receives the value from the right-most element. For
	 * example, rotateRight ({9, 12, 14, 43}) becomes {43, 9, 12, 14}.
	 */
	public static void rotateRight(int[] nums) {
		//
		// TODO
		// 
	}
	
	/**
	 * Swaps values of the array at position p1 with the element at position p2.
	 * For example swap ({14, 29, 16, 2, 8}, 1, 4) will change the array to {14,
	 * 8, 16, 2, 29}.
	 */
	public static void swap(int[] nums, int p1, int p2) {
		//
		// TODO
		// 

	}

	/**
	 * Returns a NEW array whose elements are in the reverse order of nums.
	 * For example, reverse ({5, 19, 2, 6}) returns {6, 2, 19, 5}.
	 */
	public static int[] reverse(int[] nums) {
		//
		// TODO
		// 
		return new int[0];
	}

	/**
	 * Update nums so its elements are rearranged in reverse order.
	 * For example, reverse ({5, 19, 2, 6}) changes the array to {6, 2, 19, 5}.
	 */
	public static void reverseInPlace(int[] nums) {
		//
		// TODO
		// 
	}

	/**
	 * Returns true is the array is a palindrome, false otherwise. An array is a
	 * palidrome if it has symmetry, reading the same forwards and back. 
	 * For example, the following arrays are palindromes:
	 * {2, 5, 5, 2}, {17, 14, 17}, {23, 25, 6, 5, 6, 25, 23}, {9, 0, 2, 2, 0, 9}
	 */
	public static boolean isPalindrome(int[] nums) {
		//
		// TODO
		// 
		return false;
	}

	/**
	* Returns the position of the first matching adjacent pair of numbers in the array.
	* For example, for the array {9, 17, 24, 24, 9, 4, 4, 18}, the function
	* returns 2 since the first pair (24) begins at position 2.
	* If no matching adjacent pairs exist, return -1.
	*/
	public static int firstPairPosition(int[] nums) {
		//
		// TODO
		// 
		return 0;
	}
	
	/**
 	* Returns the position of the last adjacent matching pair of numbers in the array.
	* For example, for the array {9, 17, 24, 24, 9, 4, 4, 18}, the function
	* returns 5 since the last pair (4) begins at position 5.
    * If no matching adjacent pairs exist, return -1.
	*/
	public static int lastPairPosition(int[] nums) {
		//
		// TODO
		// 
		return 0;
	}


	public static void main(String[] args) {
		int[] a = { 19, 12, 45, 1, 4, 19, 21, 12, 45, 3 };

		if (positionOfLargest(a) == 2)
			System.out.println("Passed 1 (positionOfLargest)");
		else
			System.out.println("Failed 1 (positionOfLargest)");

		if (indexOf(a, 1) == 3)
			System.out.println("Passed 2a (indexOf)");
		else
			System.out.println("Failed 2a (indexOf)");

		if (indexOf(a, 19) == 0)
			System.out.println("Passed 2b (indexOf)");
		else
			System.out.println("Failed 2b (indexOf)");

		if (indexOf(a, 55) == -1)
			System.out.println("Passed 2c (indexOf)");
		else
			System.out.println("Failed 2c (indexOf)");

		if (lastIndexOf(a, 55) == -1)
			System.out.println("Passed 3a (lastIndexOf)");
		else
			System.out.println("Failed 3a (lastIndexOf)");

		if (lastIndexOf(a, 19) == 5)
			System.out.println("Passed 3b (lastIndexOf)");
		else
			System.out.println("Failed 3b (lastIndexOf)");
		
		a = new int[] {5, 12, 19, 23};
		rotateLeft(a);
		if (Arrays.equals(a, new int[] {12, 19, 23, 5}))
			System.out.println("Passed 4 (rotateLeft)");
		else
			System.out.println("Failed 4 (rotateLeft)");

		a = new int[] {5, 12, 19, 23};
		rotateRight(a);
		if (Arrays.equals(a, new int[] {23, 5, 12, 19}))
			System.out.println("Passed 5 (rotateRight)");
		else
			System.out.println("Failed 5 (rotateRight)");

		a = new int[] {5, 12, 95, 16, 77, 19, 23};
		swap(a, 1, 3);
		if (Arrays.equals(a, new int[] {5, 16, 95, 12, 77, 19, 23}))
			System.out.println("Passed 6 (swap)");
		else
			System.out.println("Failed 6 (swap)");
		
		a = new int[] {5, 12, 19, 23};
		int[] b = reverse(a);
		if (Arrays.equals(b, new int[] {23, 19, 12, 5}))
			System.out.println("Passed 7a (reverse)");
		else
			System.out.println("Failed 7a (reverse)");
		
		a = new int[] {77, 13, 43, 6, 85};
		b = reverse(a);
		if (Arrays.equals(b, new int[] {85, 6, 43, 13, 77}))
			System.out.println("Passed 7b (reverse)");
		else
			System.out.println("Failed 7b (reverse)");

		a = new int[] {5, 12, 19, 23};
		reverseInPlace(a);
		if (Arrays.equals(a, new int[] {23, 19, 12, 5}))
			System.out.println("Passed 8a (reverseInPlace)");
		else
			System.out.println("Failed 8a (reverseInPlace)");
		
		a = new int[] {77, 13, 43, 6, 85};
		reverseInPlace(a);
		if (Arrays.equals(a, new int[] {85, 6, 43, 13, 77}))
			System.out.println("Passed 8b (reverseInPlace)");
		else
			System.out.println("Failed 8b (reverseInPlace)");

		if (isPalindrome(new int[] {5, 12, 5}))
			System.out.println("Passed 9a (isPalindrome)");
		else
			System.out.println("Failed 9a (isPalindrome)");

		if (!isPalindrome(new int[] {9, 11, 12, 9}))
			System.out.println("Passed 9b (isPalindrome)");
		else
			System.out.println("Failed 9b (isPalindrome)");
		
		if (isPalindrome(new int[] {5, 12, 45, 45, 12, 5}))
			System.out.println("Passed 9c (isPalindrome)");
		else
			System.out.println("Failed 9c (isPalindrome)");
			
		if (firstPairPosition(new int[] {7, 8, 12, 12, 9, 14, 14, 9, 1, 5})== 2)
			System.out.println("Passed 10a (firstPairPosition)");
		else
			System.out.println("Failed 10a (firstPairPosition)");
		
		if (firstPairPosition(new int[] {7, 8, 12, 9, 14, 9, 1, 5})== -1)
			System.out.println("Passed 10b (firstPairPosition)");
		else
			System.out.println("Failed 10b (firstPairPosition)");
		
		if (lastPairPosition(new int[] {7, 8, 12, 12, 9, 14, 14, 9, 1, 5})== 5)
			System.out.println("Passed 11a (lastPairPosition)");
		else
			System.out.println("Failed 11a (lastPairPosition)");

		if (lastPairPosition(new int[] {7, 8, 12, 9, 14, 9, 1, 5})== -1)
			System.out.println("Passed 11b (lastPairPosition)");
		else
			System.out.println("Failed 11b (lastPairPosition)");

		if (count(new int[] {7, 7, 12, 7, 9, 7, 14, 9, 1, 5}, 7)== 4)
			System.out.println("Passed 12a (count)");
		else
			System.out.println("Failed 12a (count)");
		
		if (count(new int[] {7, 7, 12, 7, 9, 7, 14, 9, 1, 5}, 16)== 0)
			System.out.println("Passed 12b (count)");
		else
			System.out.println("Failed 12b (count)");		
	}

}
