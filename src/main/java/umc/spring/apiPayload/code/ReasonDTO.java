package umc.spring.apiPayload.code;

import lombok.*;
import org.springframework.http.HttpStatus;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ReasonDTO {
    private String message;
    private String code;
    private boolean isSuccess;
    private HttpStatus httpStatus;
}

