package forTest;

public class BreakTest01 {	//BreakTest01 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//1~100 까지 합 출력
		
		//총합 변수 선언
		//for (int i =1; i<=100; i++){
		//+=
		//}
		//출력
		
		int total = 0;		//정수형변수 total 선언후 0으로 초기화
		for(int i=1; i<=100; i++) {
		//정수형변수 i를 선언하고 1로 초기화, 100이하일 때까지 1씩 증가하며 반복하는 for반복문 시작영역
			total += i;		//total에 i를 누적으로 합하여 저장
		}					//for반복문 종료영역
		System.out.println(total); //total에 저장된 값 콘솔창에 출력
		
	} //main 메소드 종료영역
}	//BreakTest01 클래스 종료영역
