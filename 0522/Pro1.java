package basic;
import java.util.*;
// ����1
public class Pro1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int n = in.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		
		for(int i=n; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
