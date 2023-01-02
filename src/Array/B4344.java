package Array;

import java.util.Scanner;

public class B4344 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int c = input.nextInt(); //테스트 케이스의 개수
		int s[];
		
		for(int i = 0; i<c; i++) {
			int N = input.nextInt(); //학생 수
			s = new int[N];
			double sum = 0;
			
			for(int j = 0; j<N; j++) {
				int score = input.nextInt(); //각 학생들의 점수
				s[j] = score;
				sum += score;
			}
			
			double a = (sum/N); // 평균값
			double count = 0;
			
			for(int j = 0; j<s.length; j++) {
				if(s[j]>a) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n", (count/N)*100);
			
		}
	}
}
