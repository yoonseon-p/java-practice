/*
 * 
 *  �⺻��� 12000
 *  ��������
 *  û�ҳ� - 20% ����
 *  ��� - 50% ����
 *  ����� - 25% ����
 * 
 */
public class MyProgram1 {
	public static Long GetTotalEntryPrice(Human[] peoples) {
		long total = 0L;
		for (int i = 0; i < peoples.length; i++) {
			total += peoples[i].getPrice();
		}
		return total;
	}
	
	public static void main(String[] args) {
		// ��� 2��, ����� 1��, û�ҳ� 3��
		
		// ������ ����
		Human[] peoples = {
				new Teenager(12), new Teenager(15), new Teenager(17),
				new Child(10), new Child(8), new Senior(67), 
				new Adult(), new Adult(), new Adult()
		};
		
		//�Լ� ȣ��
		long total = GetTotalEntryPrice(peoples);
		String str =  String.format("�� ���� ������ %d�� �Դϴ�. ", total);
		System.out.println(str);
		
		
	}

}
