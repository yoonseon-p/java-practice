package basic;

import java.util.Scanner;

public class Ex02 {
//	public static void hello (String name) {
//		System.out.printf("안녕하세요 %s님 반갑습니다.\n", name);
//	}
	
	public static String hello (String name) {
		String str = String.format("안녕하세요 %s님 반갑습니다.\n", name);
		return str;
	}
	
	
	public static void main(String[] args) {
		String name = "박윤선";
		String result = hello(name);
		System.out.println(result);
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("이름을 입력하세요");
//		String name = in.next();
//		hello(name);
	}
}
