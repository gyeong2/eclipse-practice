package Array;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B3052 {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[10]; //�Է¹��� ���ڸ� ������ �迭 ����
		
		for(int i = 0; i<10; i++) { //���� �Է¹ޱ�
			a[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		Arrays.sort(a);
		int count = 1;
		for(int j = 1; j<a.length; j++) { //�� ���� ���ϱ�
			if(a[j-1] != a[j]) { //�������� �ٸ��� count++ 
				count++;
			}
		}
		System.out.println(count);
	}
}
