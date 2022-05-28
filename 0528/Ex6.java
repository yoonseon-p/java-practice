package basic;

public class Ex6 {

	public static void main(String[] args) {
		// 0 ~ 10포함해서 출력 while문
		int n=-1;
		
		while(n<10) {
			n++;
			System.out.println(n);
		}
		System.out.println("=======================");
		
		// 0 ~ 10포함해서 출력 for문
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("=======================");
		
		// continue를 포함해서 0 ~ 10중에서 짝수만 출력 while문
		n=-1;
		
		while(n<10) {
			n++;
			if(n % 2 !=0 || n == 0) 
				continue;
			System.out.println(n);
		}
		System.out.println("=======================");
		
		// continue를 포함해서 0 ~ 10중에서 짝수만 출력 for문
		for(int i=0; i<=10; i++) {
			if(i % 2 !=0 || i == 0) 
				continue;
			System.out.println(i);
		}
		System.out.println("=======================");
		
		// continue를 포함해서 0 ~ 100중에서 3의 배수만 출력 while문
		n=-1;
		
		while(n<100) {
			n++;
			if(n % 3 !=0 || n == 0) 
				continue;
			System.out.println(n);
		}
		System.out.println("=======================");
		
		// continue를 포함해서 0 ~ 100중에서 3의 배수만 출력 for문
		for(int i=0; i<=100; i++) {
			if(i % 3 !=0 || i == 0) 
				continue;
			System.out.println(i);
		}

	}

}
