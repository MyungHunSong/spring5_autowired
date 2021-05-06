package spring5_autowired.di;

public class MemberPrn1 extends MemberPrinter {

	public void print(Member member) {
		System.out.printf("회원 정보: 아이디=%d, 이메일 =%s",member.getId(), member.getEmail());
	}
	
}
