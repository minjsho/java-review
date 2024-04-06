package input;

import java.util.Scanner;	//입력클래스 불러오기
//import 자동완성 ctrl shift o

public class InputTest02 { //InputTest02 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		Scanner sc = new Scanner(System.in); //입력클래스 sc라는 변수에 저장
		
		System.out.print("첫번째 입력 : "); //첫번째 입력 문구 콘솔창에 출력(문구 오른쪽에 입력받음)
		String str1 = sc.next(); //입력받은 값 문자열 변수 str1에 저장
		System.out.println(str1); //str1 변수에 저장된 값 콘솔창에 출력
		
		System.out.print("두번째 입력 : "); //두번째 입력 문구 콘솔창에 출력(문구 오른쪽에 입력받음)
		String str2 = sc.next(); //입력받은 값 문자열 변수 str2에 저장
		System.out.println(str2); //str2 변수에 저장된 값 콘솔창에 출력
		
		System.out.print("세번째 입력 : "); //세번째 입력 문구 콘솔창에 출력(문구 오른쪽에 입력받음)
		String str3 = sc.next(); //입력받은 값 문자열 변수 str2에 저장
		System.out.println(str3); //str3 변수에 저장된 값 콘솔창에 출력
		
	} //main 메소드 끝영역

} //InputTest02 클래스 끝영역
