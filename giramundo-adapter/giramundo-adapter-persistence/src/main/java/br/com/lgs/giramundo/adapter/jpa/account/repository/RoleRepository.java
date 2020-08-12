package br.com.lgs.giramundo.adapter.jpa.account.repository;

import br.com.lgs.giramundo.adapter.jpa.account.model.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
    Optional<RoleEntity> findByName(String name);
}
