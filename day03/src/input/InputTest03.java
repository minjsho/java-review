package input;

import java.util.Scanner;	//입력클래스 불러오기

public class InputTest03 { //InputTest02 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//입력클래스, import
		Scanner sc = new Scanner(System.in);
		//입력클래스 sc라는 변수에 저장
		
		System.out.print("입력 : "); //입력문구 콘솔창에 출력(문자 오른쪽에 입력받음)
//		System.out.println(sc.next());
//		System.out.println(sc.next());
//		System.out.println(sc.next());
		System.out.println(sc.nextLine()); //입력받은 값 콘솔창에 출력(공백도 그대로 표현됨)
		System.out.println(sc.nextLine()); //
		System.out.println(sc.nextLine()); //
		
	} //main 메소드 끝영역

} //InputTest02 클래스 끝영역
