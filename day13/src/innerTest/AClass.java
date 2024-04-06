package innerTest;

public class AClass {
	
	//필드
	int instanceVar;
	static int staticVar;
	
	class InstanceInner{	//AClass 내부에서 정의한 인스턴스 내부 클래스
		
	}
	
	static class StaticInner{	//AClass 내부에서 정의한 스태틱 내부 클래스
		
	}
	
	
	//메소드
	void instanceMethod() {	//인스턴스 메소드
		//지역변수
		int localVar;
		
		//클래스
		class LocalInner{	//메소드 내부에서 정의한 로컬 내부 클래스
			
		}
		
		//로컬 클래스는 메소드 안에서 객체 생성!!
		//로컬 내부 클래스의 객체를 참조하는 로컬변수
		//자료형(클래스명)
		LocalInner li = new LocalInner();
		//AClass 내부의 인스턴스 내부 클래스의 객체를 참조하는 인스턴스 변수
		InstanceInner ii = new InstanceInner();
		//AClass 내부의 스태틱 내부 클래스의 객체를 참조하는 인스턴스 변수
		StaticInner si = new StaticInner();
	}
	

	static void staticMethod() {
		//스태틱메소드
		//지역변수
		int localVar;
//		instanceVar =30;
	    staticVar = 10;  //값을 할당해야 함
	    localVar = 20;

	    class LocalInner{
	        //메소드 내부에서 정의한 로컬 내부 클래스
	          
	     }
	    
	    //로컬 내부 클래스의 객체를 참조하는 로컬 변수
	    LocalInner li = new LocalInner();
	    
	    //AClass의 InstanceInner 클래스의 객체를 참조하는 로컬 변수
//	    InstanceInner ii = new InstanceInner();
	    
	    //AClass 내부의 스태틱 내부 클래스의 객체를 참조하는 로컬 변수
	    StaticInner si = new StaticInner();
		
	}
}
