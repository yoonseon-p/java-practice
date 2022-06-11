package basic;

import java.util.*;

public class StudentMain {

	public static void inputData(Student[] students) {
		Random r = new Random();
		
		// ������ �Է�
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			
			students[i].name = "�л�"+(i+1);
			students[i].addr = "�ּ�"+(i+1);
			for (int j = 0; j < students[i].score.length; j++) {
				students[i].score[j] = r.nextInt(100);
			}
			students[i].totalScore();
			students[i].average();
		}
		sortStudents(students); // ����
		makeRankStudents(students); // ���ī����
	}
	
	// ���
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
	
	// ����
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
	
	// ���ī����
	public static void makeRankStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			students[i].rank = i+1;
		}
	}
	
	public static void main(String[] args) {
		// ��ü���� ���α׷��ֿ��� Ŭ������ ������ٸ�
		// �� Ŭ����Ÿ���� ��ü�� ���� �� ��ü�� ������ ���
		// 10���� �л��� ����
		
		//�л� ��ü�� 10�� �ʿ�
		Student[] students = new Student[10];
		inputData(students); // ������ �Է�
		showStudents(students); // ���
		
//		sortStudents(students); // ���� �������� (���� ū ���� �տ� ��)
//		makeRankStudents(students);	// ���ī����
//		showStudents(students); // ���
		
	}
}
