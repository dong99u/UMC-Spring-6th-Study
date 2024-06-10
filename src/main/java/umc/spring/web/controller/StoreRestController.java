package umc.spring.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.spring.apiPayload.ApiResponse;
import umc.spring.converter.MissionConverter;
import umc.spring.converter.ReviewConverter;
import umc.spring.domain.Mission;
import umc.spring.domain.Review;
import umc.spring.service.storeService.StoreCommandService;
import umc.spring.web.dto.MissionRequestDTO;
import umc.spring.web.dto.MissionResponseDTO;
import umc.spring.web.dto.ReviewRequestDTO;
import umc.spring.web.dto.ReviewResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store")
public class StoreRestController {

    private final StoreCommandService storeCommandService;

    @PostMapping("/{storeId}/review")
    public ApiResponse<ReviewResponseDTO.ReviewDto> registerReview(@RequestBody @Valid ReviewRequestDTO.CreateReviewDTO request){
        Review review = storeCommandService.registerReview(request);
        return ApiResponse.onSuccess(ReviewConverter.toReviewResultDTO(review));
    }

    @PostMapping("/{storeId}/mission")
    public ApiResponse<MissionResponseDTO.MissionDto> registerMission(@RequestBody @Valid MissionRequestDTO.CreateMissionDTO request){
        Mission mission = storeCommandService.registerMission(request);

        return ApiResponse.onSuccess(MissionConverter.toMissionResultDTO(mission));
    }

}
