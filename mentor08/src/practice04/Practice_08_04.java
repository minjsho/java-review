package practice04;

public class Practice_08_04 {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.plus(1, 2));
	}
}

class Calc{
	String plus(int num1, int num2) {
		int res = num1+num2;
		return "결과 : " + res;
	}
	
}
