package br.com.lgs.giramundo.adapter.rest.security.payload.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class JwtResponse {
    private final String jwt;
    private final Long id;
    private final String username;
    private final String email;
    private final List<String> roles;
}
