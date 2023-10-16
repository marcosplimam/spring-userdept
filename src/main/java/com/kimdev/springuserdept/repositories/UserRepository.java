package com.kimdev.springuserdept.repositories;

import com.kimdev.springuserdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
