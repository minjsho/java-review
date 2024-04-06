package day03;

public class Review { //Review 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		char ch1 = ' ';		//char 타입은 '' 빈문자 값을 넣을 수 없다
		//문자형 변수 ch1를 선언하고 공백으로 초기화
		System.out.println(ch1);	//ch1변수에 저장된 값 출력
		System.out.println("=======");
		
		String st1 ="";		//String 타입은 "" 빈문자열 값을 넣을 수 있다
		//문자열 변수 st1 선언하고 빈 문자열로 초기화
		System.out.println(st1);	//st1 변수에 저장된 값 출력
		System.out.println("======="); //이동 단축키 : alt + 방향키위아래
		
		System.out.println("152423"+1); //문자열, 연결되어 출력
		System.out.println(152423+1);	//연산된 값 출력
	}//main 메소드 끝영역

}//Review 클래스 끝영역
