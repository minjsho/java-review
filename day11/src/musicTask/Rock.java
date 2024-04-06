package musicTask;

public class Rock extends Music{
	//Rock
	//락모드 출력하는 mode 메소드
	//only 락 실행 출력하는 onlyRock 메소드
	
	@Override
	void mode() {
		System.out.println("락 모드");
	}
	
	void onlyRock() {
		System.out.println("only 발라드 실행");
	}


}
