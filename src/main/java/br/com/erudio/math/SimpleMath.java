package br.com.erudio.math;

public class SimpleMath {
	
	public Double sum(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public Double sub(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public Double mult(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public Double div(Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;
	}
	
	public Double med(Double firstNumber, Double secondNumber) {
		return (firstNumber + secondNumber) /2;
	}
	
	public Double pwr(Double firstNumber, Double secondNumber) {
		return Math.pow(firstNumber, secondNumber);
	}
	
	public Double sqrt(Double firstNumber) {
		return Math.sqrt(firstNumber);
	}
}
