package Array;

import java.util.Scanner;

public class B2577 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt(); // �ڿ��� 3�� �Է¹ޱ�
		
		int result = n1*n2*n3; // �ڿ��� 3���� ���� ���
		String str = Integer.toString(result); // ���ڿ��� ��ȯ
		
		for(int i=0; i<10; i++) {
			int count = 0; //�� ���ڰ� ��� �������� üũ�� ����
			for(int j=0; j<str.length(); j++) {
				if((str.charAt(j) - '0') == i) { // -'0' �Ǵ� -48 ���� > �ƴϸ� �ƽ�Ű�ڵ�� ����
					count++; //���� ����
				}
			}
			System.out.println(count); //�� ���� ����ϱ� 
		}
		
	}
}
