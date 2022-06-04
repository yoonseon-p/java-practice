package basic;
// 배열에서 특정 값을 가지는 요소를 찾아라,
// 동일값의 요소가 여러개 있으면 가장 앞에 위치한 요소를 찾는 프 로그램과 가장 뒤에 있는 요소를 찾는 프로그램
public class Ex06 {

	public static void main(String[] args) {
		int[] score = {5,4,1,5,6,1,7,8,1,2};
		int findNum = 1;
		int first = 0, end=0,cnt=0;
		
		System.out.println("1번 방법");
		for (int i = 0; i < score.length; i++) {
			if(findNum==score[i] && cnt==0) {
				System.out.printf("score의 %d번째\n",i);
				cnt++;
			}
			else if(findNum==score[i]) {
				end=i;
			}
		}
		if(end!=0)
			System.out.printf("score의 %d번째\n",end);
		
		first = 0; end=0;
		
		System.out.println("2번 방법"); 
		for (int i = 0; i < score.length; i++) {
			if(findNum==score[i]) {
				first=i;
				break;
			}
		}
		
		for (int i = score.length-1; i >= 0; i--) {
			if(findNum==score[i]) {
				end=i;
				break;
			}
		}
		
		if(first==end)
			System.out.printf("score의 %d번째\n",first);
		else {
			System.out.printf("score의 %d번째\n",first);
			System.out.printf("score의 %d번째\n",end);
		}
		
	}

}
