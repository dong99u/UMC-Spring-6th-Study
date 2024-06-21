package umc.spring.converter;

import umc.spring.domain.Review;
import umc.spring.web.dto.member.MemberResponseDTO;
import umc.spring.web.dto.review.ReviewRequestDTO;
import umc.spring.web.dto.review.ReviewResponseDTO;

import java.util.List;

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

    public static MemberResponseDTO.ReviewListResultDTO toReviewListResultDTO(List<Review> list) {
        return MemberResponseDTO.ReviewListResultDTO.builder()
                .reviewId(list.get(0).getId())
                .memberId(list.get(0).getMember().getId())
                .memberName(list.get(0).getMember().getName())
                .score(list.get(0).getScore())
                .content(list.get(0).getContent())
                .createdAt(list.get(0).getCreatedAt())
                .reviewImages(list.get(0).getReviewImageList())
                .build();
    }
}
