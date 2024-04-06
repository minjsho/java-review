package castingTest;

public class TypeTest {
	public static void main(String[] args) {
		Parents p = new Parents();
		Child c = new Child();
		System.out.println(p);
		System.out.println(c);
		
		System.out.println("======클래스 객체 타입 비교=====");
		System.out.println(p instanceof Parents);
		//p라는 객체는 Parents 클래스 타입의 객체가 맞니?
		//맞으면 true, 틀리면 false
		System.out.println(p instanceof Child);
		System.out.println(c instanceof Parents);
		System.out.println(c instanceof Child);
		
		
		System.out.println("======캐스팅 시 클래스 객체 타입 비교=======");
		//업캐스팅
		Parents pp = new Child();
		//pp 라는 변수는 Parents 타입의 참조변수이다. (stack)
		//실제로 Child 클래스의 참조값이 할당되엇ㅇ므로 업캐스팅디ㅗㄴ다.
		System.out.println(pp);		
		System.out.println(pp instanceof Parents);
		System.out.println(pp instanceof Child);
		
		//업캐스팅 된 pp 객체를 다운 캐스팅
		Child cc = (Child) pp;
		System.out.println(cc instanceof Parents);
		System.out.println(cc instanceof Child);
	
	}

}
