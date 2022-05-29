package basic;
//요소개수가 5개인 int형 배열에 순서대로 5 4 3 2 1을 대입하고 전부출력
public class Ex08 {
	public static void main(String[] args) {
		int[] intArr = {5, 4, 3, 2, 1};
		
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}

	}
}
