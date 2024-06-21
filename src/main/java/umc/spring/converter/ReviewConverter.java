package umc.spring.converter;

import umc.spring.domain.Review;
import umc.spring.web.dto.review.ReviewRequestDTO;
import umc.spring.web.dto.review.ReviewResponseDTO;

public class ReviewConverter {

    public static Review toReview(ReviewRequestDTO.CreateReviewDTO request) {
        return Review.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .score(request.getScore())
                .build();
    }

    public static ReviewResponseDTO.ReviewDto toReviewResultDTO(Review review) {
        return ReviewResponseDTO.ReviewDto.builder()
                .memberId(review.getMember().getId())
                .createdAt(review.getCreatedAt())
                .build();
    }
}
