package markerTest2;

public class Harbivore extends Animal{
	//Animal 클래스를 상속받는 Harbivore 클래스 시작영역

	//생성자
	public Harbivore(String name) {
		super(name); //부모생성자에 매개변수로 받은 name 값 전달하여 호출
	}
	
	//메소드
	public void graze() { //graze 메소드 시작영역
		System.out.println(getName() + "이(가) 초원에서 풀을 먹습니다");
		//private 필드에 접근하기 위해 get메소드로 호출
	}

}//Harbibore 클래스 종료
