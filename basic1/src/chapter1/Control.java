package chapter1;

public class Control {

	public static void main(String[] args) {
		
		// 코드 블럭
		// 코드들의 묶음 (하나의 기능으로 취급)
		// {}로 표시
				
		{
			// 더하기 연산
			int a = 10;
			int b = 20;
			int result = a + b;
			System.out.println(result);
		}
		
		{
			// 빼기 연산
			int a = 10;
			int b = 5;
			int result = a - b;
			System.out.println(result);
		}
		
		
		// 제어문 : 조건에 따라서 코드의 흐름 결정하는 것
		
		// 조건문 : 특정 조건이 만족하면 해당 코드블럭을 실행하는 것
		
		// if문 : 주어진 조건이 true이면 코드를 실행하게 하는 것
		System.out.println("if 문 코드 실행");
		
		// 점수가 60점 이상이면 "통과"라는 문자열을 출력하고
		// 그렇지 않으면 아무것도 출력하지 않음
		int score = 70;
		
		if (score >= 60) {
			System.out.println("통과");
		} 
		
		System.out.println("if문 코드 종료");
		
		
		// else문 : if문의 조건-논리 표현식이 false이면 코드를 실행하게 하는 것
		// 1. else문은 반드시 if문 이후에 와야함 (else문 단독 사용 불가능)
		// 2. else문에는 조건을 작성하지 않음
		
		int score1 = 60;
		if(score1 >= 60) {
			System.out.println("통과");
		} else {
			System.out.println("과락");
		}
		
		int age = 32;
		String gender = "남자";
		
	
		if (age >= 30) {
			if (gender.equals("남자")) {
				System.out.println("30대 중년 남성입니다.");
			} else {
				System.out.println("일반인 입니다.");
			}
		} else {
			System.out.println("일반인 입니다.");
		}
		
		
		
		if (age >= 30 && gender.equals("남자")) {
			System.out.println("30대 중년 남성입니다.");
		} else {
			System.out.println("일반인 입니다.");
		}
		
		
		boolean isMiddleMan = age >= 30 && gender.equals("남자");
		if (isMiddleMan) {
			System.out.println("30대 중년 남성입니다.");
		} else {
			System.out.println("일반인 입니다.");
		}
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		
	}

}
