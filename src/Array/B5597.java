package Array;

import java.util.Scanner;

public class B5597 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[31];
		
		for(int i = 1; i<29; i++) {
			int n = input.nextInt(); //������ �л� ��ȣ �Է¹ޱ�
			a[n] = 1; //������ �л� ��ȣ ä���ֱ�
		}
		
		for(int j = 1; j<a.length; j++) {
			if(a[j] != 1) //���� j��° �ڸ��� ����ִٸ�
				System.out.println(j); //j(�⼮��ȣ) ����ϱ�
		}
	}
}
