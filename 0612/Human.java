package basic;

/*
 * 
 * ����ȭ - private
 * ĸ��ȭ - private
 * ��������� private
 * ��������� �����Ҽ� �ִ� get-- set-- �޼ҵ带 ����
 * get-- set-- �޼ҵ�� ��Ȳ�� ���� validation check ��ȿ�� �˻�
 * �̸��� �����̿ü� ����
 * height 0���� ũ�� 300 ���Ͽ����Ѵ�
 * weight 0���� ũ�� 1000 ���Ͽ����Ѵ�
 * 
 */

public class Human {
	private String name;
	private int height,weight;
	
	boolean setName(String name) {
		if( name != " ") {
			this.name = name;
			return true;
		}
		else {
			System.out.println("�̸��� ������ �� �� �����ϴ�");
			return false;
		}
	}
	String getName() {
		return name;
	}
	
	boolean setHeight(int height) {
		if(height > 0 && height < 300) {
			this.height = height;
			return true;
		}
		else {
			System.out.println("0�� 300������ ������ �Է��ϼ���");
			return false;
		}
	}
	int getHeight() {
		return height;
	}
	
	boolean setWeight(int weight) {
		if(weight > 0 && weight < 1000) {
			this.weight = weight;
			return true;
		}
			
		else {
			System.out.println("0�� 1000������ ������ �Է��ϼ���");
			return false;
		}
	}
	int getWeight() {
		return weight;
	}
	
}
