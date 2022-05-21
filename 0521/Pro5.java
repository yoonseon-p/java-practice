package basic;

public class Pro5 {
	public static void main(String[] args) {
		int n1 = 313;
		long n2 = 15L;
		
		long res1 = n1 * n2;
		System.out.println(" == 자동 형변환 == ");
		System.out.printf("res1 : %d \n" , res1 );
		
		long res2 = n1 / n2;
		double res3 = n1 / n2;
		double res4 = n1 / 15.0;
		
		System.out.println(" == 정수/실수 결과 == ");
		System.out.printf("res2 - 정수 : %d \n", res2);
		System.out.printf("res3 - 실수 : %f \n", res3);
		System.out.printf("res4 - 실수 : %.3f \n", res4);
		
		int res5 = 1000000 * 1000000;
		
		System.out.println(" == 오버 플로우 == ");
		System.out.println(res5);
	}
}
