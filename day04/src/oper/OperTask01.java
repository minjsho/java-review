package oper; 

import java.util.Scanner;	//입력클래스 불러오기

public class OperTask01 { //OperTask01 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		/*정수 2개를 입력받아서 큰 수 출력하기
		 * 
		 * 정수1 입력 : 10
		 * 정수2 입력 : 20
		 * 정수1 보다 정수2가 더 큽니다
		 * 
		 * 로직구성
		 * 입력클래스, import
		 * 정수 2개, 결과값 선언, 초기화
		 * 입력메세지 출력
		 * 입력메소드 nextInt()
		 * String result 삼항연산자로 선언
		 * 출력
		 */
		
		Scanner sc = new Scanner(System.in); //입력클래스 sc변수 선언하여 저장
		int num1 =0, num2 =0;	//정수형 변수 num1, num2 선언하고 0으로 초기화
		String result = null; //msg = "정수 입력 : ";	도 선언해주면 편함
		//문자열 변수 result 선언하여 아무것도 없는 값으로 초기화

		System.out.print("정수1 입력 : ");	//System.out.println(msg);
		//정수1 입력 문구 출력하고 오른쪽에 입력받음
		num1 = sc.nextInt(); //입력받은 값 num1 변수에 저장
		System.out.print("정수2 입력 : "); //정수2 입력 문구 출력하고 오른쪽에 입력받음
		num2 = sc.nextInt(); //입력받은 값 num2 변수에 저장
		
//		result = num1 > num2 ? num2 + "보다 " + num1 + "(이)가 더 큽니다" 
//				: num1 + "보다 " + num2 + "가 더 큽니다";

		result = num1 > num2 ? "큰 수 : " + num1 : num1 == num2 ? "같습니다"
				: "큰 수 : " + num2;
		//삼항연산자 이용
		//num1에 저장된 값이 num2에 저장된 값보다 크다는 조건식이
		//참이면 큰 수 : , num1 연결한 값 result에 저장
		//거짓이면, 다시 num1 값과 num2 값이 같다는 조건식이 참일 때 같습니다 result에 저장하고
		//거짓일 때는 큰 수, num2 연결한 값 result에 저장
	
		System.out.println(result); //result에 저장된 값 콘솔창에 출력
		
	} //main 메소드 종료영역
} //OperTask01 클래스 종료영역
