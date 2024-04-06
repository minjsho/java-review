package accessTask;

public class MainTask { //MainTask 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		Animal ani = new Animal(); //Animal클래스 타입의 ani객체 생성하고 Animal 생성자 저장
		Cat cat = new Cat(); //Cat클래스 타입의 cat객체 생성하고 Cat생성자 저장
		
		cat.name = "나비";
		//cat객체의 name 필드에 나비 저장 -> Animal클래스를 상속받았기 때문에 가능
		cat.setCol("흰"); //cat객체의 setCol 메소드 호출, col 필드에 흰 저장
		cat.getCol(); //cat객체의 getCol 메소드 호출, col 필드에 저장된 값 출력
		
		cat.scratch(); //cat객체의 scratch 메소드 호출 -> play 메소드도 같이 호출됨
		
	} //main 메소드 종료영역

} //MainTask 클래스 종료영역
