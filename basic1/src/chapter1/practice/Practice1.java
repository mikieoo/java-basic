package chapter1.practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[0];
		
		int cnt = 0;
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if(num < 0) {
				for(int i=0; i<numbers.length; i++) {
					System.out.print(numbers[i] + " ");
				}
				break;
			}
			int[] newNumbers = new int[numbers.length + 1];  // 2
			newNumbers[newNumbers.length - 1] = num; // 1
			numbers[newNumbers.length - 1] = newNumbers[cnt]; // 1 = 1 
			cnt++;
		}
		
		sc.close();
		
	}

}
