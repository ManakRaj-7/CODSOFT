package TASK2_STUDENT_GRADE_CALCULATOR;

import java.util.Scanner;
import java.lang.String;

public class StudentGradeCalculator{

    public static String GradeCalc(float AvgPercentage) {
        int RoundOffPercentage = (int) AvgPercentage / 10;
        switch (RoundOffPercentage) {
            case 10:
                return "A";
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }
    public static void main(String[] args){

        System.out.println("___________________STUDENT GRADE CALCULATOR___________________");
         // using the scanner class to create a scanner object
         Scanner SC = new Scanner(System.in);

         System.out.println("User is requested to enter the number of subjects : ");
         int NumOfSubjects = SC.nextInt();
         
         // creating an array Marks of size equal to NumOfSubjects
         int[] Marks = new int[NumOfSubjects]; 

         int TotalMarksObtained = 0;
         
         // iterating to read marks
         for(int x = 0;x<NumOfSubjects;x++){
            System.out.print("Please enter your your marks for subject " + (x+1) + "(Marks are out of 100): ");
            Marks[x] = SC.nextInt();
            TotalMarksObtained = TotalMarksObtained + Marks[x];

         }

         
        // to calculate average percentage and grade
        float AvgPercentage = (float)TotalMarksObtained/NumOfSubjects; 
        String Grade = GradeCalc(AvgPercentage);

        // displaying results
        System.out.println("\n");
        System.out.println("Results Obtained : ");
        System.out.println("Total Marks obtained : " + TotalMarksObtained);
        System.out.println("Average Percentage : " + AvgPercentage + "%");
        System.out.println("Grade Obtained : " + Grade);

        SC.close();
    }

}