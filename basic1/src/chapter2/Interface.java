package chapter2;

// 인터페이스 : 클래스가 구현해야하는 메서드들을 선언한 참조 타입
// 인터페이스의 모든 변수 public static final 형태가 와야함
// 인터페이스의 모든 메서드는 public abstract 형태가 와야함
// 인터페이스는 다중 구현이 가능

// 접근제어자 interface 인터페이스명 {...}

interface AreaCalculation {
	
	double PI = 3.14; // final 키워드가 붙어있지 않아도 인터페이스 안에 선언된 변수이기 때문에 재할당 안됨
	
	double getTriangleArea(double bottom, double height);
	double getRectangleArea(double bottom, double height);
	double getCirclArea(double radius);
	
}

interface Circumference {
	
	double getCircleCircumference(double radius);
}

// 인터페이스는 다중 상속이 가능함
interface Calculation extends AreaCalculation, Circumference {
	
}

// 인터페이스는 implements 키워드를 이용하여 클래스에서 구현하여 사용할 수 있음
// 인터페이스는 다중 구현이 가능함
class MyCalculation implements AreaCalculation, Circumference {

	@Override
	public double getTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		return bottom * height;
	}

	@Override
	public double getCirclArea(double radius) {
		return radius * radius * PI;
	}

	@Override
	public double getCircleCircumference(double radius) {
		return radius * 2 * PI;
	}
	
}

// 인터페이스는 개발자간의 상호 약속을 위한 수단으로도 사용됨
interface Statement {
	String greet = "안녕하세요";
}

public class Interface {

	public static void main(String[] args) {
		
		MyCalculation instance = new MyCalculation();
		System.out.println(instance.getCirclArea(10));
		
		System.out.println(Statement.greet + " !");
	}

}
