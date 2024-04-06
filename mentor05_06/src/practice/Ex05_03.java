package practice;

public class Ex05_03 {
	public static void main(String[] args) {
		/*
		 * 합 저장 정수형 변수 sum 선언, 초기값 0 할당
		 * for(int i=0; i<100; i++){
		 * 	if(i+1을 2로 나눈 나머지% == 0){
		 * 		sum += i+1 ;
		 * 	}
		 * }
		 * sum  출력
		 */
		
		int sum =0;
		for(int i=0; i<100; i++){
			if((i+1)%2 == 0) {
				sum += i+1;
			}
		}
		System.out.println(sum);
	}

}
