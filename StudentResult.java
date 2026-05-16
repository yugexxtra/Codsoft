import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int subCount;
        int totalMarks = 0;

        System.out.print("How many subjects do you have? : ");
        subCount = input.nextInt();

        for(int i = 1; i <= subCount; i++) {

            System.out.print("Enter marks of subject " + i + " : ");
            int marks = input.nextInt();

            totalMarks = totalMarks + marks;
        }

        double avg = totalMarks / (double) subCount;

        String grade;

        if(avg >= 90) {
            grade = "A";
        }
        else if(avg >= 75) {
            grade = "B";
        }
        else if(avg >= 60) {
            grade = "C";
        }
        else if(avg >= 35) {
            grade = "D";
        }
        else {
            grade = "Fail";
        }

        System.out.println("\n------ RESULT ------");
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage = " + avg);
        System.out.println("Grade = " + grade);

        input.close();
    }
}