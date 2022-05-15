package basic;

public class Pro3 {
	public static void main(String[] args) {
		// type casting (형 변환)
		int n1 = 100, n2 = 200;
		// 문자열 + 모든타입 ---> 문자열 + 문자열
		System.out.println("더하기 : " + (n1+n2));
		System.out.println("빼기 : " + (n1-n2));
		System.out.println("곱하기 : " + (n1*n2));
		
		// 정수 / 정수는 결과도 정수이기 때문에
		// 실수 / 실수 형태로 변경해 줘야 한다
		// type 변환은 변수명 앞에 (타입)을 적어준다
		System.out.println("나누기 : " + ((double)n1/n2));
		
		/*
		System.out.println((n1));
		System.out.println(((double)n1));
		System.out.println("나누기 : " + ((double)n1/(double)n2));
		*/
	}
}
