package control;

public class IfTest01 { //IfTest01 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
//		if문
		System.out.println("1번");	//1번 이라는 문자열 콘솔창에 출력
		if(true) {					//조건식이 true인 if조건문 시작영역
			System.out.println("2번");	//조건식 true가 참일 때 2번 이라는 문자열 콘솔창에 출력
		}							//첫번째 조건문 종료영역
		if(false) {					//조건식이 false인 if조건문 시작영역
			System.out.println("3번");//조건식이 참일 때 3번 이라는 문자열 콘솔창에 출력
		}							//두번째 조건문 종료영역
		System.out.println("4번");	//4번이라는 문자열 콘솔창에 출력
		
	} //main메소드 종료영역

}//IfTest01 클래스 종료영역
