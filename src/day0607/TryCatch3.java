package day0607;

public class TryCatch3 {
	public static void main(String[] args) {
		
		try {
		String data1 = "100";
		String data2 = "0";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result1 = value1+value2;
		System.out.printf("%d + %d = %d%n", value1, value2, result1);
		
		int result2 = value1/value2;
		System.out.printf("%d / %d = %d", value1, value2, result2);
		// 멀티 catch문 주의할 점
		// 1. 부모-자식 관계는 불가능
		// 2. catch문에서 메서드를 호출할 경우에는 하나의 예외에서만 가지고 있는 메서드를 호출하면 안 됨.
		} catch(NumberFormatException | ArithmeticException e) {
			System.out.println("문자는 숫자로 변환할 수 없습니다.");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}