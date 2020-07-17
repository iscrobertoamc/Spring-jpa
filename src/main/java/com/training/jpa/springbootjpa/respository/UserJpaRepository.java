package com.training.jpa.springbootjpa.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.jpa.springbootjpa.model.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Long>{

}
