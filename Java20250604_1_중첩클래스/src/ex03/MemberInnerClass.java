package ex03;

/*
 * 클래스 생성
 */

class SendMessage{
	
	private String msg;

	public SendMessage(String msg) {
		this.msg = msg;
	}
	
	String getMsg() { return msg;}
}

class Network{
	public void message(String content) {
		
		SendMessage message = new SendMessage(content);
		
		System.out.println(message.getMsg());
	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
		
		Network network = new Network();
		network.message("이 문장을 전송해 주세요!!!");
		
	}
}