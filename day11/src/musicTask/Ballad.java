package musicTask;

public class Ballad extends Music{
	//Ballad 클래스
	//발라드 모드를 출력하는 mode 메소드
	//only 발라드 실행을 출력하는 onlyBallad 메소드
	
	@Override
	void mode() {
		System.out.println("발라드 모드");
	}
	
	void onlyBallad() {
		System.out.println("only 발라드 실행");
	}


}
