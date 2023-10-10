import java.util.Scanner;
public class marks{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of subjects");
        int numsubjects = scanner.nextInt();
        int[] marks = new int[numsubjects];
        for (int i = 0; i < numsubjects; i++) {
            System.out.println("subject " + (i + 1) + " =");
            marks[i] = scanner.nextInt();
        }
        scanner.close();
        int total = 0;
        for (int i = 0; i < numsubjects; i++) {
            total += marks[i];
        }
        System.out.println("total marks: "+total);
        double average = (double) total / numsubjects;
        System.out.println("Average = "+average);
        String grade;
        if (average >= 90){
            grade = "A GOOD";
        }else if (average >= 80){
            grade = "B AVERAGE";
        }else if (average >= 70){
            grade = "C CAN DO BETTER";
        }else if (average >= 60){
            grade = "D NEED TO IMPROVE";
        }else {
            grade = "F FAIL";
        }
        System.out.println("Grade: "+grade);
        scanner.close();
    }
}
