package basic;
// ��������� private
// �ʿ��ϸ� getter/setter�� �����... alt+shift+s
// ��������� �ʱ�ȭ �ϴ� �Ű����� �����ڸ� �����
// ��� ����� ���� Ȯ���� �����ϵ��� toString()�� �����
// name age
public class Human3 {
	private String name;
	private int age;
	
	public Human3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Human3 [name=" + name + ", age=" + age + "]";
	}
	
}
