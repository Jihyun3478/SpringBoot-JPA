package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {

    private Long id;

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String loginPw;

    @NotEmpty
    private String name;
}
