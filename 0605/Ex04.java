package basic;
/*
 * 
 * 계산기 아주 단순한 계산기
 * 사칙연산 피 연산자는 두개로 제한 + - * / 
 * 1,"+",1 --> 1+1
 * 
 * (int num1, String op, int num2)
 * 
 */
public class Ex04 {
	public static double calc (int num1, String op, int num2){
		int res = 0;
		switch (op) {
		case "+":
			res =  num1 + num2;
			break;
		case "-":
			res =  num1 - num2;
			break;
		case "*":
			res =  num1 * num2;
			break;
		case "/":
			res = num1 / num2;
			break;
		default:
			break;
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		String op = "+";
		// 함수이름(num1, op, num2);
		// 함수에서 출력 할 것인지 또는 결과를 리턴해서 여기서 결과를 출력
		double res=calc(num1,op,num2);
		System.out.printf("%d %s %d = %.2f",num1,op,num2,res);
	}

}
