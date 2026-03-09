package jenkins_project;

import java.util.*;

public class First_run {   // ← class name should match file: First_run.java (case-sensitive!)
    public static void main(String[] args) {   // ← fixed "First_run" to "main", args spelling
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String s1 = sc.next();   // or sc.nextLine() if names have spaces

        System.out.println("Enter the age");
        int age = sc.nextInt();

        System.out.print(age + s1);   // prints number + string (concat)
        // or better: System.out.println("Age: " + age + ", Name: " + s1);

        sc.close();
    }
}