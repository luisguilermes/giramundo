package br.com.lgs.giramundo.account.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Getter
@Builder
public class User {
    private final Long id;
    private final String username;
    private final String email;
    private final String password;
    private final Set<Role> roles;
}
