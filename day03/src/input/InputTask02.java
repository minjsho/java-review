package input;

import java.util.Scanner; //입력클래스 불러오기

public class InputTask02 { //InputTask02 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//두 정수를 입력받고 합을 출력하기
		//next() 메소드만 사용
		//ex)
		//정수1 입력 : 10
		//정수2 입력 : 20
		//두 정수의 합은 30입니다
		
		//자료형의 기본값
		//int :0
		//double :0.0
		//char : ' '
		//String : "", null
		
		//로직구성먼저!
		//입력클래스, import
		//변수 2개 선언(String int), 초기화
		//정수1입력 : 문구 출력
		//입력받은 정수1 num1에 저장, 입력메소드 .next()
		//정수2입력 : 문구 출력
		//입력받은 정수2 num2에 저장, 입력메소드 .next()
		//형변환한 두 정수의 합 num1+num2 출력
		
		Scanner sc = new Scanner(System.in);	//입력클래스를 sc라는 변수에 저장
		String num1 = "", num2 ="";	//문자열 변수 num1, num2 선언하고 초기화
		int result =0;				//정수형 변수 result 선언하고 초기화
		System.out.print("정수1 입력 : "); //정수1 입력 문구 출력
		num1 = sc.next();			//정수1 입력받은 값 num1 변수에 저장
		System.out.print("정수2 입력 : "); //정수2 입력 문구 출력
		num2 = sc.next();			//정수2 입력받은 값 num2 변수에 저장
		result = Integer.parseInt(num1) + Integer.parseInt(num2);
//		num1과 num2를 정수형으로 선언한 경우 integer안에 sc.next() 넣어주면 됨
		//문자열 num1과 문자열 num2를 각각 정수로 형변환 하여 더한 값을 정수형 변수 result에 저장
		System.out.printf("두 정수의 합은 %d입니다",result);
		//정수 서식문자가 포함된 문구의 서식문자 자리에 result에 저장된 값 넣어서 출력
		
	}//main 메소드 끝영역

}//InputTask02 클래스 끝영역
