package balancetalk.module.member.dto;

import balancetalk.module.member.domain.Member;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class LoginRequest {

    @Schema(description = "회원 이메일", example = "test1234@naver.com")
    private String email;

    @Schema(description = "회원 비밀번호", example = "Test1234test!")
    private String password;

    public Member toEntity() {
        return Member.builder()
                .email(email)
                .password(password)
                .build();
    }
}
