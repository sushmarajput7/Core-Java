package corejava;

import java.util.Scanner;

class AssignmentOperators {

	public static void main(String[] args) {
		//Creating Object of scanner class
		Scanner sc = new Scanner(System.in);
		
		//Taking input from the user
		System.out.println("Enter first Value");
		int num1 =sc.nextInt();
		System.out.println("Enter Second Value");
		int num2 =sc.nextInt();
		
		//Adding an Assigning Value
		num1 += num2;
		System.out.println("num1="+num1);
		
		//Subtracting an Assigning Value
				num2 -= num1;
				System.out.println("num1="+num2);
				
	    //Multiply an Assigning Value
				num2 *= num1;
				System.out.println("num2="+num2);
				
		 //Dividing an Assigning Value
				num2/= num1;
				System.out.println("num2="+num2);
				
		 //Modulo an Assigning Value
				num2 %= num1;
				System.out.println("num2="+num2);
		
		
		

	}

}
