package basic;
import java.util.Scanner;
public class Pro13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n1입력 : ");
		int n1= in.nextInt();
		System.out.println("n2입력 : ");
		int n2= in.nextInt();
		
		if(n1 > 0 && n2 > 100) {
			System.out.println("n1은 0 보다 크고 n2는 100보다 크다.");
		}
		else {
			System.out.println("조건을 만족하지 않음");
		}
	}
}
