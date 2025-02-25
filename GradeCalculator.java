import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Get the student's score from the user
        int score = getStudentScore();
        
        // Determine the corresponding grade
        String grade = calculateGrade(score);
        
        // Display the calculated grade
        System.out.println("Your Grade is: " + grade);
    }
    
    /**
     * Prompts the user to enter their score and returns it.
     * return the student's score as an integer.
     */
    public static int getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        
        // Read the input score (this example assumes a valid integer input)
        int score = scanner.nextInt();
        
        // Optionally, you could add input validation here
        
        scanner.close();
        return score;
    }
    
    /**
     * Calculates the letter grade based on the numerical score.
     * param score the student's score.
     * return the corresponding letter grade as a String.
     */
    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
