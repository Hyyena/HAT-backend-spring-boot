package io.howstheairtoday.memberappexternalapi.service.dto.request;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ModifyNicknameRequestDto {

    private UUID memberId;
    private String nickname;
}