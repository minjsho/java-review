package FanTest;

public class FanMain { //FanMain 클래스 시작영역
	public static void main(String[] args) {//main 메소드 시작영역
		FanMain fm = new FanMain(); //FanMain 클래스타입의 fm 객체 생성
		fm.method(new BasicFan());	//fm객체의 method 메소드 호출
								//-> BasicFan의 생성자를 매개변수로 받음
								//BasicFan에서 오버라이딩 된 내용 출력
		fm.method(new BasicFan2()); //BasicFan2의 생성자를 매개변수로 받아서 호출
								//BasicFan2에서 오버라이딩 된 내용 출력
		fm.method(new SmartFan());	//SmartFan의 생성자를 매개변수로 받아서 호출
								//SmartFan에서 오버라이딩 된 내용 출력
	} //main 메소드 종료
	
	
	//매소드
	void method(Fan fan) { //Fan 클래스 타입의 fan을 매개변수로 받는 method 메소드 시작
		fan.on();	//fan의 on 메소드 호출
		fan.off();	//fan의 off 메소드 호출
		fan.turbo();//fan의 turbo 메소드 호출
	}//menthod 메소드 종료

}//FanMain 클래스 종료
