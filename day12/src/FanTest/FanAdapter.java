package FanTest;

public abstract class FanAdapter implements Fan{
	//Fan 인터페이스를 구현한 FanAdapter 추상클래스 시작영역

	//인터페이스는 강제성이 강해서 
	//일부만 재정의 하고 싶을 때는 Adapter를 사용하여
	//재정의에 사용하지 않을 메소드를 빼준다 
	@Override
	public void turbo() {
		// TODO Auto-generated method stub
		
	}
	
}
