package Array;

import java.util.Scanner;

public class B10807 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt(); //정수의 개수 입력받기
		int[] a = new int[N];
		int cnt = 0;
		
		for(int i = 0; i<N; i++) {
			a[i] = input.nextInt(); //정수 입력받기 
		}
		
		int v = input.nextInt(); //찾으려는 정수 입력받기
		
		for(int j = 0; j<a.length; j++) {
			if(a[j] == v) //만약 찾으려는 정수가 존재하면
				cnt++; //count 변수 증가
		}
		
		System.out.println(cnt);
	}
}
