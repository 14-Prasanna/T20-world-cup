package interface_handon;


import java.util.*;
class Person {
	String name;
	String address;
	
	Person(String name, String address){
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [Name=" + name + ", Address=" + address + "]";
	}
}

class Student extends Person {
	String program;
	int year;
	double fee;
	
	Student (String name,String address,String program, int year, double fee){
		super(name,address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return program;
	}

	public int getYear() {
		return year;
	}

	public double getFee() {
		return fee;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", program=" + program + ", year=" + year + ", fee="
				+ fee + "]";
	}
	
}
class staff extends Person{
	String school;
	double pay;
	public staff(String name, String address, String school, double pay) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	public String getSchool() {
		return school;
	}
	public double getPay() {
		return pay;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", address=" + address + ", school=" + school + ", pay=" + pay + "]";
	}
	
}
public class handson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int cho;
        
        do {
        	System.out.println("1. Enter Student Details");
            System.out.println("2. Enter Staff Details");
            System.out.print("Choose an option: ");
            cho = in.nextInt();
            in.nextLine();
            
            switch(cho) {
            case 1:
            	System.out.println("\nEnter Student Details:");
                System.out.print("Name: ");
                String Name = in.nextLine();
                System.out.print("Address: ");
                String Address = in.nextLine();
                System.out.print("Program: ");
                String program = in.nextLine();
                System.out.print("Year: ");
                int year = in.nextInt();
                System.out.print("Fee: ");
                double fee = in.nextDouble();
                in.nextLine();
                
                Student s = new Student(Name, Address, program, year, fee);
                System.out.println("\n" + s);
                break;
                
            case 2:
                System.out.println("\nEnter Staff Details:");
                System.out.print("Name: ");
                String stName = in.nextLine();
                System.out.print("Address: ");
                String stAddress = in.nextLine();
                System.out.print("School: ");
                String school = in.nextLine();
                System.out.print("Pay: ");
                double pay = in.nextDouble();
                in.nextLine();

                staff s1 = new staff(stName, stAddress, school, pay);
                System.out.println("\n" + s1);
                break;

            case 3:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice!");    
            }
        }while (cho != 3);
        in.close();
	}
}
