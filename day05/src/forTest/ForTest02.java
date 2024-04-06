package forTest;

public class ForTest02 { //ForTest02 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//1번 김민주
		//2번 김민주
		//3번 김민주
		//4번 김민주
		//5번 김민주
		//for문 이용해ㅅ 출력
		
		//로직구성
		//for(int i=1; i<=5; i++){
		//i+1번 김민주 출력
		
		for (int i = 0; i <5; i++) {
		//정수형 변수 i를 선언하고 0으로 초기화, i가 5보다 작을 때까지 1씩 증가하며 반복하는 for문 시작영역
			System.out.println((i+1)+"번 김민주"); //i는 0부터 시작하므로 i+1을 해주어야 1번, 2번 ... 나온다
		}	//for반복문 종료영역
		
		//10번째 ~ 1번째
		
		//for 반복문 (
		//초기식 int i=0;
		//조건식 i<10;
		//증감식 i++){
		//10-i번
		
		System.out.println("-----------");
		for (int i = 0; i < 10; i++) {
		////정수형 변수 i를 선언하고 0으로 초기화, i가 10보다 작을 때까지 1씩 증가하며 반복하는 for문 시작영역
			System.out.println(10-i +"번 김민주"); //10-i는 10번, 9번 ... 거꾸로
		}	//for반복문 종료영역
		
	} //main 메소드 시작영역
} //ForTest02 클래스 종료영역
