package Abstract;

// "동물"이라는 단어 자체가 추상적인 개념이기에
// 상속 받은 클래스들을 구체화 시킴

// 클래스들의 멤버나 메서드를 공통적인 부분을 뽑아서 하나로 묶어놓은 것! 
// 각각의 클래스들한테 상속!

// 추상 클래스
// 추상 메서드 : 구현부가 없는 메서드
//           → 구현부 {} 즉 몸통이 없는 메서드
//  함수 - 선언부(타입) / 구현부(실행) → 둘 중 하나라도 없다면 미완성 메서드

/*
 * 함수 작성할 때
 * 접근제어자 반환타입 함수명(매개변수 타입){ // 선언부
 * 		실행문장; // 구현부
 * }
 * 
 * 추상메서드를 하나라도 가지고 있는 클래스는 미완성된 클래스로 객체를 생성할 수 없다
 * 
 * abstract 키워드를 메서드에 붙인다
 * 정상적인 클래스를 만들 수 없기 때문에 클래스로 abstract 붙여서 사용한다
 * 
 * 상속받을 다른 클래스들에게 도움을 줄 목적으로 사용한다
 * 
 */

public abstract class Animal { // → 클래스에도 abstract를 기입해야 아래 추상 메서드를 작성할 수 있다
	abstract void 운다(); // → 함수지만 미완성된 함수로 추상적인 개념으로 선언한 것
	abstract void play();
	abstract void 먹는다();
	
//	void 운다() {
//		System.out.println(""); // 이렇게 쓴다면 작성할 이유가 없기에 추상메서드를 사용하는 것
//	}
//	
//	void play() {
//		System.out.println("");
//	}
//	
//	void 먹는다() {
//		System.out.println("");
//	}
	
}