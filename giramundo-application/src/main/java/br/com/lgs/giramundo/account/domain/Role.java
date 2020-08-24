package br.com.lgs.giramundo.account.domain;

import br.com.lgs.giramundo.account.domain.enums.UserRoleEnum;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private Integer id;
    private UserRoleEnum name;
}
