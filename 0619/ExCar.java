// �����ڴ� �ݵ�� �θ��� �����ڸ� ȣ���Ѵ�. �̶� ������ �����ڸ� ȣ��
// ����Ʈ�� �θ��� ����Ʈ �����ڸ� ȣ��
// �Ű����� �����ڴ� �θ��� �Ű����� �����ڸ� ȣ��
public class ExCar extends Car {
	private double totalMileage; // �� ����Ÿ�
	
	// �θ��� �����ڿ� ������ �����ڸ� ��������
	// �ڽ��� ��� �����ڴ� �⺻������ �θ��� �⺻�����ڸ� ȣ���ϰ� �Ǿ� �ִ�..
	// �����ڿ����� �ٸ� �����ڸ� ȣ���Ҽ� �ִ�...
	// ���� �θ��� �����ڸ� ȣ���Ϸ��� super Ű���带 ����ϰ�
	// �ڽ��� �����ڸ� ȣ���Ҷ��� this�� ����Ѵ�.
	
	public ExCar(String name, int width, int height, int length, double fuel) {
		super(name, width, height, length, fuel);
		totalMileage = 0.0;
	}

	@Override
	public void getSpec() {
		super.getSpec();
		System.out.printf("�� ���ϸ��� : %.2f\n", totalMileage);
	}
	
	public boolean move(double dx, double dy) {
		// �θ��� ����߿� ���� ���ϸ��� �����ϴ� ����� �߰��ؼ� ������ ���� �����.
		// �̶� �θ��� ����̳� �Ǵ� ������ �̿�
		double currentDistance = (int) Math.sqrt(dx*dx + dy*dy);
		if(!super.move(dx, dy))
			return false;
		totalMileage += currentDistance;
		return true;
	}
	
	// ��������� �ʱ�ȭ �ϴ� ������ - totalMileage�� ��� �����Ҳ���? ���� �����ϴ� ����� ���� ��ȯ�ϴ� ���
	// �θ��� �Լ����߿��� ���� �״�� �ᵵ �ɱ�?
	// 1. getSpec()�Լ���?
	// 2. move()�Լ���?
	
	
}
