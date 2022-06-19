package product;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * �ʵ� ����
 * ����Ÿ� : distance
 */
public class Car {
	private String name;					// �ڵ�����
	private int width,height,length;		// ���� ���� ��
	private double x, y, fuel;				// x��ǥ y��ǥ ���ᷮ
	private String puchaseDay;				// ������
	
	public Car(String name, int width, int height, int length, double fuel) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.x = 0.0;
		this.y = 0.0;
		this.fuel = fuel;
		puchaseDay = getCurrentDateForString();
	}
	
	private String getCurrentDateForString() {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy�� mm�� dd��");
		String myDate = sd.format(new Date());
		return myDate;
	}
	
	// x y fuel purchaseDay -- getter �����
	public double getX() {return x;}
	public double getY() {return y;}
	public double getFuel() {return fuel;}
	public String getPuchaseDay() {return puchaseDay;}
	
	// �ڵ����� ����� ǥ���ϴ� method �̸� : getSpec() �̸�, ����, ���� ����
	public void getSpec() {
		String str = String.format("���Գ��� : %s\n�̸� : %s\n���� : %d\n���� : %d\n���� : %d\n���� ���ᷮ : %.2f\n",
				puchaseDay,name,width,height,length,fuel);
		System.out.println(str);
	}
	
	// �ڵ����� Ư�� ��ǥ�� �̵���Ű�� �Լ� move �ܺηκ��� ��ǥ���� �޾Ƽ� ó��
	// move(dx, dy) --> x�������� dx��ŭ �̵�
	// �̵��Ÿ��� ���Ѵ�... root(x^2 + y^2)	Math.sqrt(x^2 + y^2) --> distance
	// distance = Math.sqrt(x^2 + y^2)
	// ����� ����Ÿ���ŭ �پ��� fuel -= distance
	
	public boolean move(double dx, double dy) {
		double currentDistance = (int) Math.sqrt(dx*dx + dy*dy);
		if(currentDistance > fuel)
			return false;
		fuel -= currentDistance;
		x += dx;
		y += dy;
		return true;
	}
}
