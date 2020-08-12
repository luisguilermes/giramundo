package br.com.lgs.giramundo.adapter.jpa.account;

import br.com.lgs.giramundo.account.application.port.out.UserPersistencePort;
import br.com.lgs.giramundo.account.domain.User;
import br.com.lgs.giramundo.adapter.jpa.account.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class UserPersistenceAdapter implements UserPersistencePort {

    private final UserRepository repository;

    @Override
    public Optional<User> findByUsernameOrEmail(String s) {
        return repository.findByUsernameOrEmail(s)
                .flatMap(e -> Optional.of(e.toDomain()));
    }
}
