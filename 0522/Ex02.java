package basic;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = in.nextInt();
		
		//10~19 10대
		switch(age) {
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			System.out.println("당신은 10대");
			break;
		
		default:
			System.out.println("잘못입력했습니다");
			break;
		}
	}
}
