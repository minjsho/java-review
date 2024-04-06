package home04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
//		입력클래스, import
//		정수형 점수 변수 선언 초기화
//		점수 입력 문구 출력
//		입력메소드 .nextInt()
//		if문 1)60점이상(100점이하) 2)60점 미만 3)그 외, &&사용
		
		Scanner sc = new Scanner(System.in);
		int score =0;
		System.out.println("점수 입력 : ");
		score = sc.nextInt();
		
		if(score>= 60 && score<=100) {
			System.out.println("합격");
		} else if(score<60 && score >=0) {
			System.out.println("불합격");
		} else {
			System.out.println("0~100 중에 입력하세요");
		}
	}

}
