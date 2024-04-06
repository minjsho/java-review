package input;

import java.util.Scanner;	//입력클래스 불러오기

public class InputTest01 { //InputTest01 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
//		입력메소드를 사용하기 위해서는 Scanner 라는 입력 클래스를 불러와야 한다.
		
		Scanner sc = new Scanner(System.in);
		//Scanner랑 똑같이 생긴 애를 sc라는 변수에 저장해서 쓸거다
		
		System.out.print("숫자 입력 : ");
		//숫자 입력 문구 출력(줄바꿈 없이 오른쪽에 입력되게 하기 위해 print()사용)
		String data = sc.next(); //입력받은 값을 문자열 변수 data에 저장
		System.out.println(data); //data에 저장된 값 콘솔창에 출력
		System.out.println("출력 끝"); //출력 끝 콘솔창에 출력
		
		
	} //main 메소드 끝영역
} //InputTest01 클래스 끝영역
