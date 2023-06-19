package com.example.exam_myuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepository;

    public List<User> listAll(){return userRepository.findAll();}

    public  void  saveUser(User user) {userRepository.save(user);}
    public void deleteUser(int id) {userRepository.deleteById(id);}

}
