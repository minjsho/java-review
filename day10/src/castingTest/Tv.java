package castingTest;

public class Tv { //Tv 클래스 시작영역
	//필드
	int vol;	//정수형 볼륨 필드 선언
	int ch;		//정수형 채널 필드 선언
	boolean power; //논리형 파워(전원) 필드 선언
	
	//메소드
	void chUp() {	//chUp 메소드
		System.out.println("현재채녈 : " + this.ch);
		//현재채널 + ch 필드 값 출력
	}
	void chDown() {	//chDown 메소드
		System.out.println("현재채녈 : " + this.ch);
	}
	
	void powerOnOff() { //powerOnOff 메소드
		System.out.println("tv 전원을 켜고 끕니다");
	}

} //Tv 클래스 종료
