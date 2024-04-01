package OOP_Assignment;

import java.util.Scanner;

public class Student {
    private Scanner sc = new Scanner(System.in);
    
    private int rno, marks, s1, s2, s3, s4, s5;
    private String name, grade, result;
    private float per;
    private String course;
    private static final int TOTAL_MARKS = 500;

    public void get_info() {
        System.out.println("Enter Name of Student:");
        name = sc.next();
        System.out.println("Enter Roll no:");
        rno = sc.nextInt();
        System.out.println("Enter Course name:");
        course = sc.next();

        System.out.println("\n******************************");
        System.out.println("**Enter marks for 5 Subjects**");
        System.out.println("Marathi:");
        s1 = sc.nextInt();
        System.out.println("English:");
        s2 = sc.nextInt();
        System.out.println("Hindi:");
        s3 = sc.nextInt();
        System.out.println("Maths:");
        s4 = sc.nextInt();
        System.out.println("Science:");
        s5 = sc.nextInt();
    }

    public void cal_g() {
        marks = s1 + s2 + s3 + s4 + s5;
        per = (marks * 100) / TOTAL_MARKS;

        if (per > 90)
            grade = "A";
        else if (per > 80)
            grade = "B";
        else if (per > 70)
            grade = "C";
        else if (per > 60)
            grade = "D";
        else
            grade = "F";
    }

    public void cal_r() {
        result = (per > 60) ? "PASS" : "FAIL";
    }

    public void show() {
    	System.out.println("\n\n*************GURUKRUPA TUTORIALS NASHIK*************");
        System.out.println("Name of Student   : " + name);
        System.out.println("Current Course    : " + course);
        System.out.println("Name of Roll no   : " + rno);
        System.out.println("\n\n*************RESULT SHEET*************");
        System.out.println("Marathi           : " + s1);
        System.out.println("English           : " + s2);
        System.out.println("Hindi             : " + s3);
        System.out.println("Maths             : " + s4);
        System.out.println("Science           : " + s5);
        System.out.println("Total Marks       : " + marks);
        System.out.println("Percentage        : " + per);
        System.out.println("Grade             : " + grade);
        System.out.println("Final Result      : " + result);
    }
}
