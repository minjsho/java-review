package markerTest2;

public class Horse extends Harbivore implements Land{
	//Harbivore 클래스를 상속받고 Land 인터페이스를 구현한 Horse 클래스 시작영역

	//생성자
	public Horse(String name) {
		super(name); //부모생성자에 변수로 입력받은 name값 전달하여 호출
	}
	
} //Horse 클래스 종료