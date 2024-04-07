package musicInter;

public class Ballad implements Music{ //Ballad 클래스 시작영역, 
	//mode 메소드를 사용할 것이므로 Music 인터페이스를 구현시킴

	@Override //mode 메소드 오버라이딩
	public void mode() {
		System.out.println("발라드 모드");	//재정의
	}
	
	void onlyBallad() { //onlyBallad 메소드 시작영역
		System.out.println("only 발라드 실행");
	} //onlyBallad 메소드 종료영역

} //Ballad 클래스 종료


// Ballad 클래스
// 발라드 모드를 출력하는 mode 메소드
// only 발라드 실행을 출력하는 onlyBallad메소드