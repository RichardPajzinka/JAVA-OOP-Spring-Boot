package com.java;

import java.math.BigDecimal;

public class SimpleInterestFormulaMain {

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5); // 5 year duration
		System.out.println(totalValue);
	}

	}


