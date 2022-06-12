package basic;

import java.util.Scanner;

public class Exe {

	
	public static void main(String[] args) {
		// Student
		// 이름 나이 점수 Scanner 이용 입력 받아 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요 : ");
		int number = sc.nextInt();
		Student[] students = new Student[number];
		
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			
			System.out.println("이름을 입력하세요");
			students[i].setName(sc.next());
			
			System.out.println("나이를 입력하세요");
			while (!students[i].setAge(sc.nextInt())) {
				System.out.println("나이는 0 ~ 150 사이에 입력해야 합니다\n다시 입력하세요");
			}
		
			System.out.println("점수를 입력하세요");
			while (!students[i].setScore(sc.nextInt())) {
				System.out.println("점수는 0 ~ 100 사이에 입력해야 합니다\n다시 입력하세요");
			}
			
//			students[i] = new Student(name, age, score);
		}
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]); // 객체 자체를 출력하면 toStirng을 override 했기때문에 주소값이 아니라..
		}
		
	}

}
