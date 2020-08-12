package br.com.lgs.giramundo.account.domain;

import br.com.lgs.giramundo.account.domain.enums.UserRoleEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Role {
    private final Integer id;
    private final UserRoleEnum name;
}
