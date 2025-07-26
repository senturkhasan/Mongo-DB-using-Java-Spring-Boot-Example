package com.example.mongosX;
 
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
@AllArgsConstructor
public class UserController {


    private final UserRepository userRepository;
    private UserService userService;

    @PostMapping("users")
    public ResponseEntity<User> addUser(@RequestBody User user){
        user=userRepository.save(user);
        System.out.println(user.getId());
        return ResponseEntity.created(URI.create("/api/v1/users/"+user.getId())).body(user);
    }

    
    @GetMapping("test")
    public String test(){
        return "test";
    }
    @GetMapping("users/{id}")
    public ResponseEntity  getUser(@PathVariable String id){
        Optional<User> userById = userRepository.findById(id);
        return userById.map(ResponseEntity::ok).orElseThrow(UserNotFound::new);
    }

}
