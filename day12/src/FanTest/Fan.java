package FanTest;

public interface Fan { //Fan 인터페이스 시작영역
	//Fan 인터페이스를 구현한 클래스 3개
	//1. BasicFan 클래스
	//버튼으로 전원 켜기, 끄기, turbo는 비워둔다
	//2.BasicFan2 클래스
	//리모컨으로 전원켜기, 전원끄기, turbo는 터보 출력
	//3.SmartFan 클래스
	//음성인식으로 전원켜기, 전원끄기, turbo는 터보 출력

	//상수
	int MAX_STRANGTH =3; //상수는 대문자로 입력 (초기값 3할당)
	int MIN_STRANGTH =0; //상수 MIN_STRANGTH 선언하고 초기값 0 할당
	
	//추상메소드 - on, off, turbo
	void on();	//on 추상메소드
	void off(); //off 추상메소드
	void turbo(); //turbo 추상메소드
	
} //Fan 인터페이스 종료
