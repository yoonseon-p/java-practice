package basic;
import java.util.*;
public class Ex07 {
	public static void main(String[] args) {
		// Factorial...
		// 5!	5x4x3x2x1
		System.out.println("���丮�� ���� �Է��ϼ��� : ");
		Scanner in = new Scanner(System.in);
		int factnum = in.nextInt();
		long sum=1;
		
		for(int i=1; i<=factnum; i++)
		{
			sum*=i;
		}
		
		System.out.printf("%d ���丮���� : %d\n" , factnum, sum);
	}
}
