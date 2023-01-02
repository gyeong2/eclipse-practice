package Array;

import java.util.Scanner;

public class B5597 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[31];
		
		for(int i = 1; i<29; i++) {
			int n = input.nextInt(); //제출한 학생 번호 입력받기
			a[n] = 1; //제출한 학생 번호 채워넣기
		}
		
		for(int j = 1; j<a.length; j++) {
			if(a[j] != 1) //만약 j번째 자리가 비어있다면
				System.out.println(j); //j(출석번호) 출력하기
		}
	}
}
