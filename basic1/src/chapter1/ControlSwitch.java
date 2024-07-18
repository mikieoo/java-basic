package chapter1;

import java.util.Scanner;

public class ControlSwitch {
	
	public static void main(String[] args) {
		
		// Switch 문 : 특정 변수 또는 표현식에 따라 실행할 코드 블럭의 범위를 결정하는 것
		/*switch (변수-일반표현식) {
		case 값1:
			변수 - 일반표현식이 값1과 같을 때 시작할 코드 블럭 위치
		case 값2:
			변수 - 일반표현식이 값2와 같을 때 시작할 코드 블럭 위치
			break;
		case 값3:
			변수 - 일반표현식이 값3와 같을 때 시작할 코드 블럭 위치
		default:
			변수 - 일반표현식이 case의 값과 일치하는 것이 없거나 바로 위에서
			break문을 만나지 않으면 실행되는 코드
		}*/
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		switch (number) {
		case 0:
			System.out.println("A");
			break;
		case 1:
			System.out.println("B");
			System.out.println("C");
			break;
		case 2:
			System.out.println("D");
			break;
		}
		
		
		
		
	}

}
