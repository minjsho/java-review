package whileTest;

import java.util.Scanner;	//입력클래스 불러오기

public class WhileTest01 {	//WhileTest01 클래스 시작영역 
	public static void main(String[] args) {	//main메소드 시작영역
		//안녕하세요 000님 환영합니다 10번 출력
		
		//반복횟수 변수 선언
		//while문, 반복횟수 1씩 증가
		
		
		//로직구성
		//1)입력클래스 import
		//2)이름 변수 선언
		//3)카운트 변수 (반복횟수를 조건식)
		//4)while문{
		//5)입력 받을 메시지
		//6)이름 입력 메소드
		//7)출력메시지
		//8)증감연산자 ++
		
		Scanner sc = new Scanner(System.in); //입력클래스 sc 변수 선언하여 저장
		
		String name = "";	//문자열 변수 name 선언하여 빈문자열로 초기화
		int count =0;		//정수형 변수 count 선언하여 0으로 초기화	
		while(count<10) {	//count가 10보다 작을 때까지 반복하는 while문 시작영역
			System.out.println("이름을 입력하세요 : ");	//입력문구 콘솔창에 출력
			name = sc.nextLine();	//입력받은 값 name 변수에 저장
			System.out.println("안녕하세요 " + name + "님 환영합니다"); //문자열 연결하여 콘솔창에 출력
			count++;	//count값 1증가
		} //while문 종료영역
		
	} //main 메소드 종료영역
}	//WhileTest01 클래스 종료영역
