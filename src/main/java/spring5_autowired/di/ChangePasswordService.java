package spring5_autowired.di;

import org.springframework.beans.factory.annotation.Autowired;

import spring5_autowired.exception.MemberNotFoundException;

public class ChangePasswordService {
	
	@Autowired
	private MemberDao memberDao;

//	public void setMemberDao(MemberDao memberDao) {
//		this.memberDao = memberDao;
//	}
	
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			throw new MemberNotFoundException();
		}
 
		member.changePassword(oldPwd, newPwd);
		memberDao.update(member);		// 원래 true 면 업데이트 해야한다.
		
		
	}	
}
