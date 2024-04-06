package input;

import java.util.Scanner;	//입력클래스 불러오기

public class InputTask01 { //InputTask01클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//이름을 입력하세요 : 000
		//000님 안녕하세요 출력
		
		//입력클래스 불러오기 import
		//이름을 입력하세요 출력 print()
		//문자열 변수에 이름 저장, 입력메소드 .next()
		//출력
		
		Scanner sc = new Scanner(System.in);	//입력클래스를 sc라는 변수에 저장
		System.out.print("이름을 입력하세요 : ");	//이름 입력 문구 콘솔창에 출력
		String name = sc.next();		//입력받은 값을 문자열 name 변수에 저장
		System.out.println(name+"님 안녕하세요");	//name변수에 저장된 값과 문자열 연결하여 출력
		System.out.printf("%s님 안녕하세요",name); //문자열에 포함된 서식문자에 name변수에 저장된 값 넣어 출력
		
	}//main 메소드 끝영역
}//InputTask01클래스 끝영역
