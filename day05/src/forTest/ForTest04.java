package forTest;

public class ForTest04 { //ForTest04 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//3단 구구단
		
		int dan =3;		//정수형변수 dan 선언하고 3으로 초기화
		for(int i = 1; i<10; i++) {
		//정수형변수 i 선언하고 0으로 초기화, i가 10보다 작을 때까지 1씩 증가하며 반복하는 for문 시작영역
			System.out.printf("%d x %d = %d\n", dan , i , dan*i);
			//조건식이 참일 때 제어문자 활용하여 정수 dan에 저장된 값 x i에 저장된 값 = 둘의 곱 콘솔창에 출력
		} //for반복문 종료영역
		
	} //main 메소드 종료영엿

} //ForTest04 클래스 종료영역
