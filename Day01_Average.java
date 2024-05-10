import java.util.Scanner;
import java.util.Arrays;

public class Day01_Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers will you enter?");
        int numAmount = input.nextInt();
        int[] nums = new int[numAmount];
        
        for (int i = 0; i < numAmount; i++) {
            System.out.println("Enter a number:");
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        double total = 0; 
        for (int i = 0; i < numAmount; i++) {
            total += nums[i];
        }

        System.out.println("average is " + total / numAmount);

        int aboveAverage = 0;
        for (int i = 0; i < numAmount; i++) {
            if (nums[i] > total / numAmount) {
                aboveAverage++;
            }
        }
        System.out.println("num above avg " + aboveAverage);
    }
}
