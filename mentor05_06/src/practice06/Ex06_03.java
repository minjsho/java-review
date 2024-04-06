package practice06;

public class Ex06_03 {
	public static void main(String[] args) {
		//랜덤값 저장할 정수형 변수 num 선언, 초기값 0 할당
		//정수형 이차원배열 변수 arr 선언, 2행 5열 생성
		//반복문(for문 i는 배열길이만큼 반복){
		//	반복문(for문 j는 열의 길이만큼 반복){
		//		num에 랜덤값 저장 Math.random() 형변환 필요
		//		arr[i][j]에 num 저장
		//  	배열 값 출력
		//	}
		// 줄바꿈
		//}
		
		int num =0;
		int[][] arr = new int[2][5];
		for (int i = 0; i < arr.length; i++) {
			for(int j=0; j<5; j++) {
				num = (int)(Math.random()*10) + 1;			
				arr[i][j] = num;
//				System.out.println(num + " ");
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}		
	}

}
