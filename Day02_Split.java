import java.util.Scanner;
import java.util.Arrays;

public class Day02_Split {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("gimme a sentence");

        String[] sence = input.nextLine().split(" ");

        for (int i = 1; i < sence.length; i+=2) {
            System.out.println(sence[i]);
        }
        for (int i = 0; i < sence.length; i++) {
            if (sence.length % 2 == 0) {
                System.out.print(sence[sence.length]);
                System.out.print(sence[sence.length - 1]);
            } else {
                System.out.println(sence[sence.length / 2]);
            }
        }
    }
}
