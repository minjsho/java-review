package whileTest;

import java.util.Scanner;	//입력클래스 불러오기

public class WhileTest03 {	//WhileTest03 클래스 시작영역
	public static void main(String[] args) {	//main 메소드 시작영역
	      //1) 입력클래스 import
	      //2) 숫자 저장할 변수
	      //3) do{
	      //4)    숫자 입력 메시지 출력
	      //5)    변수 nextInt() 사용
	      //6)   조건문(if <= 0) {
	      //7)      양수가 아닙니다 출력 }
	      //8) }while(<= 0)
	      //9) 출력

		
		//while문으로 바꾸기
		//1) 입력클래스 import
	    //2) 카운트 변수
		//3) while(<=0){
		//4)    숫자 입력 메시지 출력
	    //5)    변수 nextInt() 사용
	    //6)   조건문(if <= 0) {
	    //7)      양수가 아닙니다 출력}
		//8) 출력
		
	      Scanner sc = new Scanner(System.in);	//입력클래스 sc 변수 선언하여 저장
	      int number = 0;		//정수형 변수 number 선언하고 0으로 초기화
	      while(number <= 0) {	//number 변수에 저장된 값이 0보다 작거나 같을 때까지 반복하는 while문 시작영역
	         System.out.println("숫자 입력 : ");	//조건문이 참일 때 입력문구 콘솔창에 출력
	         number = sc.nextInt();	//입력받은 값 number변수에 저장
	         if(number <= 0) {		//number에 저장된 값이 0보다 작거나 같을 때 실행되는 if조건문 시작영역
	            System.out.println("양수가 아닙니다");	//조건문이 참일 때 해당 문구 콘솔창에 출력
	         }	//if문 종료영역
	      } //while문 종료영역
	      System.out.println(number + "양수입니다");	//문자열 연결하여 콘솔창에 출력

	} //main 메소드 종료영역
}	//WhileTest03 클래스 종료영역
