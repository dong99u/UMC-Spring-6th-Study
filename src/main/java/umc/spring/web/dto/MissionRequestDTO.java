package umc.spring.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalDate;

public class MissionRequestDTO {

    @Getter
    public static class CreateMissionDTO {
        @NotNull
        Long storeId;
        @NotBlank
        String missionSpec;
        @NotNull
        Integer reward;
        @NotBlank
        LocalDate deadline;
    }
}
