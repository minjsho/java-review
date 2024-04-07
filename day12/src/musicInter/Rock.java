package musicInter;

public class Rock implements Music{
	//Music 인터페이스를 구현한 Rock 클래스 시작영역

	@Override //mode 메소드 오버라이딩
	public void mode() {
		System.out.println("락 모드");	//재정의
	}

	void onlyRock() { //onlyRock 메소드 시작영역
		System.out.println("only 락 실행");
	} //onlyRock 메소드 종료
	
}//Rock 클래스 종료

// Rock 클래스
// 락 모드를 출력하는 mode 메소드
// only 락 실행을 출력하는 onlyRock 메소드