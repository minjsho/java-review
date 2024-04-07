package FanTest;

public class SmartFan implements Fan{ //Fan 인터페이스를 구현한 SmartFan 클래스 시작영역
	//3.SmartFan 클래스
	//음성인식으로 전원켜기, 전원끄기, turbo는 터보 출력

	//모든 추상메소드 오버라이딩
	@Override
	public void on() {
		System.out.println("음성인식으로 전원 켜기"); //재정의
	}

	@Override
	public void off() {
		System.out.println("음성인식으로 전원 끄기"); //재정의
	}

	@Override
	public void turbo() {
		System.out.println("터보 출력"); //재정의
	}
} //SmartFan 클래스 종료
