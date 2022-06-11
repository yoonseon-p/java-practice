package basic;

public class Student {
	int age;
	String name,addr;
	int[] score = new int[4];
	String[] score_name = {"kor","eng","math","sci"}; 
	int total;
	double avg;
	int rank;
	
	// 총점 구하는 함수
	void totalScore() {
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
	}
	
	// 평균 구하는 함수
	void average() {
		avg = total / (double)score.length;
	}
	
	// 석차 구하는 함수 -- 클래스 외부
}
