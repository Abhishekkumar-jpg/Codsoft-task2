import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] scores = new double[numSubjects];
        double total = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the score for subject " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            total += scores[i];
        }

        double average = total / numSubjects;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.printf("Total Score: %.2f\n", total);
        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}