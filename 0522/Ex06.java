package basic;
import java.util.*;
/*
 * ������
 * ��ø for��
 */
public class Ex06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���۰��� �Է��ϼ��� : ");
		int start = in.nextInt();
		System.out.println("���ᰪ�� �Է��ϼ��� : ");
		int end = in.nextInt();
		
		System.out.println("========== ������ ==========\n");
		for(int i = start; i <= end; i++) {
			System.out.println(i +"��\n");
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j , i*j);
			}
			System.out.println();
		}
		
		
		System.out.println("========== ������ ==========\n");
		for(int i = end; i >= start; i--) {
			System.out.println(i +"��\n");
			for(int j=9; j>=1; j--) {
				System.out.printf("%d * %d = %d\n", i, j , i*j);
			}
			System.out.println();
		}
		
	}
}
