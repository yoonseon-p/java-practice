package basic;

public class Pro5 {
	public static void main(String[] args) {
		int n1 = 313;
		long n2 = 15L;
		
		long res1 = n1 * n2;
		System.out.println(" == �ڵ� ����ȯ == ");
		System.out.printf("res1 : %d \n" , res1 );
		
		long res2 = n1 / n2;
		double res3 = n1 / n2;
		double res4 = n1 / 15.0;
		
		System.out.println(" == ����/�Ǽ� ��� == ");
		System.out.printf("res2 - ���� : %d \n", res2);
		System.out.printf("res3 - �Ǽ� : %f \n", res3);
		System.out.printf("res4 - �Ǽ� : %.3f \n", res4);
		
		int res5 = 1000000 * 1000000;
		
		System.out.println(" == ���� �÷ο� == ");
		System.out.println(res5);
	}
}
