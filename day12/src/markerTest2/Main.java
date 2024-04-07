package markerTest2;

public class Main { //Main클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		Main m = new Main(); //Main 클래스 타입의 m 객체 생성
		m.checkA(new Tiger("호랑이"));
		//m 객체의 checkA 메소드 호출하여 Tiger 생성자에 호랑이 전달한 값 확인
		
		Animal[] animals = {new Eagle("독수리"), new Tiger("호랑이"), new Horse("말")};
		//Animal타입의 배열변수 animals 선언하고 값 저장
		m.checkB(animals); //m객체의 checkB 메소드 호출하여 전체 동물 확인
		
	} //main 메소드 종료

	
	//어떤 종류의 동물인지 확인하는 메소드
	void checkA(Animal animal) {
	//Animal 클래스 타입의 animal을 매개변수로 받는 checkA 메소드
		if(animal instanceof Carnivore) {//만약 animal이 Carnivore 타입이라면
			System.out.println(animal.getName()+"은(는) 육식동물입니다");
			//animal 객체의 name 필드를 게터 메소드로 불러오고 육식동물입니다 출력
		}else if(animal instanceof Harbivore){ //그게 아니고 Harbivore 타입이라면
			System.out.println(animal.getName()+"은(는) 초식동물입니다"); //초식동물입니다 출력
		}//else if문 종료
	}//checkA 메소드 종료
	
	
	//땅을 다니는 동물인지, 하늘을 나는 동물인지 확인하는 메소드
	void checkB(Animal[] animals) {
	//Animal 클래스의 배열타입으로 animal 매개변수를 받는 checkB 메소드
		for(int i=0; i<animals.length; i++) {
		//animals는 배열타입이므로 0번 인덱스부터 배열 길이까지 반복하여 확인함
			if(animals[i] instanceof Land) {
			//animals의 i번째 인덱스 값이 마크인터페이스 Land 타입이라면
				System.out.println(animals[i].getName() + "은(는) 뛰어다닙니다");
			} //if문 종료
			else if(animals[i] instanceof Sky) { //Sky 타입이라면
				System.out.println(animals[i].getName()+"은(는) 날아다닙니다");
			} //else if문 종료
		}//for문 종료
	}//checkB 메소드 종료
	
}//Main 클래스 종료
