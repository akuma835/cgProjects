package com.cg.assignment.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.assignment.exception.InvalidDivisionException;
import com.cg.assignment.exception.InvalidNumberException;
import com.cg.assignment.utility.ArithmeticOperationHelper;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float firstNumber = 0;
		float secondNumber = 0;
		float resultDivision = 0;
		try {
			System.out.println("Enter the FirstNumber1");
			firstNumber = scanner.nextInt();
			System.out.println("Enter the SecondNumber" + "");
			secondNumber = scanner.nextInt();

			resultDivision = ArithmeticOperationHelper.divideNumber(firstNumber, secondNumber);
			System.out.println("Your result is " + resultDivision);
		} catch (InvalidNumberException e) {
			System.err.println(e.getMessage());
		} catch (InvalidDivisionException e) {
			System.err.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.err.println("You have not given the correct number as a input");
		}
	}
}
