package com.lawrence.user.repository;

import com.lawrence.user.entity.Usero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usero, Long> {

	Usero findByUserId(Long userId);
}
