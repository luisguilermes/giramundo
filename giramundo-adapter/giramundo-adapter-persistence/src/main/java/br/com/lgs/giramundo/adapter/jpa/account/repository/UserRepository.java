package br.com.lgs.giramundo.adapter.jpa.account.repository;

import br.com.lgs.giramundo.adapter.jpa.account.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query(
            value = "SELECT * FROM user u WHERE u.username = ?1 OR u.email = ?1 " +
                    "inner join ",
            nativeQuery = true)
    Optional<UserEntity> findByUsernameOrEmail(String s);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
