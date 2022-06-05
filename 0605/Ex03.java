package basic;
/*
 * 
 * 사용자가 전달한 값을 가지고 1부터 순차적으로 합을 구하는데
 * 그 합이 50을 넘어가면 중지하고 그때까지의 누적된 합을 출력
 * 만약에 50리 안넘어가면 전부 합을 구해서 출력
 * 
 */
public class Ex03 {

	public static int add(int num) {
		int sum=0;
		for (int i = 0; i <= num; i++) {
			sum += i;
			if(sum > 50) {
				return sum;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10));
	}

}
