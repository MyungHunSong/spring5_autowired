package spring5_autowired.di;

import java.time.LocalDateTime;
import java.util.DuplicateFormatFlagsException;
// 등록 서비스
public class MemberRegisterService {
	private MemberDao memberDao;

	public MemberRegisterService() {
	}

	public MemberRegisterService(MemberDao memberDao) { 
		this.memberDao = memberDao;
	}

	public Long regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		if(member != null) {
			throw new DuplicateFormatFlagsException("dup email" + req.getEmail());
		}	
		// 여기 순서에 한번 털렷다 잘 기억해두자.
		Member newMember = new Member(req.getEmail(),  req.getName(), req.getPassword(),  LocalDateTime.now()); 
		memberDao.insert(newMember);
		return newMember.getId();
	}


	
}
