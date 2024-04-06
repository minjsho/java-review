package forTest;

public class ForTest01 {	//ForTest01 클래스 시작영역
	public static void main(String[] args) {	//main 메소드 시작영역
		
		for(int i =0; i < 10; i++) {
		//정수형 변수 i를 선언하고 0으로 초기화, i가 10보다 작을 때까지 1씩 증가하며 반복하는 for반복문 시작영역
//			System.out.println("김민주");   //김민주 콘솔창에 출력
			String name = "김민주";		//문자열 변수 name 선언하고 김민주 저장
			System.out.println(name + "님 환영합니다"); //name변수에 저장된 값과 문구 연결하여 콘솔창에 출력
		}	//for반복문 종료영역
		
	} //main 메소드 종료영역
} //ForTest01 클래스 종료영역
