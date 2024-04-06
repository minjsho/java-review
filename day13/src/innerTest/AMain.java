package innerTest;

public class AMain {
	public static void main(String[] args) {
		//AClass의 인스턴스 a 생성
		AClass a = new AClass();
		System.out.println(a);
		
		//로컬 내부 클래스의 객체 생성 => 불가!
//		AClass.InstanceInner
		
		//AClass의 참조변수를 이용해서 InstanceInner 클래스의 객체 생성
		AClass.InstanceInner ai = a.new InstanceInner();
		System.out.println(ai); 	//$ 있으면 내부클래스
		
		//AClass의 인스턴스 생성하고 그 인스턴스를 이용해서 InstanceInner 클래스 객체 생성
		AClass.InstanceInner ai2 = new AClass().new InstanceInner();
		
	      //StaticInner 클래스의 객체 생성
	      AClass.StaticInner as = new AClass.StaticInner();
	      System.out.println(as);
//	      InstanceInner as2 = new AClass().new InstanceInner();
//	      System.out.println(as2);

	}

}
