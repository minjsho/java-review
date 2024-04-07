package musicInter;

public class MusicMain { //MusicMain 클래스 시작영역
	public static void main(String[] args) {//main 메소드 시작영역
		check(new Ballad()); //static 메소드이므로 객체생성하지 않아도 되며
		check(new HipHop());	//각각의 생성자를 매개변수로 넣어서 호출한다
		check(new Rock());
		
	}//main 메소드 종료영역
	
	
	//check메소드
	static void check(Music music) { //객체를 만들지 않고 바로 사용하기 위해 static 사용
	//Music 클래스 타입의 music을 매개변수 받는 check 메소드 시작영역
		music.mode(); //music 매개변수로 받은 객체의 mode 메소드 호출
		if(music instanceof Ballad) { //만약 music이 Ballad 타입의 객체라면
			((Ballad) music).onlyBallad(); //music 객체의 onlyBallad 메소드 실행
			//music은 Music 타입이고 onlyBallad는 Ballad 타입이므로 업캐스팅 되었기 때문에
			//다운 캐스팅을 해주어야 onlyBallad 메소드 사용이 가능하다
		} else if(music instanceof HipHop) { //만약 music이 HipHop 타입의 객체라면
			((HipHop) music).onlyHipHop(); //music 객체의 onlyHipHop 메소드 실행
			//마찬가지로 업캐스팅 된 music을 다운 캐스팅 하여야 onlyHipHop 메소드 사용이 가능하다
		} else if(music instanceof Rock) { //만약 music이 Rock 타입의 객체라면
			((Rock) music).onlyRock(); //music 객체의 onlyRock 메소드 실행
			//마찬가지로 업캐스팅 된 music을 다운 캐스팅 하여야 onlyRock 메소드 사용이 가능하다
		}//else if문 종료
	}//check 메소드 종료영역

}//MusicMain 클래스 종료영역

// MusicMain 클래스
// main 메소드
// check 메소드 => 객체를 확인해서 해당 클래스의 메소드가 모두 출력되도록 구현하기
