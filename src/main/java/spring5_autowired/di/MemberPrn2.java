package spring5_autowired.di;

public class MemberPrn2 extends MemberPrinter {

	public void print(Member member) {
		System.out.printf("이름=%s, 등록일=%tF%n",member.getName(), member.getRegisterDateTime());
	}
	
}
