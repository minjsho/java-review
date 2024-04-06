package whileTest;

public class WhileTest02 {	//WhileTest02 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//1부터 100까지의 짝수의 합 출력 while
		//로직구성
		//1)카운트 변수, sum 변수 선언
		//2)while 카운트<=100 {
		//3)if 2로 나눈 나머지 0과 같을 때 (%) {
		//4)sum에 값을 더해 넣어줌}
		//5)}증감연산자 ++}
		//6)합 출력
		
		int count=1, sum=0;	//정수형 변수 count, sum 선언하고 각각 1,0으로 초기화
		while(count<=100) {		//count에 저장된 값이 100보다 작거나 같을 때까지 반복하는 while문 시작영역
			if(count%2 == 0) {	//count에 저장된 값을 2로 나눈 나머지가 0과 같을 때 실행되는 if문 시작영역
				sum += count;	//count에 저장된 값을 sum 변수에 누적하여 더함
			}	//if문 종료영역
			count++; //count 1증가
		}System.out.println("총합: "+sum); //문자열 연결하여 콘솔창에 출력
		
		
	}	//main 메소드 종료영역
}	//WhileTest02 클래스 종료영역
