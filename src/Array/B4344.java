package Array;

import java.util.Scanner;

public class B4344 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int c = input.nextInt(); //�׽�Ʈ ���̽��� ����
		int s[];
		
		for(int i = 0; i<c; i++) {
			int N = input.nextInt(); //�л� ��
			s = new int[N];
			double sum = 0;
			
			for(int j = 0; j<N; j++) {
				int score = input.nextInt(); //�� �л����� ����
				s[j] = score;
				sum += score;
			}
			
			double a = (sum/N); // ��հ�
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
