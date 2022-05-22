package basic;
import java.util.*;
// 음수 양수 구분
public class Ex12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int n = in.nextInt();
		
		if(n>0) {
			System.out.println("양수");
		}
		else if(n<0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0");
		}
	}
}
