package umc.spring.web.dto.review;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

public class ReviewRequestDTO {

    @Getter
    public static class CreateReviewDTO {
        @NotNull
        Long storeId;
        @NotNull
        Long memberId;
        @NotBlank
        String title;
        @NotBlank
        String content;
        @NotNull
        Float score;
    }


}
