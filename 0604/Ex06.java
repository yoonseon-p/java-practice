package basic;
// �迭���� Ư�� ���� ������ ��Ҹ� ã�ƶ�,
// ���ϰ��� ��Ұ� ������ ������ ���� �տ� ��ġ�� ��Ҹ� ã�� �� �α׷��� ���� �ڿ� �ִ� ��Ҹ� ã�� ���α׷�
public class Ex06 {

	public static void main(String[] args) {
		int[] score = {5,4,1,5,6,1,7,8,1,2};
		int findNum = 1;
		int first = 0, end=0,cnt=0;
		
		System.out.println("1�� ���");
		for (int i = 0; i < score.length; i++) {
			if(findNum==score[i] && cnt==0) {
				System.out.printf("score�� %d��°\n",i);
				cnt++;
			}
			else if(findNum==score[i]) {
				end=i;
			}
		}
		if(end!=0)
			System.out.printf("score�� %d��°\n",end);
		
		first = 0; end=0;
		
		System.out.println("2�� ���"); 
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
			System.out.printf("score�� %d��°\n",first);
		else {
			System.out.printf("score�� %d��°\n",first);
			System.out.printf("score�� %d��°\n",end);
		}
		
	}

}
