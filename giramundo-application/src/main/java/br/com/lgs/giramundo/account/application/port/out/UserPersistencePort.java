package br.com.lgs.giramundo.account.application.port.out;

import br.com.lgs.giramundo.account.domain.User;

import java.util.Optional;

public interface UserPersistencePort {
    Optional<User> findByUsernameOrEmail(String s);
}
