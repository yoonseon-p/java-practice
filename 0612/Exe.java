package basic;

import java.util.Scanner;

public class Exe {

	
	public static void main(String[] args) {
		// Student
		// �̸� ���� ���� Scanner �̿� �Է� �޾� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�л����� �Է��ϼ��� : ");
		int number = sc.nextInt();
		Student[] students = new Student[number];
		
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			
			System.out.println("�̸��� �Է��ϼ���");
			students[i].setName(sc.next());
			
			System.out.println("���̸� �Է��ϼ���");
			while (!students[i].setAge(sc.nextInt())) {
				System.out.println("���̴� 0 ~ 150 ���̿� �Է��ؾ� �մϴ�\n�ٽ� �Է��ϼ���");
			}
		
			System.out.println("������ �Է��ϼ���");
			while (!students[i].setScore(sc.nextInt())) {
				System.out.println("������ 0 ~ 100 ���̿� �Է��ؾ� �մϴ�\n�ٽ� �Է��ϼ���");
			}
			
//			students[i] = new Student(name, age, score);
		}
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]); // ��ü ��ü�� ����ϸ� toStirng�� override �߱⶧���� �ּҰ��� �ƴ϶�..
		}
		
	}

}
