package oper; 

import java.util.Scanner;	//입력클래스 불러오기

public class OperTest01 { //OperTest01 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//두자리수 정수를 입력받고 십의 자리와 일의 자리를 각각 출력하기
		
//		1)입력클래스 import
//		2)정수형 변수 3개 선언
//		3)출력메세지(두자리수 정수 입력)
//		4)입력 받아서 변수에 저장 nextInt()
//		5)십의자리 / 10
//		6)일의자리 % 10
//		7)출력
		
		Scanner sc = new Scanner(System.in);	//입력클래스 sc변수에 저장
		int inputNum=0, result1=0, result2=0;	//정수형 변수 3가지 선언, 초기화
		System.out.print("두 자리 정수를 입력하세요 : ");	//입력문구 콘솔창에 출력(문구 오른쪽에 입력)
		inputNum = sc.nextInt(); //입력받은 값 inputNum 변수에 저장
		result1 = inputNum / 10; //inputNum 변수에 저장된 값 10으로 나누어 result1 변수에 저장
		result2 = inputNum % 10; //inputNum 변수에 저장된 값을 10으로 나눈 몫을 result2 변수에 저장
		System.out.println("십의자리 : "+result1); //문자열 콘솔창에 출력
		System.out.println("일의자리 : "+result2); //문자열 콘솔창에 출력
		
	}//main 메소드 종료

}//OperTest01 클래스 종료
