import java.util.Arrays;
import java.lang.Math;

public class Day5000_Random {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for (int i = 0; i < 50000000; i++) {
			int num = ((int)(Math.random() * 10));
			nums[num] += 1;
		}
		for (int i = 0; i < 10; i++){
			System.out.println(i + "'s: " + nums[i]);
		}
		int least = 50000000;
		int leastNum = 0;
		for (int i = 0; i < 10; i++) {
			if (nums[i] < least) {
				least = nums[i];
				leastNum = i;
			}
		}
		System.out.println("Java is racist to " + leastNum + "'s");
	}
}
