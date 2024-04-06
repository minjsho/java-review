package home04;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
//		입력클래스 import
//		1~7 중에 입력하라는 문구 출력
//		입력받을 변수 선언, nextInt() 초기화
//		switch 사용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 7까지 숫자 중에 하나를 입력하세요 : ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;
		default:
			break;
		}
	}

}
