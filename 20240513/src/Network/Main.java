package Network;

public class Main {

	public static void main(String[] args) {

		// 네트워크
		// : 장비와 데이터를 주고 받는 작업
		// - 여러 사람들끼리 정보를 공유하기 위해서 만든 것
		
		// 노드: 네트워크에 속한 컴퓨터, 통신 장비
		// 인터넷: 문서, 그림 영상과 같은 여러 가지 데이터를 공유하도록 구성된 세상에서 가장 큰 전세계를 연결하는 네트워크
		
		// 네트워크의 분류
		// LAN(Local Area Network): 가까운 지역을 하나로 묶는 네트워크
		// WAN(Wide Area Network): 가까운 LAN끼리 묶어놓은 네트워크
		
		// 네트워크를 이용할 때 규칙 - 프로토콜
		// - Http
		
		// 서버: 서비스를 제공하는 컴퓨터
		// 클라이언트: 서비스를 사용하는 컴퓨터
		
		// IP: 컴퓨터를 구별하는데 사용하는 고유의 값
		// - 인터넷을 사용하는 모든 컴퓨터는 고유의 값(공인IP)
		// - 4byte(32bit) 의 정수로 구성
		// - 1byte 단위의 정수의 마침표로 구성
		
		// 자바
		// - java.net 패키지를 사용하면 네트워크 어플래케이션의 데이터 통신 부분을 쉽게 사용 가능
		
		// URL: 인터넷에 존재하는 여러 서버들이 제공하는 데이터에 접근할 수 있는 주소를 표현
		
		// 프로토콜: 데이터에 접근하기 위해서 서버와 통신할 때 사용되는 규칙(http, https)
		// → //호스트명:포트번호/경로명/파일명?쿼리스트링
		// 호스트명: 데이터를 제공하는 서버이름(네이버, 구글...)
		// 포트번호: 통신에 사용되는 서버의 포트번호(http: 80)
		// 파일명  : 접근하려는 데이터가 저장된 서버상의 위치
		
		// URL 클래스에서 관리한다.
		// URL connection
		// - http 프로토콜을 사용하여 특정 웹 서버와 통신한다.
		
		// URL 생성
		// HttpURLConnection 초기화
		// HTTP메서드 설정
		// 응답코드 확인
		// 응답 본문 확인 할 때 InputStream
		// 연결 종료
		
		
	}

}
