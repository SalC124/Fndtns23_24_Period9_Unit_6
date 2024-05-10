import java.util.Scanner;

public class Day02_Warmup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[7];
        System.out.println("gimme 7 nums");
        for (int i = 0; i < 7; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println(nums[3]);
        System.out.println(nums[0] + " and " + nums[6]);

        for (int i = 6; i > -1; i--) {
            System.out.println(nums[i]);
        }
    }
}
