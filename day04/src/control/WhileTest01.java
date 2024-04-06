package control;

public class WhileTest01 {	//WhileTest01 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		
		int cnt =1;			//정수형 변수 cnt 선언하고 1로 초기화
		while(cnt < 6){		//cnt에 저장된 값이 6미만일 때까지 반복하는 while반복문 시작영역
			System.out.println("안녕하세요");	//안녕하세요 콘솔창에 출력
			System.out.println(cnt++);		//cnt에 저장된 값을 출력하고 cnt값에 +1 해줌
//			break; //한번만 실행되고 끝남		//즉시 while반복문 탈출
		}	//while반복문 종료영역
		
	} //main 메소드 종료영역

}	//WhileTest01 클래스 종료영역
