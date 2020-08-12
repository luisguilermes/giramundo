package br.com.lgs.giramundo.account.application.port.in;

import br.com.lgs.giramundo.account.domain.User;

import java.util.Optional;

public interface AuthSecurityUsecase {
    Optional<User> findByUsernameOrEmail(String s);
}
