package basic;

public class Ex06 {
	
	// 정수형 변수 1개
	// 정수형 변수 1개
	// 정수형 변수 1개
	// 정수형 변수 1개
	// 정수형 변수 5개를 갖는 함수를 설계
		
	// 객체지향의 가장 핵심인 overload -  대표적인 케이스가 overload
	// constructor overload
//	public static void method(int num) { }
//	public static void method(int num, int num2) { }
//	public static void method(int num, double num2) { }
//	public static void method(double num, int num2) { }
//	public static void method(int num, int num2, int num3) { }
	
	public static void method(int...num) { 
		System.out.println(num.length);
		System.out.println(num[0]);
	}
	
	public static void main(String[] args) {
		method(1,2,3,4);
		method(1,2);
		method(1);
		method(1,2,3,4,5,6,7,8,9,10,11,12);
	}
}
