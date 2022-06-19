package day0607;

public class Throw {
	public static void main(String[] args) {
	
//		try {
//			throw new Exception();
//		} catch (Exception e) {
//			
//		}
		
		try {
			System.out.println("출력");
			
			Exception e = new Exception("고의로 예외 발생");
			throw e;
		} catch(Exception e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
		}

	}

}
