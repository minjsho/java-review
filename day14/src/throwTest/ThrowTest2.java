package throwTest;

import java.util.Scanner;

public class ThrowTest2 {
	//사용자로부터 입력 받은 수가 음수일 경우 예외처리
	public static void main(String[] args) { //main 메소드 시작
		//입력클래스, import
		//입력받을 문구 출력
		//입력받은 값 변수 선언하여 저장
		//if문(0보다 작으면){
		//	try-catch문{
		//		throw new MyException
		//	}
		//}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요>>");
		int num = sc.nextInt();
		
		if(num<0) {
		try {
				throw new MyException();
			} catch (MyException e) {
				e.printStackTrace();
			} //try-catch문 종료
		} //if문 종료
		
		System.out.println(num);
		
	} //main 메소드 종료

}
