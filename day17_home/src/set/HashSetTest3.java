package set;

import java.util.ArrayList; //ArryaList 클래스 불러오기
import java.util.HashSet; //HashSet 클래스 불러오기

public class HashSetTest3 { //HashSetTest3 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		ArrayList<Integer> list = new ArrayList<>();
		//정수형 타입의 ArrayList 컬렉션 객체 list 생성
		
		list.add(1); //list에 1추가
		list.add(2); //list에 2추가
		list.add(3); //list에 3추가
		System.out.println(list); //list에 있는 요소 출력
		System.out.println(list.add(5));
		//list 요소에 5 존재 여부 반환(없으면 true 반환하고 5 추가)
		System.out.println(list); //list에 있는 요소 출력
		System.out.println(list.size()); //list의 요소 개수 반환
		
		HashSet<Integer> set = new HashSet<>(list);
		//정수형 HashSet 컬렉션 객체 set 생성하고
		//생성자로 list 객체 전달
		System.out.println(set);
		//set에 list 요소들 저장되고 -> 출력
		
		ArrayList<Integer> result = new ArrayList<>(set);
		//정수형 ArrayList 컬렉션 객체 result 생성하고
		//생성자로 set 객체 전달
		System.out.println(result);
		//result에 set 요소들 저장되고 -> 출력
		
	} //main 메소드 종료영역

} //HashSetTest3 클래스 종료영역
