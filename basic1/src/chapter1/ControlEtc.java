package chapter1;

public class ControlEtc {

	public static void main(String[] args) {

		// continue : 반복문에서 continue 를 만나면 조건 검사로 넘어감
		// break : 반복문에서 break 를 만나면 반복문을 종료함
		// continue. break 문은 조건문과 같이 사용됨
		
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) continue;
			if(i % 4 == 0 && i % 11 == 0) break;
			System.out.println(i);
		}
	}

}
