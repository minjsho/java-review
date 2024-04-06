package forTest;

public class TwoForTest04 {	//TwoForTest04 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		for(int i =0; i <= 5; i++) { //바깥for : 행
		//정수형변수 i 선언하고 0으로 초기화, i가 5이하일 때까지 1씩 증가하며 반복하는 for문 시작영역
			for(int j =0; j <= 3; j++) { //안쪽for : 열
			//위 for문의 조건문이 참일 때 실행
			//정수형변수 j 선언하고 0으로 초기화, j가 3이하일 때까지 1씩 증가하며 반복하는 for문 시작영역
				System.out.print("* "); //별표와 공백 번갈아 출력
				//조건문이 참일 때 '* ' 콘솔창에 출력, 줄바꿈 없음 
			} //안쪽 for문 종료영역
			System.out.println();	//줄바꿈
		} //바깥쪽 for문 종료영역
		
		
//		바깥for문에서 i는 1부터 5까지 반복
//		안쪽for문에서 j는 1부터 3까지 반복
//		i가 1일때 j는 1부터 3까지 반복하므로 출력되는 문장은 별표와 공백을 번갈아 출력
//		별표 3개씩 출력
//		한줄 출력이 끝나면(한 행이 끝나면) 바깥 for문으로 이동하므로
//		다음 줄로 넘어갈 수 있도록 줄바꿈 출력
//		바깥for문의 조건문이 false가 되면 반복문 종료
	} //main 메소드 종료영역

}	//TwoForTest04 클래스 종료영역
