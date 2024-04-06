package oper;

public class OperTest04 { //OperTest04 클래스 시작영역 
	public static void main(String[] args) { //main 메소드 시작영역
//		비트연산자를 이용한 암호화 복호화
		int origin =42; //원본메시지	//정수형 origin 변수 선언하고 42로 초기화
		int key = 99;	//비트마스크(암호화 및 복호화에 사용) //정수형변수 key 선언하고 99로 초기화
		
		//xor 연산을 통한 암호화
		int encrypte = origin ^ key;
		System.out.println("암호화된 메시지 : " +encrypte);
		int decrypte = encrypte ^ key;
		System.out.println("복호화된 메시지 : " +decrypte);
		
	}//main 메소드 종료영역
}//OperTest04 종료영역
