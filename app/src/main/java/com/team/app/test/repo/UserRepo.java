package com.team.app.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team.app.test.model.User;

public interface UserRepo extends JpaRepository<User,Long>{
	

}
