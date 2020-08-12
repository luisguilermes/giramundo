package br.com.lgs.giramundo.adapter.rest.security.payload.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public class LoginRequest {
    private final String username;
    private final String password;
}
