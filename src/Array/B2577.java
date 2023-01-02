package Array;

import java.util.Scanner;

public class B2577 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt(); // 자연수 3개 입력받기
		
		int result = n1*n2*n3; // 자연수 3개를 곱한 결과
		String str = Integer.toString(result); // 문자열로 변환
		
		for(int i=0; i<10; i++) {
			int count = 0; //각 숫자가 몇번 쓰였는지 체크할 변수
			for(int j=0; j<str.length(); j++) {
				if((str.charAt(j) - '0') == i) { // -'0' 또는 -48 연산 > 아니면 아스키코드로 나옴
					count++; //변수 증가
				}
			}
			System.out.println(count); //각 개수 출력하기 
		}
		
	}
}
