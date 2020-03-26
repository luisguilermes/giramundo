package br.com.techipster.giramundo.core.domain;

import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;

public interface UserService {

	Collection<User> listUsers();

	User createUser(@Valid UserData user);

	Optional<User> findUser(Long id);

}
