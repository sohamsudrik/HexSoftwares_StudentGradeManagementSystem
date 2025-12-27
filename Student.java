package com.task2;

public class Student {
	
	 String name;
	    int studentId;
	    int[] grades;

	    // Constructor
	    public Student(String name, int studentId, int[] grades) {
	        this.name = name;
	        this.studentId = studentId;
	        this.grades = grades;
	    }

	    // Calculate average
	    double calculateAverage() {
	        int sum = 0;
	        for (int g : grades) {
	            sum += g;
	        }
	        return (double) sum / grades.length;
	    }

	    // Display grades
	    void displayGrades() {
	        System.out.print("Grades: ");
	        for (int g : grades) {
	            System.out.print(g + " ");
	        }
	        System.out.println();
	    }

	    // Pass or Fail
	    void checkResult() {
	        if (calculateAverage() >= 40) {
	            System.out.println("Result: PASS");
	        } else {
	            System.out.println("Result: FAIL");
	        }
	    }
	}
