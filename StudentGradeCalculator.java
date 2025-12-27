package com.task1;
import java.util.Scanner;

public class StudentGradeCalculator {
	
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];
        double classTotal = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            sc.nextLine(); // consume newline
            String name = sc.nextLine();

            System.out.print("Student ID: ");
            int id = sc.nextInt();

            System.out.print("Number of subjects: ");
            int subjects = sc.nextInt();

            int[] grades = new int[subjects];
            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter grade " + (j + 1) + ": ");
                grades[j] = sc.nextInt();
            }

            students[i] = new Student(name, id, grades);
            classTotal += students[i].calculateAverage();
        }

        System.out.println("\n----- Student Results -----");

        for (Student s : students) {
            System.out.println("\nName: " + s.name);
            System.out.println("Student ID: " + s.studentId);
            s.displayGrades();
            System.out.println("Average: " + s.calculateAverage());
            s.checkResult();
        }

        double classAverage = classTotal / n;
        System.out.println("\nClass Average: " + classAverage);

        sc.close();
    }

}
