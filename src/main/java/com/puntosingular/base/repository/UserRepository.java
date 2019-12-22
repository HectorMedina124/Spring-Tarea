package com.puntosingular.base.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.puntosingular.base.dto.UserDTO;
import com.puntosingular.base.models.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	public User findByName(String name);
	@Query("Select user from User user where user.name=?1")
	public User getUserByName(String name);//query cruda
	

}
