package org.example.expert.domain.auth.dto.response;

import lombok.Getter;

@Getter
public class loginResponse {

    private final String bearerToken;

    public loginResponse(String bearerToken) {
        this.bearerToken = bearerToken;
    }
}
