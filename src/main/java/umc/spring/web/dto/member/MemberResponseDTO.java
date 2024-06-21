package umc.spring.web.dto.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.spring.domain.ReviewImage;

import java.time.LocalDateTime;
import java.util.List;

public class MemberResponseDTO {

    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class JoinResultDTO {
        Long memberId;
        LocalDateTime createdAt;
    }

    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class ChallengeMissionResultDTO {
        Long memberId;
        Long missionId;
        LocalDateTime createdAt;
    }

    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class ReviewListResultDTO {
        Long reviewId;
        Long memberId;
        String memberName;
        Float score;
        String content;
        LocalDateTime createdAt;
        List<ReviewImage> reviewImages;
    }
}
