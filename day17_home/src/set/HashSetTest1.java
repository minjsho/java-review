package set;

import java.util.HashSet; //HashSet 클래스 불러오기
import java.util.Iterator; //Iterator 인터페이스 불러오기

public class HashSetTest1 { //HashSetTest1 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		HashSet<String> animalSet = new HashSet<>();
		//String 타입의 HashSet 컬렉션 객체 animalSet 생성하고
		//동일한 타입의 생성자 저장
		animalSet.add("강아지");	//animalSet에 강아지 추가
		animalSet.add("고양이");	//animalSet에 고양이 추가
		animalSet.add("기린");	//animalSet에 기린 추가
		System.out.println(animalSet); //animalSet 값 출력
		
		Iterator<String> animalIter = animalSet.iterator();
		//String 타입의 반복자 animalIter 생성하고
		//HashSet 컬렉션 객체 animalSet을 iterator로 변환하여 저장
		System.out.println(animalIter);
		//HashSet의 내부에 있는 Iterator 주소 출력
		System.out.println(animalIter.hasNext());
		//animalIter의 다음값 존재여부 반환 -> 있다면 true 반환됨
		System.out.println(animalIter.next());
		//다음 값 반환
		
		//animalIter에 다음 값이 존재할 때까지만 반복
		while(animalIter.hasNext()) {
			System.out.println(animalIter.next());
			//animalIter 다음값 출력
		} //while문 종료
		
	} //main 메소드 종료영역

} //HashSetTest1 클래스 종료영역
