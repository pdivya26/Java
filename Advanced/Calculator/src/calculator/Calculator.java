package calculator;

import java.util.*;
import javax.swing.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
                
		System.out.println("Enter the first number: ");
		double num1 = input.nextDouble();

		System.out.println("Enter the second number: ");
		double num2 = input.nextDouble();

		System.out.println("Choose an operation (+, -, *, /): ");
		char operator = input.next().charAt(0);

		double result;

		switch (operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				System.out.println("Invalid operator");
				return;
		}

		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}
}