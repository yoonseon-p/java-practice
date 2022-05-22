package basic;
import java.util.*;
// 두개의 숫자 절대값을 더하기
public class Ex14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("N1을 입력하세요 : ");
		int n1 = in.nextInt();
		System.out.println("N2을 입력하세요 : ");
		int n2 = in.nextInt();
		
		if(n1<0) {
			n1*=-1;
		}
		else if(n2<0) {
			n2*=-1;
		}
		
		int sum = n1+n2;
		
		System.out.println(sum);
	}
}
