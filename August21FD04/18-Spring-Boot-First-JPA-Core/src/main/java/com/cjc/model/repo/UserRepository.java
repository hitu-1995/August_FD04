package com.cjc.model.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.cjc.model.User;

@Component
public interface UserRepository extends CrudRepository<User,Integer> {

}
