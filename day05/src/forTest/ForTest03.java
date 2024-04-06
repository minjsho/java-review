package forTest;

public class ForTest03 { //ForTest03 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//초기식 int i =0;
		
		//1~100 짝수만 tab키 적용
		//for(int i =0; i<100; i++){
		//if(i%2 ==0){
		//출력 /t .printf()
		//}}
		
		for(int i =0; i<100; i++){
		//정수형변수 i 선언하고 0으로 초기화, i가 100미만일 때까지 1씩 증가며 반복하는 for문 시작영역
			if(i%2 ==0){	//i%2 == 0 && i != 0
			//위 for문의 조건식이 참일 때 실행
			//i를 2로 나눈 나머지가 0인(즉, 짝수) 조건을 가진 if조건문 시작영역
				System.out.print(i+2 +"\t");
				//조건식이 참일 때 i+2값과 tab공백 연결하여 콘솔창에 출력(줄바꿈 없음)
			} //if조건문 종료영역
		} //for반복문 종료영역
		
		//A~F 출력
		//for(int i=0; i<6; i++){
		//char 형변환
		//출력
		
		System.out.println();	//줄바꿈
		for(int i=0; i<6; i++){
		//정수형변수 i를 선언하고 0으로 초기화, i가 6미만일 때까지 1씩 증가하며 반복하는 for문 시작영역
			System.out.println((char)(i+65));
			//조건식이 참일 때 i+65의 값을 문자형으로 형변환하여 콘솔창에 출력
		} //for반복문 종료영역
		
		
		//aBcD~XyZ 출력
		//for(int i=0; i<26; i++){
		//char 형변환 65 -> 97 번갈아
		
//		for(int i=0; i<26; i++){
//			if(i%2 ==0) {
//				System.out.print((char)(i+97));
//			}else {
//			System.out.print((char)(i+65));
//			}
//		}
		
		for(int i=0; i<26; i++){
		//정수형변수 i를 선언하고 0으로 초기화, i가 26미만일 때까지 1씩 증가하며 반복하는 for문 시작영역
			System.out.print(i%2 ==0 ? (char)(i+97) : (char)(i+65));
			//조건식이 참일 때
			//i를 2로 나눈 나머지가 0이라는(짝수라는) 조건이 참이면 i+97 값 문자형으로 형변환하여 출력하고
			//거짓이면 i+65 값을 문자형으로 형변환하여 콘솔창에 출력
			//97은 a, 65는 A
		} //for문 종료영역
	
	}//main 메소드 시작영역
}//ForTest03 클래스 시작영역
