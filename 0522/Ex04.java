package basic;
import java.util.*;
/*
 * ���� 2���� �Է� �޾Ƽ� .. ex) 1 5
 * 1~5������ ���� ���ϼ���
 * �Է� �޾� ����ϱ� 3�� �ݺ�
 * 
 */
public class Ex04 {
	public static void main(String[] args) {
		for(int k=0; k<3; k++) {
			Scanner in = new Scanner(System.in);
			System.out.println("���۰��� �Է��ϼ��� : ");
			int start = in.nextInt();
			System.out.println("���ᰪ�� �Է��ϼ��� : ");
			int end = in.nextInt();
			// �հ踦 ������ ����
			int sum=0;
			
			for(int i=start; i<=end; i++) { // start ~ end
				sum+=i;
			}
			
			System.out.printf("%d���� %d������ �� = %d\n",start, end, sum);
			System.out.println("===================");
		}
		
	}
}
