package home04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
//		입력클래스, import
//		입력받을 변수 선언, 모든 정수 합할 변수 선언
//		처음 입력 문구, 입력메소드 sc.nextInt()
//		while문으로 반복 -> 입력메소드 sc.nextInt(), 입력받은 정수 누적합
//		if문 0입력 -> break;
//		누적합 출력
		
		Scanner sc = new Scanner(System.in);
		int num =0, sum =0;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		sum += num;
		
		while(num != 0) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			sum += num;
		}
		if(num == 0) {
		System.out.println("입력받은 정수들의 합 : " +sum);
		}
	}
}
