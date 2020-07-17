package com.training.jpa.springbootjpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.training.jpa.springbootjpa.model.User;
import com.training.jpa.springbootjpa.respository.UserJpaRepository;
import com.training.jpa.springbootjpa.respository.UserRepository;

@Component
public class UserRepositoryCommandLinerRunner2 implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLinerRunner2.class);
	@Autowired
	private UserJpaRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("User2","Role");
		user = userRepository.save(user);
		log.info("New User is created: " + user) ;
		Optional<User> userWithOneId = userRepository.findById(1L);
		log.info("User retreived " + userWithOneId) ;
		List<User> users = userRepository.findAll();
		log.info("All users :" + users);
		
	}
	
}
