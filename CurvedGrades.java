// Sal
import java.util.Scanner;
import java.util.Arrays;
public class CurvedGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the student names, separated by commas:");

        String[] students = input.nextLine().split(", ");

        for (int i = 0; i < students.length; i++) {
            students[i] = students[i].trim();
        }

        System.out.println(Arrays.toString(students));

        int[] grades = new int[students.length];
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter score of " + students[i] + ": ");
            grades[i] = input.nextInt();
        }

        int highest = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > highest) {
                highest = i;
                highest = grades[i];
            }
        }

        System.out.println();
        for (int i = 0; i < students.length; i++) {
            String letterGrade = "";
            String anOrA = "a";
            if (grades[i] > (highest - 5)) {letterGrade = "A";}
            else if (grades[i] > (highest - 15)) {letterGrade = "B";}
            else if (grades[i] > (highest - 25)) {letterGrade = "C";}
            else if (grades[i] > (highest - 35)) {letterGrade = "D";}
            else if (grades[i] <= (highest - 35)) {letterGrade = "F";}

            if (letterGrade.equals("A") || letterGrade.equals("F")) {anOrA = "an";}
            System.out.println(students[i] + "'s grade is " + anOrA + " " + letterGrade);
        }
    }
}