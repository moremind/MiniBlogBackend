package com.javanorth.javanorthapp.miniapp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VerifyUserDTO {
    private String openId;
    private String sessionId;
}
