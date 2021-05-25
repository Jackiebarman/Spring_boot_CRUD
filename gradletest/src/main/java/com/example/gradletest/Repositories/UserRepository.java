package com.example.gradletest.Repositories;

import com.example.gradletest.Entities.UserEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
