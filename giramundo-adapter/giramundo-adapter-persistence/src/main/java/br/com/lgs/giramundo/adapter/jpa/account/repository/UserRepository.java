package br.com.lgs.giramundo.adapter.jpa.account.repository;

import br.com.lgs.giramundo.adapter.jpa.account.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

//    @Query(
//            value = "SELECT * FROM user u " +
//                    "JOIN user_roles ur ON u.id = ur.user_id " +
//                    "JOIN role r ON ur.role_id = r.id " +
//                    "WHERE u.username = ?1 OR u.email = ?1",
//            nativeQuery = true)
    Optional<UserEntity> findByUsernameOrEmail(@Param("identity") String identity);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
