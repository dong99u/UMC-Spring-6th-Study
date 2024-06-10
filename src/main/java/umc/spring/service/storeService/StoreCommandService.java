package umc.spring.service.storeService;

import org.springframework.stereotype.Service;
import umc.spring.domain.Mission;
import umc.spring.domain.Review;
import umc.spring.web.dto.MissionRequestDTO;
import umc.spring.web.dto.ReviewRequestDTO;

@Service
public interface StoreCommandService {

    Review registerReview(ReviewRequestDTO.CreateReviewDTO request);

    Mission registerMission(MissionRequestDTO.CreateMissionDTO request);

}
