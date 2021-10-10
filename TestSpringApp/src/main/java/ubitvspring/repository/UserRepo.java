package ubitvspring.repository;

import org.springframework.data.repository.CrudRepository;
import ubitvspring.entity.UserEntity;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
