package markerTest;

public class SomeClass implements Markerinterface{
	//Markerinterface를 구현받는 SomeClass 클래스 시작영역
	//필드
	private String data;

	//매개변수 1개 받는 생성자
	public SomeClass(String data) {
		super(); //부모생성자 호출
		this.data = data;
	}


	//게터 메소드 - private
	//생성자에서 값을 매개변수로 입력받기 때문에 세터 메소드는 없어도 된다
	public String getData() {
		return data; //data 필드에 저장된 값 반환
	}

} //SomeClass클래스 종료
