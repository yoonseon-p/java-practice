package basic;

import java.util.Scanner;

public class Pro11 {
	public static void main(String[] args) {
		System.out.println("국어 영어 수학 점수를 공백을 기준으로 입력하세요");
		//80 90 80 83.333...
		
		Scanner in = new Scanner(System.in);
		
		int kor= in.nextInt();
		int eng= in.nextInt();
		int math= in.nextInt();
		// 정수 + 정수 +정수는 결과가 정수
		// 정수 / 정수 결과 정수
			
		double avg =((double)kor+eng+math) / 3;
		//double avg =(kor+eng+math) / 3.0;
		//정석 -- double avg =((double)kor+(double)eng+(double)math) / (double)3;
		System.out.println("평균 점수 : " + avg);
	}
}
