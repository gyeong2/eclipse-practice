package Array;

import java.util.Scanner;

public class B10807 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt(); //������ ���� �Է¹ޱ�
		int[] a = new int[N];
		int cnt = 0;
		
		for(int i = 0; i<N; i++) {
			a[i] = input.nextInt(); //���� �Է¹ޱ� 
		}
		
		int v = input.nextInt(); //ã������ ���� �Է¹ޱ�
		
		for(int j = 0; j<a.length; j++) {
			if(a[j] == v) //���� ã������ ������ �����ϸ�
				cnt++; //count ���� ����
		}
		
		System.out.println(cnt);
	}
}
