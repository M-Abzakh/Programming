package Calculator;

import java.util.Scanner;

public class Method {
	public static int add(int n1, int n2){
		int add=n1+n2;
		return add;
	}
		public static int subtract(int n1, int n2){
			int subtract=n1-n2;
			return subtract;
		
	}
		public static int multiply(int n1, int n2){
			int multiply=n1*n2;
			return multiply;
		}
		public static int divide(int n1, int n2){
			int divide=n1/n2;
			return divide;
		}
		public static int readNumber(){
			Scanner s = new Scanner(System.in);
	        System.out.print("Enter your Number : ");
	        int n = s.nextInt();
			return n;
		}
	

	public static void main(String[] args) {
		int n1= readNumber();
		int n2= readNumber();
		int result;
		System.out.println("1-Add");
		System.out.println("2-Sub");
		System.out.println("3-Multi");
		System.out.println("4-Div");
		System.out.println("5-Quit");
		System.out.println("Please enter your choice:");
		int choice = readNumber();
		switch(choice){
		case 1:
			result=add(n1,n2);
			System.out.println(result);
			break;
		case 2:
			result=subtract(n1,n2);
			System.out.println(result);
			break;
		case 3:
			result=multiply(n1,n2);
			System.out.println(result);
			break;
		case 4:
			result=divide(n1,n2);
			System.out.println(result);
			break;
		case 5:
			System.out.println("The programme has ended");
			return;
		}
	}
}
