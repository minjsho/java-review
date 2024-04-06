package forTest;

public class ContinueTest02 {	//ContinueTest02 클래스 시작영역
	public static void main(String[] args) {	//main 메소드 시작영역
		//1부터 10까지 5를 제외하고 출력
		//반복문 for
		//조건문
		
		for(int i=0; i<10; i++) {
		//정수형변수 i를 선언하여 0으로 초기화, i가 10미만일 때까지 1씩 증가하며 반복하는 for반복문 시작영역
			if(i==4) {		//i가 4와 같다는 조건식이 참일 때 실행되는 if조건문 시작영역
				continue;	//아래 코드 무시하고 다음 실행 //break인 경우 4까지 출력되고 끝
			}				//if조건문 종료영역
			System.out.println(i+1);	//i값에 1더한 값 콘솔창에 출력
		} //for반복문 종료영역
		
	} //main 메소드 종료영역
} //ContinueTest02 클래스 종료영역
