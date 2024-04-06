package Ex08_18;

public class Bus {
	void take(int num) {
		while(true) {
			if(num<3000) {
				System.out.println("충전하세요");
				return;
			}
			System.out.println("승차입니다");
			num -= 1250;
		}
		
	}

}
