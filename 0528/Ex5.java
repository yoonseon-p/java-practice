package basic;
/*
 * ��ȯ���� ���� (for loop, while loop)
 * break, continue
 * 
 * break --> switch
 * 
 */
public class Ex5 {
	public static void main(String[] args) {
		// ���ѷ���
		// break
		int count=0;
		while(true) {
			if(count > 4)
				break;
			System.out.println(count);
			count++;
		}
		
		System.out.println("=======================");
		
		// continue
		count=-1;
		while(count < 5) {
			count++;
			if(count == 3)
				continue;
			System.out.println(count);
			
		}
		
	}
}
