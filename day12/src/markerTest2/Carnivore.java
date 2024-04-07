package markerTest2;

public class Carnivore extends Animal{
	//Animal 클래스를 상속받는 Carnivore 클래스 시작영역

	//생성자 필요
	public Carnivore(String name) {
		super(name); //부모생성자에 매개변수로 받은 name 값 전달하여 호출
	} 

	//메소드
	public void hunt() {
		System.out.println(getName()+"이(가) 사냥을 합니다");
		//private 필드 name을 게터 메소드로 접근함
	}
}//Carnivore 클래스 종료
