package basic;

public class Ex6 {

	public static void main(String[] args) {
		// 0 ~ 10�����ؼ� ��� while��
		int n=-1;
		
		while(n<10) {
			n++;
			System.out.println(n);
		}
		System.out.println("=======================");
		
		// 0 ~ 10�����ؼ� ��� for��
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("=======================");
		
		// continue�� �����ؼ� 0 ~ 10�߿��� ¦���� ��� while��
		n=-1;
		
		while(n<10) {
			n++;
			if(n % 2 !=0 || n == 0) 
				continue;
			System.out.println(n);
		}
		System.out.println("=======================");
		
		// continue�� �����ؼ� 0 ~ 10�߿��� ¦���� ��� for��
		for(int i=0; i<=10; i++) {
			if(i % 2 !=0 || i == 0) 
				continue;
			System.out.println(i);
		}
		System.out.println("=======================");
		
		// continue�� �����ؼ� 0 ~ 100�߿��� 3�� ����� ��� while��
		n=-1;
		
		while(n<100) {
			n++;
			if(n % 3 !=0 || n == 0) 
				continue;
			System.out.println(n);
		}
		System.out.println("=======================");
		
		// continue�� �����ؼ� 0 ~ 100�߿��� 3�� ����� ��� for��
		for(int i=0; i<=100; i++) {
			if(i % 3 !=0 || i == 0) 
				continue;
			System.out.println(i);
		}

	}

}
