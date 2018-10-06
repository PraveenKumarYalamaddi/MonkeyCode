package com.mockito.code;

public class MathApplication {
	private CalculatorService calculatorService;

	public CalculatorService getCalculatorService() {
		return calculatorService;
	}

	public void setCalculatorService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	public double add(double input1, double input2) {
		return calculatorService.add(input1, input2);
		//return input1+input2;
	}
	
	public double substarct(double input1, double input2) {
		//return calculatorService.substarct(input1, input2);
		return(input1-input2);
	}
	
	public double multyplay(double input1, double input2) {
		return calculatorService.multiply(input1, input2);
	}
	
	public double divide(double input1, double input2) {
		return calculatorService.divide(input1, input2);
	}

}
