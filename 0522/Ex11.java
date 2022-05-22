package basic;
import java.util.*;
//사칙 계산기
public class Ex11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("N1을 입력하세요 : ");
		int n1 = in.nextInt();
		System.out.println("N2을 입력하세요 : ");
		int n2 = in.nextInt();
		
		int a=n1+n2;
		int b=n1-n2;
		int c=n1*n2;
		float d=(float)n1/n2;
		
		System.out.printf("%d + %d = %d\n" ,n1,n2,a);
		System.out.printf("%d - %d = %d\n" ,n1,n2,b);
		System.out.printf("%d * %d = %d\n" ,n1,n2,c);
		System.out.printf("%d / %d = %f\n" ,n1,n2,d);
	}
}
