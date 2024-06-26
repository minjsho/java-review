package set;

import java.util.HashSet; //HashSet 클래스 불러오기
import java.util.Iterator; //Iterator 인터페이스 불러오기

public class HashSetTest2 { //HashSetTest2 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		HashSet<String> set = new HashSet<>();
		//String 타입의 HashSet 컬렉션 객체 set 생성하고
		//같은 타입의 HashSet 생성자 저장
		set.add("java"); //set 객체에 java 추가
		set.add("java"); //중복 값 무시된다
		set.add("dbms"); //set 객체에 dbms 추가
		set.add("jdbc"); //set 객체에 jdbc 추가
		set.add("web"); //set 객체에 web 추가
		System.out.println(set); //set에 있는 요소 출력
		System.out.println(set.add("java"));
		//set에 추가할 수 있는지 boolean 타입으로 반환
		//set에 없는 값이면 true, 이미 있는 중복 값이라면 false 반환
		
		set.remove("jdbc"); //set에서 jdbc 제거
		System.out.println(set); //set에 있는 요소 출력
		
		System.out.println(set.size()); //set의 요소 개수 반환
		System.out.println(set.isEmpty()); //set이 비어있는지 확인
//		set.clear();	//set의 모든 요소 제거
//		System.out.println(set); //set에 있는 값 출력 -> []
	
		
		Iterator<String> iter = set.iterator();
		//set의 반복자 iter 생성
		while(iter.hasNext()) { //iter 다음 값이 있을 때까지만 반복
		//clear() 이후에는 다음 값이 없으므로 실행되지 않음
			System.out.println(iter.next()); //다음값 출력
		}//while문 종료
	} //main 메소드 종료영역

} //HashSetTest2 클래스 종료영역
