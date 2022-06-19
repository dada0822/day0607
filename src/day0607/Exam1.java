package day0607;

import java.util.Scanner;

/* 1~100 사이의 랜덤수를 하나 지정하고
 * 사용자가 그 수를 맞추는 게임
 * 큰 수를 입력하면 '더 작은 수를 입력하세요' 출력
 * 작은 수를 입력하면 '더 큰 수를 입력하세요' 출력
 * 맞추면 시도횟수와 함께 '정답입니다' 출력
 * 
 *  1부터 100 사이의 값을 입력하지 않은 경우 예외 발생
 *  문자를 입력했을 때도 예외 발생 */


public class Exam1 {
	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100)+1; // 정답
		int input = 0; // 사용자의 입력값 저장
		int count = 0; // 시도횟수 저장
		
//		나
		while(true) {
			System.out.print("1~100 사이의 값을 입력하세요 : ");
			++count;
			int num = 0;
			
			try {
				Scanner s = new Scanner(System.in);
				num = s.nextInt();
				
				if (num<1 || num>100) {
						throw new Exception();
				}
	
			} catch (Exception e) {
				System.out.println("유효하지 않은 입력값입니다!");
				continue;
			}
			
			if(num>answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if (num<answer) {
				System.out.println("더 큰 수를 입력하세요.");
			} else {
				System.out.println("정답입니다.");
				System.out.println("시도횟수 : " + count);
				break;
			}
		}
		
//		강사님
//		do {
//			System.out.print("1~100 사이의 값을 입력하세요 : ");
//			count++;
//			
//			try {
//				Scanner scan = new Scanner(System.in);
//				int num = scan.nextInt();
//				input = num;
//				
//				input = new Scanner(System.in).nextInt();
//				
//				if (input<1 || input>100) {
//					throw new Exception("예외 발생");
//				}
//			} catch (Exception e) {
//				System.out.println("값을 확인하고 다시 입력하세요!");
//				continue;
//			}
//			
//			if(answer>input) {
//				System.out.println("더 큰 수를 입력하세요.");
//			} else if (answer<input) {
//				System.out.println("더 작은 수를 입력하세요.");
//			} else {
//				System.out.println("정답입니다.");
//				System.out.println(count + "번만에 맞췄습니다.");
//				break;
//			}
//			
//		} while(true);
	}

}