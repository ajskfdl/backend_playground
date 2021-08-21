package Operator;

public class Main02 {

	public static void main(String[] args) {
		// 정수의 나눗셈
		int a = 7;
		int b = 3;
		int result = a / b;
		System.out.println("7/3 = " + result);
		
		// 실수의 나눗셈
		double c = 7.0d;
		double d = 3.0d;
		double result2 = c/d;
		System.out.println("7.0 / 3.0 = " + result2);
		
		// 정수와 실수를 계산
		//int result3 = c / b;
		double result3 = c / b;
		System.out.println("7.0 / 3 = " + result3);
		
		// 0으로 나누기
		int num = 100;
		int zero = 0;
		int result4 = num / zero;
		
		System.out.println("100 / 0 = " + result4);
	}

}
