import java.util.Scanner;
public class Lab_Plinko {
    public static void dropMarble(int[] slots){
        int bounce = 0;
        int totalBounce = 0;
        for (int i = 0; i < slots.length - 1; i++) {
            bounce = (int)(Math.random() * 2);
            if (bounce == 0) {System.out.print("L");} else {System.out.print("R");}
            totalBounce += bounce;
            }System.out.println();
            slots[totalBounce] += 1;
        }

    public static void printBoard(int[] slots){
        for (int i = 0; i < slots.length; i++) {
            System.out.print(slots[i] + "|");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to\t ____  _     ___ _   _ _  _____    _  _\n" + //
                        "\t\t|  _ \\| |   |_ _| \\ | | |/ / _ \\  | || |\n" + //
                        "\t\t| |_) | |    | ||  \\| | ' / | | | |_||_|\n" + //
                        "\t\t|  __/| |___ | || |\\  | . \\ |_| |  _  _\n" + //
                        "\t\t|_|   |_____|___|_| \\_|_|\\_\\___/  |_||_|\n"); // made using https://www.asciiart.eu/text-to-ascii-art

        System.out.println("How many slots are on the board?");
        int[] slots = new int[input.nextInt()];
        System.out.println("How many marbles are you dropping?");
        int marblesDropped =  input.nextInt();

        for (int i = 0; i < marblesDropped; i++) {
            dropMarble(slots);
        }
        printBoard(slots);
    }
}