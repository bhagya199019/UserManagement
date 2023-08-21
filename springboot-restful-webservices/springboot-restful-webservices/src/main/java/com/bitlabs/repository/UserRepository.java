package com.bitlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
