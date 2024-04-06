package forTest;

public class TwoForTest03 { //TwoForTest03 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//2단~9단까지 구구단 출력하기
		// -> tab 적용해서 가로로 출력
		
		for(int num=1; num<10; num++) {
		//정수형변수 num 선언하고 1로 초기화, num이 10미만일 때까지 1씩 증가하며 반복하는 for문 시작영역
			for(int dan =2; dan<10; dan++) { //이중 for문
			//위 for문의 조건식이 참일 때 실행
			//정수형변수 dan 선언하고 2로 초기화, dan이 10미만일 때까지 1씩 증가하며 반복하는 for문 시작영역
				System.out.print(dan + "x" + num + "=" + dan*num + "\t");
				//조건식이 참일 때 dan x num = dan과 num 곱한 값, tab 공백 연결해서 콘솔창에 출력
				//줄바꿈 없음
			} //안쪽 for문 종료영역
			System.out.println();	//줄바꿈
		} //바깥쪽 for문 종료영역
		
	}  //main 메소드 종료영역
} //TwoForTest03 클래스 종료영역
