
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int subjects = 5;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double percentage = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90)
            System.out.println("Grade: A");
        else if (percentage >= 80)
            System.out.println("Grade: B");
        else if (percentage >= 70)
            System.out.println("Grade: C");
        else if (percentage >= 60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");

        sc.close();
    }
}
