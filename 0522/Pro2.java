package basic;
import java.util.*;
// ����2
public class Pro2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���۰��� �Է��ϼ��� : ");
		int start = in.nextInt();
		System.out.println("���ᰪ�� �Է��ϼ��� : ");
		int end = in.nextInt();
		
		for(int i=1; i<=9; i++) {
			for(int j=start; j<=end; j++) {
				System.out.printf("%d * %d = %d\t",j,i,(j*i));
			}
			System.out.println();
		}
	}
}
