package castingTest2;

public class CastingTest {	//CastingTest 클래스 시작
	public static void main(String[] args) { //main 메소드 시작
		//객체화 작업(인스턴스화)
		Person p1 = new Person("짱구", 5, "유치원생"); //Person클래스 타입의 p1객체 생성
		Student p2 = new Student("김민주", 20, "대학생", "코리아학교"); //Student클래스 타입의 p2객체 생성
		Employee p3 = new Employee("홍길동", 40, "개발자", "코리아회사"); //Employee클래스 타입의 p3객체 생성
		
		//메소드 오버라이딩 된 것으로 호출됨을 확인
//		p1.eat();
//		p2.eat();
//		p3.eat();		
		
		System.out.println(p2); //p2 객체 주소값 출력
	      
	      printWalk(p1); //printWalk 메소드 호출, 매개변수에 p1객체. 
	      printWalk(p2); //printWalk 메소드 호출, 매개변수에 p2객체. 
	      printWalk(p3); //printWalk 메소드 호출, 매개변수에 p3객체. 
	      
	      
//	      Person pr = new Student(null, 0, null, null); 부모타입의 객체에 자식의 참조값이 들어가면 업캐스팅
	   } //main 메소드 종료
	   
	   //매개변수 부모클래스 타입의 매개변수(들어오면서 자동 업캐스팅)
	   static void printWalk(Person person) {
		//static 메소드, Person클래스 타입의 person 매개변수를 가지는 printWlak 메소드
	      if(person instanceof Student) { //만약 person이 Student 타입의 객체가 맞다면
	         ((Student)person).walk(); //Student 타입으로 강제형변환하여 walk 메소드 호출
	      }else if(person instanceof Employee) { //person이 Student 타입은 아니고 Employee 타입의 객체가 맞다면
	         ((Employee)person).walk();	//Employee 타입으로 강제형변환하여 walk 메소드 호출
	      }else { //위 조건들이 모두 거짓이라면
	         System.out.println("걷기싫어"); //걷기싫어 출력
		}
	} //printWalk 메소드 종료

}	//CastingTest 클래스 종료
