package umc.spring.apiPayload.code;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorReasonDTO {

    private String message;
    private String code;
    private boolean isSuccess;
    private HttpStatus httpStatus;

}
