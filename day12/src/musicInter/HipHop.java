package musicInter;

public class HipHop implements Music{
	//Music 인터페이스를 구현한 HipHop 클래스 시작영역

	@Override //mode 메소드 오버라이딩
	public void mode() {
		System.out.println("힙합 모드");	//재정의
	}
	
	void onlyHipHop() {	//onlyHipHop 메소드 시작영역
		System.out.println("only 힙합 실행");
	}	//onlyHipHop 메소드 종료
	
}//HipHop 클래스 종료영역

// HipHop 클래스
// 힙합 모드를 출력하는 mode 메소드
// only 힙합 실행을 출력하는 onlyHipHop메소드
