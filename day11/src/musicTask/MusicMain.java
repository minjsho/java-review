package musicTask;

public class MusicMain {
	//MusicMain
	//mian 메소드
	//check 메소드 => 객체를 확인해서 해당 클래스의 메소드가 모두 출력될 수 있도록 구현

	
	public static void main(String[] args) {
		check(new Ballad());
		check(new HipHop());
		check(new Rock());
		
	}
	
	static void check(Music music) {
		if(music instanceof Ballad) {
			((Ballad)music).mode();
			((Ballad)music).onlyBallad();
		}else if(music instanceof HipHop) {
			((HipHop)music).mode();
			((HipHop)music).onlyHipHop();
		}else if(music instanceof Rock) {
			((Rock)music).mode();
			((Rock)music).onlyRock();
		}
	}
}
