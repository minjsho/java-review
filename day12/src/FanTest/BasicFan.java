package FanTest;

public class BasicFan implements Fan{ //Fan 인터페이스를 구현한 BasicFan 클래스 시작영역
	//1. BasicFan 클래스
	//버튼으로 전원 켜기, 끄기, turbo는 비워둔다

	//모든 추상메소드 오버라이딩
	@Override	
	public void on() {
		System.out.println("버튼으로 전원 켜기"); //재정의
	}

	@Override
	public void off() {
		System.out.println("버튼으로 전원 끄기"); //재정의
	}

	@Override
	public void turbo() {
		//제정의
	}
}//BasicFan 클래스 종료
