package br.com.techipster.giramundo.core.persistence;

import java.util.Collection;
import java.util.Optional;

import br.com.techipster.giramundo.core.domain.User;
import br.com.techipster.giramundo.core.domain.UserData;

public interface UserPersistencePort {
	Collection<User> listUsers();

	User createUser(UserData userData);

	Optional<User> findUser(Long id);

}
