package product;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 필드 정의
 * 주행거리 : distance
 */
public class Car {
	private String name;					// 자동차명
	private int width,height,length;		// 가로 세로 폭
	private double x, y, fuel;				// x좌표 y좌표 연료량
	private String puchaseDay;				// 구입일
	
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
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 mm월 dd일");
		String myDate = sd.format(new Date());
		return myDate;
	}
	
	// x y fuel purchaseDay -- getter 만들기
	public double getX() {return x;}
	public double getY() {return y;}
	public double getFuel() {return fuel;}
	public String getPuchaseDay() {return puchaseDay;}
	
	// 자동차의 사양을 표시하는 method 이름 : getSpec() 이름, 전폭, 전고 전장
	public void getSpec() {
		String str = String.format("구입날자 : %s\n이름 : %s\n전폭 : %d\n전고 : %d\n전장 : %d\n남은 연료량 : %.2f\n",
				puchaseDay,name,width,height,length,fuel);
		System.out.println(str);
	}
	
	// 자동차를 특정 좌표로 이동시키는 함수 move 외부로부터 좌표값을 받아서 처리
	// move(dx, dy) --> x방향으로 dx만큼 이동
	// 이동거리를 구한다... root(x^2 + y^2)	Math.sqrt(x^2 + y^2) --> distance
	// distance = Math.sqrt(x^2 + y^2)
	// 연료는 주행거리만큼 줄어든다 fuel -= distance
	
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
