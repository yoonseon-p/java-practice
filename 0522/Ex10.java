package basic;
import java.util.*;
// 홀 짝 구분
// 배수 
public class Ex10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int n = in.nextInt();
		
		if(n%2==0) {
			System.out.println("짝");
		}
		else {
			System.out.println("홀");
		}
		
		if(n%2==0) {
			System.out.println("2의 배수");
		}
		else if(n%3==0) {
			System.out.println("3의 배수");
		}
		else if(n%5==0) {
			System.out.println("5의 배수");
		}
		else if(n%7==0) {
			System.out.println("7의 배수");
		}
		else {
			System.out.println("2,3,5,7의 배수가 아님");
		}
	}
}
