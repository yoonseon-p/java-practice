package basic;

public class Pro2 {
	public static void main(String[] args) {
		int res1 = 202983738 + 903847563;
		
		// 실수를 정수형 변수에 대입하려면 큰범위에서 작은범위로 전환되기 때문에
		// 사용자가 젼수타입을 저장하려는 정수로 변환해야 한다.
		int res2 = (int)(5.0/2);
		
		int res3 = -10000000*10000000;
		
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
	}
}
