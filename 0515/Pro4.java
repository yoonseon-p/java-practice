package basic;

public class Pro4 {
	public static void main(String[] args) {
		// 타입 변환
		int num = 100;
		// auto casting -- 묵시적 형변환
		// double dnum = (double)num;
		double dnum = num;
		System.out.println(dnum);
		
		
		// non auto casting -- 개발자가 직접해줘야 함 -- 명시적 형변환
		int num2= (int)dnum;
	}
}
