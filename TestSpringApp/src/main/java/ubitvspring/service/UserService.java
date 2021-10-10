package ubitvspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ubitvspring.entity.UserEntity;
import ubitvspring.exeptions.UserAlreadyExist;
import ubitvspring.exeptions.UserNotFound;
import ubitvspring.model.User;
import ubitvspring.repository.UserRepo;

@Service
public class UserService {


    @Autowired
    private UserRepo userRepo;

    public UserEntity registration(UserEntity user) throws UserAlreadyExist {
        if (userRepo.findByUsername(user.getUsername()) != null) {
            throw new UserAlreadyExist("Пользователь с таким именем уже существует");
        }
      return   userRepo.save(user);
    }

    public User getOne(Long id) throws UserNotFound {
        UserEntity user = userRepo.findById(id).get();
        if (user == null){
            throw new UserNotFound("Пользователя не найден");
        }
        return User.toModel(user);
    }

    public Long deleteUser(Long id){
        userRepo.deleteById(id);
        return id;
    }
}
