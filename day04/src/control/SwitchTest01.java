package control;

import java.util.Scanner; //입력클래스 불러오기

public class SwitchTest01 {	//SwitchTest01 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		Scanner sc = new Scanner(System.in); //입력클래스 sc라는 변수 선언하여 저장
		int choice =0;			//정수형 변수 choice를 선언하고 0으로 초기화
		String result = null;	//문자열 변수 result 선언하고 아무것도 없는 값으로 초기화
		
		System.out.print("1부터 4까지 정수 입력 : "); //입력문구 콘솔창에 출력하고 문구 오른쪽에 입력받음
		choice = sc.nextInt(); 		//입력받은 값 choice 변수에 저장
		System.out.println(choice);	//choice 변수에 저장된 값 콘솔창에 출력
		
		switch(choice) {	//choice 변수에 저장된 값을 여러 값과 비교하여 각각의 case에 따라
							//결과를 실행시키는 switch 조건문 시작영역
		case 1: case 3:		//choice 변수에 저장된 값이 1일 때와 3일 때 아래 코드 실행
			result = "홀수";	//result 변수에 홀수 문자열 저장
			break;			//즉시 switch 조건문 영역 탈출
		case 2: case 4:		//choice 변수에 저장된 값이 2일 때와 4일 때 아래 코드 실행
			result = "짝수"; //result 변수에 짝수 문자열 저장
			break;			//즉시 switch 조건문 영역 탈출
//		case 3:
//			result = "홀수";
//			break;			
//		case 4:
//			result = "짝수";
//			break;			
		default:			//choice 변수에 저장된 값이 위의 case 이외의 값인 경우 아래 코드 실행
			result="잘못입력했습니다";	//result 변수에 잘못입력했습니다 문자열 저장
			break;			//즉시 switch 조건문 영역 탈출
		}					//switch 조건문 종료영역
		System.out.println(result);	//result 변수에 저장된 값 콘솔창에 출력
		
	} //main 메소드 종료영역

}	//SwitchTest01 클래스 종료영역
