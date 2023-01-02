package Array;

import java.util.Scanner;

public class B1546 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // ���� �� ������ ����
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
//���� ������ �� �ڵ�.. 
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // ���� �� ������ ����
		double exam[] = new double[n];
		double max = exam[0];
		double sum = 0;

		for(int i = 0; i<n; i++) {
			exam[i] = input.nextInt();
		}
		
		for(int i=1; i<n; i++) { //����! �迭�� ���Ұ� �ϳ��� ��쿡�� �� �۾��� �Ҽ��� ����...
								 //���� ������ 2�� �̻��̴� <�̷� ������ �־����� ������ �ʾ�����. 
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