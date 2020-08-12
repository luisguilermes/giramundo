package br.com.lgs.giramundo.adapter.jpa.account.model;

import br.com.lgs.giramundo.account.domain.Role;
import br.com.lgs.giramundo.account.domain.User;
import br.com.lgs.giramundo.account.domain.enums.UserRoleEnum;
import lombok.*;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(	name = "user",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        })
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<RoleEntity> roles;

    public User toDomain() {
        return User.builder()
                .id(id)
                .username(username)
                .email(email)
                .password(password)
                .roles(roles.stream().map(r -> new Role(r.getId(), UserRoleEnum.valueOf(r.getName())))
                        .collect(Collectors.toSet()))
                .build();
    }
}
