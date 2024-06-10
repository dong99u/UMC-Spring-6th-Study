package umc.spring.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalDate;

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
