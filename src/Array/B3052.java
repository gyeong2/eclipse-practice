package Array;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B3052 {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[10]; //입력받은 숫자를 저장할 배열 생성
		
		for(int i = 0; i<10; i++) { //숫자 입력받기
			a[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		Arrays.sort(a);
		int count = 1;
		for(int j = 1; j<a.length; j++) { //각 원소 비교하기
			if(a[j-1] != a[j]) { //나머지가 다르면 count++ 
				count++;
			}
		}
		System.out.println(count);
	}
}
