package jenkins_project;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String s1 = sc.next();   // or sc.nextLine() if names have spaces

        System.out.println("Enter the age");
        int age = sc.nextInt();

        System.out.print(age + s1);   // prints number + string (concat)
        // or better: System.out.println("Age: " + age + ", Name: " + s1);



	}

}
