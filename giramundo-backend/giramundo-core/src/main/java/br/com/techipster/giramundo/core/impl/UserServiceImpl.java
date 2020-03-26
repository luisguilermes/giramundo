package br.com.techipster.giramundo.core.impl;

import java.util.Collection;
import java.util.Optional;

import javax.inject.Named;
import javax.validation.Valid;

import br.com.techipster.giramundo.core.domain.User;
import br.com.techipster.giramundo.core.domain.UserData;
import br.com.techipster.giramundo.core.domain.UserService;
import br.com.techipster.giramundo.core.domain.Validated;
import br.com.techipster.giramundo.core.persistence.UserPersistencePort;
import lombok.RequiredArgsConstructor;

@Named
@Validated
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	private final UserPersistencePort persistencePort;

	@Override
	public Collection<User> listUsers() {
		return persistencePort.listUsers();
	}

	@Override
	public User createUser(@Valid UserData user) {
		return persistencePort.createUser(user);
	}

	@Override
	public Optional<User> findUser(Long id) {
		return persistencePort.findUser(id);
	}

}
