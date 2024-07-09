import java.util.Scanner;

public class ExamProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Variables for coursework assessments
        int[] assessments = {5, 4, 8, 13, 11}; //scores for ass1, ass2, ass3, cat1, cat2
        int courseworkTotal = 0;
        for (int assessment : assessments) {
            courseworkTotal += assessment;
        }

        // Menu
        do {
            System.out.println("Menu:");
            System.out.println("1. View coursework results");
            System.out.println("2. View exam results");
            System.out.println("3. Exit the program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Coursework Results: ");
                    System.out.println("Total Coursework Score: " + courseworkTotal + "/50");
                    break;
                case 2:
                    System.out.println("Enter Final Exam Score (out of 50): ");
                    int finalExamScore = scanner.nextInt();
                    int totalScore = courseworkTotal + finalExamScore;
                    System.out.println("Total Score: " + totalScore + "/100");
                    
                    // Decision function
                    if (courseworkTotal < 2 * (50 / 3)) {
                        System.out.println("You have not completed 2/3 of the coursework. You are required to repeat the course.");
                    } else {
                        System.out.println("You have completed 2/3 of the coursework.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
