package basic;

public class Ex06 {

	public static void main(String[] args) {
		int[]  num = {88, 72, 96, 28, 60};
		int sum=0;
		// for each = 읽기 전용
//		for (int i : num) {
//			System.out.println(i);
//		}
		
		
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		System.out.println(sum);
	}

}
