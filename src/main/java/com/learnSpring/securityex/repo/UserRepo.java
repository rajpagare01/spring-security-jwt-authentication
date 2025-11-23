package com.learnSpring.securityex.repo;

import com.learnSpring.securityex.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

    User findByUsername(String username);
}
//bcrypt password encoder
//plain->hashed1->hashed2
//123-> $2a$10$Dow1b0j6f6H59KfQ7jHoueJ8m3jFh5E6
//verify
//plain, hashed-> true/false