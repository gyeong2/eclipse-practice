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
			int cnt = 0; //연속횟수
			int sum = 0; //합산
			
			for(int j = 0; j<a[i].length(); j++) {
				if(a[i].charAt(j) == 'O') { //만약 연속으로 O가 나오면
					cnt++; //cnt 값을 1 더한다.
				}
				else { //X가 나오면
					cnt = 0; //cnt값은 0으로 초기화된다. 
				}
				sum += cnt; //합계를 구한다.
			}
			System.out.println(sum);
		}
	}
}
