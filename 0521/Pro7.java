package basic;

import java.util.Scanner;

public class Pro7 {
	public static void main(String[] args) {
		// 삼항연산
		
		Scanner in = new Scanner(System.in);
		System.out.println("당신의 나이를 입력하세요");
		int age = in.nextInt();
		
		String check = (age > 19) ? "성인" : "미성년자";
		
		// System.out.println("당신은 " + check + " 입니다.");
		System.out.printf("당신은 %s 입니다.\n", check);
	}
}
