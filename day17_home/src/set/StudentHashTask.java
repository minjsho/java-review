package set;

import java.util.HashSet;

public class StudentHashTask {
	public static void main(String[] args) {
		//hashSet 객체 생성
		HashSet<Student> set = new HashSet<>();
		
		//Student 객체 생성
		Student st = new Student(1, "짱구");
		
		// equals 메소드 테스트
		boolean isTrue = st.equals(new Student(1, "홍길동"));
		System.out.println(isTrue);
		isTrue = st.equals(new Student(2, "홍길동"));
		System.out.println(isTrue);
		
		//Student객체를 HashSet에 추가
		set.add(st);
		
		System.out.println(new Student(1, "홍길동"));
		set.add(new Student(1, "홍길동"));
		System.out.println(set.size());
		
		System.out.println(new Student(2, "홍길동"));
		set.add(new Student(2, "홍길동"));
		System.out.println(set.size());
		
	}

}
