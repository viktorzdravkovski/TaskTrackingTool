package com.viktor.ttt.repository;

import com.viktor.ttt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Jpa Repository for {@link Role}.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
