
import java.util.Scanner;
 public class StudentGradeCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of subjects: ");
            int SubjectNumber = scanner.nextInt();

            int totalMarks = 0;

            for (int i = 1; i <= SubjectNumber; i++) {
                System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
                int marks = scanner.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                    return;
                }
                totalMarks += marks;
            }

            double average = (double) totalMarks / SubjectNumber;

            char grade;

            if (average >= 100) {
                grade = 'O';
            } else if (average >= 80) {
                grade = 'A';
            } else if (average >= 70) {
                grade = 'B';
            } else if (average >= 60) {
                grade = 'C';
            } else {
                grade = 'F';
            }

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + average + "%");
            System.out.println("Grade: " + grade);
        }
    }

