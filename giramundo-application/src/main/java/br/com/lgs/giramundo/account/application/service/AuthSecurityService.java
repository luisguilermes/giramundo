package br.com.lgs.giramundo.account.application.service;

import br.com.lgs.giramundo.account.application.port.in.AuthSecurityUsecase;
import br.com.lgs.giramundo.account.application.port.out.UserPersistencePort;
import br.com.lgs.giramundo.account.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class AuthSecurityService implements AuthSecurityUsecase {

    private final UserPersistencePort userPersistencePort;

    @Override
    public Optional<User> findByUsernameOrEmail(String s) {
        return userPersistencePort.findByUsernameOrEmail(s);
    }
}
