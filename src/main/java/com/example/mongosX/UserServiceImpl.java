package com.example.mongosX;
 
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public  class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
       User saveUser= userRepository.save(user);
        return saveUser;
    }

    @Override
    public List<User> getAllUser() {
      List<User>  listUser= userRepository.findAll();
        return listUser;
    }
}
