package com.cg.assignment.utility;

import com.cg.assignment.exception.InvalidDivisionException;
import com.cg.assignment.exception.InvalidNumberException;

public class ArithmeticOperationHelper {

	public static float divideNumber(float firstNumber, float secondNumber)
			throws InvalidDivisionException, InvalidNumberException {
		if (firstNumber < secondNumber) {
			float tempNumber = firstNumber;
			firstNumber = secondNumber;
			secondNumber = tempNumber;
//			throw new InvalidNumberException("Your Second number must be equal of less than first number");
		}
		if (secondNumber == 0) {
			throw new InvalidDivisionException("Division not possible with 0");
		}
		float result = firstNumber / secondNumber;
		return result;
	}

}
