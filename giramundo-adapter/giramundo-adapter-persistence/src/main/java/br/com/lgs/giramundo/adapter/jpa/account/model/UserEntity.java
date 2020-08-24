package br.com.lgs.giramundo.adapter.jpa.account.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(	name = "user",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        })
@SqlResultSetMapping(
        name = "UserEntity.findByUsernameOrEmailMapping",
        entities = {
                @EntityResult(entityClass = UserEntity.class)
        }
)
@NamedEntityGraphs({
        @NamedEntityGraph(name = "graph.UserEntity.Roles",
                attributeNodes = @NamedAttributeNode("roles"))
})
@NamedNativeQuery(
        name = "UserEntity.findByUsernameOrEmail",
        query = "SELECT u.id, u.username, u.email, u.password, r.id as rid, r.name as rame " +
                "FROM user u JOIN user_roles ur ON u.id = ur.user_id " +
                "JOIN role r ON ur.role_id = r.id " +
                "WHERE u.username =:identity OR u.email =:identity",
        resultSetMapping = "UserEntity.findByUsernameOrEmailMapping"
)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(	name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<RoleEntity> roles;


}
