package basic;

public class Student {
	int age;
	String name,addr;
	int[] score = new int[4];
	String[] score_name = {"kor","eng","math","sci"}; 
	int total;
	double avg;
	int rank;
	
	// ���� ���ϴ� �Լ�
	void totalScore() {
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
	}
	
	// ��� ���ϴ� �Լ�
	void average() {
		avg = total / (double)score.length;
	}
	
	// ���� ���ϴ� �Լ� -- Ŭ���� �ܺ�
}
