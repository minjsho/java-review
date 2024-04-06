package forTest;

public class TwoForTest01 {	//TwoForTest01 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		
		for (int i = 0; i < 3; i++) {
		//정수형변수 i 선언하고 0으로 초기화, i가 3보다 작을 때까지 1씩 증가하며 반복하는 for문 시작영역
//			System.out.println(i);	//i 콘솔창에 출력
			for(int j=1; j<3; j++) {	//이중for문
			//정수형변수 j 선언하고 1로 초기화, j가 3보다 작을 때까지 1씩 증가하며 반복하는 for문 시작영역
				System.out.println("i = " + i + ", j = " + j);
				//조건식이 참일 때 i = i값, j = j값 연결하여 콘솔창에 출력
			} //안쪽 for문 종료영역
		} //바깥 for문 종료영역
		
	}  //main 메소드 종료영역
}	//TwoForTest01 클래스 종료영역
