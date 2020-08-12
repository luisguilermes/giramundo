package br.com.lgs.giramundo.adapter.rest.security.service;

import br.com.lgs.giramundo.account.application.port.in.AuthSecurityUsecase;
import br.com.lgs.giramundo.account.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    private final AuthSecurityUsecase authSecurityUsecase;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = authSecurityUsecase.findByUsernameOrEmail(s)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + s));

        return UserDetailsImpl.build(user);
    }
}
