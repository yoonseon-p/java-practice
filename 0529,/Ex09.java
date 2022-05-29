package basic;
//요소 개수가 5인 double 형 배열을 만들고 앞에서부터 1.1,2.2,3.3,4.4,5.5를 대입해서 표시하는 프로그램
public class Ex09 {
	public static void main(String[] args) {
		double[] doubleArr = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		for(int i=0; i<doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
		}

	}
}
