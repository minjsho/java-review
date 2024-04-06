package control; 

import java.util.Scanner; //입력클래스 불러오기

public class IfTest02 {	//IfTest02 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		System.out.println("프로그램 시작"); //프로그램 시작 문구 콘솔창에 출력
		
		int num = 0;	//정수형 변수 num 선언하고 0으로 초기화
		Scanner sc = new Scanner(System.in); //입력클래스 sc라는 변수 선언하여 저장
		System.out.println("정수 입력 : ");	//정수입력 문구 콘솔창에 출력
		num = sc.nextInt();		//입력받은 값 num 변수에 저장
		
		
		//조건식(if~else)
		if(num % 2 ==0) { //num 변수에 저장된 값을 2로 나눈 나머지가 0과 같다는 조건식을 가진 if조건문 시작영역 
			System.out.println(num + "은(는) 짝수입니다");
			//조건식이 참일 때 num에 저장된 값 문자열로 형변환하여 뒤 문자열과 연결하여 콘솔창에 출력
		} else {	//if조건문 종료, else문 시작영역
			System.out.println(num + "은(는) 홀수입니다");
			//if문의 조건문이 거짓일 때 num에 저장된 값 문자열로 형변환하여 뒤 문자열과 연결하여 콘솔창에 출력  
		}	//else문 종료영역
		
		System.out.println("프로그램 종료"); //프로그램 종료 문구 콘솔창에 출력
		
	}//main 메소드 종료영역
}//IfTest02 클래스 종료영역
