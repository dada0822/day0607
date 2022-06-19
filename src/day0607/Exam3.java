package day0607;

public class Exam3 {

	public static void main(String[] args) {
		/* 1부터 10까지의 숫자가 입력되어 있는 배열이 있다.
		 * 배열의 값을 출력할 때
		 * 배열의 범위가 벗어나는 경우에 오류가 발생한다.
		 * 오류의 표시 없이 '인덱스 초과'로 표시가 되도록 설정하시오. */
		
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++) {
			array[i] = i+1;
		}
//		for(int i=1; i<=10; i++) {
//			array[i-1] = i;
//		}

		try {
			for(int i=0; i<=array.length; i++) {
				System.out.print(array[i] + ", ");
			}
			
//			for(int a : array) {
//				System.out.print(a + ", ");
//			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 초과");
		}
	}

}