import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = scan.nextDouble();
		double result = Sum(num1, num2);
		double result1 = Subtract(num1, num2);
		double result2 = Multiply(num1, num2);
		double result3 = Divide(num1, num2);
		System.out.println("Sum of "+num1 +" + "+ num2 +" = " + result);
		System.out.println("Subtract of "+num1 +" - "+ num2 +" = " + result1);
		System.out.println("Multiply of "+num1 +" * "+ num2 +" = " + result2);
		System.out.println("Divide of "+num1 +" / "+ num2 +" = " + result3);
	}
	public static double Sum(double num1, double num2) {
		return num1 + num2;
		}	
	
	public static double Subtract(double num1, double num2) {
		return num1 - num2;
		}
	
	public static double Multiply(double num1, double num2) {
		return num1 * num2;
		}
	
	public static double Divide(double num1, double num2) {
		return num1 / num2;
		}

}
