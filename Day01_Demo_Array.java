import java.util.Arrays;

public class Day01_Demo_Array {
    public static void main(String[] args) {
        // create an array of 7 ints called array1
        int[] array1 = new int[7];
        // another array called array2 with
        // the values of 14,19,25,99
        int[] array2 = {14,19,25,99};
        // set the first and the last positions of
        // the first array to the middle
        // two values of the second array
        array1[0] = array2[2];
        array1[array1.length - 1] = array2[2];
        // print the values of array 1 using a
        // for loop
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        // print the array2 w/o a for loop
        System.out.println(Arrays.toString(array2));
    }
}