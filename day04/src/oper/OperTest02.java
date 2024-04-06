package oper;

public class OperTest02 {	//OperTest02 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//삼항연산자
		//조건식 ? 참일 때의 값 : 거짓일 때의 값
		
		int num1 =10, num2 =20, num3 =20; //정수형 변수 num1,num2,num3 선언하고 각각 10,20,20으로 초기화
		String num4 = num1 >= 9 ? num1+ "이 9보다 큽니다" : num1 + "은 9보다 크지 않습니다";
		//문자열 변수 num4 선언하고
		//num1이 9보다 크거나 같다는 조건식이 참일 때는 num1이 9보다 큽니다 저장
		//조건식이 거짓일 때는 num1은 9보다 크지 않습니다 저장
		
		System.out.println(true ? 10 : 20);	//true이면 10, false이면 20을 콘솔창에 출력
		System.out.println(false ? 10 : 20); //flase이면 10, true이면 20을 콘솔창에 출력
		
		System.out.println(num1 == num2 ? "같다" : "다르다"); //num1과 num2가 같다는 조건식이 참이면 같다 출력, 거짓이면 다르다 출력
		System.out.println(num1 != num2 ? "같다" : "다르다"); //um1과 num2가 같지 않다는 조건식이 참이면 같다, 거짓이면 다르다 출력
		System.out.println(num4); //num4에 저장된 값 콘솔창에 출력
		
		
	}	//main 메소드 종료영역
}	//OperTest02 클래스 종료영역
