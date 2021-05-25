package com.example.gradletest.Repositories;

import com.example.gradletest.Entities.Player;
import com.example.gradletest.Entities.UserEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
public interface PlayerRepo extends CrudRepository<Player, Integer> {

}
