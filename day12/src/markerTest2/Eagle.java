package markerTest2;

public class Eagle extends Carnivore implements Sky{
	//Carnivore 클래스를 상속받고 Sky 인터페이스를 구현한 Eagle 클래스 시작

	public Eagle(String name) {
		super(name); //부모생성자에 name 받은 값 전달하여 반환
	}
}//Eagle 클래스 종료
