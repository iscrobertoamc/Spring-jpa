package com.training.jpa.springbootjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.training.jpa.springbootjpa.model.User;
import com.training.jpa.springbootjpa.respository.UserRepository;

@Component
public class UserRepositoryCommandLinerRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLinerRunner.class);
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("User","Role");
		long insert = userRepository.insert(user);
		log.info("New User is created: " + user) ;
	}
	
}
