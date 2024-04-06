package oper; 

public class OperTest03 {	//OperTest03 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		
		System.out.println(10&11); //& : 두 비트가 모두 1이면 1
		//10 -> 이진수로 1010, 11 -> 이진수로 1011 => 1010 즉 10
		System.out.println(10|11); //|| : 두 비트 중 하나라도 1이면 1
		//1010, 1011 => 1011 즉 11
		System.out.println(10^11); // ^ : 두 비트가 서로 다르면 1
		//1010, 1011 => 0001 즉 1
		System.out.println(~10);
		System.out.println(~12);
		// ~a = -a-1
		
		//이진수로 바꾸어주는 메소드
		System.out.println("십진수 : " + 10 + ", 이진수 : " + Integer.toBinaryString(10));
		System.out.println("십진수 : " + 11 + ", 이진수 : " + Integer.toBinaryString(11));
		System.out.println("이진수 : " + Integer.toBinaryString(10&11));
		System.out.println("이진수 : " + Integer.toBinaryString(~10));
		
		System.out.println("====================");
		//shift 연산자
		System.out.println(10<<1);
		System.out.println("이진수 : " + Integer.toBinaryString(10<<1));
	
		
	} //main 메소드 종료영역
}	//OperTest03 클래스 종료영역
