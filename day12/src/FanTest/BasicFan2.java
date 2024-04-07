package FanTest;

public class BasicFan2 implements Fan{ //Fan 인터페이스를 구현한 BasicFan2 클래스 시작영역
	//2.BasicFan2 클래스
	//리모컨으로 전원켜기, 전원끄기, turbo는 터보 출력

	//모든 추상메소드 오버라이딩
	@Override
	public void on() {
		System.out.println("리모컨으로 전원 켜기"); //재정의
	}

	@Override
	public void off() {
		System.out.println("리모컨으로 전원 끄기"); //재정의
	}

	@Override
	public void turbo() {
		System.out.println("터보 출력"); //재정의
	}
}//BasicFan2 클래스 종료
