package umc.spring.converter;

import umc.spring.domain.Mission;
import umc.spring.web.dto.MissionRequestDTO;
import umc.spring.web.dto.MissionResponseDTO;

public class MissionConverter {

    public static Mission toMission(MissionRequestDTO.CreateMissionDTO request) {
        return Mission.builder()
                .missionSpec(request.getMissionSpec())
                .reward(request.getReward())
                .deadline(request.getDeadline())
                .build();
    }

    public static MissionResponseDTO.MissionDto toMissionResultDTO(Mission mission) {
        return MissionResponseDTO.MissionDto.builder()
                .missionId(mission.getId())
                .createdAt(mission.getCreatedAt())
                .build();
    }
}
