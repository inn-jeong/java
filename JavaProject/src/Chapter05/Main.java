package Chapter05;

public class Main {
	public static void main(String[] args) {
//		new Animal();//추상클래스는 객체 생성 못 함
		Animal a;//참조변수 선언은 된다.
//		new Bird();//추상클래스는 객체 생성 못 함
		Penguin p = new Penguin();
		p.swim();//멤버 5개(life, wing, walk(), eat(), swim())중 수영한다.
		Bird p2 = new Penguin();
//		p2.swim();//업캐스팅은 슈퍼클래스의 멤버만 접근 가능(오류 발생)
		p2.walk();//슈퍼클래스의 멤버 호출
		Penguin p3 = (Penguin)p2; //downcasting
		p3.swim();//다운캐스팅은 모든 멤버 접근 가능
		
		Bird d = new Duck();//업캐스팅
		d.eat();//업캐스팅은 슈퍼클래스의 멤버만 접근 가능	}
		
		Duck d2 = (Duck)d;//다운캐스팅
		d2.fly();//다운캐스팅은 모든 멤버 접근 가능
		
		//추상클래스를 참조변수 선언(슈퍼클래스)
		Animal d3 = new Duck();//업캐스팅은 슈퍼클래스의 멤버만 접근 가능
		int x = d3.life;
		System.out.println("x===>"+x);
		
//		new Swim2();//인터페이스는 객체 생성 못 한다.
		Swim2 s = new Penguin();
		s.swim();//penguis swims.
		//인터페이스가 인터페이스 배열 2개를 가리킨다.
		//객체배열과 형태가 비슷
		//s2[0], s2[1]
		Swim2[] s2 = new Swim2[2];
		s2[0] = new Penguin();//s2[0]=>참조변수
		s2[1] = new Duck();
		s2[0].swim();
//		s2[1].fly();
		//컴파일러 단계는 알 수 없고, 런타임 실행시 오류 발생
//		java.lang.ArrayIndexOutOfBoundsException : 2
//		s2[2]=new Penguin();
	}
}
