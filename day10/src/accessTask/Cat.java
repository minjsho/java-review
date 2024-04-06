package accessTask; 

public class Cat extends Animal{ //Animal 클래스를 상속받는 Cat 클래스 시작영역
	//Cat클래스
	//Animal클래스 상속
	
	//필드 : private 색상(col)
	private String col;	//같은 클래스에서만 접근 가능한 문자열 col 필드 선언

	//생성자 : 매개변수 없는 기본생성자
	public Cat() {	//모든 패키지에서 접근 가능한 Cat 생성자
		super(); //부모생성자 호출
	}
	
	//매소드 : play(매개x, 리턴x) => 00색 고양이 00이가 놀고있습ㄴ다 출력
	//scratch(매개x 리턴x) => 00이가 스크래치를 긁습니다 출력
	private void play() {	//같은 클래스에서만 접근 가능한 play 메소드 시작영역
		System.out.println(this.col + "색 고양이 " + super.name + "이(가) 놀고있습니다");
		//같은 클래스 내에 있는 col 필드, 부모클래스의 name 필드
	} //play 메소드 종료영역
	
	void scratch() { //scratch 메소드 시작영역	
		play();	//play 메소드 호출 -> private 메소드를 외부에서 사용 가능하도록 불러옴
		System.out.println(super.name + "이(가) 스크래치를 긁습니다");
		//부모클래스의 name 필드 포함하여 출력
	} //scratch 메소드 종료영역

	
	public String getCol() {
	//모든 패키지에서 접근 가능한, 리턴값이 문자열인 게터메소드 getCol
		return col;	//col 필드에 저장된 값 반환
	}//getCol 메소드 종료
	
	public void setCol(String col) {
	//모든 패키지에서 접근 가능한, 매개변수로 문자열 col 변수를 받는 세터메소드 setCol
		this.col = col;	//매개변수로 받은 col 값을 col 필드에 저장
	} //setCol 메소드 종료

}//Cat 클래스 종료영역
