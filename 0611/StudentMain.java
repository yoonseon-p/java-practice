package basic;

import java.util.*;

public class StudentMain {

	public static void inputData(Student[] students) {
		Random r = new Random();
		
		// 데이터 입력
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			
			students[i].name = "학생"+(i+1);
			students[i].addr = "주소"+(i+1);
			for (int j = 0; j < students[i].score.length; j++) {
				students[i].score[j] = r.nextInt(100);
			}
			students[i].totalScore();
			students[i].average();
		}
		sortStudents(students); // 정렬
		makeRankStudents(students); // 등수카운팅
	}
	
	// 출력
	public static void showStudents(Student[] students) {
		System.out.printf("no\t rank\t name\t adress\t   kor\t eng\t math\t science  total\t avg\n");
		System.out.println("-------------------------------------------------------------------------------");
		
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			System.out.printf("%d\t %d\t %s\t %s\t   ",i+1,student.rank, student.name, student.addr);
			for (int j = 0; j < student.score.length; j++) {
				System.out.printf("%d\t ",student.score[j]);
			}
			System.out.printf(" %d\t %.2f\n",student.total,student.avg);
		}	
	}
	
	// 정렬
	public static void sortStudents(Student[] students) {
		for (int j = 0; j < students.length; j++) {
			for (int i = 0; i < students.length-1; i++) {
				if(students[i].total < students[i+1].total) {
					Student t = students[i];
					students[i] = students[i+1];
					students[i+1] = t;
				}
			}
		}
	}
	
	// 등수카운팅
	public static void makeRankStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			students[i].rank = i+1;
		}
	}
	
	public static void main(String[] args) {
		// 객체지향 프로그래밍에서 클래스를 만들었다면
		// 그 클래스타입의 객체를 만들어서 그 객체를 가지고 사용
		// 10명의 학생을 관리
		
		//학생 객체가 10개 필요
		Student[] students = new Student[10];
		inputData(students); // 데이터 입력
		showStudents(students); // 출력
		
//		sortStudents(students); // 정렬 내림차순 (가장 큰 값이 앞에 옴)
//		makeRankStudents(students);	// 등수카운팅
//		showStudents(students); // 출력
		
	}
}
