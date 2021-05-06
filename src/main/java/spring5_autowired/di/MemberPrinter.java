package spring5_autowired.di;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;


public class MemberPrinter {
	private DateTimeFormatter dateTimeFormatter;
	
	
	
	public MemberPrinter() {
		dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"); 
		// 스프링은 생성자 안에 들어잇는 요새끼 까지는 알아서 자동으로 못해준다
	}
	public void print(Member member) {
		if(dateTimeFormatter == null) {
			System.out.printf("회원 정보: 아이디=%d, 이메일 =%s, 이름=%s, 등록일=%tF%n",
					member.getId(),
					member.getEmail(),
					member.getName(),
					member.getRegisterDateTime());
		}else {
			System.out.printf("회원 정보: 아이디=%d, 이메일 =%s, 이름=%s, 등록일=%s%n", member.getId(), member.getEmail(),
					member.getName(), dateTimeFormatter.format(member.getRegisterDateTime()));
		}	
	}

	@Autowired(required = false)
	public void setDateTimeFormatter( DateTimeFormatter dateTimeFormatter) {
		this.dateTimeFormatter = dateTimeFormatter;
	}
}
