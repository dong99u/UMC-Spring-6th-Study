package umc.spring.service.memberService;

import org.springframework.stereotype.Service;
import umc.spring.domain.Member;
import umc.spring.web.dto.MemberRequestDTO;

@Service
public interface MemberCommandService {

    Member joinMember(MemberRequestDTO.JoinDto request);
}
