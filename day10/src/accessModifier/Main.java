package accessModifier; 

public class Main {	//Main 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		A a = new A();	//A클래스 타입의 a 객체 생성하고 A클래스 생성자 저장
		//public, default, protected : 같은 패키지 내에 다른 클래스이기 때문에 접근 가능
		a.var1 =10;	//a객체의 var1 필드에 10 저장
		a.var2 =20;	//a객체의 var2 필드에 20 저장
		a.var3 =30; //a객체의 var3 필드에 30 저장
		
		System.out.println(a.var1);	//a의 var1 필드에 저장된 값 콘솔창에 출력
		System.out.println(a.var2);	//a의 var2 필드에 저장된 값 콘솔창에 출력
		System.out.println(a.var3);	//a의 var3 필드에 저장된 값 콘솔창에 출력
		
		
		//같은 패키지 내에 다른 클래스에 있는 메소드 
		//public, default, protected 접근 가능
		a.publicMethod();	//a객체의 publicMethod메소드 호춯
		a.proMethod();		//a객체의 proMethod메소드 호출
		a.defaultMethod();	//a객체의 defaultMethod메소드 호출
		
		System.out.println(a.getVar4()); //a객체의 getVar4메소드 호출 -> var4에 저장된 값 출력됨
		a.setVar4(40); //a객체의 setVar4메소드 호출 -> var4에 40이라는 값 저장함
		System.out.println(a.getVar4()); //a객체의 getVar4메소드 호출
		
	} //main 메소드 종료

} //Main클래스 종료
