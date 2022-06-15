package com.example.fixedWidth;

public class ConvertNumber {
	public static float toTwoDecimalPlaces(String number) {
		float decimalNumb = Float.parseFloat(number) / 100f;
		return (float) decimalNumb;
	}
}
