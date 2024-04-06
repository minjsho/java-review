package lambdaTest;

public class EsTest {
	public static void main(String[] args) {
		//식 vs 문
		int a = 3;	//문
		System.out.println(a);	//문
		
		int b = a = 5; //문
		//a = 5 식
 		
		add10(20);	// 20 :식, add10(20) :add10이라는 메소드를 호출하는 문
	}
	
	static int add10(int num) {
		System.out.println(num+10);	//문
		return num+10;	//문
	}

}
