package com.Pizza.Pizza_Bill_Generator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Pizza.Pizza_Bill_Generator.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
