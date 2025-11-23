package com.learnSpring.securityex.services;

import com.learnSpring.securityex.model.User;
import com.learnSpring.securityex.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
     private UserRepo userRepo;
     private BCryptPasswordEncoder encoder= new BCryptPasswordEncoder(12);
    public User register(User user)
    {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
    @Autowired
    AuthenticationManager  authmanager;
    @Autowired
    JWTService jwtService;
    public String verifyLogin(User user) {
        Authentication authentication =authmanager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
   if(authentication.isAuthenticated()) return jwtService.generateToken(user.getUsername());
    else return "Login Failed";

    }
}
