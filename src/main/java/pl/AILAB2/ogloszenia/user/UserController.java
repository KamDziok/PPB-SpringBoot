package pl.AILAB2.ogloszenia.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    private List<User> getAllUser(){
        return (List<User>) userRepository.findAll();
    }

    @GetMapping("/{login}?{password}")
    private User getUserByLoginAndPassword(@PathVariable("login") String login, @PathVariable("password") String password){
        return userRepository.findByLoginAndPassword(login, password);
    }

    @PostMapping
    private User addUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping
    private User updateUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @DeleteMapping
    private User deleteUser(@RequestBody User user){
        userRepository.delete(user);
        return user;
    }
}
