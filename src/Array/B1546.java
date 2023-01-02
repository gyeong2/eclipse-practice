package Array;

import java.util.Scanner;

public class B1546 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // 시험 본 과목의 개수
		int exam[] = new int[n];
		int max = 0;
		int sum = 0;
		double avg = 0.0;

		for(int i = 0; i<exam.length; i++) {
			exam[i] = input.nextInt();
			if(exam[i] > max) {
				max = exam[i];
			}
			sum += exam[i];
		}
		
		avg = 100.0 * sum / max / n;
		System.out.println(avg);
	}
}

/*
//원래 수정전 내 코드.. 
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // 시험 본 과목의 개수
		double exam[] = new double[n];
		double max = exam[0];
		double sum = 0;

		for(int i = 0; i<n; i++) {
			exam[i] = input.nextInt();
		}
		
		for(int i=1; i<n; i++) { //오류! 배열의 원소가 하나인 경우에는 비교 작업을 할수가 없다...
								 //시험 점수가 2개 이상이다 <이런 조건이 있었으면 나쁘지 않앗을듯. 
			if(max < exam[i]) {
				max = exam[i];
			}
		}
		
		for(int j = 0; j<n; j++) {
			exam[j] = exam[j]/max*100;
			sum += exam[j];
		}
		
		System.out.println(sum/n);
	}
}
*/