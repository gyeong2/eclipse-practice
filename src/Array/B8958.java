package Array;

import java.util.Scanner;

public class B8958 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String a[] = new String[n];
		
		for(int i = 0; i<n; i++) {
			a[i] = input.next();
		}
		
		for(int i = 0; i<n; i++) {
			int cnt = 0; //����Ƚ��
			int sum = 0; //�ջ�
			
			for(int j = 0; j<a[i].length(); j++) {
				if(a[i].charAt(j) == 'O') { //���� �������� O�� ������
					cnt++; //cnt ���� 1 ���Ѵ�.
				}
				else { //X�� ������
					cnt = 0; //cnt���� 0���� �ʱ�ȭ�ȴ�. 
				}
				sum += cnt; //�հ踦 ���Ѵ�.
			}
			System.out.println(sum);
		}
	}
}
