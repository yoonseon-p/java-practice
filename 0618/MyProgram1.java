/*
 * 
 *  기본요금 12000
 *  할인조건
 *  청소년 - 20% 할인
 *  어린이 - 50% 할인
 *  노약자 - 25% 할인
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
		// 어린이 2명, 노약자 1명, 청소년 3명
		
		// 데이터 생성
		Human[] peoples = {
				new Teenager(12), new Teenager(15), new Teenager(17),
				new Child(10), new Child(8), new Senior(67), 
				new Adult(), new Adult(), new Adult()
		};
		
		//함수 호출
		long total = GetTotalEntryPrice(peoples);
		String str =  String.format("총 입장 수입은 %d원 입니다. ", total);
		System.out.println(str);
		
		
	}

}
