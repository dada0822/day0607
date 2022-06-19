package day0607;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		/* 두 개의 정수를 입력받아 곱셈과 나눗셈의 연산 결과를 출력
		 * 입력값에서 정수가 아닌 값이 입력되면 예외가 발생하면서
		 * 실행이 중단되는데 이를 예외 처리하여 실행되도록 구현하시오. */
		
		int x = 0, y = 0, mul = 0, div = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("두 개의 정수 입력 > ");
		
		try {	
			x = s.nextInt();
			y = s.nextInt();
			
			mul = x*y;
			div = x/y;
			System.out.printf("%d * %d = %d%n", x, y, mul);
			System.out.printf("%d / %d = %d", x, y, div);
		} catch (InputMismatchException e) {
			System.out.println(e + "예외 발생");
		} catch (ArithmeticException e) {
			System.out.println(e + "예외 발생");
		} catch (Exception e) {
			System.out.println("확인하세요.");
		} finally {
			s.close();
		}
		

		
	}

}