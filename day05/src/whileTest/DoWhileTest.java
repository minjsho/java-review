package whileTest;

import java.util.Scanner; //입력스캐너 불러오기

public class DoWhileTest {	//DoWhileTest 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
//		boolean isTrue = false;	//논리형변수 isTrue 선언하고 false로 초기화
//			
//		while(isTrue) {		//isTrue 조건식이 참일 때 반복하는 while문 시작영역
//			System.out.println("출력"); //조건식이 참일 때 출력 문자열 콘솔창에 출력
//		} //while문 종료영역
//		
		
//		do { 	//do~while문 시작영역
//			System.out.println("김민주"); //먼저 김민주 문자열 콘솔창에 한번 출력
//		}while(isTrue);		isTrue 조건식이 참일 때 반복
		
		
		//사용자로부터 숫자 1 입력받아서 해당 숫자가 양수인지 검사
		//입력된 숫자가 양수가 아니면 사용자에게 다시 입력하라는 메시지 출력
		//입력된 숫자가 양수일 경우만 양수입니다 출력
		
		Scanner sc = new Scanner(System.in); //입력클래스 sc 변수 선언하여 저장
		int num =0;	//정수형 변수 int 선언 후 0으로 초기화
		do { //do~while문 시작영역
			System.out.println("숫자를 입력하세요 : ");
			//숫자입력 문구 콘솔창에 출력
			num = sc.nextInt(); //입력받은 값 num에 저장
			if(num<=0) {	//num에 저장된 값이 0보다 작거나 같을 때 실행되는 if문 시작영역
				System.out.println("양수가 아닙니다. 다시 입력하세요.");
				//조건식이 참일 때 해당 문구 콘솔창에 출력
			} //if문 종료영역
		}while(num <=0); //do영역 콘솔창에 출력 후 num의 값이 0보다 작거나 같을 때 무한반복
		System.out.println(num + "는 양수입니다"); //문자열 연결하여 콘솔창에 출력

	} //main 메소드 종료영역

} //DoWhileTest 클래스 종료영역
