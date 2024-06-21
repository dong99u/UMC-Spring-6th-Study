package umc.spring.service.storeService;

import org.springframework.stereotype.Service;
import umc.spring.domain.Review;
import umc.spring.domain.Store;
import org.springframework.data.domain.Page;

import java.util.Optional;

@Service
public interface StoreQueryService {

    Optional<Store> findStore(Long id);

    Page<Review> getReviewList(Long storeId, Integer page);

    Page<Review> getMyReviewList(Long memberId, Long storeId, Integer page);

}
