package home04;

public class Ex01 {
	public static void main(String[] args) {
//		정수형 변수 선언
//		반복 while문
//		반복문 if 안에 홀수라면 출력 -> 2로 나눈 나머지 1
//		변수 1씩 증가하면서 반복
		
		int num=1;
		while (num<=10) {
			if(num%2 == 1) {
				System.out.println(num);
			}
			num++;
		}
		
	}
}
