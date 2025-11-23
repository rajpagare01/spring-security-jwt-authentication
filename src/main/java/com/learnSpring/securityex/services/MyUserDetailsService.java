// src/main/java/com/learnSpring/securityex/services/MyUserDetailsService.java
package com.learnSpring.securityex.services;

import com.learnSpring.securityex.model.User;
import com.learnSpring.securityex.model.UserPrincipal;
import com.learnSpring.securityex.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);

        if (user == null) {
            System.out.println("User not found: " + username);
            throw new UsernameNotFoundException("User not found");
        }

        return new UserPrincipal(user);
    }
}